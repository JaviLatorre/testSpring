package com.javier.test.controller;

import com.javier.test.model.Archivo;
import com.javier.test.repository.ArchivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/archivos")
public class ArchivoController {

    @Autowired
    private ArchivoRepository archivoRepository;

    // Obtener todos los archivos
    @GetMapping
    public Iterable<Archivo> findAll() {
        Iterable<Archivo> archivos = archivoRepository.findAll();
        System.out.println("Datos obtenidos: " + archivos); // Agrega este log para verificar la respuesta
        return archivos;
    }

    // Obtener archivo por ID
    @GetMapping("/{id}")
    public Archivo findById(@PathVariable Long id) {
        return archivoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Archivo no encontrado"));
    }

    // Crear nuevo archivo
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Archivo create(@RequestBody Archivo archivo) {
        return archivoRepository.save(archivo);
    }

    // Eliminar archivo por ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        archivoRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Archivo no encontrado"));
        archivoRepository.deleteById(id);
    }

    // Actualizar archivo
    @PutMapping("/{id}")
    public Archivo update(@RequestBody Archivo archivo, @PathVariable Long id) {
        if (!archivoRepository.existsById(id)) {
            throw new RuntimeException("Archivo no encontrado");
        }
        archivo.setId(id);
        return archivoRepository.save(archivo);
    }
}
