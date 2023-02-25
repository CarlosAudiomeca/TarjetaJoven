package com.cjimenezro.TarjetaJoven.domain.UseCase;

import com.cjimenezro.TarjetaJoven.domain.EmpresaRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Empresa;

public class AddEmpresaUseCase {

    private EmpresaRepository empresaRepository;

    public AddEmpresaUseCase(EmpresaRepository empresaRepository){
        this.empresaRepository= empresaRepository;
    }

    public void execute(Empresa empresa){
        empresaRepository.save(empresa);
    }


}
