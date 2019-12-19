package com.ustglobal.lms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
@Data
@Entity
@Table(name="login")
public class LoginBean {
    @Id
    @Column
    @GeneratedValue
    private int id;
    @Column(unique = true)
	private String username;
    @Column
	private String password;
    @Column
    private String status;
    @Column
    private String type;
    @lombok.ToString.Exclude
    @OneToOne(mappedBy = "loginBean")
    private StudentBean studentBean;
    @lombok.ToString.Exclude
    @OneToOne(mappedBy = "bean")
    private LibrarianBean librarianBean;
    
	

}
