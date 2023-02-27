package com.cjimenezro.TarjetaJoven.data;

import com.cjimenezro.TarjetaJoven.data.local.CompraFileLocalDataSource;
import com.cjimenezro.TarjetaJoven.domain.CompraRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Compra;

import java.util.List;

public class CompraDataRepository implements CompraRepository {

    private CompraFileLocalDataSource localDataSource;

    public CompraDataRepository(CompraFileLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }


    @Override
    public void save(Compra compra) {
        this.localDataSource.save(compra);
    }

    @Override
    public List<Compra> getAll() {
        return null; //localDataSource.findAll();
    }
}
