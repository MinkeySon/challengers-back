package org.knulikelion.challengers_backend.service;

import org.knulikelion.challengers_backend.data.dto.request.ChangePasswordRequestDto;
import org.knulikelion.challengers_backend.data.dto.request.ChangePasswordWithCodeRequestDto;
import org.knulikelion.challengers_backend.data.dto.response.BaseResponseDto;
import org.knulikelion.challengers_backend.data.dto.response.MyPageResponseDto;

public interface MyPageService {
    MyPageResponseDto getInfo(String email);
    BaseResponseDto changePassword(String email, ChangePasswordWithCodeRequestDto changePasswordWithCodeRequestDto);
    BaseResponseDto sendPwChangeCode(String email,ChangePasswordRequestDto changePasswordRequestDto);
    Boolean checkPassword(String email,String password);
}
