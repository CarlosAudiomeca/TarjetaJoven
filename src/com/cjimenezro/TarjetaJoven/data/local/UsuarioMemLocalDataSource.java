package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UsuarioMemLocalDataSource implements UsuarioLocalDataSource{

    private static UsuarioMemLocalDataSource instance = null;

    private Map<String, Usuario> storage = new TreeMap<>();

    private UsuarioMemLocalDataSource() {

    }

    @Override
    public void save(Usuario usuario) {
        storage.put(usuario.getNif(), usuario);
    }

    @Override
    public List<Usuario> findAll() {
        return new ArrayList<>(storage.values());
    }

    public static UsuarioMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new UsuarioMemLocalDataSource();
        }
        return instance;
    }


}
