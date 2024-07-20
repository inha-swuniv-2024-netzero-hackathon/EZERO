package com.study.wastecollector.domain.company;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/company")
public class CompanyController {
    private final CompanyService companyService;

    @PostMapping("/{company_name}")
    public void createObject(
            @PathVariable String company_name
    ) {
        companyService.createCompany(company_name);
    }

    @PostMapping("/ApartmentId/{apartment_id}/ObjectsId/{objects_id}")
    public void resetCount(
            @PathVariable Long apartment_id,
            @PathVariable Long objects_id
    ) {
        companyService.resetCount(apartment_id, objects_id);
    }

}
