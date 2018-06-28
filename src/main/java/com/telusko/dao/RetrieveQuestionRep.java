package com.telusko.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.telusko.model.QuestionChoices;
import com.telusko.model.Questions;

public interface RetrieveQuestionRep extends CrudRepository<Questions, String> {

	@Query("from Questions ")

	List<Questions> RetrievQuestions();

	@Query("select choice from QuestionChoices where question_id = :pQuestionId  ")

	List<String> RetrievQuestionChoices(@Param("pQuestionId") int pQuestionId);

}
