package com.cjimenezro.TarjetaJoven.domain.UseCase;

import com.cjimenezro.TarjetaJoven.domain.UsuarioRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Usuario;

import java.util.List;

public class GetUsuarioUseCase {

    private UsuarioRepository usuarioRepository;

    public GetUsuarioUseCase(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }

    public List<Usuario> execute(){
        return usuarioRepository.getAll();
    }


}
