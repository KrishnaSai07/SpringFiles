package com.verizon.adb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.adb.dao.ContactRepository;
import com.verizon.adb.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	
	@Override
	public Contact getContactById(long contactId) {
		Contact contact=null;
		
		/*if(contactRepository.existsById(contactId))
		{
			contact=contactRepository.findById(contactId).get();
		}*/
		Optional<Contact> optContact = contactRepository.findById(contactId);
		if(optContact.isPresent())
		{
			contact = optContact.get();
		}
		
			return contact;
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return contactRepository.findAll();
	}

	@Override
	public Contact addContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.save(contact);
		
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.save(contact);
	}

	@Override
	public boolean deleteContact(long contactId) {
		// TODO Auto-generated method stub
		boolean isDeleted=false;
		if(contactRepository.existsById(contactId))
		{
		contactRepository.deleteById(contactId);
		isDeleted= true;
		}
		return isDeleted;
	}

	@Override
	public boolean existsByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return contactRepository.existsByEmailId(emailId);
	}

	@Override
	public boolean existsByMobileNumber(String mobileNumber) {
		// TODO Auto-generated method stub
		return contactRepository.existsByMobileNumber(mobileNumber);
	}

	@Override
	public Contact findByMobileNumber(String mobileNumber) {
		// TODO Auto-generated method stub
		return contactRepository.findByMobileNumber(mobileNumber);
	}

	@Override
	public Contact findByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return contactRepository.findByEmailId(emailId);
	}

	@Override
	public List<Contact> findAllByLastName(String lastName) {
		// TODO Auto-generated method stub
		return contactRepository.findAllByLastName(lastName);
	}

}
