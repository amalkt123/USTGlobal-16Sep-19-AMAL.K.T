package com.ustglobal.finalproject.dao;

import java.util.List;

import com.ustglobal.finalproject.dto.EmailBean;
import com.ustglobal.finalproject.dto.UserBean;

public interface IEmailDAO {
	public boolean registerUser(UserBean user);
	public UserBean loginUser(String email,String password);
	public UserBean forgotPassowrd(String email,String question,String answer);
	public boolean changePassword(String email, String password,String newPassword);
	public boolean compose(String subject,String message,String email,int id);
	public boolean draft(String subject, String message, String email,int id);
	public List<EmailBean> inbox(int to_id);
	public List<EmailBean> send(int from_id);
	public boolean delete(int id);
	public List<EmailBean> draftlist(int to_id,String status);
	public boolean deleteInbox(int id);
	
}
