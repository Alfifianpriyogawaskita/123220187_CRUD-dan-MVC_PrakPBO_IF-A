package DAOdatabuku;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.databuku;
import DAOImplements.databukuimplementasi;
import connection.koneksi;

public class databukuDAO implements databukuimplementasi {
    Connection connection;
    
    final String select = "SELECT * FROM dataperpus";
    final String insert = "INSERT INTO databuku (judul,genre,penulis,penerbit,lokasi,stock,id) VALUES (?,?,?,?,?,?,?);";
    public databukuDAO(){
        connection = koneksi.connection();
    }

    @Override
    public void insert(databuku p) {
       PreparedStatement statement = null;
       try{
           statement = connection.prepareStatement(insert, statement.RETURN_GENERATED_KEYS);
           statement.setString(1, p.getGenre());
           statement.setString(2, p.getLokasi());
           statement.setString(3, p.getPenerbit());
           statement.setString(4, p.getPenulis());
           statement.setString(5, p.getUdul());
           statement.setInt(6, p.getStock());
           statement.setInt(7, p.getId());
           statement.executeUpdate();
           ResultSet rs = statement.getGeneratedKeys();
           while(rs.next()){
           p.setId(rs.getInt(1));
           
       }
       }catch(SQLException ex){
           ex.printStackTrace();
       }finally{
         try{
             statement.close();
         }  catch(SQLException ex){
             ex.printStackTrace();
         }
       }
    }

    @Override
    public void update(databuku p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(databuku p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<databuku> getAll() {
       List<databuku> dp = null;
       try{
           dp = new ArrayList<databuku>();
           Statement st = connection.createStatement();
           ResultSet rs = st.executeQuery(select);
           while(rs.next()){
               databuku buku = new databuku();
               buku.setId(rs.getInt("id"));
               buku.setUdul(rs.getString("judul"));
               buku.setGenre(rs.getString("Genre"));
               buku.setPenulis(rs.getString("Penulis"));
               buku.setPenerbit(rs.getString("Penerbit"));
               buku.setLokasi(rs.getString("Lokasi"));
               buku.setStock(rs.getInt("Stock"));
               dp.add(buku); 
           }
          
           rs.close();
           st.close();
       } catch(SQLException ex){
           Logger.getLogger(databukuDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return dp;
    }
}
