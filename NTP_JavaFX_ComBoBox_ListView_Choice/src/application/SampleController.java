package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> combo1;

    @FXML
    private ListView<String> list1;

    @FXML
    private Button btn1;

    @FXML
    private TextField txt_1;

    @FXML
    private ChoiceBox<String> choice1;

    @FXML
    private Label lbl1;

    @FXML
    void btn1_Click(ActionEvent event) {
    	//combo1.getItems().add(txt_1.getText());
    	//TextFieldda yazani combobox sonuna ekler
    	ObservableList<String> icerik;
    	icerik=list1.getSelectionModel().getSelectedItems();
    	for (String i : icerik) {
			System.out.println(i);
		}
    	
    	ObservableList<Integer> indisler;
    	indisler=list1.getSelectionModel().getSelectedIndices();
    	for (int i : indisler) {
			System.out.println(i);
		}
    	
    	
    }

    @FXML
    void combo1_Action(ActionEvent event) {
    	//combo1.getItems().add(3, "***********");
    	//Combonun 3.indisine deger ekleme
    	//combo1.getItems().remove(3);
    	//Combonun 3.indisindeki degeri silme
    	//combo1.getItems().remove("Deneme1");
    	//comboda ilk "Deneme1" degerini temizleme    	
    	//combo1.getItems().removeAll("Deneme1");
    	//Combodaki tum "Deneme1" degerlerini temizler
    	//combo1.getItems().removeAll("Deneme1", "Deneme2");
    	//Combo icerisindeki Birden fazla degeri silme (Liste, dizi, ObserableList olabilir
    	lbl1.setText( combo1.getSelectionModel().getSelectedItem());
    	//Comboda secili olan degeri getirir
    	lbl1.setText( String.valueOf(combo1.getSelectionModel().getSelectedIndex()));
    	//Comboda secilen indis numarasını getirir.
    	System.out.println(combo1.getItems().get(combo1.getSelectionModel().getSelectedIndex()));
    	System.out.println(combo1.getItems().get(4));
    	//Combodaki 4. indisteki degeri getir
    	
    	System.out.println(combo1.getItems().indexOf("Deneme1"));
    	//Comboda "Deneme1" degeri ilk indisi
    	System.out.println(combo1.getItems().lastIndexOf("Deneme1"));
    	//Comboda "Deneme1" degeri en son kacinci indiste
    	
    }

    @FXML
    void initialize() {
        combo1.setPromptText("Deger Seçiniz");
        String[] dizi= {"Deneme1", "Deneme2", "Deneme3", "Deneme1"};
        
        combo1.getItems().addAll(dizi);
        
        ObservableList<String> dizi2= FXCollections.observableArrayList("deger 1", "deger 2", "deger3");
        combo1.getItems().addAll(dizi2);
        
        list1.getItems().addAll(dizi2);
        
        //List - ComboBox- ChoiceBox Select islemleri
        list1.getSelectionModel().getSelectedItem();
        //Listede Secili olani verir
        list1.getSelectionModel().getSelectedIndex();
        //Listede secili olan indisi donderir
        
        list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        list1.getSelectionModel().getSelectedIndices();
        //Listede birden fazla secili varsa onlarin indislerini verir
        
        list1.getSelectionModel().getSelectedItems();
        //Listede birden fazla secili varsa o degerleri donderir
        
        list1.getSelectionModel().select(3);
        //3 nolu indisi sec
        list1.getSelectionModel().selectAll();
        //Listedeki tumunu sec
        list1.getSelectionModel().selectFirst();
        //Listenin 0.indisini secer
        list1.getSelectionModel().selectLast();
        //Listenin Son indisini secer
        list1.getSelectionModel().selectNext();
        //Hangi indisteyseniz bir sonraki indisi secer
        list1.getSelectionModel().selectPrevious();
        //Hangi indisteysenin bir oncekini secer
        list1.getSelectionModel().selectRange(2, 3);
    	//Listeden Belirli indis araligi secme 2.ve 3. indis arasi    	
    	list1.getSelectionModel().clearSelection();
    	//List uzerindeki Secimi iptal eder
        
        
        
        
    }
}
