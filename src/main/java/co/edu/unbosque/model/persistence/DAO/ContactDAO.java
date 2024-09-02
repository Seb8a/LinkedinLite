package co.edu.unbosque.model.persistence.DAO;

import java.util.List;

import co.edu.unbosque.model.Contact;
import co.edu.unbosque.model.persistence.FileHandler;

public class ContactDAO implements DataAccessObject<Contact>{
	private final FileHandler fh;
	
	private final List<Contact> contacts;
	
	public ContactDAO() {
		fh = new FileHandler();
		contacts = getAll();
	}

	@Override
	public List<Contact> getAll() {
		return fh.readFile();
	}

	@Override
	public void post(Contact item) {
        contacts.add(item);

        fh.writeFile(contacts);
		
	}
}
