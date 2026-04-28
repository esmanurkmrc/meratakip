package com.meratakip.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meratakip.Model.HayvanKonum;

public interface HayvanKonumRepository extends JpaRepository<HayvanKonum, Long> {
}