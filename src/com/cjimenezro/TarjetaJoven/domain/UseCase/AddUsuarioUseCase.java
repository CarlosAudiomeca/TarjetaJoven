package com.cjimenezro.TarjetaJoven.domain.UseCase;

import com.cjimenezro.TarjetaJoven.domain.UsuarioRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Usuario;

public class AddUsuarioUseCase {

    private UsuarioRepository usuarioRepository;

    public AddUsuarioUseCase(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }

    public void execute(Usuario usuario){
        usuarioRepository.save(usuario);
    }


}
