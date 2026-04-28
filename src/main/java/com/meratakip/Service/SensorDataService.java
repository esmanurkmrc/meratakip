package com.meratakip.Service;

import com.meratakip.Model.SensorData;
import com.meratakip.Repository.SensorDataRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SensorDataService {

    private final SensorDataRepository sensorDataRepository;

    public SensorDataService(SensorDataRepository sensorDataRepository) {
        this.sensorDataRepository = sensorDataRepository;
    }

    
    public SensorData veriKaydet(SensorData sensorData) {
        sensorData.setZaman(LocalDateTime.now());
        return sensorDataRepository.save(sensorData);
    }

    
    public List<SensorData> tumVeriler() {
        return sensorDataRepository.findAll();
    }

    
    public SensorData veriGetir(Long id) {
        return sensorDataRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sensör verisi bulunamadı!"));
    }

   
    public void veriSil(Long id) {
        sensorDataRepository.deleteById(id);
    }

   
    public SensorData sonVeriGetir() {
        List<SensorData> veriler = sensorDataRepository.findAll();

        if (veriler.isEmpty()) {
            return null;
        }

        return veriler.get(veriler.size() - 1);
    }
}