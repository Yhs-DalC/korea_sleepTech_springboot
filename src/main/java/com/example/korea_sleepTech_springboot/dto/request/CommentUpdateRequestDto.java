package com.example.korea_sleepTech_springboot.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentUpdateRequestDto {
    @NotNull(message = "내용은 필수 입력 값입니다")
    private String content;

}
