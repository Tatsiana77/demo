package com.example.demo.service;

import com.example.demo.dto.PublisherDto;
import com.example.demo.entity.Publisher;
import com.example.demo.repository.PublisherRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublisherService {

    public List<PublisherDto> getAllPublisher();

    public PublisherDto getPublisherWithBookById(Integer idPublisher);
}
