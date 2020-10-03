package com.example.reporter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attributes")
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "attribute_id")
    private int attributeid;

    @Column(name = "attribute_name")
    private String attributename;

    @Column(name = "attribute_description")
    private String attributedescription;

    public int getAttributeid() {
        return attributeid;
    }

    public void setAttributeid(int attributeid) {
        this.attributeid = attributeid;
    }

    public String getAttributename() {
        return attributename;
    }

    public void setAttributename(String attributename) {
        this.attributename = attributename;
    }

    public String getAttributedescription() {
        return attributedescription;
    }

    public void setAttributedescription(String attributedescription) {
        this.attributedescription = attributedescription;
    }

    
      
}

