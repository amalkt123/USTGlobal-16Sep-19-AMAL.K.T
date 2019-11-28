package com.ustglibal.jpawithhibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Table
@Data
public class VoterCard {
	@Column
	@Id
	private int vid;
	@Column
	private String vname;
	@Exclude
	@OneToOne(mappedBy = "card")
	private Person person;
	
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	

}