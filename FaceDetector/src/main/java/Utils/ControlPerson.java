
package Utils;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControlPerson {
    
    Connect con=new Connect();
    public void insert(ModelPerson mod)
    {
        try{
        con.connection();
        PreparedStatement pst=con.cn.prepareStatement("insert into person(id,fname,lname,dob,office) values (?,?,?,?,?)");
        pst.setInt(1,mod.getId());
        pst.setString(2,mod.getFname());
        pst.setString(3,mod.getLname());
        pst.setString(4,mod.getDob());
         pst.setString(5,mod.getOffice());
        
        
        pst.executeUpdate();
        con.disconnect();
        
        
        }
        catch(SQLException e)
        {
            System.err.println("\nsql alert -"+e.getMessage()+"\n");
        }
       
    
}
}
