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
class EmulateurModel {
    private String nom;
    private final int id;
    private ImageView miniature;
    private float note;
    private static int cmpt = 0;
    
    public EmulateurModel(String nom,Image image) {
        this.nom = nom;
        this.miniature = new ImageView();
        this.miniature.setImage(image);
        this.note = 0;
        this.cmpt++;
        this.id = cmpt;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public ImageView getMiniature() {
        return miniature;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }
    
}
