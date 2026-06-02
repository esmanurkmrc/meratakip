package com.meratakip.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meratakip.Model.HayvanKonum;

public interface HayvanKonumRepository extends JpaRepository<HayvanKonum, Long> {
    List<HayvanKonum> findTop5ByOrderByZamanDesc();
}