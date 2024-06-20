package com.example.shiftmanajer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "requests")
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    @Id
    @GeneratedValue
    private UUID requestId;
    private String reasonDetails;
    private LocalDate startSpareDay;
    private LocalDate endSpareDay;
    private RequestStatus requestStatus;

    @ManyToOne
    @JoinColumn(name = "reasonId")
    private Reason reason;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
