/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolrom.Controller;

import coolrom.View.View;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import coolrom.View.View;
import coolrom.View.AccueilView;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

/**
 *
 * @author Fabien
 */
public class ChangerGenre implements EventHandler<ActionEvent> {
    
    private final View view;
    
    public ChangerGenre(View view) {
        this.view = view ;
    }
    @Override
    public void handle(ActionEvent event) {
    MenuItem temp = (MenuItem) event.getTarget();
    if (temp.getText().equals("Action")){
        AccueilView.getmenugenre().setText("Action");               
    }
    else if (temp.getText().equals("Aventure")){
        AccueilView.getmenugenre().setText("Aventure");      
    }
    else if (temp.getText().equals("RPG")){
        AccueilView.getmenugenre().setText("RPG"); 
    }
    }
}