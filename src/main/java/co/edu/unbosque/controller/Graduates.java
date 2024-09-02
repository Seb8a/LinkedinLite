package co.edu.unbosque.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.util.List;

import co.edu.unbosque.model.Graduate;
import co.edu.unbosque.model.adapter.DataMaper;
import co.edu.unbosque.model.persistence.DAO.DataAccessObject;
import co.edu.unbosque.model.persistence.DTO.GraduateDTO;


@WebServlet("/Graduates")
public class Graduates extends HttpServlet {
	@SuppressWarnings("preview")
	private String filepath = STR."\{File.separator}src\{File.separator}main\{File.separator}webapp\{File.separator}graduates.jsp";
	
	private DataAccessObject<Graduate> graduateDao;	
	
	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<GraduateDTO> graduates = DataMaper.graduadosDtoToModel(graduateDao.getAll());
    
        req.setAttribute("graduates", graduates);
        
        req.getRequestDispatcher(filepath).forward(req, res);
	}
}
