package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import client.ChatClient;
import client.ClientUI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Employee;

public class entertxtController implements Initializable {
	public String txt = "enter employee number";
	public String path = "EmployeeUpdate";
	public String command = "GetGasStationData";
	ArrayList<String> cmd = new ArrayList<String>();

	@FXML
	private Button submitbtn;

	@FXML
	private Button canclebtn;

	@FXML
	private Label text1;

	@FXML
	private Label text2;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		text1.setText(command);
		text2.setText(txt);
	}

	public void submitBtn(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		Stage primaryStage = new Stage();

	
		if (path == "Personal information") {
			if(ChatClient.flag==1) {
			cmd.add(command);
			cmd.add(ChatClient.User.getUsername());
			cmd.add(ChatClient.User.getPassword());
			cmd.add("123456");
			ClientUI.chat.accept(cmd);
			UpdateCustomerInformationController customerController= loader.getController();
			customerController.loadUser(ChatClient.User);
			}
			if(ChatClient.flag==2)
				cmd.add(command);
			cmd.add(ChatClient.emp.getUsername());
			cmd.add(ChatClient.emp.getPassword());
			cmd.add("123456");
			ClientUI.chat.accept(cmd);
			UpdateCustomerInformationController customerController= loader.getController();
			Employee emp=new Employee(ChatClient.emp.getUsername(),ChatClient.emp.getId(), ChatClient.emp.getPassword(),ChatClient.emp.getFName(),ChatClient.emp.getLName(),ChatClient.emp.getEmail(),ChatClient.emp.getStation_id(),ChatClient.emp.getRole());

			Pane root = loader.load(getClass().getResource("/gui/" + path + ".fxml").openStream());
			Scene scene = new Scene(root);
			primaryStage.setTitle("Update Subscription");
		//	customerController.loadUser(emp);
			primaryStage.setScene(scene);
			primaryStage.show();
			

		}

		// info.getScene().getWindow().hide();//hise the shit

		

	}

	public void cancleBtn(ActionEvent event) throws Exception {

		FXMLLoader loader = new FXMLLoader();

		// info.getScene().getWindow().hide();//hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/updatesubs.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Update Subscription");

		primaryStage.setScene(scene);
		primaryStage.show();

	}
}
