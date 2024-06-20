package com.example.shiftmanajer.repository;

import com.example.shiftmanajer.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface RequestRepository extends JpaRepository<Request, UUID> {
}
