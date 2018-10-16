/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Victor Briere
 */
/**
 * classe Etudiant
 */
public class Etudiant {

    /**
     * ID de l etudiant
     */
    private String id;
    /**
     * tableau de notes de l etudiant
     */
    private float notes[];
    /**
     * taille du tableau de notes
     */
    private int taille;
    /**
     * nom et prenom de l etudiant
     */
    public String nom, prenom;

    Etudiant() {
        this.id = null;
        this.notes = null;
        this.taille = 0;
        this.nom = null;
        this.prenom = null;
    }

    Etudiant(float tab_notes[]) {
        this.taille = tab_notes.length;
        this.notes = tab_notes;
    }

    /**
     * methode pour modifier les attributs
     */
    void modifier(String id, String nom, String prenom, int taille,
            float notes[]) {
        this.id = id;
        this.taille = taille;
        this.nom = nom;
        this.prenom = prenom;
        this.notes = notes;
    }

    /**
     * getter attribut int id
     */
    String getId() {
        return id;
    }

    /**
     * getter attribut float notes[]
     */
    float[] getNotes() {
        return notes;
    }

    /**
     * getter attribut int taille
     */
    int getTaille() {
        return taille;
    }

    /**
     * methode d'affichage des notes du tableau
     */
    void affichage_notes() {
        for (float elem : this.notes) {
            System.out.println(elem);
        }
    }

    /**
     * methode qui remplit le tab notes de notes aléatoires entre 0 et 20
     */
    void note_aleat() {
        for (int i = 0; i < this.notes.length; i++) {
            Random note = new Random();
            this.notes[i] = note.nextInt(21);
        }
    }

    /**
     * methode de tri de tableau
     */
    void tri_croissant() {
        Arrays.sort(this.notes);
    }

    /**
     * methode pour trouver le minimum des val d'un tab
     */
    float mini() {
        float minVal = 0;
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] > minVal) {
                minVal = this.notes[i];
            }
        }
        return minVal;
    }

    /**
     * methode pour trouver le maximum des val d'un tab
     */
    float maxi() {
        float maxVal = 1000000000;
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] < maxVal) {
                maxVal = this.notes[i];
            }
        }
        return maxVal;
    }

    /**
     * calcul du max, min, moyenne, et % inf à 8, % sup à 12 et % entre 8 et 12
     */
    void statistiques() {
        //minimum
        float minVal = Float.MAX_VALUE;
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] < minVal) {
                minVal = this.notes[i];
            }
        }
        System.out.println("min : " + minVal);

        //maximum
        float maxVal = Float.MIN_VALUE;
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] > maxVal) {
                maxVal = this.notes[i];
            }
        }
        System.out.println("max : " + maxVal);

        //moyenne
        float counter = 0;
        for (int i = 0; i < this.notes.length; i++) {
            counter += this.notes[i];
        }
        System.out.println("moyenne : " + counter / this.notes.length);

        //notes inf à 8
        int inf = 0;
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] < 8.0) {
                inf++;
            }
        }
        System.out.println("inf a 8 : " + (inf * 100 / this.notes.length)+" %");

        //notes entre 8 et 12
        int inter = 0;
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] >= 8.0 && this.notes[i] <= 12.0) {
                inter++;
            }
        }
        System.out.println("entre 8 et 12 : " + (inter * 100 / this.notes.length)+" %");

        //notes sup à 12
        int sup = 0;
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] > 12.0) {
                sup++;
            }
        }
        System.out.println("sup a 12 : " + (sup * 100 / this.notes.length)+" %");
    }

    /**
     * recherche d'element dans le tab de note
     */
    boolean search(float note) {
        int counter = 0;
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] == note) {
                counter++;
            }
        }
        if (counter != 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * @return id, nom, prenom de l'objet etudiant*/
    @Override
    public String toString(){
        return "id : "+this.id+" nom : "+this.nom+" prenom : "+this.prenom;
    }
}
