package com.example.demo.service;

import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.BookDto;
import com.example.demo.entity.Author;

import java.util.List;

public interface AuthorService {

    public List<AuthorDto> getAllAuthor();

    public List<AuthorDto> getAllAuthorWithBooks();

    public Author saveEntity(AuthorDto authorDto);

    public AuthorDto getAuthorById(Integer idAuthor);

    public AuthorDto getAuthorByName(String name);

    public AuthorDto  getAuthorWithBookById(Integer iAuthor);

    public void deleteById(Integer id);

}
