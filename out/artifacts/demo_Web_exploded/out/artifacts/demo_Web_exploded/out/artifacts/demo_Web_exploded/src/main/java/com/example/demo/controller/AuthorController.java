package com.example.demo.controller;

import com.example.demo.dto.AuthorDto;
import com.example.demo.entity.Author;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AuthorController {

    private AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(value="/author", method = RequestMethod.GET)
    public String getAllAuthor(ModelMap modelMap) {
        List<AuthorDto> authors= authorService.getAllAuthor();
        modelMap.addAttribute("authors", authors);
        return "author";
    }


    @RequestMapping("/author/edit")
    public String editAuthor(ModelMap modelMap, @RequestParam Integer id) {
        AuthorDto authorDto = authorService.getAuthorById(id);
        modelMap.addAttribute("author", authorDto);
        return "editAuthor";
    }

    @RequestMapping(value="/edit-author", method =RequestMethod.POST)
    public String saveAuthor(@ModelAttribute("author") AuthorDto authorDto) {
        authorService.saveEntity(authorDto);
        return "redirect:/author";
    }

    @RequestMapping("/author/{id}")
    public String deleteAuthor(ModelMap modelMap, @RequestParam Integer id){
       authorService.deleteById(id);
        return  "delAuthor";
    }

}

