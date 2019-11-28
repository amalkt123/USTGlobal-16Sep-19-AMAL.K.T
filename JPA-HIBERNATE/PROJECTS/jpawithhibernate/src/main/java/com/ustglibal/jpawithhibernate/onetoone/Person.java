package com.ustglibal.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Person {
	@Column
	@Id
	private int id;
	@Column
	private String name;
	@OneToOne(cascade = CascadeType.ALL) //type of mapping//cascade.Type-->type of operation persist merge detach remove all etc
	@JoinColumn(name="vid")//join two table by using primary key of votercard class vid act as forign key in person class
	private VoterCard card;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public VoterCard getCard() {
		return card;
	}
	public void setCard(VoterCard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", card=" + card + "]";
	}

}
