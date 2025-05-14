package com.example.korea_sleepTech_springboot.service;

import com.example.korea_sleepTech_springboot.dto.response.ResponseDto;
import com.example.korea_sleepTech_springboot.dto.user.request.UserUpdateRequestDto;
import com.example.korea_sleepTech_springboot.dto.user.response.GetUserResponseDto;

public interface UserService {
    ResponseDto<GetUserResponseDto> getUserInfo(String userEmail);

    ResponseDto<GetUserResponseDto> updateUserInfo(String userEmail, UserUpdateRequestDto dto);

    ResponseDto<Void> deleteUser(String userEmail);
}