package com.zoho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entities.Contacts;
import com.zoho.repositories.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService {

	@Autowired
	private ContactsRepository contactRepo;
	
	@Override
	public void saveContactInformaition(Contacts contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts findContactsById(long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contact = findById.get();
		return contact;
	}

}
