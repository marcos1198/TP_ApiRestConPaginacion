package com.UTN.APIRest.controllers;

import com.UTN.APIRest.entities.Libro;
import com.UTN.APIRest.services.LibroServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {

    @Override
    public ResponseEntity<?> getAll(Pageable pageable) throws Exception {
        return null;
    }
}
