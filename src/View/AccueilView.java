package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author slima
 */
public class AccueilView extends View{
    private final MenuBar menuBar2;
    private final VBox vbox2;
    private final GridPane gridpane;
    private final TextField textField;
    
    public AccueilView(Stage primaryStage){
   super(primaryStage);
    
    vbox2 = new VBox();
    
    Label label = new Label("Rechercher un jeu");
    vbox2.setAlignment(Pos.BASELINE_CENTER);
    gridpane = new GridPane();
    
    menuBar2 = new MenuBar();
    Menu reglages = new Menu("Réglages");
    menuBar2.getMenus().add(reglages);
    gridpane.add(menuBar2, 0, 1);
    
    textField = new TextField();
    gridpane.add(textField, 1, 1, 10, 1);
    
    vbox2.setSpacing(25);
    vbox2.getChildren().addAll(label, menuBar2);
    vbox2.setPadding(new Insets(150,350,0,350));
    super.root.setCenter(vbox2);
 
    }
}
