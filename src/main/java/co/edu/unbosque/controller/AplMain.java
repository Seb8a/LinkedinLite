package co.edu.unbosque.controller;

public class AplMain {

	public static void main(String[] args) {
		Email email = new Email();
		
		
			String correo1 = "jochoay@unbosque.edu.co";
	        if (email.esCorreoValido(correo1)) {
	        	email.enviarCorreo(correo1, "password123");
	            System.out.println("El correo es válido.");
	           
	        } else {
	            System.out.println("El correo es inválido.");
	        }
		
	    	String correo2 = "jochoay@";
	        if (email.esCorreoValido(correo2)) {
	        	email.enviarCorreo(correo2, "password123");
	            System.out.println("El correo es válido.");
	           
	        } else {
	            System.out.println("El correo es inválido.");
	        }
		
		
	
	}
}
