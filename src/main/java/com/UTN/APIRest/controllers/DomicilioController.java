package com.UTN.APIRest.controllers;

import com.UTN.APIRest.entities.Domicilio;
import com.UTN.APIRest.services.DomicilioServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{


    @Override
    public ResponseEntity<?> getAll(Pageable pageable) throws Exception {
        return null;
    }
}
