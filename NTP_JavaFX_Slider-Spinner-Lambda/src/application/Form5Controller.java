package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Form5Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Slider slider1;

    @FXML
    private Slider slider2;

    @FXML
    private Spinner<Integer> spin1;

    @FXML
    private Spinner<String> spin2;

    @FXML
    private Spinner<Double> spin3;

    @FXML
    private Spinner<Integer> spin4;

    @FXML
    private Spinner<Integer> spin5;

    @FXML
    private Spinner<Integer> spin6;

    @FXML
    private Spinner<Integer> spin7;

    @FXML
    private Spinner<Integer> spin8;

    @FXML
    void btn1_Click(ActionEvent event) {

    }

    @FXML
    void btn2_Click(ActionEvent event) {

    }

    @FXML
    void initialize() {
        int secilen=2;
        
        SpinnerValueFactory<Integer> deger1=new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 15, secilen);
        //(baslangic, bitis, secili)
        spin1.setValueFactory(deger1);
        
        
        ObservableList<String> aylar=FXCollections.observableArrayList("Ocak", "Þubat", "Mart", "Nisan");
        SpinnerValueFactory<String> deger2=new SpinnerValueFactory.ListSpinnerValueFactory<>(aylar);
        deger2.setValue("Deneme");
        spin2.setValueFactory(deger2);
        
        SpinnerValueFactory<Double> deger3=new SpinnerValueFactory.DoubleSpinnerValueFactory(1.1, 5.9, 1.3, 0.1);
      //(baslangic, bitis)
      //(baslangic, bitis, secili)
      //(baslangic, bitis, secili, kacarkacar)
        spin3.setValueFactory(deger3);
        
        spin4.setValueFactory(deger1);
        spin4.getStyleClass().add(Spinner.STYLE_CLASS_ARROWS_ON_LEFT_HORIZONTAL);
        spin5.setValueFactory(deger1);
        spin5.getStyleClass().add(Spinner.STYLE_CLASS_ARROWS_ON_LEFT_VERTICAL);
        spin6.setValueFactory(deger1);
        spin6.getStyleClass().add(Spinner.STYLE_CLASS_ARROWS_ON_RIGHT_HORIZONTAL);
        spin7.setValueFactory(deger1);
        spin7.getStyleClass().add(Spinner.STYLE_CLASS_SPLIT_ARROWS_VERTICAL);
        spin8.setValueFactory(deger1);
        //spin8.getStyleClass().add(Spinner.BASELINE_OFFSET_SAME_AS_HEIGHT);
        
        spin8.valueProperty().addListener(
        		
        		(obs, oldValue, newValue)->{System.out.println("Spinner yeni degeri:"+newValue);
    										System.out.println("Spinner eski deger"+oldValue);
        		}
        		
        		);
        
        
        slider1.setMax(55);
        slider1.setMin(15);
        
        slider1.setShowTickLabels(true);
        //Tick etiketleri
        slider1.setShowTickMarks(true);
        //Tick markerlari
        
        slider1.setMajorTickUnit(5);
        //Slider En fazla kac birim gidecek
        
        slider1.setBlockIncrement(10);
        
        //Slider Change listener ile event atamasi
        slider1.valueProperty().addListener(new ChangeListener<Number>() {
        	@Override
        	public void changed(ObservableValue<?extends Number> obs, Number oldValue, Number newValue) {
        		System.out.println("Slider eski deger="+oldValue);
        		lbl1.setText(String.valueOf(oldValue));
        		System.out.println("Slider yeni deger="+newValue);
        		lbl2.setText(String.valueOf(newValue));
        	}
		});
        
        //Slider Lambda ile event atama
        
        slider1.valueProperty().addListener(
        		
        		(obs, oldValue, newValue)->{
        			System.out.println("Spinner eski deger="+oldValue);
            		lbl1.setText(String.valueOf(oldValue));
            		System.out.println("Spinner yeni deger="+newValue);
            		lbl2.setText(String.valueOf(newValue));	
        			
        		}
        		
        		);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
