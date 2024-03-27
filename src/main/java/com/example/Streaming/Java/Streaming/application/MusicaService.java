package com.example.Streaming.Java.Streaming.application;

import com.example.Streaming.Java.Streaming.domain.Musica;
import com.example.Streaming.Java.Streaming.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class MusicaService {

    @Autowired
    private MusicaRepository repository;

    public Optional<Musica> getMusica(UUID id) {
        return this.repository.findById(id);
    }

}