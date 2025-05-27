package com.example.korea_sleepTech_springboot.dto.file;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommunityResponseDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime created_at;

    private List<FileResponseDto> files;
}
