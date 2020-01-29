package com.jpa;

import com.jpa.dto.AuthorDto;
import com.jpa.repository.AuthorRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookStoreService {

	private final AuthorRepository authorRepository;

	public BookStoreService(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}
	
	public void fetchWithSeqNumber1() {
		List<AuthorDto> authors = authorRepository.fetchWithSeqNumber1();
		
		authors.forEach(a -> System.out.println(a.getRowNum()
				+ " , " + a.getName() + " , " + a.getAge()));
	}
}
