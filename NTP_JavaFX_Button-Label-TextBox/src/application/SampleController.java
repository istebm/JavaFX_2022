package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txt_1;

    @FXML
    private TextField txt_2;

    @FXML
    private Label lbl_1;

    @FXML
    private Button btn_Hesapla;

    @FXML
    private Button btn_temizle;

    @FXML
    void btn_Hesapla_Click(ActionEvent event) {
    	double sayi1= Double.parseDouble(txt_1.getText());
    	double sayi2=Double.parseDouble(txt_2.getText());
    	double sonuc=sayi1+sayi2;
    	
    	lbl_1.setText(Double.toString(sonuc));
    	
    	//Double.toString()
    	//Float.toString()
    	//Integer.toString()
    	
    	//Double.parseDouble(s)
    	//Integer.parseInt(s)
    	//Float.parseFloat(s)
    }

    @FXML
    void btn_Temizle_Click(ActionEvent event) {
    	txt_1.setText("");
    	txt_2.setText("");
    	lbl_1.setText("");
    }

    @FXML
    void initialize() {
        
    }
}
