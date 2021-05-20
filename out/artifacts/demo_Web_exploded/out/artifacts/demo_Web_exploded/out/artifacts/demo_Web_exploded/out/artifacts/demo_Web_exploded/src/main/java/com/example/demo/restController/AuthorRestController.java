package com.example.demo.restController;

import com.example.demo.dto.AuthorDto;
import com.example.demo.entity.Author;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class AuthorRestController {
    private AuthorService authorService;

    @Autowired
    public AuthorRestController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @GetMapping("/api/authors")
    public List<AuthorDto> getAllAuthor() {
        return authorService.getAllAuthor();
    }

    @GetMapping("/api/authorWithBooks")
    public List<AuthorDto> getAllAuthorWithBook() {
        return authorService.getAllAuthorWithBooks();
    }


    @GetMapping(value = "/api/{idAuthor}")
    public AuthorDto getAuthorById(@PathVariable("idAuthor") Integer idAuthor) {
        return authorService.getAuthorWithBookById(idAuthor);
    }

    @GetMapping("/api/author/name")
    public AuthorDto getAuthorByName(@RequestParam String name) {
        return authorService.getAuthorByName(name);
    }



    @PostMapping ("/api/author")
    public void saveAuthor(@RequestBody AuthorDto authorDto) {
        authorService.saveEntity(authorDto);
    }


    @DeleteMapping("/api/author")
    public void deleteAuthorById(@PathVariable("idAuthor") Integer id) {
        authorService.deleteById(id);
    }
}

