package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TableViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Kayitlar> kayitlar_table;

    @FXML
    private TableColumn<Kayitlar, Integer> id;

    @FXML
    private TableColumn<Kayitlar, String> kul_adi;

    @FXML
    private TableColumn<Kayitlar, String> sifre;

    @FXML
    private TextField txt_kul;

    @FXML
    private TextField txt_sifre;

    @FXML
    private Button btn_ekle;

    @FXML
    private Button btn_sil;

    @FXML
    private Button btn_guncelle;

    @FXML
    private Label lbl_deger;

    @FXML
    private Button btn_goster;
    
    ObservableList<Kayitlar> veriler;

    @FXML
    void btn_ekle_Click(ActionEvent event) {
    	veriler=FXCollections.observableArrayList();
    	veriler.add(new Kayitlar(3, txt_kul.getText(), txt_sifre.getText()));
    	kayitlar_table.getItems().addAll(veriler);
    }

    @FXML
    void btn_goster_Click(ActionEvent event) {
    	//Secili kaydi aldirmak icin
    	Kayitlar kayit=new Kayitlar();
    	if(kayitlar_table.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(Kayitlar) kayitlar_table.getItems().get(kayitlar_table.getSelectionModel().getSelectedIndex());
    		
    		lbl_deger.setText("Deger= ID:"+kayit.getId()+ " Kullanýcý Adý:"+kayit.getKul_ad()+ " Þifre="+kayit.getSifre());
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kayýt seçilmedi....");
    	}
    	
    }

    @FXML
    void btn_guncelle_Click(ActionEvent event) {
    	//Secili Kaydi Aldirmak icin
    	Kayitlar kayit=new Kayitlar();
    	if(kayitlar_table.getSelectionModel().getSelectedIndex()!=-1) {
    		kayit=(Kayitlar) kayitlar_table.getItems().get(kayitlar_table.getSelectionModel().getSelectedIndex());
    		int idm=kayit.getId();
    		//txt_kul.setText(kayit.getKul_ad());
    		//txt_sifre.setText(kayit.getSifre());
    		//lbl_deger.setText("Deger= ID:"+kayit.getId()+ " Kullanýcý Adý:"+kayit.getKul_ad()+ " Þifre="+kayit.getSifre());
    		
    		//Yeni kayitlar olusturarak indise gore deger atama
    		Kayitlar kk=new Kayitlar(idm, txt_kul.getText(), txt_sifre.getText());
    		int sira=kayitlar_table.getSelectionModel().getSelectedIndex();
    		kayitlar_table.getItems().set(sira, kk);
    		
    	}
    	else {
    		lbl_deger.setText("Herhangi bir kayýt seçilmedi....");
    	}
    }

    @FXML
    void btn_sil_Click(ActionEvent event) {
    	ObservableList<Kayitlar> secilenKayit, tumKayitlar;
    	tumKayitlar=kayitlar_table.getItems();
    	secilenKayit=kayitlar_table.getSelectionModel().getSelectedItems();
    	
    	secilenKayit.forEach(tumKayitlar::remove);
    }

    @FXML
    void initialize() {
    	btn_ekle.setTooltip(new Tooltip("Kayýt eklemeyi saðlar...."));
    	//Tooltip Ekleme
    	
    	Tooltip tip=new Tooltip();
    	tip.setStyle("-fx-background-color:gray;");
    	tip.setText("Silme iþlemi yapar...");
    	Image img=new Image(getClass().getResourceAsStream("logo.png"));
    	tip.setGraphic(new ImageView(img));
    	btn_sil.setTooltip(tip);
    	
    	//TableView veri gomme
    	veriler=FXCollections.observableArrayList();
    	veriler.add(new Kayitlar(1, "admin", "12345"));
    	veriler.add(new Kayitlar(2, "root", "123456"));
    	veriler.add(new Kayitlar(3, "user", "iste123"));
    	
    	//Ýlk id tableColumn ismi 
    	//ikinci id Kayitlar Classindan gelen id
    	id.setCellValueFactory(new PropertyValueFactory<>("id"));
    	kul_adi.setCellValueFactory(new PropertyValueFactory<>("kul_ad"));
    	sifre.setCellValueFactory(new PropertyValueFactory<>("sifre"));
    	
    	kayitlar_table.setItems(veriler);
    	
    	//kul_adi.setVisible(false);
    	//Tableview icerisindeki TableColumn gizlenmesi
    	
    }
    
    
    
    public static class Kayitlar{
    	private int id;
    	private String kul_ad;
    	private String sifre;
    	
    	Kayitlar() {
			// TODO Auto-generated constructor stub
    		this.id=0;
		}
    	
    	Kayitlar(int id, String kul_ad, String sifre){
    		this.id=id;
    		this.kul_ad=kul_ad;
    		this.sifre=sifre;
    	}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getKul_ad() {
			return kul_ad;
		}

		public void setKul_ad(String kul_ad) {
			this.kul_ad = kul_ad;
		}

		public String getSifre() {
			return sifre;
		}

		public void setSifre(String sifre) {
			this.sifre = sifre;
		}
    	
    	
    	
    	
    }
}
