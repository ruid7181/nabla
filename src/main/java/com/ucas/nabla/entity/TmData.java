package com.ucas.nabla.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity   // mapping with a specific DB table.
public class TmData {
    @Id   // key
    private String f_name;
    @Column
    private String f_path;
    @Column
    private String loc;
    @Column
    private String sat;
    @Column
    private String collection;
    @Column
    private String level;
    @Column
    private String tier;
    @Column
    private int npath;
    @Column
    private int nrow;
    @Column
    private int TIME;
    @Column
    private double cloud_cover;
}
