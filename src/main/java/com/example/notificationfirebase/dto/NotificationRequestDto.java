package com.example.notificationfirebase.dto;

import lombok.Data;

@Data
public class NotificationRequestDto {
    private String token;
    private String title;
    private String body;
}
