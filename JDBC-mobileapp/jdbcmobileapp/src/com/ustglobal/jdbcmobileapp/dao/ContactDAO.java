package com.ustglobal.jdbcmobileapp.dao;

import java.util.List;

import com.ustglobal.jdbcmobileapp.dto.ContactBean;

public interface ContactDAO {
	
	public List<ContactBean> getAllNames();
	public ContactBean searchContact(String name);
	
	public int addContact(ContactBean bean);
	public int deleteContact(ContactBean bean);
	public int editContact(ContactBean bean);
	

}
