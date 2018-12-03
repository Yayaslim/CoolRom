package coolrom.Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import coolrom.View.View;
import javafx.scene.control.Button;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author slima
 */
public class ChangerMode implements EventHandler<ActionEvent> {
    
    private final View view ;
    
    public ChangerMode(View view){
        this.view = view ;
    }
    
    
    @Override
    public void handle(ActionEvent event) {
    Button temp = (Button) event.getTarget();
    if (temp.getText().equals("Mode nuit")){
        temp.setText("Mode jour");
        this.view.getroot().setStyle("-fx-background-color: #2a3b4c;");
        
    }
    else{
        temp.setText("Mode nuit");
        this.view.getroot().setStyle("-fx-background-color: #ffffff;");
    }

    
    }
    
}
