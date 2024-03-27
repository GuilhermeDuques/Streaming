package com.example.Streaming.Java.Streaming.repository;

import com.example.Streaming.Java.Streaming.domain.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, UUID> {

}