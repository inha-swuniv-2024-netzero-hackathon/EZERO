package com.study.wastecollector.domain.apartment;

import com.study.wastecollector.domain.company.Company;
import com.study.wastecollector.domain.company.CompanyRepository;
import com.study.wastecollector.domain.objects.Objects;
import com.study.wastecollector.domain.objects.ObjectsRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApartmentService {
    private final CompanyRepository companyRepository;
    private final ApartmentRepository apartmentRepository;
    private final ObjectsRepository objectsRepository;

    public void createApartment(ApartmentRequestDto apartmentRequestDto) {
        Company company = companyRepository.findById(apartmentRequestDto.getCompanyId()).get();
        Apartment apartment = new Apartment(company, apartmentRequestDto.getName());
        apartmentRepository.save(apartment);
    }
    /*
    public void createApartment(String apartmentName, Long companyId) {
        Company company = companyRepository.findById(companyId).get();
        Apartment apartment = new Apartment(company, apartmentName);
        apartmentRepository.save(apartment);
    }*/

    @Transactional
    public void addWaste(Long apartmentId, Long wasteId, Long wasteCount) {
        Apartment apartment = apartmentRepository.findById(apartmentId).get();
        Objects objects = objectsRepository.findById(wasteId).get();
        objects.addCount(wasteCount);
    }

    public Long getWaste(Long wasteId) {
        Objects objects = objectsRepository.findById(wasteId).get();
        return objects.getCount();
    }
}
