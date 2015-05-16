package ClientForm;



import java.awt.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ClientPart.Client;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public abstract class Controller implements Initializable{

	@FXML
	private Button btnStart, btnSend;
	
	@FXML
	public static TextArea textArea;
	
	@FXML
	public static TextField textField;

	@FXML
	private void startOnClick() throws Exception{
		textArea.appendText("This client start...");
		try {
			Client.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FXML
	private void sendOnClick() throws Exception{
		textArea.appendText("This client start...");
		try {
			Client.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
