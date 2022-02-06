package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IProductoDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MethodsImpl implements Methods {

    @Autowired
    IProductoDao iProductoDao;

    @Override
    public List<Producto> lista() {
        return (List<Producto>) iProductoDao.findAll();
    }

    @Override
    public void guardarActualizar(Producto producto) {
        iProductoDao.save(producto);
    }

    @Override
    public Producto obtenerPorId(Integer id) {
        return iProductoDao.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Integer id) {
        iProductoDao.deleteById(id);
    }

    

   

}
