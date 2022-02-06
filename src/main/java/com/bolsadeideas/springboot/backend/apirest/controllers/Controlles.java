package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Producto;
import com.bolsadeideas.springboot.backend.apirest.models.services.Methods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:3000", "*" })
@RestController
@RequestMapping("/api")
public class Controlles {

    @Autowired
    private Methods methods;

    @GetMapping("/crud")
    public List<Producto> lista(){
        return methods.lista();
    }

    @GetMapping("/crud/{id}")
    public ResponseEntity<Producto> obtenerPorId(@PathVariable Integer id){

        try {
            Producto producto = methods.obtenerPorId(id);
            return new ResponseEntity<Producto>(producto, HttpStatus.OK);
            
        } catch (Exception e) {
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);

        }
    }

	@Secured("ROLE_ADMIN")
    @PostMapping("/crud")
    public void guardar(@RequestBody Producto producto){
        methods.guardarActualizar(producto);
    }

	@Secured({"ROLE_ADMIN", "ROLE_USER"})
    @PutMapping("/crud/{id}")
    public ResponseEntity<?> actualizar(@RequestBody Producto producto, @PathVariable Integer id){

        try {
            Producto productoActualizado = methods.obtenerPorId(id);
            productoActualizado.setName(producto.getName());
            productoActualizado.setBrand(producto.getBrand());
            productoActualizado.setMadein(producto.getMadein());
            productoActualizado.setPrice(producto.getPrice());
            
            methods.guardarActualizar(productoActualizado);
            return new ResponseEntity<Producto>( HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
        }
    }
    
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
    @DeleteMapping("/crud/{id}")
    public void eliminar(@PathVariable Integer id){
        methods.eliminar(id);
    }

  
}
