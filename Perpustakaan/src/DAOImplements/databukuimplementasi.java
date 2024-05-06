/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplements;
import java.util.List;
import model.*;

/**
 *
 * @author BIMA
 */
public interface databukuimplementasi {
    public void insert(databuku p);
    public void update(databuku p);
    public void delete(databuku p);
    public List<databuku> getAll();
}
