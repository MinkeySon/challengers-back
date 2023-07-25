package org.knulikelion.challengers_backend.data.dto.request;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserUpdateRequestDto {
    private String email;
    private String userName;
    private Long selectClubId;
    private Long updateClubId;
}
