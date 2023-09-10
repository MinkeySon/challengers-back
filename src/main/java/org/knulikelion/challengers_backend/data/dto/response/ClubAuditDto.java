package org.knulikelion.challengers_backend.data.dto.response;

import lombok.*;
import org.knulikelion.challengers_backend.data.enums.EventType;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ClubAuditDto {

    private Long clubId;
    private String projectName;
    private String createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;
    private EventType eventType;
}