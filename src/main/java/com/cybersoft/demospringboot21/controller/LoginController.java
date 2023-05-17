package com.cybersoft.demospringboot21.controller;


import com.cybersoft.demospringboot21.model.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/login")
public class LoginController {
    @GetMapping("")
    public String login() {return "Login page";}

//    @RequestParam: quy định tham số nhỏ lẻ
//    @RequestBody: tham số sẽ là một JSON (Đối tượng)
    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestParam String userName, @RequestParam String password) {
        return new ResponseEntity<>("Trả về " + userName + " - " + password, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody UserModel userModel){
        return new ResponseEntity<>(userModel.getUserName(), HttpStatus.OK);
    }
}
