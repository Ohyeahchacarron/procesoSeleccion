package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Entities.Periodo;

@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Long> {

}
