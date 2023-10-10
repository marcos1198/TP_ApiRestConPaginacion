package com.UTN.APIRest.repositories;

import com.UTN.APIRest.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
    //Anotacion metodo QUERY
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre,String apellido);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre,String apellido,Pageable pageable);

   // boolean existByDni(int dni);

    //Anotacion JPQL parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> search(String filtro, Pageable pageable);

  /*   //Anotacion JPQL con parametros nombrados (otra anotacion)
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'")
    List<Persona> search(@Param("filtro") String filtro);*/

    //anotacion QUERY native
    @Query(value = "SELECT * FROM persona WHERE persona.first_name LIKE %:filtro% OR persona.last_name LIKE %:filtro%",
    nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM persona WHERE persona.first_name LIKE %:filtro% OR persona.last_name LIKE %:filtro%",
           countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}