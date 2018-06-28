package com.telusko.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.telusko.dao.RetrieveQuestionRep;
import com.telusko.model.QuestionChoices;
import com.telusko.model.Questions;

@Service
public class RetrieveQuestionServiceImpl implements RetrieveQuestionService {

	@Autowired
	RetrieveQuestionRep retrieveQuestionRep;

	@Transactional
	public Map<String, List<String>> RetrieveQuestions() {

		Map<String, List<String>> AllQuestions = new HashMap<String, List<String>>();
		List<String> vQuestionChoices = null;

		List<Questions> vQuestions = retrieveQuestionRep.RetrievQuestions();

		for (Questions qu : vQuestions) {

			vQuestionChoices = retrieveQuestionRep.RetrievQuestionChoices(qu.getQuestion_id());

			AllQuestions.put(qu.getQuestion(), vQuestionChoices);
		}
		return AllQuestions;

	}

}
