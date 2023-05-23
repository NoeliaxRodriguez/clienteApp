package com.panaderia.controllers;

import com.panaderia.domains.Usuario;
import com.panaderia.repositories.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LogInOutController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    /*@GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login";
    }*/

    @PostMapping("/login")
    public String iniciarSesion(@RequestParam String mail, @RequestParam String passwd, HttpSession session) {
        Usuario usuario = usuarioRepository.findByMailAndPasswd(mail, passwd);

        if (usuario != null) {
            session.setAttribute("usuario", usuario);
            return "homepageAdmin";
        } else {
            return "index";
        }
    }

    @GetMapping("/logout")
    public String cerrarSesion(HttpSession session) {
            session.invalidate();
            return "index";
        }
}