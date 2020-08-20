/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Beans.Student;
import Beans.User;
import ConnectionUntil.DatabaseUntil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class StudentDao {

    private DatabaseUntil con = new DatabaseUntil();

    public List<Student> getStudent() {
        Connection conn;
        PreparedStatement st;
        ResultSet rs;
        Student s;
        List<Student> students;
        conn = con.getConnection();
        students = new ArrayList<>();
        try {
            String sql = "select * from tblStudent";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                s = new Student(rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("phone"),
                        rs.getString("avg_mark"));
                students.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return students;
    }

    public boolean deleteProduct(int id) {
        Connection conn;
        PreparedStatement st;
        ResultSet rs;
        Student s;
        int status = 0;
        boolean statusExecute = false;
        conn = con.getConnection();
        try {
            String sql = "delete from tblStudent where id = ?";
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            status = st.executeUpdate();
            if (st.executeUpdate() > 0) {
                statusExecute = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusExecute;
    }

    public List<Student> searchProduct(String name) {
        Connection conn;
        PreparedStatement st;
        ResultSet rs;
        Student s;
        List<Student> students;
        conn = con.getConnection();
        students = new ArrayList<>();
        try {
            String sql = "select * from tblStudent where fullname like '%" + name + "%'";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                s = new Student();
                s.setId(rs.getInt("id"));
                s.setFullname(rs.getString("fullname"));
                s.setPhone(rs.getString("phone"));
                s.setAvg_mark(rs.getString("avg_mark"));
                students.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public Student getStudentByID(int id) {
        Connection conn;
        PreparedStatement st;
        ResultSet rs;
        Student student = null;
        conn = con.getConnection();
        try {
            String sql = "select * from tblStudent where id = ?";
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            while (rs.next()) {
                student = new Student(rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("phone"),
                        rs.getString("avg_mark"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

   public boolean updateProduct(Student student) {
        Connection conn;
        PreparedStatement st;
        ResultSet rs;
        int status = 0;
        boolean statusExecute = false;
        conn = con.getConnection();
        try {
            String sql = "update tblStudent set fullname = ?, phone = ?, avg_mark = ? where id = ?";
            st = conn.prepareStatement(sql);
            st.setString(1, student.getFullname());
            st.setString(2, student.getPhone());
            st.setString(3, student.getAvg_mark());
            st.setInt(4, student.getId());
            status = st.executeUpdate();
            if (st.executeUpdate() > 0) {
                statusExecute = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusExecute;
    }
   
   public boolean insertProduct(Student student) {
        Connection conn;
        PreparedStatement st;
        ResultSet rs;
        Student s;
        List<Student> students;
        int status = 0;
        boolean statusExecute = false;
        conn = con.getConnection();
        students = new ArrayList<>();
        try {
            String sql = "insert into tblStudent values(?,?,?,?) ";
            st = conn.prepareStatement(sql);
            st.setInt(1, student.getId());
            st.setString(2, student.getFullname());
            st.setString(3, student.getPhone());
            st.setString(4, student.getAvg_mark());
            status = st.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return status > 0 ? true : false;
    }
}
