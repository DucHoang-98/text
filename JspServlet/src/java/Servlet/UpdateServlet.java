/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Beans.Student;
import Dao.StudentDao;
import com.sun.imageio.plugins.common.I18N;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class UpdateServlet extends HttpServlet {

    
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        StudentDao studentDao = new StudentDao();
        Student student = new Student();
        student = studentDao.getStudentByID(id);
        request.setAttribute("updateStudent", student);
        request.getRequestDispatcher("update.jsp").forward(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        StudentDao studentDao = new StudentDao();
        Student studentUpdate = new Student();
        studentUpdate.setId(Integer.parseInt(request.getParameter("id")));
        studentUpdate.setFullname(request.getParameter("fullname"));
        studentUpdate.setPhone(request.getParameter("phone"));
        studentUpdate.setAvg_mark(request.getParameter("avg"));
        studentDao.updateProduct(studentUpdate);
        System.out.println(studentUpdate.getId() + studentUpdate.getFullname() + "222222");
        response.sendRedirect("DisplayServlet");
    }

}
