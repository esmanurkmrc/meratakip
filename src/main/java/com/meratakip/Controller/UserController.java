package com.meratakip.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meratakip.Model.User;
import com.meratakip.Service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    
    @PostMapping("/kayit")
    public User kullaniciKaydet(@RequestBody User user) {
        return userService.kullaniciKaydet(user);
    }

    
    @GetMapping("/liste")
    public List<User> tumKullanicilar() {
        return userService.tumKullanicilar();
    }

    
    @GetMapping("/{id}")
    public User kullaniciGetir(@PathVariable Long id) {
        return userService.kullaniciGetir(id);
    }

   
    @PutMapping("/{id}")
    public User kullaniciGuncelle(@PathVariable Long id, @RequestBody User user) {
        return userService.kullaniciGuncelle(id, user);
    }

    
    @DeleteMapping("/{id}")
    public String kullaniciSil(@PathVariable Long id) {
        userService.kullaniciSil(id);
        return "Kullanıcı başarıyla silindi.";
    }

    
    @PostMapping("/giris")
    public String girisYap(@RequestBody User user) {
        User bulunanUser = userService.emailIleBul(user.getEmail());

        if (bulunanUser != null && bulunanUser.getSifre().equals(user.getSifre())) {
            return "Giriş başarılı";
        }

        return "Email veya şifre hatalı";
    }
}