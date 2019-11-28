package com.ustglobal.contactfileapp.util;

import com.ustglobal.contactfileapp.dao.ContactFileJdbcImpl;

public class ContactManager {
	public static ContactFileJdbcImpl getContactFileImpl() {
		return new ContactFileJdbcImpl();
	}

}
