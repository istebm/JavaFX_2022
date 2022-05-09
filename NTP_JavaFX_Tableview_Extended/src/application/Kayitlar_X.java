package application;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Kayitlar_X {
	private int id;
	private String kul_adi;
	private double ortalama;
	
	private CheckBox onay;
	private TextField metinkutusu;
	private Button buton;
	
	Kayitlar_X(){
		
	}
	
	Kayitlar_X(int id, String kul_adi, double ortalama, String icerik, Button buton){
		this.id=id;
		this.kul_adi=kul_adi;
		this.ortalama=ortalama;
		
		
		this.onay=new CheckBox();
		//onay.setText("Metin");
		this.metinkutusu=new TextField();
		this.metinkutusu.setText(icerik);
		
		this.buton=buton;
		this.buton.setText("Mesaj Yolla");		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKul_adi() {
		return kul_adi;
	}

	public void setKul_adi(String kul_adi) {
		this.kul_adi = kul_adi;
	}

	public double getOrtalama() {
		return ortalama;
	}

	public void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}

	public CheckBox getOnay() {
		return onay;
	}

	public void setOnay(CheckBox onay) {
		this.onay = onay;
	}

	public TextField getMetinkutusu() {
		return metinkutusu;
	}

	public void setMetinkutusu(TextField metinkutusu) {
		this.metinkutusu = metinkutusu;
	}

	public Button getButon() {
		return buton;
	}

	public void setButon(Button buton) {
		this.buton = buton;
	}
	
}
