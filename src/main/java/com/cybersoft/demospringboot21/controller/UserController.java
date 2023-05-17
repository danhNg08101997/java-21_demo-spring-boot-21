package com.cybersoft.demospringboot21.controller;

import com.cybersoft.demospringboot21.model.RoleModel;
import com.cybersoft.demospringboot21.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserModel userModel;

    @GetMapping("")
    public ResponseEntity<?> getUser(){
        List<RoleModel> roleModelList = new ArrayList<>();
        RoleModel roleModel = new RoleModel();
        roleModel.setId(1);
        roleModel.setName("ADMIN");

        RoleModel roleModel1 = new RoleModel();
        roleModel1.setId(2);
        roleModel1.setName("USER");

        roleModelList.add(roleModel);
        roleModelList.add(roleModel1);

        userModel.setRoleModels(roleModelList);

        return new ResponseEntity<>(userModel, HttpStatus.OK);
    }


}
