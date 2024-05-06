package connection;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class koneksi {
    static Connection con;
    
   
    public static Connection connection() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("perpusttakaan");
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
                System.out.println("Koneksi berhasil");
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("koneksi gagal");
            }
        }
        return con;
    }
}
