package gui;


import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import client.ChatClient;
import client.ClientUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Employee;
public class SignUpController 
{
	   @FXML
	    private TextField Lname=null;

	    @FXML
	    private TextField id;

	    @FXML
	    private TextField Fname;

	    @FXML
	    private TextField Email;

	    @FXML
	    private TextField Pass;

	    @FXML
	    private TextField rePass;
	    
	    @FXML
		private Button signupReq=null;
		
	    @FXML
		private Button backMain=null;
	
	    @FXML
		private Button btnlogin = null;
	
	    @FXML
		private Button aboutus=null;
		
		@FXML
		private Button contactus=null;
		
		@FXML
		private Button stationFind=null;
		
		@FXML
		private Button news=null;
		
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
	    
	    
	    public void signupReq(ActionEvent event) throws Exception 
		{
			
		}
}
