package com.meratakip.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meratakip.Model.User;
import com.meratakip.Repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

  
    public User kullaniciKaydet(User user) {
        return userRepository.save(user);
    }

    
    public List<User> tumKullanicilar() {
        return userRepository.findAll();
    }

    
    public User kullaniciGetir(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Kullanıcı bulunamadı!"));
    }

    
    public User kullaniciGuncelle(Long id, User yeniUser) {
        User mevcutUser = kullaniciGetir(id);

        mevcutUser.setAd(yeniUser.getAd());
        mevcutUser.setSoyad(yeniUser.getSoyad());
        mevcutUser.setEmail(yeniUser.getEmail());
        mevcutUser.setSifre(yeniUser.getSifre());

        return userRepository.save(mevcutUser);
    }

    
    public void kullaniciSil(Long id) {
        userRepository.deleteById(id);
    }

    
    public User emailIleBul(String email) {
        return userRepository.findByEmail(email);
    }
}