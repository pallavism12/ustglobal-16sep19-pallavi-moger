package com.ustglobal.jdbcmobileapp.util;

import com.ustglobal.jdbcmobileapp.dao.ContactDAO;
import com.ustglobal.jdbcmobileapp.dao.ContactDaoImpl;

public class ContactManager {
	private ContactManager () {
		
	}

	public static ContactDAO getAContactDetails() {
		return new ContactDaoImpl();
	}
}
