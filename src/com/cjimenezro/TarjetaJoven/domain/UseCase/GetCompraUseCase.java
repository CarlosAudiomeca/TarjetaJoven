package com.cjimenezro.TarjetaJoven.domain.UseCase;

import com.cjimenezro.TarjetaJoven.domain.CompraRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Compra;

import java.util.List;

public class GetCompraUseCase {

    private CompraRepository compraRepository;

    public GetCompraUseCase(CompraRepository compraRepository){
        this.compraRepository=compraRepository;
    }

    public List<Compra> execute(){
        return compraRepository.getAll();
    }


}
