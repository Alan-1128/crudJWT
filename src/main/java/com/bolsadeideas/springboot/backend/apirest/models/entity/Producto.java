package com.bolsadeideas.springboot.backend.apirest.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre" ,length = 45)
    @NotNull
    private String name;

    @Column(name = "marca" ,length = 45)
    @NotNull
    private String brand;

    @Column(name = "hecho" ,length = 45)
    @NotNull
    private String madein;

    @Column(name = "precio" ,length = 45)
    @NotNull
    private Float price;

}
