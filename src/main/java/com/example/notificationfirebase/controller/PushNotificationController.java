package com.example.notificationfirebase.controller;

import com.example.notificationfirebase.dto.*;
import com.example.notificationfirebase.service.FCMService;
import com.example.notificationfirebase.service.PushNotificationService;
import com.google.firebase.messaging.TopicManagementResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushNotificationController {

    private PushNotificationService pushNotificationService;

    public PushNotificationController(PushNotificationService pushNotificationService) {
        this.pushNotificationService = pushNotificationService;
    }

//        @PostMapping("/notification/topic")
//    public ResponseEntity sendNotification(@RequestBody PushNotificationRequest request) {
//        pushNotificationService.sendPushNotificationWithoutData(request);
//        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
//    }
// send Push notification to device token
//    @PostMapping("/notification/token")
//    public ResponseEntity sendTokenNotification(@RequestBody PushNotificationRequest request) {
//        pushNotificationService.sendPushNotificationToToken(request);
//        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
//    }
//
//    @PostMapping("/notification/data")
//    public ResponseEntity sendDataNotification(@RequestBody PushNotificationRequest request) {
//        pushNotificationService.sendPushNotification(request);
//        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
//    }

    //
//    @GetMapping("/notification")
//    public ResponseEntity sendSampleNotification() {
//        pushNotificationService.sendSamplePushNotification();
//        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent."), HttpStatus.OK);
//    }
    // send Push notification to device token ~~ /notification/token
    @PostMapping("/token")
    public String sendPnsToDevice(@RequestBody NotificationRequestDto notificationRequestDto) {
        return pushNotificationService.sendPnsToDevice(notificationRequestDto);
    }

    //    @PostMapping("/subscribe")
//    public String subscribeToTopic(@RequestBody SubscriptionRequestDto subscriptionRequestDto) {
//        pushNotificationService.subscribeToTopic(subscriptionRequestDto);
//    }
    @PostMapping("/subscribe")
    public void subscribeToTopic(@RequestBody SubscriptionRequestDto subscriptionRequestDto) {
         pushNotificationService.subscribeToTopic(subscriptionRequestDto);
    }

    @PostMapping("/unsubscribe")
    public void unsubscribeFromTopic(SubscriptionRequestDto subscriptionRequestDto) {
        pushNotificationService.unsubscribeFromTopic(subscriptionRequestDto);
    }

    @PostMapping("/topic")
    public String sendPnsToTopic(@RequestBody TopicRequestDto notificationRequestDto) {
        return pushNotificationService.sendPnsToTopic(notificationRequestDto);
    }
}
