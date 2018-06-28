package com.telusko.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.service.RetrieveQuestionService;

@RestController

public class RetrieveController {

	@Autowired

	private RetrieveQuestionService retrieveQuestionService;

	@RequestMapping("/RetrieveQuestion")
	public Map<String, List<String>> Retrieve(Model model) {

		System.out.println("welcome here");
		Map<String, List<String>> Questions = retrieveQuestionService.RetrieveQuestions();
		model.addAttribute("Questions", Questions);

		return Questions;

	}

	@RequestMapping("/result")
	public String Retrieve(@RequestParam("answer") String pOption,@RequestParam("question") String pQuestion , ModelMap model) {

		System.out.println("welcome here result");
		System.out.println("Optons" + pOption);
		System.out.println("Optons" + pQuestion);

		return pQuestion;

	}

}
