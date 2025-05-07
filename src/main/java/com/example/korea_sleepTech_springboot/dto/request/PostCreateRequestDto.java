package com.example.korea_sleepTech_springboot.dto.request;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

// Dto 클래스명 지정
// 엔티티명 + CRUD(동작) +Request/Response + Dto

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostCreateRequestDto {
    @NotBlank(message = "제목은 필수 입력 값입니다.")
    private String title;

    @NotBlank(message = "내용은 필수 입력 값입니다.")
    private String content;

    @NotBlank(message = "작성자는 필수 입력 값입니다.")
    private String author;
}
