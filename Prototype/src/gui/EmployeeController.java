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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import logic.Employee;
import client.*;

public class EmployeeController implements Initializable {
//	private Employee e;
		
	
	@FXML
	private TextField txtFName;
	@FXML
	private TextField txtLName;
	@FXML
	private TextField txtEmpID;
	@FXML
	private TextField txtEmail;
	@FXML
	private TextField txtRole;
	@FXML
	private TextField txtCompany;
	
	@FXML
	private Button btnClose=null;
	
	@FXML
	private Button btnSave=null;

		
	
	ChatClient client;
	
	ObservableList<String> list;
	
	 
	 
	
	public void loadStudent(Employee e){
		this.txtEmpID.setText(e.getId());
		this.txtFName.setText(e.getFName());
		this.txtLName.setText(e.getLName());
		this.txtEmail.setText(e.getEmail());
		this.txtRole.setText(e.getRole());
		this.txtCompany.setText(e.getStation_id());
	}
	public void getCloseBtn(ActionEvent event) throws Exception {
		
		System.out.println("Return to The Previous Window");
		FXMLLoader loader = new FXMLLoader();
		
	
		((Node)event.getSource()).getScene().getWindow().hide(); //hiding primary window
		Stage primaryStage = new Stage();//big window
		Pane root = loader.load(getClass().getResource("/gui/login.fxml").openStream());


		Scene scene = new Scene(root);			//small window
		primaryStage.setTitle("Login Page");

		primaryStage.setScene(scene);		
		primaryStage.show();
			
		
		
	}
	public void getSaveBtn(ActionEvent event) throws Exception {//save the new data of the student if changed 
		
		ArrayList<String> employeesArrayList= new ArrayList<String>();
		System.out.println("Saving The New Data In The Server");
		employeesArrayList.add("UpdateEmployee");
		employeesArrayList.add(this.txtEmpID.getText());
		employeesArrayList.add(this.txtFName.getText());
		employeesArrayList.add(this.txtLName.getText());
		employeesArrayList.add(this.txtEmail.getText());
		employeesArrayList.add(this.txtCompany.getText());
		employeesArrayList.add(this.txtRole.getText());
		ClientUI.chat.accept(employeesArrayList);
		
	
	}
	
	// creating list of Faculties
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {	
				
	}
	

	

	
}
