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

import java.util.List;


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
        return convertListAuthorToListAuthorDto(authors);
    }

    @Override
    @Transactional
    public List<AuthorDto> getAllAuthorWithBooks() {
        List<Author> authors = authorRepository.getAllAuthorWithJoin();
        return convertFromListEntityToListDto(authors);
    }

    @Override
    public Author saveEntity(AuthorDto authorDto) {
        Author author = convertFromAuthorDtoToEntity(authorDto);
        authorRepository.save(author);

        return author;
    }


    @Override
    public AuthorDto getAuthorById(Integer idAuthor) {
        Author author = authorRepository.findById(idAuthor).get();
        return convertFromEntityAuthorToDto(author);
    }

    @Override
    public AuthorDto getAuthorByName(String name) {
        return convertFromEntityAuthorToDto(authorRepository.getAuthorByName(name));
    }

    @Override
    public AuthorDto getAuthorWithBookById(Integer idAuthor) {
        return convertFromEntityToDto(authorRepository.getAuthorWithBookById(idAuthor));
    }


    @Override
    public void deleteById(Integer id) {
        authorRepository.deleteById(id);
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

    private Author convertFromAuthorDtoToEntity(AuthorDto authorDto) {
        Author author = new Author();
        if (authorDto.getId() != null) {
            author.setId(authorDto.getId());
        }
        author.setName(authorDto.getName());
        List<Book> books = new ArrayList<>();
        for (BookDto bookdto : authorDto.getBookDto()) {
            books.add(convertFromBookDtoToBookEntity(bookdto, author));


        }
        author.setBook(books);
        return author;
    }

    private Book convertFromBookDtoToBookEntity(BookDto bookDto, Author author) {
        Book book = new Book();
        if (bookDto.getId() != null) {
            book.setId(bookDto.getId());
        }

        book.setAuthor(author);
        book.setTitle(bookDto.getTitle());
        return book;
    }
}
