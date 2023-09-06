package org.knulikelion.challengers_backend.service;

import org.knulikelion.challengers_backend.data.dto.request.*;
import org.knulikelion.challengers_backend.data.dto.response.*;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AdminService {
    SignResponseDto signIn(SignInRequestDto signInRequestDto) throws RuntimeException;
    BaseResponseDto assignAdministrator(AssignAdministratorRequestDto assignAdministratorRequestDto);
    BaseResponseDto postNoti(NoticeRequestDto noticeRequestDto, String email);
    List<NoticeResponseDto> getAllNoti();
    NoticeResponseDto getNotiDetail(Long id);
    BaseResponseDto deleteNoti(Long id);
    BaseResponseDto updateNoti(UpdateNoticeRequestDto updateNoticeRequestDto, String email);
    BaseResponseDto changeName(String email, String name);
    BaseResponseDto changeProfile(String email, String url);
    BaseResponseDto changePw(ChangePasswordRequestDto changePasswordRequestDto, String email);
    BaseResponseDto changeRole(String email, String role);
    Page<AdminClubResponseDto> getAllClubs(int page, int size);
}
