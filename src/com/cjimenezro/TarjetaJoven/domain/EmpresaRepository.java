package com.cjimenezro.TarjetaJoven.domain;

import com.cjimenezro.TarjetaJoven.domain.models.Empresa;

import java.util.List;

public interface EmpresaRepository {

    public void save(Empresa empresa);

    public List<Empresa> getAll();
}
