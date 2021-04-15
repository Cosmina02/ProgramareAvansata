package compulsory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Find {
    public void findMovieById(DBConnection con,String id) throws SQLException {
        String sql="select * from movies where movie_id = "+id;
        Statement Query= con.getConn().createStatement();
        ResultSet rez=Query.executeQuery(sql);
        System.out.println(rez);
    }
    public void findMovieByName(DBConnection con,String id) throws SQLException {
        String sql="select * from movies where title = "+id;
        Statement Query= con.getConn().createStatement();
        ResultSet rez=Query.executeQuery(sql);
        System.out.println(rez);
    }
    public void findGenById(DBConnection con,String id) throws SQLException {
        String sql="select * from genres where gen_id = "+id;
        Statement Query= con.getConn().createStatement();
        ResultSet rez=Query.executeQuery(sql);
        System.out.println(rez);
    }
    public void findGenByName(DBConnection con,String id) throws SQLException {
        String sql="select * from genres where name = "+id;
        Statement Query= con.getConn().createStatement();
        ResultSet rez=Query.executeQuery(sql);
        System.out.println(rez);
    }

}
