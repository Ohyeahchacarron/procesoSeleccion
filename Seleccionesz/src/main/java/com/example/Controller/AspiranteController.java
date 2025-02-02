package com.example.Controller;

import com.example.Entities.Aspirante;
import com.example.Service.AspiranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aspirantes")  // Ruta base para el controlador
public class AspiranteController {

    @Autowired
    private AspiranteService aspiranteService;

    @PostMapping
    public ResponseEntity<Void> createAspirante(@RequestBody Aspirante aspirante) {
        aspiranteService.insertAspirante(aspirante);
        return ResponseEntity.status(HttpStatus.CREATED).build();  // Retorna 201 Created
    }

    // Endpoint para obtener todos los aspirantes
    @GetMapping
    public ResponseEntity<List<Aspirante>> getAllAspirantes() {
        List<Aspirante> aspirantes = aspiranteService.getAllAspirantes();
        return ResponseEntity.ok(aspirantes);  // Retorna 200 OK
    }

    // Endpoint para obtener la vista "lista_aspirantes"
    @GetMapping("/lista")
    public ResponseEntity<List<Aspirante>> getListaAspirantes() {
        List<Aspirante> listaAspirantes = aspiranteService.getListaAspirantes();
        return ResponseEntity.ok(listaAspirantes);  // Retorna 200 OK
    }

    // Endpoint para cambiar el estatus de un aspirante
    @PutMapping("/{idAspirante}/estatus")
    public ResponseEntity<Void> updateEstatusAspirante(@PathVariable Long idAspirante, @RequestParam int nuevoEstatus) {
        aspiranteService.updateEstatusAspirante(idAspirante, nuevoEstatus);
        return ResponseEntity.noContent().build();  // Retorna 204 No Content
    }
}
