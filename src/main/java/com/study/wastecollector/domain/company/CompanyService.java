package com.study.wastecollector.domain.company;

import com.study.wastecollector.domain.apartment.Apartment;
import com.study.wastecollector.domain.apartment.ApartmentRepository;
import com.study.wastecollector.domain.objects.Objects;
import com.study.wastecollector.domain.objects.ObjectsRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final ApartmentRepository apartmentRepository;
    private final ObjectsRepository objectsRepository;

    public void createCompany(String name) {
        Company company = new Company(name);
        companyRepository.save(company);
    }

    @Transactional
    public void resetCount(Long apartmentId, Long objectsId) {
        Apartment apartment = apartmentRepository.findById(apartmentId).get();
        Objects objects = objectsRepository.findById(objectsId).get();
        objects.resetCount();
    }
}
