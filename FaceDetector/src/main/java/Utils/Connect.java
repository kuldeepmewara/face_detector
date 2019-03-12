package Utils;

import java.sql.*;

public class Connect {
    
    public Statement stm;
    public ResultSet rs;
    public Connection cn;
    
    public  String driver="com.mysql.jdbc.Driver";
    public  String root="jdbc:mysql://localhost:3306/projects";
    public  String user="root";
    public  String passwd="kuldeep@mysql";
    
    
    public void connection()
    {
         try
         {
            Class.forName(driver);
            cn=DriverManager.getConnection(root,user, passwd);
         }
         catch(ClassNotFoundException e)
         {
            System.err.println("\nDevice not found..\n");
         }
         catch(SQLException e)
         {
            System.err.println("\nsql alert[connect 2] -"+e.getMessage()+"\n");
         }
    }
    
    public void disconnect()
    {
        try
        {
            cn.close();
        }
        catch(SQLException e)
        {
            System.err.println("\nsql alert[connect 1] -"+e.getMessage()+"\n");
        }
    }
    
    public void executeSql(String sql)
    {
     try
     {
         stm=cn.createStatement();
         rs=stm.executeQuery(sql);
     }
     catch(SQLException e)
     {
            System.err.println("\nsql alert[connect] -"+e.getMessage()+"\n");
     }
    }
     
}
