package co.edu.unbosque.model.persistence;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.Contact;

public class FileHandler {
    @SuppressWarnings("preview")
    
	private String filepath = STR."database\{File.separator}contacts";

    public FileHandler() {
        createFile();
    }

    public void createFile() {
        Path path = Path.of(filepath);
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }
    }

    public void writeFile(List<Contact> itemsToWrite) {
        try (FileOutputStream fileOut = new FileOutputStream(filepath);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(itemsToWrite);
        } catch (IOException err) {
            System.out.println("Error al escribir el archivo: " + err.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<Contact> readFile() {
        List<Contact> itemsRead = new ArrayList<>();

        try (FileInputStream fileIn = new FileInputStream(filepath);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            itemsRead = (List<Contact>) objectIn.readObject();
        } catch (EOFException eof) {
            // End of file reached
        } catch (IOException | ClassNotFoundException err) {
            System.out.println("Error al leer el archivo: " + err.getMessage());
        }
        return itemsRead;
    }

}
