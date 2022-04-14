package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class menu_AnasayfaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_dis;

    @FXML
    private Button btn_fonk;

    @FXML
    private Button btn_ham;

    @FXML
    private Button btn_ic;

    @FXML
    private Button btn_trans;
    
    @FXML
    private AnchorPane anchor_sag;

    @FXML
    private AnchorPane anchor_sol;

    @FXML
    private AnchorPane anchor_tumu;

    @FXML
    void btn_dis_Click(ActionEvent event) {
    	//Dis stage (Form) olusturma
    	try {
    		Stage stage=new Stage();
        	AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("Form3.fxml"));
        	Scene scene1=new Scene(pane1);
        	stage.setScene(scene1);
        	stage.getIcons().add(new Image(getClass().getResourceAsStream("logom.png")));
        	stage.show();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
   }

    @FXML
    void btn_fonk_Click(ActionEvent event) {
    	//Dis stage arasi veri ve bilesen transferi
    	try {
    		FXMLLoader loader=new FXMLLoader(getClass().getResource("menu_sag.fxml"));
        	AnchorPane pane2=(AnchorPane) loader.load();
        	menu_sagController nesne=loader.getController();
        	
        	Scene scene1=new Scene(pane2);
        	nesne.VeriAl("Deneme: ÝSTE deðeri");
        	
        	Stage stage1=new Stage();
        	stage1.setScene(scene1);
        	stage1.show();
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
    	
    }
    
    public int durum=0;

    @FXML
    void btn_ham_Click(ActionEvent event) {
    	
    	if(durum==0) {
    		FadeTransition fd1=new FadeTransition(Duration.seconds(0.5), anchor_sol);
        	fd1.setFromValue(0);
        	fd1.setToValue(0.6);
        	fd1.play();
        	
        	TranslateTransition tt1=new TranslateTransition(Duration.seconds(0.5), anchor_sol);
        	tt1.setByX(-200); //X dogrultusunda 
        	//tt1.setByY(0);//Y dogrultusunda
        	tt1.play();
        	durum=1;
    	}
    	else {
        	TranslateTransition tt1=new TranslateTransition(Duration.seconds(0.5), anchor_sol);
        	tt1.setByX(+200); //X dogrultusunda 
        	//tt1.setByY(0);//Y dogrultusunda
        	tt1.play();
        	durum=0;
    	}
    	
    	
    	
    	
    }

    @FXML
    void btn_ic_Click(ActionEvent event) {
    	try {
        	AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("menu_sol.fxml"));
        	anchor_sol.getChildren().setAll(pane1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    }

    @FXML
    void btn_trans_Click(ActionEvent event) {
    	//Dis stage (Form) olusturma
    	try {
    		Stage stage=new Stage();
        	AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("Form3.fxml"));
        	Scene scene1=new Scene(pane1);
        	stage.setScene(scene1);
        	stage.setOpacity(0.5);
        	stage.setTitle("ÝSTE Otomasyon");
        	stage.centerOnScreen();
        	
        	stage.initStyle(StageStyle.DECORATED); //Varsayilan
        	stage.initStyle(StageStyle.UNIFIED); //Varsayilan
        	stage.initStyle(StageStyle.TRANSPARENT); //Transparan Gorunum saglama form elemanlari yok
        	stage.initStyle(StageStyle.UTILITY); //SAdece kapat butonu
        	stage.setFullScreen(true);
        	
        	
        	stage.show();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
    }

    @FXML
    void initialize() {
    	try {
        	AnchorPane pane1= (AnchorPane) FXMLLoader.load(getClass().getResource("Form3.fxml"));
        	anchor_sol.getChildren().setAll(pane1);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	

    }

}
