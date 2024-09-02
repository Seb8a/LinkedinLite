package co.edu.unbosque.controller;

import static java.lang.StringTemplate.STR;

import java.io.File;
import java.io.IOException;
import java.util.List;

import co.edu.unbosque.model.Graduate;
import co.edu.unbosque.model.Project;
import co.edu.unbosque.model.adapter.DataMaper;
import co.edu.unbosque.model.persistence.DAO.DataAccessObject;
import co.edu.unbosque.model.persistence.DTO.GraduateDTO;
import co.edu.unbosque.model.persistence.DTO.ProjectDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Projects")
public class Projects extends HttpServlet {

	@SuppressWarnings("preview")
	private String filepath = STR."\{File.separator}src\{File.separator}main\{File.separator}webapp\{File.separator}graduates.jsp";
	
	private DataAccessObject<Project> projectDao;
	
	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<ProjectDTO> projects = DataMaper.projectDtoToModel(projectDao.getAll());
    
        req.setAttribute("projects", projects);
        
        req.getRequestDispatcher(filepath).forward(req, res);
	}
}
