package com.example.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Entity
@Table(name = "aspirante")
public class Aspirante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("idAspirante")  // Nombre del campo en el JSON
    @Column(name = "id_aspirante")  // Nombre del campo en la base de datos
    private Long idAspirante;

    @JsonProperty("nombreAsp")
    @Column(name = "nombre_asp")  // Nombre del campo en la base de datos
    private String nombreAsp;

    @JsonProperty("correo")
    @Column(name = "correo")  // Nombre del campo en la base de datos
    private String correo;

    @JsonProperty("telefono")
    @Column(name = "telefono")  // Nombre del campo en la base de datos
    private String telefono;

    @JsonProperty("usuario")
    @Column(name = "usuario")  // Nombre del campo en la base de datos
    private String usuario;

    @JsonProperty("curp")
    @Column(name = "curp")  // Nombre del campo en la base de datos
    private String curp;

    @JsonProperty("carreraDeseada")
    @Column(name = "carrera_deseada")  // Nombre del campo en la base de datos
    private String carreraDeseada;

    @JsonProperty("estatusA")
    @Column(name = "estatusa")  // Nombre del campo en la base de datos
    private int estatusA;

	public int getEstatusA() {
		return estatusA;
	}

	public void setEstatusA(int estatusA) {
		this.estatusA = estatusA;
	}
    
    
}
