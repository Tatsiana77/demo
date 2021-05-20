package com.example.demo.service;

import com.example.demo.dto.AuthorDto;
import com.example.demo.dto.BookDto;
import com.example.demo.dto.PublisherDto;
import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.entity.Publisher;
import com.example.demo.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {

    private PublisherRepository publisherRepository;

    @Autowired
    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<PublisherDto> getAllPublisher() {
        List<Publisher> publishers = publisherRepository.getAllPublisher();
        return convertListPublisherToListPublisherDto(publishers);
    }

    @Override
    public PublisherDto getPublisherWithBookById(Integer idPublisher) {
        return convertFromEntityToDto(publisherRepository.getPublisherWithBookById(idPublisher));
    }

    private List<PublisherDto> convertListPublisherToListPublisherDto(List<Publisher> publisher) {
        List<PublisherDto> publisherDtos = new ArrayList<>();
        for (Publisher publishers : publisher) {
            publisherDtos.add(convertFromEntityPublisherToDto(publishers));
        }

        return publisherDtos;
    }

    private PublisherDto convertFromEntityPublisherToDto(Publisher publisher) {
        PublisherDto publisherDto = new PublisherDto();
        publisherDto.setId(publisher.getId());
        publisherDto.setName(publisher.getName());
        publisherDto.setPublisher_Address(publisher.getPublisher_Address());
        publisherDto.setYearOfPub(publisher.getYearOfPub());
        publisherDto.setBookDto(new ArrayList<>());
        return publisherDto;
    }

    private List<PublisherDto> convertFromListEntityToListDto(List<Publisher> publisher) {
        List<PublisherDto> publisherDtos = new ArrayList<>();
        for (Publisher publishers : publisher) {
            publisherDtos.add(convertFromEntityToDto(publishers));
        }

        return publisherDtos;
    }

    private PublisherDto convertFromEntityToDto(Publisher publisher) {
        PublisherDto publisherDto = new PublisherDto();
        publisherDto.setId(publisher.getId());
        publisherDto.setName(publisher.getName());
        publisherDto.setPublisher_Address(publisher.getPublisher_Address());
        publisherDto.setYearOfPub(publisher.getYearOfPub());

        List<BookDto> bookDtos = new ArrayList<>();

        for (Book book : publisher.getBook()) {
            BookDto bookDto = new BookDto();
            bookDto.setId(book.getId());
            bookDto.setTitle(book.getTitle());
            bookDtos.add(bookDto);
        }
        publisherDto.setBookDto(bookDtos);
        return publisherDto;
    }

}
