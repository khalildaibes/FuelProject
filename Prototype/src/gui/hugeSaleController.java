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

public class hugeSaleController 
{
	@FXML
	private Button backMain = null;
	@FXML
	private Button clicktosignup=null;
	
	
	public void back(ActionEvent event) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/NewsFeed.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);		
		primaryStage.show();
		
		
	
	}
	
	public void clicktosignup(ActionEvent event) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();

		
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/signup.fxml").openStream());

		Scene scene = new Scene(root);			
		primaryStage.setTitle("Sign Up");

		primaryStage.setScene(scene);		
		primaryStage.show();
		
		
	
	}
}
