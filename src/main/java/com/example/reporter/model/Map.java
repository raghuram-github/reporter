package com.example.reporter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "object_map")
public class Map {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "map_id")
    private int mapid;

    @Column(name = "object_id")
    private int objectid;

    @Column(name = "object_type")
    private String ojecttype;

    @Column(name = "table_schema")
    private String tableschema;

    @Column(name = "table_name")
    private String tablename;

    @Column(name = "table_column")
    private String tablecolumn;

    public int getMapid() {
        return mapid;
    }

    public void setMapid(int mapid) {
        this.mapid = mapid;
    }

    public int getObjectid() {
        return objectid;
    }

    public void setObjectid(int objectid) {
        this.objectid = objectid;
    }

    public String getOjecttype() {
        return ojecttype;
    }

    public void setOjecttype(String ojecttype) {
        this.ojecttype = ojecttype;
    }

    public String getTableSchema() {
        return tableschema;
    }

    public void setTableSchema(String tableschema) {
        this.tableschema = tableschema;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getTablecolumn() {
        return tablecolumn;
    }

    public void setTablecolumn(String tablecolumn) {
        this.tablecolumn = tablecolumn;
    }

}
