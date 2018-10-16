/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author Victor Briere
 */

/**Classes dans laquelle eles methodes de type Etudiant sont utilisees*/
public class TestEtudiant {

    public static void main(String args[]) {
        //déclaration de 2 objets etudians
        Etudiant e1, e2;
        //instanciation du 1er objet
        e1 = new Etudiant();

        //affichage attributs
        System.out.println(e1.getId());
        System.out.println(e1.getTaille());
        System.out.println(e1.nom);
        System.out.println(e1.prenom);

        int taille1 = 0;
        float tab[];

        Scanner sc = new Scanner(System.in);
        //lecture de l'int taille du tab de float
        System.out.println("Rentrez la taille du tableau de notes");
        int t = sc.nextInt();
        if (t > 0) {
            taille1 = t;
        }

        //instanciation du tab de float
        tab = new float[taille1];
        //saisi des val du tableau
        for (int i = 0; i < taille1; i++) {
            System.out.println("Rentrez une note");
            tab[i] = sc.nextFloat();
        }

        //instanciation du 2nd objet en appelant constructeur surchargé
        e2 = new Etudiant(tab);

        System.out.println("affichage du tableau de e2");
        e2.affichage_notes();

        System.out.println("Entrez l'id de l'etudiant e1");
        String id = sc.next();
        System.out.println("Entrez le nom de l'etudiant e1");
        String nom = sc.next();
        System.out.println("Entrez le prenom de l'etudiant e1");
        String prenom = sc.next();
        e1.modifier(id, nom, prenom, tab.length, tab);

        //affichage tableau notes de e1
        System.out.println("Voici les notes de l'etudiant e1");
        e1.affichage_notes();
        
        //remplissage aleat du tab de notes de e2
        System.out.println("Voici les notes de l'etudiant e1 entre 0 et 20");
        e1.note_aleat();
        e1.affichage_notes();
        
        //tri par ordre croissant du tableau notes
        System.out.println("tableau de notes avant tri");
        e1.affichage_notes();
        System.out.println("tableau de notes après tri");
        e1.tri_croissant();
        e1.affichage_notes();

        //affichage statistiques du tab de notes
        e1.statistiques();

    }
}
