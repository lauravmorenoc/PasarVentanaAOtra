/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author lamorenoca
 */
public class Vista2 {
   private Scene scene;

   private Button boton;

   private HBox hbBtn;
   
   public Vista2() {
      
      boton = new Button("Pues nada, ¿que pensaste?. Oprima otra vez a ver");
 
     
      hbBtn = new HBox(10);
      hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
   
      hbBtn.getChildren().add(boton);
      
 
      scene = new Scene(hbBtn, 300, 300);
   }
   
   public void mostrar(Stage stage) {
      stage.setTitle("Ventana2");
      stage.setScene(scene);
      stage.show();
   }
 
 
   public Button getBoton() {
      return boton;
   }
   
}
