package gui;

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


public class PaymentController 
{
	@FXML
    private Button backHome;

    @FXML
    private Button confirmBtn;

    @FXML
    private TextField Fname;

    @FXML
    private TextField Lname;

    @FXML
    private TextField billAdd;

    @FXML
    private ComboBox<?> payMethod;

    @FXML
    private TextField cardNumber;

    @FXML
    private TextField city;

    @FXML
    private TextField phone;

    @FXML
    private TextField zip;

    @FXML
    private Button logout;

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
		
		Pane root = loader.load(getClass().getResource("/gui/Payment Successful.fxml").openStream());
		
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Successful...");

		primaryStage.setScene(scene);		
		primaryStage.show();
    }

    @FXML
    void logout(ActionEvent event) throws IOException 
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
