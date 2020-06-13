package gui;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class successfulPage {

    @FXML
    private Button backHome;
    @FXML
    private Button backBtn;
    @FXML
    private Button back2Btn;

    @FXML
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
    
    @FXML
    public void backBtn(ActionEvent event) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader();
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		
		Stage primaryStage = new Stage();
		
		Pane root = loader.load(getClass().getResource("/gui/Products.fxml").openStream());
		
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Our Products Page");

		primaryStage.setScene(scene);		
		primaryStage.show();


	}
    @FXML
    public void back2Btn(ActionEvent event) throws Exception 
	{
		FXMLLoader loader = new FXMLLoader();
		
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		
		Stage primaryStage = new Stage();
		
		Pane root = loader.load(getClass().getResource("/gui/Home fuel order.fxml").openStream());
		
		Scene scene = new Scene(root);			
		primaryStage.setTitle("Home Fuel Order Page");

		primaryStage.setScene(scene);		
		primaryStage.show();


	}

}
