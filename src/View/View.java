/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author slima
 */
public class View {
    private final Scene scene;
    protected final BorderPane root;
    private final ImageView logo;
    private final Image image;
    private final HBox hbox;
    private final Button modenuit;
    private final MenuButton menulangue;
    private final MenuBar menuBar;
    private final VBox vbox1;
    
    public View(Stage primaryStage){
    root = new BorderPane();
    vbox1 = new VBox();
    hbox = new HBox();
    
    image = new Image(getClass().getResourceAsStream("logo.gif"));
    logo = new ImageView();
    logo.setImage(image);
    modenuit = new Button("Mode nuit");
    
    Region region1= new Region();
    HBox.setHgrow(region1, Priority.ALWAYS);
    MenuItem menuItem1 = new MenuItem("Français");
    MenuItem menuItem2 = new MenuItem("Vietnamien");
    MenuItem menuItem3 = new MenuItem("Arabe");
    menulangue = new MenuButton("Langue", null, menuItem1, menuItem2, menuItem3);
    
    hbox.getChildren().addAll(logo,region1,modenuit,menulangue);
    hbox.setMargin(modenuit, new Insets(0,50,0,0));
    
    menuBar = new MenuBar();
    
    Menu fileAccueil = new Menu("Accueil");
    Menu fileFAQ = new Menu("FAQ");
    Menu fileNews = new Menu("News");
    Menu fileTutoriel = new Menu("Tutoriel");
    Menu fileEmulateurs = new Menu("Emulateurs");
    Menu fileROM = new Menu("ROM");
    
    menuBar.getMenus().addAll(fileAccueil, fileFAQ, fileNews,fileTutoriel,fileEmulateurs,fileROM);
    vbox1.setSpacing(25);
    vbox1.getChildren().addAll(hbox,menuBar);
    root.setTop(vbox1);

    vbox1.setMargin(hbox, new Insets(20, 20, 20, 20));
    primaryStage.setMaximized(true);
    scene = new Scene(root);
    primaryStage.setScene(scene);
}

}
