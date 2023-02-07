/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionextrait.dao;

import java.sql.Date;

/**
 *
 * @author orion90
 */
public class ExtraitModel {
       private int numAct;
    private String prenom;
    private String nom;
    private Date dateNaissance;
    private String lieu;
    private String sexe;
    private String prenomPere;
    private String nomPere;
    private String domicilePere;
    private String professionPere;
     private String prenomMere;
    private String nomMere;
    private String domicileMere;
    private String professionMere;
    private Date dateDelivrance;

    public ExtraitModel() {
    }

    public ExtraitModel(int numAct, String prenom, String nom, Date dateNaissance, 
            String lieu, String sexe, String prenomPere, String nomPere, 
            String domicilePere, String professionPere, String prenomMere, 
            String nomMere, String domicileMere, 
            String professionMere, Date dateDelivrance) {
        this.numAct = numAct;
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.lieu = lieu;
        this.sexe = sexe;
        this.prenomPere = prenomPere;
        this.nomPere = nomPere;
        this.domicilePere = domicilePere;
        this.professionPere = professionPere;
        this.prenomMere = prenomMere;
        this.nomMere = nomMere;
        this.domicileMere = domicileMere;
        this.professionMere = professionMere;
        this.dateDelivrance = dateDelivrance;
    }
     public ExtraitModel(String prenom, String nom, Date dateNaissance, 
            String lieu, String sexe, String prenomPere, String nomPere, 
            String domicilePere, String professionPere, String prenomMere, 
            String nomMere, String domicileMere, 
            String professionMere, Date dateDelivrance) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.lieu = lieu;
        this.sexe = sexe;
        this.prenomPere = prenomPere;
        this.nomPere = nomPere;
        this.domicilePere = domicilePere;
        this.professionPere = professionPere;
        this.prenomMere = prenomMere;
        this.nomMere = nomMere;
        this.domicileMere = domicileMere;
        this.professionMere = professionMere;
        this.dateDelivrance = dateDelivrance;
    }

    public int getNumAct() {
        return numAct;
    }

    public void setNumAct(int numAct) {
        this.numAct = numAct;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPrenomPere() {
        return prenomPere;
    }

    public void setPrenomPere(String prenomPere) {
        this.prenomPere = prenomPere;
    }

    public String getNomPere() {
        return nomPere;
    }

    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    public String getDomicilePere() {
        return domicilePere;
    }

    public void setDomicilePere(String domicilePere) {
        this.domicilePere = domicilePere;
    }

    public String getProfessionPere() {
        return professionPere;
    }

    public void setProfessionPere(String professionPere) {
        this.professionPere = professionPere;
    }

    public String getPrenomMere() {
        return prenomMere;
    }

    public void setPrenomMere(String prenomMere) {
        this.prenomMere = prenomMere;
    }

    public String getNomMere() {
        return nomMere;
    }

    public void setNomMere(String nomMere) {
        this.nomMere = nomMere;
    }

    public String getDomicileMere() {
        return domicileMere;
    }

    public void setDomicileMere(String domicileMere) {
        this.domicileMere = domicileMere;
    }

    public String getProfessionMere() {
        return professionMere;
    }

    public void setProfessionMere(String professionMere) {
        this.professionMere = professionMere;
    }

    public Date getDateDelivrance() {
        return dateDelivrance;
    }

    public void setDateDelivrance(Date dateDelivrance) {
        this.dateDelivrance = dateDelivrance;
    }
    
}
