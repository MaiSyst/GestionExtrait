/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionextrait.dao;

import gestionextrait.db.DBConnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author orion90
 */
public class ExtraitImpl extends ExtraitDAO<ExtraitModel>{
    private Connection con;
    public ExtraitImpl(){
        this.con=DBConnect.getInstance();
    }
    @Override
    public void ajouterExtrait(ExtraitModel model) {
        try {
            var request = "INSERT INTO extrait(prenom,nom,dateNaissance,lieu,"
                    + "sexe,prenomPere,nomPere,domicilePere,professionPere,prenomMere,"
                    + "nomMere,domicileMere,professionMere,dateDelivrance) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            var pstmt = con.prepareStatement(request);
            pstmt.setString(1, model.getPrenom());
            pstmt.setString(2, model.getNom());
            pstmt.setDate(3, model.getDateNaissance());
            pstmt.setString(4, model.getLieu());
            pstmt.setString(5, model.getSexe());
            pstmt.setString(6, model.getPrenomPere());
            pstmt.setString(7, model.getNomPere());
            pstmt.setString(8, model.getDomicilePere());
            pstmt.setString(9, model.getProfessionPere());
            pstmt.setString(10, model.getPrenomMere());
            pstmt.setString(11, model.getNomMere());
            pstmt.setString(12, model.getDomicileMere());
            pstmt.setString(13, model.getProfessionMere());
            pstmt.setDate(14, model.getDateDelivrance());
            pstmt.execute();
        } catch (SQLException e) {
            Logger.getLogger(ExtraitImpl.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public List<ExtraitModel> getListExtrait() {
        var result = new ArrayList<ExtraitModel>();
        try {
            String request = "SELECT * FROM extrait";
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(request);
            while (resultSet.next()) {
                int num = resultSet.getInt("numAct");
                String prenom = resultSet.getString("prenom");
                String nom = resultSet.getString("nom");
                Date birthDate = resultSet.getDate("dateNaissance");
                String lieu = resultSet.getString("lieu");
                String sexe = resultSet.getString("sexe");
                String prenomP = resultSet.getString("prenomPere");
                String nomP = resultSet.getString("nomPere");
                String domicileP = resultSet.getString("domicilePere");
                String travailP = resultSet.getString("professionPere");
                String prenomM = resultSet.getString("prenomMere");
                String nomM = resultSet.getString("nomMere");
                String domicileM = resultSet.getString("domicileMere");
                String travailM = resultSet.getString("professionMere");
                Date dateDelivrance = resultSet.getDate("dateDelivrance");
                ExtraitModel model = new ExtraitModel(
                        num,
                        prenom,
                        nom, birthDate,
                        lieu, sexe,
                        prenomP, nomP,
                        domicileP, travailP,
                        prenomM, nomM, domicileM,
                        travailM,
                        dateDelivrance
                );
                result.add(model);
            }
        } catch (SQLException e) {
            Logger.getLogger(ExtraitImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return result;
    }
    
}
