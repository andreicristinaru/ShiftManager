package com.example.shiftmanajer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Table(name = "shiftDays")
@AllArgsConstructor
@NoArgsConstructor
public class ShiftDay {

    @Id
    @GeneratedValue
    private UUID shiftDayId;
    private String ShiftType;
    private Boolean isSpareDay;
    private String SpareDayDetails;
    private LocalDateTime startShift;
    private Integer durationInMinutes;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

}
