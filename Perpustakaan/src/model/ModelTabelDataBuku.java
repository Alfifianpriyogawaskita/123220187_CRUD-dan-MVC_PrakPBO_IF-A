/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author BIMA
 */
public class ModelTabelDataBuku extends AbstractTableModel {

    List<databuku> dp;
    public ModelTabelDataBuku(List<databuku>dp){
    this.dp = dp;
    }
    
    @Override
    public int getRowCount() {
        return dp.size();
    }

    @Override
    public int getColumnCount() {
       return 7;
    }
    
    @Override
    public String getColumnName(int colum){
    switch(colum){
        case 0:
          return "id";
        case 1:
          return "judul";
        case 2:
            return "genre";
        case 3:
            return "penulis";
        case 4:
            return "penerbit";
        case 5:
            return "lokasi";
        case 6:
            return "stock";
        default:
            return null;
    }
    }

    @Override
    public Object getValueAt(int rowIndex, int column) {
        switch(column){
        case 0:
          return dp.get(rowIndex).getId();
        case 1:
          return dp.get(rowIndex).getUdul();
        case 2:
            return dp.get(rowIndex).getPenulis();
        case 3:
            return dp.get(rowIndex).getPenerbit();
        case 4:
            return dp.get(rowIndex).getLokasi();
        case 5:
            return dp.get(rowIndex).getStock();
        case 6:
            return dp.get(rowIndex).getId();
        default:
            return null;
    }
   }
    
}
