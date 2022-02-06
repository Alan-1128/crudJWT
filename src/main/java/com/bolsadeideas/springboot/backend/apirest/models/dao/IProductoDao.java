package com.bolsadeideas.springboot.backend.apirest.models.dao;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;

import org.springframework.data.repository.CrudRepository;

public interface IProductoDao extends CrudRepository<Producto, Integer> {
    
}
