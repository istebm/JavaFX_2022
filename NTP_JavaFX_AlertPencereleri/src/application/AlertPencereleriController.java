package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

public class AlertPencereleriController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn_login;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    void btn1_CLick(ActionEvent event) {
    	Alert alert=new Alert(AlertType.WARNING);
    	alert.setTitle("�STE Otomasyon");
    	alert.setHeaderText("Bilgi Mesaj�");
    	alert.setContentText("Bu metinler otomasyon kullan�c�s�n� bilgilendirmek ama�l�d�r.");
    	alert.showAndWait();
    }

    @FXML
    void btn2_Click(ActionEvent event) {
    	Alert alert=new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("�STE Otomasyon");
    	alert.setHeaderText("Onay Mesaj�");
    	alert.setContentText("Bu metinler otomasyon kullan�c�s�n� bilgilendirmek ama�l�d�r. 2 buton var Ok ve Cancel");
    	
    	alert.showAndWait();
    }

    @FXML
    void btn3_Click(ActionEvent event) {
    	List<String> liste=new ArrayList<>();
    	//Arraylist , dizi ve observable list olabilir
    	liste.add("Adana");
    	liste.add("Ankara");
    	liste.add("Hatay");
    	
    	ChoiceDialog<String> dialog=new ChoiceDialog<String>("Adana",liste);
    	//Adana secili olarak gelecek sekilde liste eklendi
    	
    	Optional<String> sonuc= dialog.showAndWait();
    	if(sonuc.isPresent()) {
    		//Herhangi birsey secilmis ise
    		System.out.println("Se�ilen deger="+ sonuc.get());
    	}
    	
    	
    }

    @FXML
    void btn4_CLick(ActionEvent event) {
    	//TextInputDialog dialog=new TextInputDialog();
    	TextInputDialog dialog=new TextInputDialog("Deneme");
    	dialog.setTitle("�STE Otomasyon");
    	dialog.setHeaderText("TextField ile deger yollama");
    	dialog.setContentText("Telefonunuza g�nderilen onay metnini giriniz...");
    	Optional<String> sonuc= dialog.showAndWait();
    	if(sonuc.isPresent()) {
    		//Herhangi birsey secilmis ise
    		System.out.println("Se�ilen deger="+ sonuc.get());
    	}
    }

    @FXML
    void btn5_Click(ActionEvent event) {
    	Alert alert=new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("�STE Otomasyon");
    	alert.setHeaderText("Kendi butonlar�m�z");
    	alert.setContentText("Silmek istedi�inize emin misiniz");
    	
    	ButtonType btn1=new ButtonType("Evet");
    	ButtonType btn2=new ButtonType("Hay�r");
    	ButtonType btn3=new ButtonType("�ptal", ButtonData.CANCEL_CLOSE); //Iptal
    	//ButtonType btn3=new ButtonType("Tamam", ButtonData.OK_DONE); //Tamam
    	//ButtonType btn3=new ButtonType("Evet", ButtonData.YES); //Evet
    	//ButtonType btn3=new ButtonType("Hay�r", ButtonData.NO); //Hayir
    	
    	alert.getButtonTypes().setAll(btn1, btn2, btn3);
    	
    	Optional<ButtonType> sonuc= alert.showAndWait();
    	
    	if(sonuc.get()==btn1) {
    		System.out.println("Evet butonuna t�klan�nca yap�lacak i�lemler");
    	}
    	else if(sonuc.get()==btn2) {
    		System.out.println("Hay�r butonuna t�klan�nca yap�lacak i�lemler");
    	}
    	else if(sonuc.get()==btn3) {
    		System.out.println("�ptal butonuna t�klan�nca yap�lacak i�lemler");
    	}
    	else {
    		System.out.println("�ptal tu�u");
    	}
    	
    	
    	
    }

    @FXML
    void btn6_Click(ActionEvent event) {
    	Alert alert=new Alert(AlertType.ERROR);
    	alert.setTitle("�STE Otomasyon");
    	alert.setHeaderText("Hata Mesaj�");
    	alert.setContentText("Bu metinler otomasyon kullan�c�s�n� hatalar� konusunda bilgilendirme ama�l�d�r.");
    	alert.showAndWait();
    }

    @FXML
    void btn_login_Click(ActionEvent event) {
    	//Kontrol(txt1.getText(), txt2.getText());
    }

    
    @FXML
    void initialize() {

    }

}
