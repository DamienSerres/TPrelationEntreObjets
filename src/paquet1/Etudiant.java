/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet1;

import java.util.ArrayList;

/**
 *
 * @author Damien
 */
public class Etudiant {

    /**
     * Constructeur surchargé pour la solution 1
     *
     * @param uneChaise
     */
    public Etudiant(Chaise uneChaise) {
        this.maChaise = uneChaise;
    }

    /**
     * Constructeur "vide" pour illustrer la solution 2. Nécessaire
     * explicitement car le constructeur par défaut n'est plus accessible
     */
    public Etudiant() {
    }

    /**
     * Constructeur pour initialiser une liste de chaises.
     *
     * @param mesChaises
     */
    public Etudiant(ArrayList<Chaise> mesChaises) {
        this.mesChaises = mesChaises;
    }

    private Chaise maChaise;
    private ArrayList<Chaise> mesChaises;
    private Amphitheatre monAmphi;

    public void methodeEtudiant() {
        System.out.println("Je suis un objet de type Etudiant.");
    }

    public static void main(String[] args) {
        Chaise uneChaise = new Chaise();
//        //Solution 1 --> avec un constructeur surchargé
//        Etudiant unEtudiant = new Etudiant(uneChaise);
//        unEtudiant.getMaChaise().asseoir();
//
//        //Solution 2 --> avec un mutateur (setter)
//        Etudiant unAutreEtudiant = new Etudiant();
//        unAutreEtudiant.setMaChaise(uneChaise);
//        unAutreEtudiant.getMaChaise().asseoir();

        Chaise uneAutreChaise = new Chaise();
        Chaise uneTroisiemeChaise = new Chaise();
        ArrayList<Chaise> mesChaises = new ArrayList();
        mesChaises.add(uneChaise);
        mesChaises.add(uneAutreChaise);
        mesChaises.add(uneTroisiemeChaise);
        mesChaises.add(new Chaise());

        Etudiant lEtudiant = new Etudiant(mesChaises);
        
        lEtudiant.getMesChaises().get(0).asseoir();

    }

    public Chaise getMaChaise() {
        return maChaise;
    }

    public void setMaChaise(Chaise maChaise) {
        this.maChaise = maChaise;
    }

    public Amphitheatre getMonAmphi() {
        return monAmphi;
    }

    public void setMonAmphi(Amphitheatre monAmphi) {
        this.monAmphi = monAmphi;
    }

    public ArrayList<Chaise> getMesChaises() {
        return mesChaises;
    }

    public void setMesChaises(ArrayList<Chaise> mesChaises) {
        this.mesChaises = mesChaises;
    }
}
