package com.example.korea_sleepTech_springboot.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentUpdateRequestDto {
    @NotNull(message = "Post ID는 필수 입력 값입니다")
    private Long postId;

}
