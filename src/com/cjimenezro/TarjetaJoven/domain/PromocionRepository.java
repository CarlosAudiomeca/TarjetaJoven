package com.cjimenezro.TarjetaJoven.domain;

import com.cjimenezro.TarjetaJoven.domain.models.Promocion;

import java.util.List;

public interface PromocionRepository {

    public void save(Promocion promocion);

    public List<Promocion> getAll();
}
