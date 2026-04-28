package com.meratakip.Controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meratakip.Model.HayvanKonum;
import com.meratakip.Repository.HayvanKonumRepository;

@RestController
@RequestMapping("/api/konum")
@CrossOrigin(origins = "http://localhost:3000")
public class HayvanKonumController {

    private final HayvanKonumRepository repository;

    public HayvanKonumController(HayvanKonumRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public HayvanKonum konumKaydet(@RequestBody HayvanKonum konum) {
        konum.setZaman(LocalDateTime.now());
        return repository.save(konum);
    }

    @GetMapping
    public List<HayvanKonum> tumKonumlar() {
        return repository.findAll();
    }
}