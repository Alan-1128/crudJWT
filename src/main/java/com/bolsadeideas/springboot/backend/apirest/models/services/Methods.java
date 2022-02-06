package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;

public interface Methods {
    
    public List<Producto> lista();
     
    public void guardarActualizar(Producto producto);
     
    public Producto obtenerPorId(Integer id);
     
    public void eliminar(Integer id);
}
