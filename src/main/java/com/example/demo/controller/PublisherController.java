package com.example.demo.controller;

import com.example.demo.dto.PublisherDto;
import com.example.demo.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PublisherController {

    private PublisherService publisherService;

    @Autowired
    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @RequestMapping(value = "/publisher", method = RequestMethod.GET)
    public String getAllPublisher(ModelMap modelMap){
        List<PublisherDto> publishers= publisherService.getAllPublisher();
        modelMap.addAttribute("publishers", publishers);
        return "publisher";

    }

    @RequestMapping(value = "/publisher/book", method = RequestMethod.GET)
    public String getAllPublisherWithBook(ModelMap modelMap, @RequestParam Integer id) {
       PublisherDto publisherDto = publisherService.getPublisherWithBookById(id);
        modelMap.addAttribute("publisher", publisherDto);
        return "publisher_book";
    }
}
