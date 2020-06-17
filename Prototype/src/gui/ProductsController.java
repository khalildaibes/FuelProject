package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;
import logic.Employee;
import logic.Product;
import logic.Vehicle;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class ProductsController implements Initializable {
	ObservableList<Product> list = FXCollections.observableArrayList();
	
	public static Product selectedPr =new Product(0, 0, 0, null);
	
	@FXML
	private Button backHome;

	@FXML
	private Button addtoCart;

	@FXML
	private TableView<Product> productsList;

	@FXML
	private TableColumn<Product, String> pname;

	@FXML
	private TableColumn<Product, String> pid;

	@FXML
	private TableColumn<Product, String> price;

	@FXML
	private TableColumn<Product, String> quantity;
    @FXML
    private TableColumn<Product, String> description;
	

	@FXML
	private Button showProductDetails;

	@FXML
	private Button logoutBtn;

	@FXML
	private MenuItem buyProduct = null;
	@FXML
	private MenuItem homeOrder = null;
	@FXML
	private MenuItem subsPlan = null;
	@FXML
	private MenuItem orderHistory = null;
	@FXML
	private MenuItem tracker = null;
	@FXML
	private MenuItem sales = null;
	@FXML
	private MenuButton info = null;
	@FXML
	private MenuItem updateSubsPlan = null;
	@FXML
	private MenuItem showProfile1 = null;
	@FXML
	private MenuItem news = null;
	@FXML
	private MenuItem stationFind = null;
	@FXML
	private MenuItem contactUs = null;
	@FXML
	private MenuItem aboutUs = null;
	@FXML
	private MenuItem cart = null;
	@FXML
	private MenuItem carlist = null;
	@FXML
	private MenuItem addcar = null;

	public void updateSubsPlan(ActionEvent event) throws Exception {

		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/updatesubs.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Update Subscription");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void carlist(ActionEvent event) throws Exception {

		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Car List.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Cars List");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void addcar(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/vehicle.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Add Cars");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void cart(ActionEvent event) throws Exception {

		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Cart.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("My Cart");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void news(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/newsinhome.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("News");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void stationFind(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/stationFinderHome.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Station Finder");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void contactUs(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/contactusHome.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Contact Us");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void aboutUs(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/aboutusHome.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("About Us");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void tracker(ActionEvent event) throws Exception {

		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Tracker.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Track Your Order");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void buyProduct(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Products.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Our Products");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void homeOrder(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Home fuel order.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Home Fuel Order");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void sales(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/sales for customer.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("sales for customer");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void orderHistory(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Order history.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Order History");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void showProfile(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/Personal Information.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Profile");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void subsPlan(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader();

		info.getScene().getWindow().hide();// hise the shit

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/SubscriptionPlan.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Subscription Plan");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@FXML
	void addtoCart(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/addedToCart.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Added To Cart");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@FXML
	void backHome(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/homePageCus.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Home Page");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@FXML
	void logoutBtn(ActionEvent event) throws IOException {

		FXMLLoader loader = new FXMLLoader();

		((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window

		Stage primaryStage = new Stage();

		Pane root = loader.load(getClass().getResource("/gui/MAIN.fxml").openStream());

		Scene scene = new Scene(root);
		primaryStage.setTitle("Main Page");

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@FXML
	void showProductDetails(ActionEvent event) throws IOException {
		if (productsList.getSelectionModel().getSelectedItem() != null) {
			Product selectedproduct = productsList.getSelectionModel().getSelectedItem();
			selectedPr=selectedproduct;

			FXMLLoader loader = new FXMLLoader();
			
			((Node) event.getSource()).getScene().getWindow().hide(); // hiding primary window
			
			Stage primaryStage = new Stage();
			
			Pane root = loader.load(getClass().getResource("/gui/ProductDetails.fxml").openStream());
			
			Scene scene = new Scene(root);
			primaryStage.setTitle("Product Details Page");
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}


	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		/*
		 * carIdCulm.setCellValueFactory(new PropertyValueFactory<Vehicle,
		 * String>("vehicle id ")); carIdCulm.setCellValueFactory(new
		 * PropertyValueFactory<Vehicle, String>("owner id  "));
		 * carIdCulm.setCellValueFactory(new PropertyValueFactory<Vehicle,
		 * String>("a id "));
		 */
		pname.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
		pid.setCellValueFactory(new PropertyValueFactory<Product, String>("product_id"));
		price.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));
		quantity.setCellValueFactory(new PropertyValueFactory<Product, String>("quantity"));

		ArrayList<String> cmd = new ArrayList<String>();
		cmd.add("GetProductListForGsdStation");
		cmd.add(ChatClient.emp.getUsername());
		cmd.add(ChatClient.emp.getPassword());
		cmd.add("635124");/// gas station id
		ClientUI.chat.accept(cmd);
		load_Products_List();

	}

	private void load_Products_List() {
		// TODO Auto-generated method stub
		ArrayList<Product> products = ChatClient.products;
		for (int i = 0; i < products.size(); i++) {
			list.add(products.get(i));
		}
		productsList.setItems(list);

	}

}
