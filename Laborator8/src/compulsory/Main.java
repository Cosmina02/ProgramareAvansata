package compulsory;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBConnection dbconn=DBConnection.getInstance("./dbms/data.db");
        String data_to_add="('1','Movie1','23-01-2001',150,7.8)";
        Create c=new Create();
        Find f=new Find();
        c.createMovie(dbconn,data_to_add);
        data_to_add="('2','Movie2','23-06-2003',180,2.8)";
        c.createMovie(dbconn,data_to_add);
        data_to_add="('3','Movie3','10-01-2007',130,9.8)";
        c.createMovie(dbconn,data_to_add);
        data_to_add="('4','Movie4','20-11-2002',150,5.8)";
        c.createMovie(dbconn,data_to_add);
        data_to_add="('1','Gen1')";
        c.createGenre(dbconn,data_to_add);
        data_to_add="('2','Gen2')";
        c.createGenre(dbconn,data_to_add);
        data_to_add="('3','Gen3')";
        c.createGenre(dbconn,data_to_add);
        data_to_add="('4','Gen4')";
        c.createGenre(dbconn,data_to_add);

        f.findMovieById(dbconn,"3");

        f.findGenByName(dbconn,"'Gen3'");
    }

}
