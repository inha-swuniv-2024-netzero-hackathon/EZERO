package com.study.wastecollector.domain.apartment;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AddRequestDto {
    @NotBlank(message = "회사 아이디를 입력해주세요.")
    private Long address;

    @NotBlank(message = "제목을 입력해주세요.")
    private Long productName;

    @NotBlank(message = "개수를 입력해주세요.")
    private Long quantity;
}
