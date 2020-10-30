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
public class Chaise {
    
    private Etudiant monEtudiant;
    private Amphitheatre monAmphi;

    public void methodeChaise() {
        System.out.println("Je suis un objet de type Chaise.");
    }
    
    public void asseoir(){
        System.out.println("Je suis assis.");
    }
    
    public Etudiant getMonEtudiant() {
        return monEtudiant;
    }

    public void setMonEtudiant(Etudiant monEtudiant) {
        this.monEtudiant = monEtudiant;
    }

    public Amphitheatre getMonAmphi() {
        return monAmphi;
    }

    public void setMonAmphi(Amphitheatre monAmphi) {
        this.monAmphi = monAmphi;
    }
}
