/**
 * 
 */
/**
 * @author Moustafa
 *
 */
package client;


import javafx.application.Application;

import javafx.stage.Stage;
import logic.Employee;

import java.util.Vector;
import gui.MainController;
import client.ClientController;

public class ClientUI extends Application {
	public static ClientController chat;

	public static void main( String args[] ) throws Exception
	   { 
		    launch(args);  
	   } // end main
	 
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		 chat= new ClientController("localhost", 5555);
		// TODO Auto-generated method stub
						  		
		 MainController aFrame = new MainController(); // create Main Frame
		 
		 aFrame.start(primaryStage);
		 
	}
	
	
}