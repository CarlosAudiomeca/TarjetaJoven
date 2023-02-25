package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Usuario;

import java.util.List;

public interface UsuarioLocalDataSource {

    public void save(Usuario usuario);

    public List<Usuario> findAll();



}
