package com.example.Controller;


import com.example.Entities.Aspirante;
import com.example.Service.AspiranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aspirantes")  
public class AspiranteController {

    @Autowired
    private AspiranteService aspiranteService;

    @PostMapping
    public ResponseEntity<Void> createAspirante(@RequestBody Aspirante aspirante) {
        aspiranteService.insertAspirante(aspirante);
        return ResponseEntity.status(HttpStatus.CREATED).build();  
    }

    // Endpoint para obtener todos los aspirantes
    @GetMapping
    public ResponseEntity<List<Aspirante>> getAllAspirantes() {
        List<Aspirante> aspirantes = aspiranteService.getAllAspirantes();
        return ResponseEntity.ok(aspirantes);  
    }

    // Endpoint para obtener la vista "lista_aspirantes"
    @GetMapping("/lista")
    public ResponseEntity<List<Object[]>> getListaAspirantes() {
        List<Object[]> listaAspirantes = aspiranteService.getListaAspirantes();
        return ResponseEntity.ok(listaAspirantes); 
    }

    // Endpoint para cambiar el estatus de un aspirante
    @PutMapping("/{idAspirante}/estatus")
    public ResponseEntity<Void> updateEstatusAspirante(@PathVariable Long idAspirante, @RequestParam int nuevoEstatus) {
        aspiranteService.updateEstatusAspirante(idAspirante, nuevoEstatus);
        return ResponseEntity.noContent().build();  // Retorna 204 No Content
    }
}
