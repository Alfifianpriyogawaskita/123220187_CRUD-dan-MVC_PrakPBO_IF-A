/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.List;
import DAOdatabuku.databukuDAO;
import DAOImplements.databukuimplementasi;
import model.*;
import view.MainView;
/**
 *
 * @author BIMA
 */


public class databukucontroller {
    MainView frame;
    databukuimplementasi impldatabuku;
    List<databuku> dp;
    
    public databukucontroller(MainView frame){
        this.frame = frame;
        impldatabuku = new databukuDAO();
        dp = impldatabuku.getAll();
    }
    public void isitabel(){
     dp = impldatabuku.getAll();
      ModelTabelDataBuku mp = new ModelTabelDataBuku(dp);
      frame.getTabelDataBuku().setModel(mp);
    }
    
    public void insert(){
        databuku dp = new databuku();
        dp.setGenre(frame.getJTxtgenrebuku().getText());
        dp.setPenulis(frame.getJTxtpenulisbuku().getText());
        dp.setPenerbit(frame.getJTxtpenerbitbuku().getText());
        dp.setLokasi(frame.getJTxtlokasibuku().getText());
        dp.setUdul(frame.getJTxtjudulbuku().getText());
        impldatabuku.insert(dp);
    }
}
