
package coolrom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.stage.Stage;
import coolrom.View.AccueilView;
import coolrom.View.JeuxView;

/**
 *
 * @author slima
 */
public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CoolRom");
        new AccueilView(primaryStage);
        primaryStage.show();
        
        Stage secondstage = new Stage();
        secondstage.setTitle("CoolRom");
        new JeuxView(secondstage);
        secondstage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}