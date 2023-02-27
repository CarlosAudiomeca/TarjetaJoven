package com.cjimenezro.TarjetaJoven.data;

import com.cjimenezro.TarjetaJoven.data.local.UsuarioLocalDataSource;
import com.cjimenezro.TarjetaJoven.domain.UsuarioRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Usuario;

import java.util.List;

public class UsuarioDataRepository implements UsuarioRepository {

    private UsuarioLocalDataSource localDataSource;

    public UsuarioDataRepository(UsuarioLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }

    @Override
    public void save(Usuario usuario) {
        this.localDataSource.save(usuario);
    }

    @Override
    public List<Usuario> getAll() {
        return null; //this.localDataSource.findAll();
    }
}
