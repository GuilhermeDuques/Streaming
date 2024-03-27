package com.example.Streaming.Java.Streaming.repository;

import com.example.Streaming.Java.Streaming.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlbumRepository extends JpaRepository<Album, UUID> {
}