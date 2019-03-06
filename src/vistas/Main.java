/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author lamorenoca
 */
public class Main extends Application{
    
    @Override
    public void start(Stage primaryStage){
        Singleton  singleton= Singleton.getSingleton();
        singleton.setStage(primaryStage);
        
        Modelo modelo=new Modelo();
        ControladorVista1 vista=new ControladorVista1(modelo);
        vista.mostrarVista();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
