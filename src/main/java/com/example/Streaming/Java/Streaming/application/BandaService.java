package com.example.Streaming.Java.Streaming.application;


import com.example.Streaming.Java.Streaming.domain.Banda;
import com.example.Streaming.Java.Streaming.repository.BandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BandaService {

    @Autowired
    private BandaRepository repository;

    public void create(Banda banda) {
        this.repository.save(banda);
    }

    public Optional<Banda> getBanda(UUID id) {
        return this.repository.findById(id);
    }

    public List<Banda> getTodos() {
        return this.repository.findAll();
    }

}