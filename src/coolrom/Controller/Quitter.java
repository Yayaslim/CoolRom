/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolrom.Controller;
import coolrom.View.View;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Fabien
 */
public class Quitter implements EventHandler<MouseEvent> {
    
    private final View view;
    
    public Quitter(View view){
        this.view = view ;
    }
    @Override
    public void handle(MouseEvent e) {

        Platform.exit();
        System.exit(0);
        
    }
}

