package com.example.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@Entity
@Table(name = "periodo")
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("idPeriodo")  
    @Column(name = "id_periodo")  
    private Long idPeriodo;

    @JsonProperty("nombrePeriodo")
    @Column(name = "nombre_periodo")  
    private String nombrePeriodo;

    @JsonProperty("descripcion")
    @Column(name = "descripcion")  
    private String descripcion;

    @JsonProperty("estatusP")
    @Column(name = "estatusp")  
    private int estatusP;
}
