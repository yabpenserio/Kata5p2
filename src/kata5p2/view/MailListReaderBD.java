package kata5p2.view;

import java.util.ArrayList;
import java.util.List;
import kata5p2.model.Mail;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class MailListReaderBD {
    
    public static List<Mail> read(){
        List<Mail> mails = new ArrayList<>();
        String url = "jdbc:sqlite:Kata5.db";
        String sqlSelect = "SELECT * FROM email";
        
        
        try(Connection conn = DriverManager.getConnection(url)){
            ResultSet rs = conn.createStatement().executeQuery(sqlSelect);
            while(rs.next()){
                mails.add(new Mail(rs.getString("mail")));
                //System.out.println(rs.getString("mail"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return mails;
    }
    
}
