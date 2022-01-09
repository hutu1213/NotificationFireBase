package com.example.notificationfirebase.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

//@Entity
@Data
public class User {
//    @Id
//    @Column
//    private String userId;
//
//    @Column
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
//    private LocalDate dateBirth;
}
