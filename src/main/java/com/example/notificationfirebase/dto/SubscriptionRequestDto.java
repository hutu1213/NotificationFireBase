package com.example.notificationfirebase.dto;

import lombok.Data;

import java.util.List;

@Data
public class SubscriptionRequestDto {
    private String topicName;
    private List<String> tokens;
}
