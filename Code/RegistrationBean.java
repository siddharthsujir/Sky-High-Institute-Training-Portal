package mode;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import javax.annotation.Resource;

import javax.ejb.Stateless;

import javax.sql.DataSource;

@Stateless

public class RegistrationBean implements RegistrationRemote {

    @Resource(name = "s")

    private DataSource s;

   Connection con;

    PreparedStatement stmt;

    ResultSet rs;

    String name,pass,gen,qual,course;

    int pay=0,mobno;

    String str="Insert into NewUser_Table values(?,?,?,?,?,?,?)";

 public String RegUser(String name, String passwd, String gender, String qualification,      

String course, int pay, String mobno) {

        int x=0;   

        try

        {

           String sd=Integer.toString(pay);

       con=s.getConnection();

        stmt=con.prepareStatement(str);

        stmt.setString(1,name);

        stmt.setString(2,passwd);

        stmt.setString(3,gender);

        stmt.setString(4,qualification);

        stmt.setString(5,course);

        stmt.setString(6,sd);

        stmt.setString(7,mobno);

        x =stmt.executeUpdate();

        }

        catch(Exception e)

        {

        

        }

        if(x==1)

        return "row inserted";

        else 

            return "Failed";
}
