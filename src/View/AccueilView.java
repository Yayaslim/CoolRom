package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author slima
 */
public class AccueilView {
    private final Scene scene;
    private final BorderPane root;
    
    public AccueilView(Stage primaryStage){
    root = new BorderPane();
    scene = new Scene(root,350,100);
    primaryStage.setScene(scene);
    }
}
