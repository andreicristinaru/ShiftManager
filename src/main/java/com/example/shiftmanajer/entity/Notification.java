package com.example.shiftmanajer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "notifications")
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue
    private UUID notificationId;
    private String text;
    private Boolean isRead;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
