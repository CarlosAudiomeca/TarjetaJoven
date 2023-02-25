package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Compra;

import java.util.List;

public interface CompraLocalDataSource {

    public void save(Compra compra);

    public List<Compra> findAll();



}
