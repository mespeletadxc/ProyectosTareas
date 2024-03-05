package com.banana.proyectostareas.persistence;

import com.banana.proyectostareas.model.Proyecto;
import com.banana.proyectostareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TareaJPARepository extends JpaRepository<Tarea, Long> {

    public List<Tarea> findByProject(Long idProyecto) throws RuntimeException;


    public Tarea update(Tarea tarea) throws RuntimeException;
}
