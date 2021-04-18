package com.example.demo.service;

import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.BookDto;
import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorDto> getAllAuthor() {
        List<Author> authors = authorRepository.getAllAuthor();
        return  convertListAuthorToListAuthorDto(authors);
    }

    @Override
    @Transactional
    public List<AuthorDto> getAllAuthorWithBooks() {
        List<Author> authors = authorRepository.getAllAuthorWithJoin();
        return convertFromListEntityToListDto(authors);
    }

    @Override
    public void saveEntity(AuthorDto authorDto) {

    }

    @Override
    public AuthorDto getAuthorById(Integer idAuthor) {
        return null;
    }

    @Override
    public AuthorDto getAuthorByName(String name) {
        return null;
    }

    @Override
    public AuthorDto getAuthorWithBookById(Integer idAuthor) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    private List<AuthorDto> convertListAuthorToListAuthorDto(List<Author> author) {
        List<AuthorDto> authorDtos = new ArrayList<>();
        for (Author authors : author) {
            authorDtos.add(convertFromEntityAuthorToDto(authors));
        }

        return authorDtos;
    }

    private AuthorDto convertFromEntityAuthorToDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
       authorDto.setName(author.getName());
       authorDto.setSurname(author.getSurname());
       authorDto.setBookDto(new ArrayList<>());
        return authorDto;
    }

    private List<AuthorDto> convertFromListEntityToListDto(List<Author> author) {
        List<AuthorDto> authorDtos = new ArrayList<>();
        for (Author authors : author) {
            authorDtos.add(convertFromEntityToDto(authors));
        }

        return authorDtos;
    }

    private AuthorDto convertFromEntityToDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setName(author.getName());
        authorDto.setSurname(author.getSurname());

        List<BookDto> bookDtos = new ArrayList<>();

        for (Book book : author.getBook()) {
            BookDto bookDto = new BookDto();
            bookDto.setId(book.getId());
            bookDto.setTitle(book.getTitle());
            bookDtos.add(bookDto);
        }
        authorDto.setBookDto(bookDtos);
        return authorDto;
    }
}
