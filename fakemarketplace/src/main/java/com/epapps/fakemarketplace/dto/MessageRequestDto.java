package com.epapps.fakemarketplace.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class MessageRequestDto {
    private String message;
    private Long productId;
    private Long userId;
}
