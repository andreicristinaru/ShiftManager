package com.example.shiftmanajer.repository;

import com.example.shiftmanajer.entity.ShiftDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ShiftDayRepository extends JpaRepository<ShiftDay, UUID> {
}
