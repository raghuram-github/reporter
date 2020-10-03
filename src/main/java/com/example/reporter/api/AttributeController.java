package com.example.reporter.api;

import com.example.reporter.service.AttributeService;

import java.util.Optional;

import com.example.reporter.model.Attribute;
import com.example.reporter.model.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/attribute")
public class AttributeController {
    
    @Autowired
    private AttributeService attributeservice;

    @GetMapping(path = "/listall")
    public Iterable<Attribute> getAllAtrributes(){
        return attributeservice.getAllAttributes();
    }

    @GetMapping(path = "/getattribute/{attributeid}")
    public Optional<Attribute> getAttributeById(@PathVariable Integer attributeid){
        return attributeservice.getAttributeById(attributeid);
    }

    @PostMapping(path = "/createattribute")
    public Attribute createAttribute(@RequestBody Attribute newattribute){
        return attributeservice.createAttribute(newattribute);
    }

    @PostMapping(path = "/updareattribute/{attributeid}")
    public Optional<Attribute> updateAttribute(@RequestBody Attribute updateattribute, @PathVariable Integer attributeid){
        return attributeservice.updateAttribute(attributeid, updateattribute);
    }

    public Map mapAttribute(@RequestBody Map attributemap){
        return attributeservice.mapAtrribute(attributemap);
    }

}
