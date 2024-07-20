package com.study.wastecollector.domain.company;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CompanyRequestDto {
    @NotBlank(message = "제목은 필수입니다.")
    private String name;
}
