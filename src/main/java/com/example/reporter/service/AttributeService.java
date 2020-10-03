package com.example.reporter.service;

import java.util.Optional;

import com.example.reporter.dao.AttributeDao;
import com.example.reporter.dao.MapDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reporter.model.Attribute;
import com.example.reporter.model.Map;

@Service
public class AttributeService {

    @Autowired
    private AttributeDao attributedao;

    @Autowired
    private MapDao mapdao;

    public Iterable<Attribute> getAllAttributes() {
        return attributedao.findAll();
    }

    public Optional<Attribute> getAttributeById(int attributeid){
        return attributedao.findById(attributeid);
    }

    public Attribute createAttribute(Attribute attribute) {
        attributedao.save(attribute);
        return attribute;
    }

    public Optional<Attribute> updateAttribute(int attributeid, Attribute attribute) {

        final Attribute existingattribute = attributedao.findById(attributeid).get();
        existingattribute.setAttributename(attribute.getAttributename());
        existingattribute.setAttributedescription(attribute.getAttributedescription());
        return attributedao.findById(attributeid);
    }

    public Map mapAtrribute(Map attributemap){
        mapdao.save(attributemap);
        return attributemap;
    }

    public Optional<Map> deteleAttributeMap(int mapid){
        Optional<Map> attributemap = mapdao.findById(mapid);
        mapdao.deleteById(mapid);

        return attributemap;
    }
}
