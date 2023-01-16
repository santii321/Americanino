package com.americanino.Americanino.controllers;

import com.americanino.Americanino.models.ModelClient;
import com.americanino.Americanino.services.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cliente")
@CrossOrigin
public class ControllersClient {
    @Autowired
    ServiceClient serviceClient;

    @PostMapping
    public ResponseEntity<?> guardarClient(@RequestBody ModelClient modelClient) {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(serviceClient.guardarClient(modelClient));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje:Error al registrar cliente...}");

        }
    }

    @GetMapping
    public ResponseEntity<?> buscarClient() {
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(serviceClient.buscarTodos());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("{mensaje:Error al buscar cliente...}");
        }
    }
}
