package co.edu.unbosque.controller;

import java.io.Serializable;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.Attribute;
import javax.naming.NamingEnumeration;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase Email representa un objeto para enviar correos electrónicos.
 * Implementa la interfaz Serializable para permitir la serialización de objetos.
 */
public class Email implements Serializable {
    private static final long serialVersionUID = 1L;

    private Properties prop; // Propiedades del servidor de correo
    private MimeMessage mail; // Mensaje de correo electrónico
    private String ad_user; // Dirección de correo del remitente
    private String ad_pass; // Contraseña de la cuenta de correo del remitente
    private String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // Caracteres para generar el código
    private Random r; // Objeto para generar números aleatorios
    private StringBuilder sb; // Constructor de cadenas
    private int length; // Longitud del código generado

    /**
     * Constructor vacío de la clase Email.
     */
    public Email() {
        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.office365.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
    }

    /**
     * Método para enviar un correo electrónico.
     * 
     * @param email    La dirección de correo del destinatario.
     * @param password La contraseña de la cuenta de correo del remitente.
     */
    public void enviarCorreo(String email, String password) {
        ad_user = "uebestudiante@outlook.com";
        ad_pass = "Password2024";
        

        Session session = Session.getInstance(prop, new Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(ad_user, ad_pass);
            }
        });

        try {
            mail = new MimeMessage(session);
            mail.setFrom(new InternetAddress(ad_user));
            mail.setRecipients(RecipientType.TO, InternetAddress.parse(email));

            mail.setSubject("Correo prueba");
            mail.setText("Tu correo es:" + email + "\n Password " + password + "*Esto es una prueba de Juan Ochoa*");

            Transport.send(mail);
            System.out.println("EMAIL SENT SUCCESSFULLY");

        } catch (MessagingException e) {
            System.out.println("FAILED TO SEND EMAIL: " + e.getMessage());
        }
    }

    /**
     * Método para validar si un correo electrónico tiene un formato válido
     * y si el dominio tiene registros MX.
     * 
     * @param email La dirección de correo a validar.
     * @return true si el correo es válido, false en caso contrario.
     */
    public boolean esCorreoValido(String email) {
        if (email == null) {
            return false;
        }

        // Verificar formato del correo
        String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);

        // Si el formato no es válido, retornar false
        if (!matcher.matches()) {
            return false;
        }

        // Verificar si el dominio tiene registros MX
        return tieneRegistroMX(email);
    }

    /**
     * Verifica si el dominio del correo tiene registros MX.
     * 
     * @param email La dirección de correo a verificar.
     * @return true si el dominio tiene registros MX, false en caso contrario.
     */
    private boolean tieneRegistroMX(String email) {
        String domain = email.substring(email.indexOf('@') + 1);
        List<String> mxRecords = obtenerMXRecords(domain);
        return !mxRecords.isEmpty();
    }

    /**
     * Obtiene los registros MX para un dominio.
     * 
     * @param domain El dominio a consultar.
     * @return Una lista de registros MX.
     */
    private List<String> obtenerMXRecords(String domain) {
        List<String> mxRecords = new ArrayList<>();

        try {
            Hashtable<String, String> env = new Hashtable<>();
            env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            DirContext ictx = new InitialDirContext(env);
            Attributes attrs = ictx.getAttributes(domain, new String[]{"MX"});
            Attribute attr = attrs.get("MX");

            if (attr != null) {
                for (NamingEnumeration<?> e = attr.getAll(); e.hasMore(); ) {
                    String mxRecord = (String) e.next();
                    mxRecords.add(mxRecord);
                }
            } else {
                // Si no hay registros MX, intenta buscar registros A (básico)
                attrs = ictx.getAttributes(domain, new String[]{"A"});
                attr = attrs.get("A");
                if (attr != null) {
                    for (NamingEnumeration<?> e = attr.getAll(); e.hasMore(); ) {
                        String aRecord = (String) e.next();
                        mxRecords.add(aRecord);
                    }
                }
            }

        } catch (NamingException ex) {
            ex.printStackTrace();
        }

        return mxRecords;
    }

    // Métodos getter y setter para los atributos del objeto Email

    public MimeMessage getMail() {
        return mail;
    }

    public void setMail(MimeMessage mail) {
        this.mail = mail;
    }

    public String getCode() {
        return sb.toString(); // Si estás generando un código, este podría ser un getter para el mismo.
    }

    public void setCode(String code) {
        this.sb = new StringBuilder(code); // Si estás asignando un código generado, lo harías aquí.
    }
}
