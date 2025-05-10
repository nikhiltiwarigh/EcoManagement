/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.DbConnector;
import dto.DTO;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nikhil
 */
public class DeleteUserAuthenticator 
{
    public boolean deleteUser(DTO user){
        int userid = user.getUserid();
         try
        {
            Statement st = DbConnector.getStatement();
            String query = "DELETE FROM user WHERE userid='"+userid+"'";
            System.out.println("Query = "+query);
            
            int i=st.executeUpdate(query);
            if(i>0)
            {
                return true;
            }

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return false; 
    }
   }
