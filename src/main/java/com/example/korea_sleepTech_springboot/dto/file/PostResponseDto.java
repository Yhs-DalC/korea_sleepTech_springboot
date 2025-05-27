package com.example.korea_sleepTech_springboot.dto.file;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostResponseDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime created_at;

    private FileResponseDto file;
}
