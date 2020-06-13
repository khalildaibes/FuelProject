package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;


import client.ChatClient;
import client.ClientUI;
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
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;



public class AddCarController 
{
	 @FXML
	    private Button confirmBtn;

	    @FXML
	    private Button backMain;

	    @FXML
	    private TextField carId;

	    @FXML
	    private ComboBox<?> fuelType;

	    @FXML
	    private CheckBox checkPrivate;

	    @FXML
	    private CheckBox checkCompany;
	    @FXML
	    private Button logoutBtn;

	    @FXML
	    private CheckBox checkDalkan;

	    @FXML
	    private Button addAnotherCar;

	    

		@FXML
		private MenuItem buyProduct=null;
		@FXML
		private MenuItem homeOrder=null;
		@FXML
		private MenuItem subsPlan=null;
		@FXML
		private MenuItem orderHistory=null;
		@FXML
		private MenuItem tracker=null;
		@FXML
		private MenuItem sales=null;
		@FXML
		private MenuButton info=null;
		@FXML
		private MenuItem updateSubsPlan=null;
		@FXML
		private MenuItem showProfile1=null;
		@FXML
		private MenuItem news=null;
		@FXML
		private MenuItem stationFind=null;
		@FXML
		private MenuItem contactUs=null;
		@FXML
		private MenuItem aboutUs=null;
		@FXML
		private MenuItem cart=null;
		@FXML
		private MenuItem carlist=null;
		@FXML
		private MenuItem addcar=null;


	public void updateSubsPlan(ActionEvent event) throws Exception 
		{


			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/updatesubs.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Update Subscription");

			primaryStage.setScene(scene);		
			primaryStage.show();


		}
		public void carlist(ActionEvent event) throws Exception 
		{

			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/Car List.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Cars List");

			primaryStage.setScene(scene);		
			primaryStage.show();

		}
		public void addcar(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/vehicle.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Add Cars");

			primaryStage.setScene(scene);		
			primaryStage.show();

		}

		public void cart(ActionEvent event) throws Exception 
		{

			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/Cart.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("My Cart");

			primaryStage.setScene(scene);		
			primaryStage.show();



		}
		public void news(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/newsinhome.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("News");

			primaryStage.setScene(scene);		
			primaryStage.show();


		}
		public void stationFind(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/stationFinderHome.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Station Finder");

			primaryStage.setScene(scene);		
			primaryStage.show();
			

		}
		public void contactUs(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/contactusHome.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Contact Us");

			primaryStage.setScene(scene);		
			primaryStage.show();


		}
		public void aboutUs(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/aboutusHome.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("About Us");

			primaryStage.setScene(scene);		
			primaryStage.show();

		}
	public void tracker(ActionEvent event) throws Exception 
		{
			

			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/Tracker.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Track Your Order");

			primaryStage.setScene(scene);		
			primaryStage.show();


		}
		public void buyProduct(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/Products.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Our Products");

			primaryStage.setScene(scene);		
			primaryStage.show();


		}
		public void homeOrder(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/Home fuel order.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Home Fuel Order");

			primaryStage.setScene(scene);		
			primaryStage.show();


		}
		public void sales(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/sales for customer.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("sales for customer");

			primaryStage.setScene(scene);		
			primaryStage.show();


		}
		public void orderHistory(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/Order history.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Order History");

			primaryStage.setScene(scene);		
			primaryStage.show();


		}
		public void showProfile(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/Personal Information.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Profile");

			primaryStage.setScene(scene);		
			primaryStage.show();


		}
		public void subsPlan(ActionEvent event) throws Exception 
		{
			FXMLLoader loader = new FXMLLoader();
			
			info.getScene().getWindow().hide();//hise the shit
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/SubscriptionPlan.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Subscription Plan");

			primaryStage.setScene(scene);		
			primaryStage.show();


		}
	    @FXML
	    void logoutBtn(ActionEvent event) throws IOException 
	    {
	    	FXMLLoader loader = new FXMLLoader();
			
			((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/MAIN.fxml").openStream());
			
			Scene scene = new Scene(root);			
			primaryStage.setTitle("Main Page");

			primaryStage.setScene(scene);		
			primaryStage.show();
	    }
	    
	    @FXML
	    void addAnotherCar(ActionEvent event) throws IOException 
	    {
	    	FXMLLoader loader = new FXMLLoader();

			
			
			((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
			Stage primaryStage = new Stage();
			Pane root = loader.load(getClass().getResource("/gui/vehicle.fxml").openStream());

			Scene scene = new Scene(root);			
			primaryStage.setTitle("Add Cars");

			primaryStage.setScene(scene);		
			primaryStage.show();
	    }

	    @FXML
	    void backHome(ActionEvent event) throws IOException 
	    {
	    	FXMLLoader loader = new FXMLLoader();

			
			
			((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
			Stage primaryStage = new Stage();
			Pane root = loader.load(getClass().getResource("/gui/homePageCus.fxml").openStream());

			Scene scene = new Scene(root);			
			primaryStage.setTitle("Home Page");

			primaryStage.setScene(scene);		
			primaryStage.show();

	    }

	    @FXML
	    void confirmBtn(ActionEvent event) throws IOException 
	    {
	
	    	FXMLLoader loader = new FXMLLoader();

			((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
			Stage primaryStage = new Stage();
			Pane root = loader.load(getClass().getResource("/gui/carAddedSuccessful.fxml").openStream());

			Scene scene = new Scene(root);			
			primaryStage.setTitle("Car Added Successfully!");

			primaryStage.setScene(scene);		
			primaryStage.show();
	    	
	    	
	    }


}
