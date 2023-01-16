package com.americanino.Americanino.controllers;

import com.americanino.Americanino.services.ServiceDepartamentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/departamentos")
@CrossOrigin
public class ControllersDepartamentos {

    @Autowired
    ServiceDepartamentos serviceDepartamentos;

    @GetMapping
    public ResponseEntity<?> buscarDepartamento() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(serviceDepartamentos.buscarTodos());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje:Error al buscar cliente...}");
        }
    }
}
