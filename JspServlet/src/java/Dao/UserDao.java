/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Beans.User;
import ConnectionUntil.DatabaseUntil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class UserDao {
    
    private DatabaseUntil con = new DatabaseUntil();
    public boolean getUser(String username, String password) {
        Connection conn;
        PreparedStatement st;
        ResultSet rs;
        boolean check = false;
        conn = con.getConnection();
        try {
            String sql = "select * from tblUser where username = ? and passwrod =?";
            st = conn.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            if(rs.next()){
                check = true;
            }
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return check;
    }

}

