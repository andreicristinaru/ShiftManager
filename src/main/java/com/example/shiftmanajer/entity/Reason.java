package com.example.shiftmanajer.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "reasons")
@AllArgsConstructor
@NoArgsConstructor
public class Reason {
    @Id
    @GeneratedValue
    private UUID reasonId;
    private String reasonType;

    @OneToMany
    @JoinColumn(name = "requests")
    private List<Request> requests;
}
