package com.zoho.services;

import java.util.List;

import com.zoho.entities.Contacts;

public interface ContactsService {

	public void saveContactInformaition(Contacts Contact);
	public List<Contacts> getAllContacts();
	public Contacts findContactsById(long id);
}
