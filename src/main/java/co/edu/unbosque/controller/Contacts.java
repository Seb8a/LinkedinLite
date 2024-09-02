package co.edu.unbosque.controller;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import co.edu.unbosque.model.Contact;
import co.edu.unbosque.model.persistence.DAO.DataAccessObject;
import co.edu.unbosque.model.persistence.DTO.ContactDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Contacts")
public class Contacts extends HttpServlet {
	
	@SuppressWarnings("preview")
	private String filepath = STR."\{File.separator}src\{File.separator}main\{File.separator}webapp\{File.separator}graduates.jsp";

	private DataAccessObject<Contact> contactDao;
	
	@Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String nameCompany = req.getParameter("nameCompany");
        String emailRRHH = req.getParameter("emailRRHH");
        String message = req.getParameter("message");
        String expirationJobStr = req.getParameter("expirationJob");
        
        LocalDate expirationJob = LocalDate.parse(expirationJobStr);

        ContactDTO contactDTO = new ContactDTO();
        
        contactDTO.setNameCompany(nameCompany);
        contactDTO.setEmailRRHH(emailRRHH);
        contactDTO.setMessage(message);
        contactDTO.setExpirationJob(expirationJob);
        
        req.setAttribute("message", "Contact submitted successfully!");
        req.getRequestDispatcher(filepath).forward(req, res);
	}
}
