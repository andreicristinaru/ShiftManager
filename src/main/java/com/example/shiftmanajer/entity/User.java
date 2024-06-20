package com.example.shiftmanajer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private UUID userId;
    private String userName;
    private String password;
    private Boolean isAdmin;

    @OneToMany
    @JoinColumn(name = "shiftDayId")
    private Set<ShiftDay> shiftDays;

    @OneToMany
    @JoinColumn(name = "notificationId")
    private List<Notification> notifications;

    @OneToMany
    @JoinColumn(name = "spareDayId")
    private List<Request> spareDayRequests;
}
