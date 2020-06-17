// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 
package Server;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import logic.Employee;
import ocsf.server.*;

/**
 * This class overrides some of the methods in the abstract superclass in order
 * to give more functionality to the server.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;re
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Paul Holden
 * @version July 2000
 */

public class EchoServer extends AbstractServer {
	// Class variables *************************************************
	ArrayList<String> cmd = new ArrayList<String>();
	Connection conn;
	/**
	 * The default port to listen on.
	 */
	// final public static int DEFAULT_PORT = 5555;

	// Constructors ****************************************************

	/**
	 * Constructs an instance of the echo server.
	 *
	 * @param port The port number to connect on.
	 * 
	 */
	public EchoServer(int port) {
		super(port);
	}

	// Instance methods ************************************************

	/**
	 * This method handles any messages received from the client.
	 *
	 * @param msg    The message received from the client.
	 * @param client The connection from which the message originated.
	 * @param
	 * @throws SQLException
	 */
	public void handleMessageFromClient(Object msg, ConnectionToClient client) {
		cmd = extracted(msg);
		int flag = 0;
//GetVehicleListForUser
		System.out.println("Message received: " + msg + " from " + client);
		if (cmd.get(0).equals("UpdateEmployee")) {

			int x = UpdateEmployee(msg);
			ArrayList<String> data = getEmployeeData(msg);
			data.add(0, "EmployeeData");
			this.sendToRequistedClient(data, client);
		}
		if (cmd.get(0).equals("GetVehicleListForUser")) {
			// GetProductListForGsdStation
			ArrayList<String> data = getCarsDataForUser(msg);
			data.add(0, "CarsDataForUser");
			this.sendToRequistedClient(data, client);
		}
		if (cmd.get(0).equals("GetProductListForGsdStation")) {
			// GetProductListForGsdStation
			ArrayList<String> data = GetProductListForGsdStation(msg);
			data.add(0, "ProductsDataForGasStation");
			this.sendToRequistedClient(data, client);
		}
		if (cmd.get(0).equals("UpdateUser")) {

			int x = UpdateUser(msg);
			if (isEmployee(cmd) == 1) {

				ArrayList<String> data = getEmployeeData(msg);
				data.add(0, "EmployeeData");
				this.sendToRequistedClient(data, client);
			} else {
				ArrayList<String> data = getUserData(msg);
				data.add(0, "EmployeeData");
				this.sendToRequistedClient(data, client);
			}

		}

		if (cmd.get(0).equals("GetEmployeeData")) {
			ArrayList<String> data = getEmployeeData(msg);
			data.add(0, "EmployeeData");
			this.sendToRequistedClient(data, client);
		}

		if (cmd.get(0).equals("GetUserData")) {
			ArrayList<String> data = getUserData(msg);
			data.add(0, "UserData");
			this.sendToRequistedClient(data, client);
		}

		if (cmd.get(0).equals("LogIn")) {
			int x = login(cmd);
			ArrayList<String> data = new ArrayList<String>();
			if (x == 1) {
				if (isEmployee(cmd) == 1) {
					data = getEmployeeData(msg);
					data.add(0, "EmployeeLoggedIn");

				} else {
					data = getUserData(msg);
					data.add(0, "UserLoggedIn");
				}

			}
			System.out.println("ok "+data.toString());
			this.sendToRequistedClient(data, client);

		}
		if (cmd.get(0).equals("LogOut")) {
			flag = logout(cmd);
			if (flag == 1)
				this.sendToAllClients("Save");
		}

	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private ArrayList<String> getCarsDataForUser(Object msg) {
		ArrayList<String> result = new ArrayList<String>();

		try {

			cmd = extracted(msg);
			String id = getEmployeeIdUsingUsername(cmd);
			String str = ("SELECT * FROM vehicle WHERE customer_id= (?) ;");
			PreparedStatement st = conn.prepareStatement(str);
			st.setString(1, id);
			ResultSet rs = st.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {

					result.add(rs.getString(i));
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private int UpdateUser(Object msg) {
		cmd = extracted(msg);
		try {
			if (checkUser(cmd.get(1), cmd.get(2)) == 1) {
				String str = ("UPDATE registered_user  SET id = (?) , First_name = (?) , Last_name = (?) , Email = (?) ,password = (?)  WHERE username =  (?) ; ");
				PreparedStatement st = conn.prepareStatement(str);
				st = conn.prepareStatement(str);
				st.setString(1, cmd.get(3));
				st.setString(2, cmd.get(4));
				st.setString(3, cmd.get(5));
				st.setString(4, cmd.get(6));
				st.setString(5, cmd.get(7));
				st.setString(6, cmd.get(1));
				st.executeUpdate();
				System.out.println("User Is Updated to " + cmd);
				return 1;
			} else {

				System.out.println("User  NOT Found");

			}
		} catch (SQLException e) {

			e.printStackTrace();
			// TODO: handle exception
		}

		System.out.println("User NOT Found");
		return 0;

	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private ArrayList<String> extracted(Object msg) {
		return (ArrayList<String>) msg;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private ArrayList<String> GetVehicleListForUser(Object msg) {
		ArrayList<String> result = new ArrayList<String>();

		try {

			cmd = extracted(msg);
			String id = getEmployeeIdUsingUsername(cmd);
			String str = ("SELECT * FROM vehicle WHERE customer_id= (?) ;");
			PreparedStatement st = conn.prepareStatement(str);
			st.setString(1, id);
			ResultSet rs = st.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println(rs);
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					result.add(rs.getString(i));
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;

	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private ArrayList<String> GetProductListForGsdStation(Object msg) {
		ArrayList<String> result = new ArrayList<String>();

		try {

			cmd = extracted(msg);

			String str = ("SELECT product_in_gas_station.product_id,product_in_gas_station.price,product_in_gas_station.quantity,product.name FROM product_in_gas_station,product WHERE station_id= (?) AND product.product_id= product_in_gas_station.product_id ;");
			PreparedStatement st = conn.prepareStatement(str);
			st.setString(1, cmd.get(3));
			
			ResultSet rs = st.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println(rs);
			while (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					result.add(rs.getString(i));
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		return result;

	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private ArrayList<String> getUserData(Object msg) {
		ArrayList<String> result = new ArrayList<String>();

		try {

			cmd = extracted(msg);

			String str = ("SELECT * FROM registered_user WHERE username= (?) AND password= (?) ;");
			PreparedStatement st = conn.prepareStatement(str);
			st.setString(1, cmd.get(1));
			st.setString(2, cmd.get(2));
			ResultSet rs = st.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println(rs);
			if (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					{
						result.add(rs.getString(i));
					}

				}
			} else {
				return result;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private ArrayList<String> getEmployeeData(Object msg) {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<String>();

		try {

			cmd = extracted(msg);

			String str = ("SELECT registered_user.* , employee.station_id , employee.role FROM registered_user,employee WHERE registered_user.username= (?) AND registered_user.id=employee.id ;");
			PreparedStatement st = conn.prepareStatement(str);
			st.setString(1, cmd.get(1));
			ResultSet rs = st.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println(rs);
			if (rs.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					result.add(rs.getString(i));
				}
			} else {
				System.out.println(result);

				return result;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * This method overrides the one in the superclass. Called when the server
	 * starts listening for connections.
	 */
	protected void serverStarted()// change
	{
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test?serverTimezone=IST", "root", "Aa123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Server listening for connections on port " + getPort());

	}

	/**
	 * This method overrides the one in the superclass. Called when the server stops
	 * listening for connections.
	 */
	protected void serverStopped() {
		System.out.println("Server has stopped listening for connections.");
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getEmployeeIdUsingUsername(ArrayList<String> cmd) {

		String Username, result = "";

		Username = cmd.get(1);
		try {
			String str = ("SELECT registered_user.id FROM registered_user WHERE registered_user.username= '" + Username + "' ;");

			PreparedStatement st = conn.prepareStatement(str);
			ResultSet rs = st.executeQuery(str);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			if (rs.next()) {

				result = rs.getString(1);
			}
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "";

	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int isEmployee(ArrayList<String> cmd) {
		try {
			String ID;
			ID = getEmployeeIdUsingUsername(cmd);
			String str = ("SELECT id FROM employee WHERE id= (?) ; ");
			PreparedStatement st = conn.prepareStatement(str);
			st.setString(1, ID);

			ResultSet rs = st.executeQuery();
			if (rs.next()) {

				System.out.println("Employee ID Found");
				return 1;
			} else {

				System.out.println("Employee ID  NOT Found");
				return 0;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;

	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int login(ArrayList<String> cmd) {
		// ArrayList<String> result = getUserData(cmd);
		ArrayList<String> result = null;

		try {

			if (checkUser(cmd.get(1), cmd.get(2)) == 1) {

				String str = ("UPDATE registered_user SET connected = 1 WHERE username= (?) AND password= (?) ; ");
				PreparedStatement st = conn.prepareStatement(str);
				st = conn.prepareStatement(str);
				st.setString(1, cmd.get(1));
				st.setString(2, cmd.get(2));
				st.executeUpdate();
				return 1;
			} else {

				System.out.println("Employee ID  NOT Found");
				result.add("falied");
				return 0;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		result.add("falied");
		return 0;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int logout(ArrayList<String> cmd) {
		try {
			if (checkUser(cmd.get(1), cmd.get(2)) == 1) {
				String str = ("UPDATE registered_user SET connected=0 WHERE username= (?) AND password= (?) ; ");
				PreparedStatement st = conn.prepareStatement(str);

				st = conn.prepareStatement(str);
				st.setString(1, cmd.get(1));
				st.setString(2, cmd.get(2));
				st.executeUpdate();
				return 1;
			} else {

				System.out.println("Employee ID  NOT Found");
				return 0;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int UpdateEmployee(Object msg) {
		System.out.println("before cmd  ");
		cmd = extracted(msg);
		System.out.println("before everythging  ");
		try {
			if (checkUser(cmd.get(1), cmd.get(2)) == 1) {
				System.out.println("after try  ");
				String str1 = ("UPDATE registered_user  SET  password = (?), id = (?) , first_name = (?) , last_name = (?) , email = (?) WHERE username = (?) ; ");

				PreparedStatement st1 = conn.prepareStatement(str1);

				System.out.println("before");

				st1 = conn.prepareStatement(str1);

				System.out.println("before get string 4 ");
				st1.setString(1, cmd.get(4));
				System.out.println("before get string 3 ");
				st1.setString(2, cmd.get(3));
				System.out.println("before get string 5");
				st1.setString(3, cmd.get(5));
				System.out.println("before get string 6");
				st1.setString(4, cmd.get(6));
				System.out.println("before get string 7");
				st1.setString(5, cmd.get(7));
				System.out.println("before get string 1");
				st1.setString(6, cmd.get(1));
				System.out.println("after");
				System.out.println("here " + st1.executeUpdate());

				String str = ("UPDATE employee  SET id = (?) , role = (?) , station_id = (?) WHERE id = (SELECT id FROM registered_user WHERE username = (?) ) ; ");
				PreparedStatement st = conn.prepareStatement(str);
				st = conn.prepareStatement(str);

				st.setString(1, cmd.get(3));
				st.setString(2, cmd.get(9));
				st.setString(3, cmd.get(8));
				st.setString(4, cmd.get(1));
				System.out.println("here " + st.executeUpdate());
				return 1;
			} else {

				System.out.println("Employee ID  NOT Found");

			}
		} catch (SQLException e) {

			e.printStackTrace();
			// TODO: handle exception
		}

		System.out.println("Employee ID  NOT Found");
		return 0;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int checkUser(String Username, String Password) {
		try {

			String str = ("SELECT username,password FROM registered_user WHERE username= (?) AND password= (?) ; ");
			PreparedStatement st = conn.prepareStatement(str);
			st.setString(1, Username);
			st.setString(2, Password);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				// dispose();
				System.out.println("Employee ID Found");
				return 1;
			} else {

				System.out.println("Employee ID  NOT Found");
				return 0;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int loggedin(String Username) {
		try {

			String str = ("SELECT connected FROM registered_user WHERE username= (?)  ; ");
			PreparedStatement st = conn.prepareStatement(str);
			st.setString(1, Username);

			ResultSet rs = st.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();

			if (rs.next()) {
				String columnValue = rs.getString(1);
				if (columnValue == "1")
					return 0;
				else {
					System.out.print("the result is   " + columnValue);
					return 1;
				}
			} else {

				System.out.println("user is logged in please log out ");
				return 0;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public ArrayList<String> getFieldsFromTable(Object msg) {

		cmd = extracted(msg);
		ArrayList<String> res = new ArrayList<String>();
		String Username;

		Username = cmd.get(1);
		try {

			String str = ("SELECT * FROM gas_station WHERE station_id=123456 ;");

			PreparedStatement st = conn.prepareStatement(str);

			ResultSet rs = st.executeQuery(str);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			int j = 1;
			for (int i = 1; i <= columnsNumber; i++) {
				System.out.format("Column %d  %s", i, rsmd.getColumnName(i));
				res.add(rsmd.getColumnName(i));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String getGas_Station(Object msg) {
		cmd = extracted(msg);

		String Username;

		Username = cmd.get(1);
		try {

			String str = ("SELECT * FROM gas_station WHERE station_id=123456 ;");

			PreparedStatement st = conn.prepareStatement(str);

			ResultSet rs = st.executeQuery(str);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			int j = 1;
			while (rs.next()) {
				System.out.println(rs.getInt(j++));
				System.out.println(rs.getString(j++));
				System.out.println(rs.getString(j++));
				System.out.println(rs.getInt(j++));

			}
			for (int i = 1; i <= columnsNumber; i++) {
				System.out.format("Column %d where gas station %s", i, rsmd.getColumnName(i));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "";

	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}

//End of EchoServer class
