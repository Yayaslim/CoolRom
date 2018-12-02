/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author slima
 */
class ConsoleModel {
    private String nom;
    private int date;
    private EmulateurModel[] emulateurs;
    private ImageView miniature;

    public ConsoleModel(String nom, int date, EmulateurModel[] emulateur, Image image) {
        this.nom = nom;
        this.date = date;
        this.emulateurs = emulateur;
        this.miniature = new ImageView();
        this.miniature.setImage(image);
        
    }

    public String getNom() {
        return nom;
    }

    public int getDate() {
        return date;
    }

    public ImageView getMiniature() {
        return miniature;
    }

    public EmulateurModel[] getEmulateurs() {
        return emulateurs;
    }
    
}
