// This file contains material supporting section 3.7 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

package client;

import java.io.IOException;
import java.util.ArrayList;

import common.ChatIF;
import gui.EmployeeController;
import gui.HomeCustomerController;
import ocsf.client.AbstractClient;
import logic.Employee;
import logic.*;

/**
 * This class overrides some of the methods defined in the abstract superclass
 * in order to give more functionality to the client.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;
 * @author Fran&ccedil;ois B&eacute;langer
 * @version July 2000
 */
public class ChatClient extends AbstractClient {

	ArrayList<String> cmd = new ArrayList<String>();
	public static User User;
	// Instance variables **********************************************

	/**
	 * The interface type variable. It allows the implementation of the display
	 * method in the client.
	 */
	ChatIF clientUI;
	public static int flag = 0;/// 1 if user is logged in 2 if employee is logged in
	public static Employee emp = new Employee(null, null, null, null, null, null, null, null, null);
	public static boolean awaitResponse = false;
	public static ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
	public static ArrayList<Order> Orders = new ArrayList<Order>();
	public static ArrayList<Product> products = new ArrayList<Product>();
	public static ArrayList<Gas_Station> Gas_Stations = new ArrayList<Gas_Station>();
	public static ArrayList<Reports> Reports = new ArrayList<Reports>();
	public static ArrayList<Gas_Station> Gasstations = new ArrayList<Gas_Station>();
	public static ArrayList<Plan> Plans = new ArrayList<Plan>();
	// Constructors ****************************************************

	/**
	 * Constructs an instance of the chat client.
	 *
	 * @param host     The server to connect to.
	 * @param port     The port number to connect on.
	 * @param clientUI The interface type variable.
	 */

	public ChatClient(String host, int port, ChatIF clientUI) throws IOException {
		super(host, port); // Call the superclass constructor
		this.clientUI = clientUI;
	}

	// Instance methods ************************************************

	/**
	 * This method handles all data that comes in from the server.
	 *
	 * @param msg The message from the server.
	 */
	public void handleMessageFromServer(Object msg) {
		cmd = extracted(msg);
		System.out.println("--> handleMessageFromServer");
		awaitResponse = false;
		try {

			String st;
			st = msg.toString();
			String[] result = st.split(",\\s");
			if (cmd.get(0).equals("UserLoggedIn")) {

				this.flag = 1;
				this.User = new User(cmd.get(1), cmd.get(2), cmd.get(2), cmd.get(4), cmd.get(5), cmd.get(6));
				// user: username id pssword name name2 email
				System.out.println(User + "\n" + msg);
			}
			if (cmd.get(0).equals("UserData")) {

				/// change this to be able to capyure the user and add it to the clients
				this.User = new User(cmd.get(1), cmd.get(2), cmd.get(3), cmd.get(4), cmd.get(5), cmd.get(6));
				System.out.println("employee data recived");

				// user: username id pssword name name2 email
				System.out.println(User + "\n" + msg);
			}
			if (cmd.get(0).equals("NewCarData")) {
				try {
					System.out.println("New Car" + "\n" + msg);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			if (cmd.get(0).equals("EmployeeData")) {
				try {
					this.emp = new Employee(cmd.get(1), cmd.get(2), cmd.get(3), cmd.get(4), cmd.get(5), cmd.get(6),
							cmd.get(7), cmd.get(8), cmd.get(9));
					System.out.println("employee data recived");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

			if (cmd.get(0).equals("ProductsDataForGasStation")) {
				try {
					products.clear();
					int i = 1;
					Product temp;
					while (i < cmd.size()) {

						temp = new Product(Integer.parseInt(cmd.get(i++)), Float.parseFloat(cmd.get(i++)),
								Float.parseFloat(cmd.get(i++)), cmd.get(i++));

						products.add(temp);
						System.out.println(temp);
					}

					System.out.println("products data recived");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			if (cmd.get(0).equals("CarsDataForUser")) {
				try {
					cars.clear();
					int i = 1;
					Vehicle temp;
					while (i < cmd.size()) {
						temp = new Vehicle(cmd.get(i++), cmd.get(i++), cmd.get(i++), cmd.get(i++), cmd.get(i++));

						cars.add(temp);
						System.out.println(temp);
					}

					System.out.println("cars data recived");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			if (cmd.get(0).equals("EmployeeLoggedIn")) {
				try {
					this.flag = 2;
					this.emp = new Employee(cmd.get(1), cmd.get(2), cmd.get(3), cmd.get(4), cmd.get(5), cmd.get(6),
							cmd.get(7), cmd.get(8), cmd.get(9));
					System.out.println("employee has logged in ");

				} catch (Exception e) {
					// TODO: handle exception
				}
			}

		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}

	private void LoadCarsList(Object msg) {
		// TODO Auto-generated method stub

	}

	private ArrayList<String> extracted(Object msg) {
		return (ArrayList<String>) msg;
	}

	/**
	 * This method handles all data coming from the UI
	 *
	 * @param message The message from the UI.
	 */

	public void handleMessageFromClientUI(Object message) {
		try {
			openConnection();
			awaitResponse = true;
			sendToServer(message);
			// wait for response
			while (awaitResponse) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			clientUI.display("Could not send message to server: Terminating client." + e);
			quit();
		}
	}

	/**
	 * This method terminates the client.
	 */
	public void quit() {
		try {
			closeConnection();
		} catch (IOException e) {
		}
		System.exit(0);
	}
}
//End of ChatClient class
