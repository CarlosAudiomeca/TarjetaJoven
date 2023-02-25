package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Promocion;

import java.util.List;

public interface PromocionLocalDataSource {

    public void save(Promocion promocion);

    public List<Promocion> findAll();



}
