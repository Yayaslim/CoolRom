package coolrom.Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author slima
 */
public class JeuxModel {
    private String nom;
    private final int id;
    private ImageView miniature;
    private ConsoleModel console;
    private String langue;
    private String Genre;
    private static int nbr = 0;
    private float note;
    
    public JeuxModel(String nom, Image image,ConsoleModel console, String langue) {
        this.nom = nom;
        this.console=console;
        this.miniature = new ImageView();
        this.miniature.setImage(image);
        this.langue=langue;
        this.note=0;
        this.nbr++;
        this.id = nbr;
        
    }

    public String getNom() {
        return nom;
    }

    public ImageView getMiniature() {
        return miniature;
    }

    public ConsoleModel getConsole() {
        return console;
    }

    public int getId() {
        return id;
    }

    public String getLangue() {
        return langue;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }
    
}
