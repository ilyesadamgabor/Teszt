package teszt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ilyés Ádám
 */
public class Bejelentkezes {
    final String kapcs = "jdbc:mysql://localhost:3306/teszt" + 
            "?userUnicode=rtue&characterEncoding=UTF-8";
    final String user = "teszt";
    final String pass = "teszt";
    
    //adatok beírása az adatbázisba
    public void beir(String nev, String szuletett, int magassag){
        String p = "INSERT INTO teszt(nev, szuletett, magassag)" +
                "VALUES(?,?,?)";
        try (Connection k = DriverManager.getConnection(kapcs, user, pass);
                PreparedStatement ekp = k.prepareStatement(p)){
            ekp.setString(1, nev);
            ekp.setString(2, szuletett);
            ekp.setInt(3, magassag);
            ekp.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
