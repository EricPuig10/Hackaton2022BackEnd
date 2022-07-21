package com.epapps.fakemarketplace.dto;

import lombok.Data;

@Data
public class MessageResDto {
    private Long id;
    private String message;
    private Long productId;
    private UserResDtoProduct creator;
}
