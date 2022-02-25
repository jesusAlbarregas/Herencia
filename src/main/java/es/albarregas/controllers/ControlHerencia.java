/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.controllers;

import es.albarregas.DAOFactory.DAOFactory;
import es.albarregas.DAOs.IGenericoDAO;
import es.albarregas.beans.Normal;
import es.albarregas.beans.Persona;
import es.albarregas.beans.Programador;
import es.albarregas.beans.Tecnologo;
import es.albarregas.beans.Tester;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesus
 */
@WebServlet(name = "ControlHerencia", urlPatterns = {"/ControlHerencia"})
public class ControlHerencia extends HttpServlet {

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
        String url = null;
        switch (request.getParameter("donde")) {
            case "alta":
                url = "/jsp/formularioAlta.jsp";
                break;
            case "visualizar":
                DAOFactory daoF = DAOFactory.getDAOFactory();
                IGenericoDAO iDAO = daoF.getGenericoDAO();
                List listado = null;
                String tipoPersona = null;
                String tipo = request.getParameter("tipo");
                switch (tipo) {
                    case "Persona":
                        listado = iDAO.selectAll(Persona.class);
                        tipoPersona = "persona";
                        break;
                    case "Normal":
                        listado = iDAO.selectAll(Normal.class);
                        tipoPersona = "normal";
                        break;
                    case "Tecnologo":
                        listado = iDAO.selectAll(Tecnologo.class);
                        tipoPersona = "tecnologo";
                        break;
                    case "Tester":
                        listado = iDAO.selectAll(Tester.class);
                        tipoPersona = "tester";
                        break;
                    case "Programador":
                        listado = iDAO.selectAll(Programador.class);
                        tipoPersona = "programador";
                        break;
                }
                request.setAttribute("tipoPersona", tipoPersona);
                request.setAttribute("listado", listado);
                url = "/jsp/listado.jsp";
                break;
        }
        request.getRequestDispatcher(url).forward(request, response);
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
        processRequest(request, response);
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
