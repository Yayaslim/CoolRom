package coolrom.View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import coolrom.Controller.ChangerConsole;
import coolrom.Controller.ChangerGenre;
import coolrom.Controller.ChangerLangue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author slima
 */
public class AccueilView extends View{
    private final VBox vbox2;
    private final VBox vbox3;
    private final TextField textField;
    private final Text article = new Text("Blablabla il s'agit d'un article");
    private static Label label = new Label("Rechercher un jeu");
    private static Label label2 = new Label("Dernières News");
    private final HBox barrederecherche;
    private static final MenuItem menuItem1 = new MenuItem("Gameboy Advance");
    private static final MenuItem menuItem2 = new MenuItem("Gamecube");
    private static final MenuItem menuItem3 = new MenuItem("Super Nintendo");
    private static final MenuItem menuItem4 = new MenuItem("Action");
    private static final MenuItem menuItem5 = new MenuItem("Aventure");
    private static final MenuItem menuItem6 = new MenuItem("RPG");
    private static MenuButton menuconsole = new MenuButton("Console", null, menuItem1, menuItem2, menuItem3);
    private static MenuButton menugenre = new MenuButton("Genre", null, menuItem4, menuItem5, menuItem6);
    private final Button rechercher;
    public AccueilView(Stage primaryStage){
   super(primaryStage);
    
    vbox2 = new VBox();
    
    
    label.setFont(new Font(48));
    barrederecherche = new HBox();
    //MenuItem menuItem1 = new MenuItem("Gameboy Advance");
    
    //MenuItem menuItem3 = new MenuItem("Super Nintendo");
    //menuconsole = new MenuButton("Console", null, menuItem1, menuItem2, menuItem3);
    //menugenre = new MenuButton("Genre", null, menuItem4, menuItem5, menuItem6);
    menuItem1.setOnAction(new ChangerConsole(this));
    menuItem2.setOnAction(new ChangerConsole(this));
    menuItem3.setOnAction(new ChangerConsole(this));
    
    menuItem4.setOnAction(new ChangerGenre(this));
    menuItem5.setOnAction(new ChangerGenre(this));
    menuItem6.setOnAction(new ChangerGenre(this));
    
    textField = new TextField();
    rechercher = new Button("Rechercher");

    barrederecherche.getChildren().addAll(menuconsole, menugenre, textField, rechercher);
    barrederecherche.setAlignment(Pos.BASELINE_CENTER);
    //barrederecherche.setMargin(menuconsole, new Insets(0,0,0,225));
    menuconsole.setPrefWidth(150);
    menuconsole.setPrefHeight(50);
    menugenre.setPrefWidth(150);
    menugenre.setPrefHeight(50);
    textField.setPrefWidth(400);
    textField.setPrefHeight(50);

    vbox2.setSpacing(25);
    vbox2.setAlignment(Pos.BASELINE_CENTER);
    vbox2.getChildren().addAll(label, barrederecherche);
    vbox2.setPadding(new Insets(150,350,0,350));
    
    vbox3 = new VBox();
    label2.setFont(new Font(32));
    vbox3.setAlignment(Pos.BASELINE_CENTER);
    vbox3.getChildren().addAll(label2, article);
    vbox3.setStyle("-fx-border-color: black;");
    vbox3.setMargin(article, new Insets(150,350,200,350));

    super.root.setCenter(vbox2);
    super.root.setBottom(vbox3);    
    }
   
    
    public static Label getlabel(){
        return label;
    }
    
    public static MenuButton getmenuconsole(){
        return menuconsole;
    }
    
    public static MenuButton getmenugenre(){
        return menugenre;
    }

}
