package com.mung.square.register.controller;

import com.mung.square.dto.UserDTO;
import com.mung.square.register.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequiredArgsConstructor
@SessionAttributes("user")
public class RegisterController {
    private final RegisterService registerService;

    @PostMapping("/register")
    public String register(UserDTO registerUser, Model model) {
         registerService.register(registerUser);
        return "redirect:/";
    }

}