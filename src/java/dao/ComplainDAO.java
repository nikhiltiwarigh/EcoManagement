/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static db.DbConnector.getConnection;
import dto.DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author nikhi
 */
public class ComplainDAO 
{
   public static DTO userDataByTime(String username, String time) throws Exception {
    DTO dto = null;
    Connection conn = getConnection();
    String sql = "SELECT * FROM request WHERE username=? AND requesttime=?";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, username);
    ps.setString(2, time);
    ResultSet rs = ps.executeQuery();
    if (rs.next()) {
        dto = new DTO();
        dto.setUsername(rs.getString("username"));
        dto.setRequest_time(rs.getString("requesttime"));
        dto.setRequest_type(rs.getString("requesttype"));
        dto.setStatus(rs.getString("status"));
        dto.setImage(rs.getBytes("image"));
        System.out.println(username+"  "+time);
    }
    return dto;
}
 
}
