/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.lab.controller;

import com.lab.bean.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 Document   : payrollservlet
    Created on : 12 May 2026
    Author     : IZZUL MUAZZAM
    COURSE     : CSM3023
    LAB 5      : EXERCISE

 */
public class PayrollServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PayrollServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PayrollServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Membina ArrayList dan menambah 5 objek Employee [cite: 117]
        List<Employee> employeeList = new ArrayList<>();
        
        Employee e1 = new Employee();
        e1.setEmpId("E001"); e1.setName("Wan Ahmad"); e1.setDepartment("IT"); e1.setBasicSalary(4500.00);
        
        Employee e2 = new Employee();
        e2.setEmpId("E002"); e2.setName("Siti Sarah"); e2.setDepartment("HR"); e2.setBasicSalary(2800.00);
        
        Employee e3 = new Employee();
        e3.setEmpId("E003"); e3.setName("Ravi Kumar"); e3.setDepartment("Finance"); e3.setBasicSalary(3500.00);
        
        Employee e4 = new Employee();
        e4.setEmpId("E004"); e4.setName("Mei Ling"); e4.setDepartment("Marketing"); e4.setBasicSalary(2900.00);
        
        Employee e5 = new Employee();
        e5.setEmpId("E005"); e5.setName("Abu Bakar"); e5.setDepartment("IT"); e5.setBasicSalary(5000.00);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        // Berkongsi senarai ke JSP [cite: 118]
        request.setAttribute("employeeList", employeeList);

        // Forward ke view [cite: 118]
        RequestDispatcher rd = request.getRequestDispatcher("payroll_view.jsp");
        rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
