package com.bicicletas.objetivo.dataAccess;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bicicletas.objetivo.modelo.Objetivo;
import com.bicicletas.objetivo.modelo.Usuario;

@Repository
public interface ObjetivoRepository
    extends JpaRepository<Objetivo, UUID>
{

    List<Objetivo> findByUsuarioAndCompletado(Usuario usuario, boolean b);

}
