package com.example.demo.service;

import com.example.demo.dto.AuthorDto;

import java.util.List;

public interface AuthorService {

    public List<AuthorDto> getAllAuthor();

    public List<AuthorDto> getAllAuthorWithBooks();

    public void saveEntity(AuthorDto authorDto);

    public AuthorDto getAuthorById(Integer idAuthor);

    public AuthorDto getAuthorByName(String name);

    public AuthorDto getAuthorWithBookById(Integer idAuthor);

    public void updateAuthor(Integer id, String name, String surname);

    public void deleteById(Integer id);
}
