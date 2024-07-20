package com.study.wastecollector.domain.apartment;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApartmentRequestDto {
    @NotBlank(message = "제목을 입력해주세요.")
    private String name;

    @NotBlank(message = "회사 아이디를 입력해주세요.")
    private Long companyId;
}
