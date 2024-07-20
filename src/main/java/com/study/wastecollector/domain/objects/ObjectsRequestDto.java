package com.study.wastecollector.domain.objects;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ObjectsRequestDto {
    @NotBlank(message = "제목을 입력해주세요.")
    private String name;

    @NotBlank(message = "아파트 아이디를 입력해주세요.")
    private Long apartmentId;
}
