package com.cybersoft.demospringboot21.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    /*
     * /caculator => GET
     * nhận 2 tham số soA và soB
     * xuất kết quả tính tổng của 2 tham số
     *
     * */

    //    @GetMapping("/caculator/{soA}/{soB}")
//    public int tinhTong(@PathVariable int soA, @PathVariable int soB) {
//        return soA+soB;
//    }

//    @RequestParam: Sẽ lấy tham số cho phương thức GET, POST
    @GetMapping("")
    public int index(@RequestParam int soA, @RequestParam int soB){
        return soA + soB;
    }
}
