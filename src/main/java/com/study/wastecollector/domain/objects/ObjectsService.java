package com.study.wastecollector.domain.objects;

import com.study.wastecollector.domain.apartment.Apartment;
import com.study.wastecollector.domain.apartment.ApartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ObjectsService {
    private final ApartmentRepository apartmentRepository;
    private final ObjectsRepository objectsRepository;

    public void createObject(ObjectsRequestDto objectsRequestDto) {
        Apartment apartment = apartmentRepository.findById(objectsRequestDto.getApartmentId()).get();
        Objects object = new Objects(objectsRequestDto.getName(), apartment);
        objectsRepository.save(object);
    }
}
