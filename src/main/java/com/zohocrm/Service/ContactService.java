package com.zohocrm.Service;

import java.util.List;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;

public interface ContactService {
		
	public void saveContact(Contact contact);

	 List<Contact> getContacts();

	public Contact getContactById(long id);
	
}
