package com.study.wastecollector.domain.apartment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/apartment")
public class ApartmentController {
    private final ApartmentService apartmentService;

    @PostMapping()
    public void createApartment(
            @RequestBody ApartmentRequestDto apartmentRequestDto
            //@PathVariable String apartment_name,
            //@PathVariable Long companyId
    ) {
        apartmentService.createApartment(apartmentRequestDto);
        //apartmentService.createApartment(apartment_name, companyId);
    }

//    @PostMapping("/apartment/{apartmentId}/wasteId/{wasteId}/wasteCount/{wasteCount}")
//    public void addWaste(
//            @PathVariable Long apartmentId,
//            @PathVariable Long wasteId,
//            @PathVariable Long wasteCount
//    ) {
//        apartmentService.addWaste(apartmentId, wasteId, wasteCount);
//    }

    @PostMapping("/add")
    public void addWaste(
            @RequestBody AddRequestDto addRequestDto
    ) {
        apartmentService.addWaste(addRequestDto.getAddress(), addRequestDto.getProductName(), addRequestDto.getQuantity());
    }

    @GetMapping("/wasteId/{wasteId}")
    public Long getWaste(
            @PathVariable Long wasteId
    ) {
        return apartmentService.getWaste(wasteId);
    }
}
