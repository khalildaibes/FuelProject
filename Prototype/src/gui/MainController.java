package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import client.ChatClient;
import client.ClientUI;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Employee;
import client.*;

public class MainController 
{

	
	@FXML
	private Button btnlogin = null;
	
	@FXML
	private Button btnsaledetail=null;
	@FXML
	private Button aboutus=null;
	
	@FXML
	private Button contactus=null;
	@FXML
	private Button stationFind=null;
	
	@FXML
	private Button news=null;
	/*@FXML
	private TextField idtxt;
	
	@FXML
	private TextField passtxt;*/
	public void saledetails(ActionEvent event) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/Feed2.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("Huge Sale");

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
	
	public void start(Stage primaryStage) throws Exception 
	{	
		Parent root = FXMLLoader.load(getClass().getResource("/gui/MAIN.fxml"));
				
		Scene scene = new Scene(root);
		primaryStage.setTitle("Main Page");
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}
}
