package com.example.Service;

import com.example.Entities.Aspirante;
import com.example.Repository.AspiranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AspiranteService {

    @Autowired
    private AspiranteRepository aspiranteRepository;

    // Método para crear un nuevo aspirante
    public void insertAspirante(Aspirante aspirante) {
        aspiranteRepository.save(aspirante);
    }

    // Método para obtener todos los aspirantes
    public List<Aspirante> getAllAspirantes() {
        return aspiranteRepository.findAll();
    }

    // Método para obtener la vista "lista_aspirantes"
    public List<Object[]> getListaAspirantes() {
        return aspiranteRepository.findAllFromVista(); 
    }

    // Método para cambiar el estatus de un aspirante
    public void updateEstatusAspirante(Long idAspirante, int nuevoEstatus) {
        Aspirante aspirante = aspiranteRepository.findById(idAspirante).orElseThrow(() -> new RuntimeException("Aspirante no encontrado"));
        aspirante.setEstatusA(nuevoEstatus); 
        aspiranteRepository.save(aspirante);
    }
}
