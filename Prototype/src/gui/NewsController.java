package gui;

import java.awt.event.MouseEvent;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class NewsController 
{
	@FXML
	private Button covidDetails = null;
	
	@FXML
	private ImageView backMainArrow = null;
	
	@FXML
	private Button dalkanDetails = null;
	@FXML
	private Button saleDetails = null;
	@FXML
	private Button hfDetails = null;
	@FXML
	private Button btnlogin = null;
	@FXML
	private Button btnlogin2 = null;
	@FXML
	private Button backMain = null;
	@FXML
	private Button backHome = null;
	
	@FXML
	private Button logoutBtn=null;
	@FXML
	private Button aboutus=null;
	
	@FXML
	private Button contactus=null;
	@FXML
	private Button stationFind=null;
	
	@FXML
	private Button news=null;
	
	/*public void backMainArrow(MouseEvent event) throws Exception 
    {
       
    	FXMLLoader loader = new FXMLLoader();

		
		
	//	((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/Feed1.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);		
		primaryStage.show();
		
    	
    }*/
	@FXML
	private MenuItem buyProduct=null;
	@FXML
	private MenuItem stationFindM=null;
	@FXML
	private MenuItem newsM=null;
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
	private MenuItem contactUsM=null;
	@FXML
	private MenuItem aboutUsM=null;
	@FXML
	private MenuItem cart=null;
	@FXML
	private MenuItem carlist=null;
	@FXML
	private MenuItem addcar=null;

	@FXML
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
	@FXML
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
	@FXML
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
	@FXML
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
	@FXML
	public void newsM(ActionEvent event) throws Exception 
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
	@FXML
	public void contactUsM(ActionEvent event) throws Exception 
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
	@FXML
	public void aboutUsM(ActionEvent event) throws Exception 
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
	@FXML
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
	@FXML
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
	@FXML
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
	@FXML
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
	@FXML
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
	@FXML
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
	@FXML
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
	public void stationFindM(ActionEvent event) throws Exception 
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

	public void stationFind(ActionEvent event) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/stationFinderMain.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("Station Finder");

		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	public void contactus(ActionEvent event) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/contactusMain.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("Contact Us");

		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	public void aboutus(ActionEvent event) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/AboutUs.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("About Us");

		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	
	public void showNews(ActionEvent event) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/NewsFeed.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);		
		primaryStage.show();
	}
	public void covidDetails(ActionEvent event) throws Exception 
    {
       
    	FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/Feed1.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);		
		primaryStage.show();
		
    	
    }
	public void backMain(ActionEvent event) throws Exception 
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
	public void backHome(ActionEvent event) throws Exception 
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
	public void dalkanDetails(ActionEvent event) throws Exception 
    {
       
    	FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/Feed4.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);		
		primaryStage.show();
		
    	
    }
	public void hfDetails(ActionEvent event) throws Exception 
    {
       
    	FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/Feed3.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);		
		primaryStage.show();
		
    	
    }
	public void saleDetails(ActionEvent event) throws Exception 
    {
       
    	FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/Feed2.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);		
		primaryStage.show();
		
    	
    }
	public void login(ActionEvent event) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/Login.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("Log in");

		primaryStage.setScene(scene);		
		primaryStage.show();
		
		

	}
	public void logoutBtn(ActionEvent event) throws Exception 
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
}
