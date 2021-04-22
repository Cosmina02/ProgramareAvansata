package compulsory;

import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public void createMovie(DBConnection con,String data_to_add) throws SQLException {
        String sql= " insert into movies values "+ data_to_add;
        Statement Query= con.getConn().createStatement();
        Query.executeUpdate(sql);
    }

    public void createGenre(DBConnection con,String data_to_add) throws SQLException {
        String sql= " insert into genres values "+ data_to_add;
        Statement Query= con.getConn().createStatement();
        Query.executeUpdate(sql);
    }

    public void createMovieGenre(DBConnection con,String data_to_add) throws SQLException {
        String sql= " insert into movie_gen values "+ data_to_add;
        Statement Query= con.getConn().createStatement();
        Query.executeUpdate(sql);
    }
}
