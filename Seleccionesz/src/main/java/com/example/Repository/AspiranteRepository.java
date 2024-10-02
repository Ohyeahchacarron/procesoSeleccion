package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.Entities.Aspirante;

@Repository
public interface AspiranteRepository extends JpaRepository<Aspirante, Long> {
	   @Query(value = "SELECT * FROM lista_aspirantes", nativeQuery = true)
	    List<Object[]> findAllFromVista();
}
