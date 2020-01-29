package com.jpa.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpa.dto.AuthorDto;
import com.jpa.repository.AuthorRepository;

@Controller
public class BookStoreController {
	
	private final AuthorRepository authorRepository;

	public BookStoreController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/home")
	public String rowNum1(Model model) {
		model.addAttribute("results", authorRepository.fetchWithSeqNumber1());
		return "rowNum1";
	}
}
