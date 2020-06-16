package gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

import client.ChatClient;
import client.ClientUI;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;
import logic.Employee;
import logic.User;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

public class UpdateCustomerInformationController {
	@FXML
	private Button backHome;

	@FXML
	private Button logoutBtn;

	@FXML
	private Button updateBtn;

	@FXML
	private TextField Lname;

	@FXML
	private TextField id;

	@FXML
	private TextField Fname;

	@FXML
	private TextField email;

	@FXML
	private Label customerId;

	@FXML
	private Label userlbl;
	
	@FXML
	private Label missedRF;
	@FXML
	private Label FnameStar;
	@FXML
	private Label LnameStar;
	@FXML
	private Label IDStar;
	@FXML
	private Label EmailStar;
	@FXML
	private Label RepassStar;
	@FXML
	private Label typeStar;
	
	@FXML
	private TextField pass;

	@FXML
	private TextField rePass;

	@FXML
	private ComboBox  cusType;
	
	@FXML
	private Label badPassword;
	@FXML
	private MenuItem buyProduct = null;
	@FXML
	private MenuItem homeOrder = null;
	@FXML
	private MenuItem subsPlan = null;
	@FXML
	private MenuItem orderHistory = null;
	@FXML
	private MenuItem tracker = null;
	@FXML
	private MenuItem sales = null;
	@FXML
	private MenuButton info = null;
	@FXML
	private MenuItem updateSubsPlan = null;
	@FXML
	private MenuItem showProfile1 = null;
	@FXML
	private MenuItem news = null;
	@FXML
	private MenuItem stationFind = null;
	@FXML
	private MenuItem contactUs = null;
	@FXML
	private MenuItem aboutUs = null;
	@FXML
	private MenuItem cart = null;
	@FXML
	private MenuItem carlist = null;
	@FXML
	private MenuItem addcar = null;

User us = new User(null, null, null, null, null, null);
Employee emp = new Employee(null, null, null, null, null, null, null, null, null);
ObservableList<String> Ctype=FXCollections.observableArrayList("Private","Bussiness");

	public void initialize() 
	{	
		cusType.setValue("choose");
		cusType.setItems(Ctype);
		badPassword.setVisible(false);
		missedRF.setVisible(false);	
		FnameStar.setVisible(false);
		LnameStar.setVisible(false);
		IDStar.setVisible(false);
		EmailStar.setVisible(false);
		RepassStar.setVisible(false);
		typeStar.setVisible(false);
		
		us=ChatClient.User;
		emp=ChatClient.emp;
		System.out.println("employee data: "+emp);

		if(ChatClient.flag==1) 
		{
			this.id.setText(us.getId());
			this.Fname.setText(us.getFName());
			this.Lname.setText(us.getLName());
			this.email.setText(us.getEmail());	
			this.userlbl.setText(us.getUsername());
		}
		if(ChatClient.flag==2) 
		{
			this.id.setText(emp.getId());
			this.Fname.setText(emp.getFName());
			this.Lname.setText(emp.getLName());
			this.email.setText(emp.getEmail());	
			this.userlbl.setText(emp.getUsername());

		}

	}

	
	
	public void loadUser(User e) {
		this.id.setText(e.getId());
		this.Fname.setText(e.getFName());
		this.Lname.setText(e.getLName());
		this.email.setText(e.getEmail());

	}

	public void updateSubsPlan(ActionEvent event) throws Exception {

		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/updatesubs.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Update Subscription");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void carlist(ActionEvent event) throws Exception {

		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Car List.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Cars List");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void addcar(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/vehicle.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Add Cars");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void cart(ActionEvent event) throws Exception {

		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Cart.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("My Cart");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void news(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/newsinhome.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void stationFind(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/stationFinderHome.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Station Finder");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void contactUs(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/contactusHome.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Contact Us");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void aboutUs(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/aboutusHome.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("About Us");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void tracker(ActionEvent event) throws Exception {

		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Tracker.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Track Your Order");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void buyProduct(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Products.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Our Products");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void homeOrder(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Home fuel order.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Home Fuel Order");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void sales(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/sales for customer.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("sales for customer");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void orderHistory(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Order history.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Order History");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void showProfile(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Personal Information.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Profile");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void subsPlan(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/SubscriptionPlan.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Subscription Plan");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@FXML
	void backHome(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/homePageCus.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Home Page");

		primaryStage.setScene(scene);
		primaryStage.show();

	}
	boolean IsEmpty(TextField ob )
	{
		if(ob.getText().isEmpty())
			return true;
		return false;
	}

	int nothingEmpty=1;
	@FXML
	void updateBtn(ActionEvent event) throws IOException {
		ArrayList<String> employeesArrayList = new ArrayList<String>();
		String password,repassword;
		password=this.pass.getText();
		repassword=this.rePass.getText();
		if(IsEmpty(this.Fname))
		{
			FnameStar.setVisible(true);
			missedRF.setVisible(true);
		}
		else
		{
			FnameStar.setVisible(false);
			missedRF.setVisible(false);
		}
		if(IsEmpty(this.Lname))
		{
			LnameStar.setVisible(true);
			missedRF.setVisible(true);
		}
		else
		{
			LnameStar.setVisible(false);
			missedRF.setVisible(false);
		}
		if(IsEmpty(this.id))
		{
			IDStar.setVisible(true);
			missedRF.setVisible(true);
		}
		else
		{
			IDStar.setVisible(false);
			missedRF.setVisible(false);
		}
		if(IsEmpty(this.email))
		{
			EmailStar.setVisible(true);
			missedRF.setVisible(true);
		}
		else
		{
			EmailStar.setVisible(false);
			missedRF.setVisible(false);
		}
		if(IsEmpty(this.rePass)&&!(IsEmpty(this.pass)))
		{
			RepassStar.setVisible(true);
			missedRF.setVisible(true);
		}
		else
		{
			RepassStar.setVisible(false);
			missedRF.setVisible(false);
		}
		if(cusType.getValue().equals("choose"))
		{
			typeStar.setVisible(true);
			missedRF.setVisible(true);
		}
		else
		{
			typeStar.setVisible(false);
			missedRF.setVisible(false);
		}
		if(!(IsEmpty(this.Fname))&&!(IsEmpty(this.Lname))&&!(IsEmpty(this.id))&&!(IsEmpty(this.email))&&((!(IsEmpty(this.rePass))&&!(IsEmpty(this.pass)))||((IsEmpty(this.rePass))&&(IsEmpty(this.pass))))&&!(cusType.getValue().equals("choose")))
		{
			System.out.println("Saving The New Data In The Server");
			employeesArrayList.add("UpdateUser");
			if(ChatClient.flag==1) 
			{
				employeesArrayList.add(ChatClient.User.getUsername());
				employeesArrayList.add(ChatClient.User.getPassword());		
			}
			if(ChatClient.flag==2) 
			{
				employeesArrayList.add(ChatClient.emp.getUsername());
				employeesArrayList.add(ChatClient.emp.getPassword());		
			}
	
			employeesArrayList.add(this.id.getText());
			employeesArrayList.add(this.Fname.getText());
			employeesArrayList.add(this.Lname.getText());
			employeesArrayList.add(this.email.getText());
			System.out.println(password.equals(repassword));
			if(password.equals(repassword))
			{
				badPassword.setVisible(false);
				employeesArrayList.add(this.pass.getText());
				ClientUI.chat.accept(employeesArrayList);
				FXMLLoader loader = new FXMLLoader();
	
				((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window
	
				Stage primaryStage = new Stage();
	
				Pane root = loader.load(getClass().getResource("/gui/updatedsuccessful.fxml").openStream());
	
				Scene scene = new Scene(root);
				primaryStage.setTitle("updated successfully!");
	
				primaryStage.setScene(scene);
				primaryStage.show();
	
			}
			else
			{
				badPassword.setVisible(true);
				this.pass.clear();
				this.rePass.clear();
			}
		
		}
	}

	@FXML
	void logoutBtn(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/MAIN.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Main Page");

		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
