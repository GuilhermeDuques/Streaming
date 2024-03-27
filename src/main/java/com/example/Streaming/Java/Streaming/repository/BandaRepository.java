package com.example.Streaming.Java.Streaming.repository;

import com.example.Streaming.Java.Streaming.domain.Banda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BandaRepository extends JpaRepository<Banda, UUID> {
}