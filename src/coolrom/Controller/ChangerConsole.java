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
public class ChangerConsole implements EventHandler<ActionEvent> {
    
    private final View view;
    
    public ChangerConsole(View view) {
        this.view = view ;
    }
    @Override
    public void handle(ActionEvent event) {
    MenuItem temp = (MenuItem) event.getTarget();
    if (temp.getText().equals("Gameboy Advance")){
        AccueilView.getmenuconsole().setText("Gameboy Advance");               
    }
    else if (temp.getText().equals("Gamecube")){
        AccueilView.getmenuconsole().setText("Gamecube");      
    }
    else if (temp.getText().equals("Super Nintendo")){
        AccueilView.getmenuconsole().setText("Super Nintendo"); 
    }
    }
}