package com.telusko.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Question_choices")
public class QuestionChoices {
	
	@Id
	private int choice_id;
	private int question_id;
	private String choice;
	private String is_right_choice;

	public int getChoice_id() {
		return choice_id;
	}

	public void setChoice_id(int choice_id) {
		this.choice_id = choice_id;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	public String getIs_right_choice() {
		return is_right_choice;
	}

	public void setIs_right_choice(String is_right_choice) {
		this.is_right_choice = is_right_choice;
	}

	@Override
	public String toString() {
		return "QuestionChoices [choice_id=" + choice_id + ", question_id=" + question_id + ", choice=" + choice
				+ ", is_right_choice=" + is_right_choice + "]";
	}

}
