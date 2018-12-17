package com.springboot.controller;

import com.springboot.model.Shipwreck;
import com.springboot.repository.ShipwreckRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api/v1/")
@Api(value = "DummyRestApi", description = "Learning spring boot")
public class DummyController {

    @Autowired
    ShipwreckRepository shipwreckRepository;

    @GetMapping(value = "getDummy")
    @ApiOperation(value = "Hello Get api dummy 1")
    public String getDummy(){
        return "Hello";
    }

    @PostMapping(value = "Add Shipwreck")
    @ApiOperation(value = "Add new Shipwreck")
    public Shipwreck addShipWreck(Shipwreck shipwreck){
        return shipwreckRepository.saveAndFlush(shipwreck);
    }

}
