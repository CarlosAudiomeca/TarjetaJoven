package com.cjimenezro.TarjetaJoven.domain.UseCase;

import com.cjimenezro.TarjetaJoven.domain.EmpresaRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Empresa;

import java.util.List;

public class GetEmpresaUseCase {

    private EmpresaRepository empresaRepository;

    public GetEmpresaUseCase(EmpresaRepository empresaRepository){
        this.empresaRepository=empresaRepository;
    }

    public List<Empresa> execute(){
        return empresaRepository.getAll();
    }


}
