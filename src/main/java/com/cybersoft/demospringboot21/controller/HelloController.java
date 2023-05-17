package com.cybersoft.demospringboot21.controller;


// Annotation: @
// @Controller: thông báo cho SB biết class dùng để định nghĩa đường dẫn có trả ra giao diện
// @Restbody: chỉ trả ra text
// @RestController: định nghĩa đường dẫn trả ra text

import com.cybersoft.demospringboot21.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

//    @GetMapping("")
//    public String hello() {
//        return "Hello Spring Boot";
//    }
//
//    @GetMapping("/loichao")
//    public String loichao() {
//        return "Link of Hello function";
//    }

    /*
    * /caculator => GET
    * nhận 2 tham số soA và soB
    * xuất kết quả tính tổng của 2 tham số
    * */

//    @GetMapping("/caculator/{soA}/{soB}")
//    public int tinhTong(@PathVariable int soA, @PathVariable int soB) {
//        return soA+soB;
//    }

//    @RequestParam: Sẽ lấy tham số cho phương thức GET, POST
//    @GetMapping("/caculator")
//    public int index(@RequestParam int soA, @RequestParam int soB){
//        return soA + soB;
//    }



//    @Autowired: lấy class lưu trữ trên IOC xuống sử dụng
    @Autowired
//    @Qualifier('ten_bean') giúp lấy class có tên bean được chỉ định trên IOC
    UserModel userModel;

    @GetMapping("")
    public ResponseEntity<?> hello() {
        List<UserModel> list = new ArrayList<>();
        list.add(userModel);
        list.add(userModel);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
