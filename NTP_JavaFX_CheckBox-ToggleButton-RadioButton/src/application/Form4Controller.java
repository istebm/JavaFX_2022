package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class Form4Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private MenuItem btn_Kaydet;

    @FXML
    private CheckBox check1;

    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    private ToggleButton toggle1;

    @FXML
    private ToggleButton toggle2;
    
    ToggleGroup grup1=new ToggleGroup();
    ToggleGroup grup2=new ToggleGroup();

    @FXML
    void btn1_Click(ActionEvent event) {
    	ToggleButton secilen=(ToggleButton) grup1.getSelectedToggle();
    	System.out.println(secilen);
    }

    @FXML
    void btn_Kaydet_Click(ActionEvent event) {
    	System.out.println(check1.isSelected());
    	System.out.println(check1.isIndeterminate());
    }

    @FXML
    void check1_Click(ActionEvent event) {
    	if(check1.isSelected()) {
    		System.out.println("Check seçildi");
    		check1.setText("Açýk");
    	}
    	else {
    		System.out.println("Check seçili deðil");
    		check1.setText("Kapalý");
    	}
    }

    @FXML
    void radio1_Click(ActionEvent event) {
    	if(radio1.isSelected()) {
    		System.out.println("Radio seçildi");
    		radio1.setText("Açýk");
    	}
    	else {
    		System.out.println("Radio seçili deðil");
    		radio1.setText("Kapalý");
    	}
    }

    @FXML
    void toglle1_Click(ActionEvent event) {
    	boolean secim= toggle1.isSelected();
    	System.out.println(secim);
    	if(toggle1.isSelected()) {
    		System.out.println("Toggle seçildi");
    		toggle1.setText("Açýk");
    	}
    	else {
    		System.out.println("Toggle seçili deðil");
    		toggle1.setText("Kapalý");
    	}
    }

    @FXML
    void initialize() {
    	
    	check1.setIndeterminate(true);
    	
    	
    	
    	toggle1.setToggleGroup(grup1);
    	toggle2.setToggleGroup(grup1);
    	
    	
    	radio1.setToggleGroup(grup1);
    	radio2.setToggleGroup(grup1);
        
    }

}
