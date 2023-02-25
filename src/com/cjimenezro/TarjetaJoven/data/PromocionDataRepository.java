package com.cjimenezro.TarjetaJoven.data;

import com.cjimenezro.TarjetaJoven.data.local.PromocionLocalDataSource;
import com.cjimenezro.TarjetaJoven.domain.PromocionRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Promocion;

import java.util.List;

public class PromocionDataRepository implements PromocionRepository {

    private PromocionLocalDataSource localDataSource;

    public PromocionDataRepository(PromocionLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }

    @Override
    public void save(Promocion promocion) {

    }

    @Override
    public List<Promocion> getAll() {
        return null;
    }
}
