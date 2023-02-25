package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Empresa;

import java.util.List;

public interface EmpresaLocalDataSource {

    public void save(Empresa empresa);

    public List<Empresa> findAll();


}
