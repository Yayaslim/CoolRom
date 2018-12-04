/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolrom.Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import coolrom.View.View;
import coolrom.View.AccueilView;
import javafx.scene.control.Button;
/**
 *
 * @author Fabien
 */
public class ChangerLangue implements EventHandler<ActionEvent> {
    
    private final View view;

    public ChangerLangue(View view){
        this.view = view ;
    }    
    @Override
    public void handle(ActionEvent event) {
        System.exit(0);
    }

    
    
}
