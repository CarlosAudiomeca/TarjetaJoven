package com.cjimenezro.TarjetaJoven.domain;

import com.cjimenezro.TarjetaJoven.domain.models.Compra;

import java.util.List;

public interface CompraRepository {

    public void save(Compra compra);

    public List<Compra> getAll();
}
