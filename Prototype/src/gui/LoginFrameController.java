package gui;

import java.util.ArrayList;

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

public class LoginFrameController {

	@FXML
	private Button signupBtn = null;
	@FXML
	private Button btnbackMain = null;
	@FXML
	private Button btnsignin = null;
	@FXML
	private Button aboutus = null;

	@FXML
	private Button contactus = null;
	@FXML
	private Button stationFind = null;

	@FXML
	private Button news = null;

	@FXML
	private TextField idtxt;

	@FXML
	private TextField passtxt;

	private String getID() {
		return idtxt.getText();
	}

	private String getPass() {
		return passtxt.getText();
	}

	public void stationFind(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/stationFinderMain.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Station Finder");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void contactus(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/contactusMain.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Contact Us");

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void aboutus(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/AboutUs.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("About Us");

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void showNews(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/NewsFeed.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void signupBtn(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window
		Stage primaryStage = new Stage();
		Pane root = loader.load(getClass().getResource("/gui/signup.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void btnsignin(ActionEvent event) throws Exception {
		ArrayList<String> Al = new ArrayList<String>();
		String id, pass;
		id = getID();
		pass = getPass();
		if (id.trim().isEmpty()) {

			System.out.println("You must enter a id number");

		} else if (pass.trim().isEmpty()) {
			System.out.println("You must enter a password");

		} else {
			Al.add("LogIn");
			Al.add(id);// change
			Al.add(pass);
			ClientUI.chat.accept(Al);
			/*
			 * if(ChatClient.emp.getId().equals("Error")) {
			 * System.out.println("Employee ID is Not Found");
			 * 
			 * }
			 */
			// else

			try {

			
			
				FXMLLoader loader = new FXMLLoader();

				((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window
				Stage primaryStage = new Stage();
				Pane root = loader.load(getClass().getResource("/gui/homePageCus.fxml").openStream());

				Scene scene = new Scene(root);
				primaryStage.setTitle("Main Page");

				primaryStage.setScene(scene);
				primaryStage.show();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public void backMain(ActionEvent event) throws Exception {

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
