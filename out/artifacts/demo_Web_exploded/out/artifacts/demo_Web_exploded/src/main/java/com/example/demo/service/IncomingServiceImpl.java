package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.dto.IncomingDto;
import com.example.demo.entity.Book;
import com.example.demo.entity.Incoming;
import com.example.demo.repository.IncomingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class IncomingServiceImpl  implements IncomingService{
 private IncomingRepository incomingRepository;

 @Autowired
    public IncomingServiceImpl(IncomingRepository incomingRepository) {
        this.incomingRepository = incomingRepository;
    }

    @Override
    public List<IncomingDto> getAllIncoming() {
        List<Incoming> incoming = incomingRepository.getAllIncoming();
        return convertListToListIncomingDto(incoming);
    }


    private List<IncomingDto> convertListToListIncomingDto(List<Incoming> incoming) {
        List<IncomingDto> incomingDtos = new ArrayList<>();
        for (Incoming incomings : incoming) {
            incomingDtos.add(convertFromEntityToDto(incomings));
        }

        return incomingDtos;
    }

    private IncomingDto convertFromEntityToDto(Incoming incoming) {
        IncomingDto incomingDto = new IncomingDto();
        incomingDto.setId(incoming.getId());
        incomingDto.setCount_Incom(incoming.getCount_Incom());
        incomingDto.setPrice(incoming.getPrice());
        return incomingDto;
    }

    private Incoming convertFromDtoToEntity(IncomingDto incomingDto) {
        Incoming incoming = new Incoming();
        if (incomingDto.getId() != null) {
           incoming.setId(incomingDto.getId());
        }
        incoming.setCount_Incom(incomingDto.getCount_Incom());
        incoming.setPrice(incomingDto.getPrice());

        return incoming;
    }

}


