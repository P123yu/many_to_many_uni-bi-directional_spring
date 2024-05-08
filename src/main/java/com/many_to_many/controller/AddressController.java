package com.many_to_many.controller;

import com.many_to_many.model.AddressModel;
import com.many_to_many.serviceImpl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressServiceImpl addressServiceImpl;

    //getAll
    @GetMapping("/getAll")
    public List<AddressModel> getAll(){
        return addressServiceImpl.getAll();
    }
}
