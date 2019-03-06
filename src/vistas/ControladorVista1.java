/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author lamorenoca
 */
public class ControladorVista1 {
    private Vista1 ventana;
    private Modelo modelo;
    
    public ControladorVista1(Modelo modelo){
        this.ventana=new Vista1();
        this.modelo=modelo;
        this.ventana.getBoton().setOnAction(new EventoBoton());
    }
    
    public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.ventana.mostrar(singleton.getStage());
    }
    
    class EventoBoton implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent event){
          ControladorVista2 controlador=new ControladorVista2(modelo); 
          controlador.mostrarVista();
    }
}
}
