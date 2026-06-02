package com.meratakip.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meratakip.Model.SensorData;
import com.meratakip.Service.SensorDataService;

@RestController
@RequestMapping("/api/sensor")
@CrossOrigin(origins = "http://localhost:3000")
public class SensorDataController {

    private final SensorDataService sensorDataService;

    public SensorDataController(SensorDataService sensorDataService) {
        this.sensorDataService = sensorDataService;
    }

    
    @PostMapping("/data")
    public SensorData veriKaydet(@RequestBody SensorData sensorData) {
        return sensorDataService.veriKaydet(sensorData);
    }

    
    @GetMapping("/liste")
    public List<SensorData> tumVeriler() {
        return sensorDataService.tumVeriler();
    }

    
    @GetMapping("/latest")
    public SensorData sonVeri() {
        return sensorDataService.sonVeriGetir();
    }


    @GetMapping("/{id}")
    public SensorData veriGetir(@PathVariable Long id) {
        return sensorDataService.veriGetir(id);
    }

    
    @DeleteMapping("/{id}")
    public String veriSil(@PathVariable Long id) {
        sensorDataService.veriSil(id);
        return "Sensör verisi başarıyla silindi.";
    }
}