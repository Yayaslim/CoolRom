/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolrom.View;
import coolrom.Controller.ChangerLangue;
import coolrom.Controller.Quitter;
import coolrom.Controller.ChangerMode;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
import javafx.scene.text.Font;
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
    private final VBox vbox1;
    
    public View(Stage primaryStage){
    root = new BorderPane();
    vbox1 = new VBox();
    hbox = new HBox();
    
    image = new Image(getClass().getResourceAsStream("logo.gif"));
    logo = new ImageView();
    logo.setImage(image);
    modenuit = new Button("Mode nuit");
    modenuit.setOnAction(new ChangerMode(this));
    
    Region region1= new Region();
    HBox.setHgrow(region1, Priority.ALWAYS);
    MenuItem menuItem1 = new MenuItem("Français");
    MenuItem menuItem2 = new MenuItem("Vietnamien");
    MenuItem menuItem3 = new MenuItem("Arabe");
    menulangue = new MenuButton("Langue", null, menuItem1, menuItem2, menuItem3);
    menuItem3.setOnAction(new ChangerLangue(this));
    
    hbox.getChildren().addAll(logo,region1,modenuit,menulangue);
    hbox.setMargin(modenuit, new Insets(0,50,0,0));
    
    MenuBar menuBar = new MenuBar();
    
    Label labelAccueil = new Label("Accueil");
    labelAccueil.setOnMousePressed(new Quitter(this));
    labelAccueil.setFont(new Font(24));
    labelAccueil.setPadding(new Insets (0, 20, 0 ,0));
    
    Label labelFAQ = new Label("FAQ");
    labelFAQ.setOnMousePressed(new Quitter(this));
    labelFAQ.setFont(new Font(24));
    labelFAQ.setPadding(new Insets (0, 20, 0 ,0));
    
    Label labelNews = new Label("News");
    labelNews.setOnMousePressed(new Quitter(this));
    labelNews.setFont(new Font(24));
    labelNews.setPadding(new Insets (0, 20, 0 ,0));
    
    Label labelTutoriel = new Label("Tutoriel");
    labelTutoriel.setOnMousePressed(new Quitter(this));
    labelTutoriel.setFont(new Font(24));
    labelTutoriel.setPadding(new Insets (0, 20, 0 ,0));
    
    Label labelEmulateurs = new Label("Emulateurs");
    labelEmulateurs.setOnMousePressed(new Quitter(this));
    labelEmulateurs.setFont(new Font(24));
    labelEmulateurs.setPadding(new Insets (0, 20, 0 ,0));
    
    Label labelROM = new Label("ROM");
    labelROM.setOnMousePressed(new Quitter(this));
    labelROM.setFont(new Font(24));
    labelROM.setPadding(new Insets (0, 20, 0 ,0));
    Menu menuAccueil = new Menu();
    menuAccueil.setGraphic(labelAccueil);
    Menu menuFAQ = new Menu();
    menuFAQ.setGraphic(labelFAQ);
    Menu menuNews = new Menu();
    menuNews.setGraphic(labelNews);
    Menu menuTutoriel = new Menu();
    menuTutoriel.setGraphic(labelTutoriel);
    Menu menuEmulateurs = new Menu();
    menuEmulateurs.setGraphic(labelEmulateurs);
    Menu menuROM = new Menu();
    menuROM.setGraphic(labelROM);
    menuBar.getMenus().addAll(menuAccueil, menuFAQ, menuNews, menuTutoriel, menuEmulateurs, menuROM);
    
    vbox1.setSpacing(25);
    vbox1.getChildren().addAll(hbox,menuBar);
    root.setTop(vbox1);;
    
    vbox1.setMargin(hbox, new Insets(20, 20, 20, 20));
    primaryStage.setMaximized(true);
    
    scene = new Scene(root);
    
    primaryStage.setScene(scene);
}

    public BorderPane getroot() {
        return root;
    }
    
    
    
}
