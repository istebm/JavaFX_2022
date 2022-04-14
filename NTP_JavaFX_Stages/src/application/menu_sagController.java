package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class menu_sagController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl1;

    @FXML
    void initialize() {

    }
    
    public void VeriAl(String deger) {
    	lbl1.setText(deger);
    }
    


}
