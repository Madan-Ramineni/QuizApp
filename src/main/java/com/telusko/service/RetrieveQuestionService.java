package com.telusko.service;

import java.util.List;
import java.util.Map;

import com.telusko.model.QuestionChoices;

public interface RetrieveQuestionService {

	public Map<String , List<String>> RetrieveQuestions();

}
