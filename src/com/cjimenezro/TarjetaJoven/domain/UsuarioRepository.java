package com.cjimenezro.TarjetaJoven.domain;

import com.cjimenezro.TarjetaJoven.domain.models.Usuario;

import java.util.List;

public interface UsuarioRepository {

    public void save(Usuario usuario);

    public List<Usuario> getAll();
}
