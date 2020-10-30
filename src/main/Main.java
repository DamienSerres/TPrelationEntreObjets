/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/*
import paquet1.Amphitheatre;
import paquet1.Chaise;
import paquet1.Etudiant;
*/

import paquet1.*;

/**
 *
 * @author Damien
 */
public class Main {
    public static void main(String[] args) {
        //Création des objets
        Etudiant lEtudiant = new Etudiant();
        Chaise laChaise = new Chaise();
        Amphitheatre lAmphitheatre = new Amphitheatre();
        
        //Initialisation des liens d'utilisations
        lEtudiant.setMonAmphi(lAmphitheatre);
        laChaise.setMonAmphi(lAmphitheatre);
        
        laChaise.setMonEtudiant(lEtudiant);
        lEtudiant.setMaChaise(laChaise);
        
        //Initialisation de l'application
    }
}
