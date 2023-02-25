package com.cjimenezro.TarjetaJoven.data;

import com.cjimenezro.TarjetaJoven.data.local.EmpresaLocalDataSource;
import com.cjimenezro.TarjetaJoven.domain.EmpresaRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Empresa;

import java.util.List;

public class EmpresaDataRepository implements EmpresaRepository {

    private EmpresaLocalDataSource localDataSource;

    public EmpresaDataRepository(EmpresaLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }


    @Override
    public void save(Empresa empresa) {

    }

    @Override
    public List<Empresa> getAll() {
        return null;
    }
}
