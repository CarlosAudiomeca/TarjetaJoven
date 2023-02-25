package com.cjimenezro.TarjetaJoven.domain.UseCase;

import com.cjimenezro.TarjetaJoven.domain.CompraRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Compra;

public class AddCompraUseCase {

    private CompraRepository compraRepository;

    public AddCompraUseCase(CompraRepository compraRepository){
        this.compraRepository=compraRepository;
    }

    public void execute(Compra compra){
        compraRepository.save(compra);
    }


}
