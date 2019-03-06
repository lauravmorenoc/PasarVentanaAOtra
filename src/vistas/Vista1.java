/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author lamorenoca
 */
public class Vista1 {
   private Scene scene;
    
   private Button boton;

   private HBox hbBtn;
   
   public Vista1() {
      
      boton = new Button("¿Que pasa si oprimes esto?");
 
     
      hbBtn = new HBox(10);
      hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
   
      hbBtn.getChildren().add(boton);
      
 
      scene = new Scene(hbBtn, 300, 300);
   }
 
   public void mostrar(Stage stage) {
      stage.setTitle("Ventana1");
      stage.setScene(scene);
      stage.show();
   }
 
 
   //solo crea getters de elementos que son modificados y / o dinámicos
  
 
   public Button getBoton() {
      return boton;
   }
   
 
}
