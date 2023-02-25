package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Promocion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PromocionMemLocalDataSource implements PromocionLocalDataSource{

    private static PromocionMemLocalDataSource instance = null;

    private Map<String, Promocion> storage = new TreeMap<>();

    private PromocionMemLocalDataSource() {

    }

    @Override
    public void save(Promocion promocion) {
        storage.put(promocion.getId(), promocion);
    }

    @Override
    public List<Promocion> findAll() {
        return new ArrayList<>(storage.values());
    }

    public static PromocionMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PromocionMemLocalDataSource();
        }
        return instance;
    }


}
