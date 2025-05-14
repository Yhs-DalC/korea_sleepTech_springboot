package com.example.korea_sleepTech_springboot.dto.user.response;

import com.example.korea_sleepTech_springboot.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GetUserResponseDto {
    private Long id;
    private String email;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public GetUserResponseDto(User user){
        this.id = user.getId();
        this.email = user.getEmail();
        this.created_at = user.getCreatedAt();
        this.updated_at = user.getUpdatedAt();
    }
}
