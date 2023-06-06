package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Answer {
	@Id
	@Column(name = "a_id")
	private int aid;
	private String ans;
	@ManyToOne
	private Question question;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Answer(int aid, String ans, Question question) {
		super();
		this.aid = aid;
		this.ans = ans;
		this.question = question;
	}
	
	
	

}
