package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Compra;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CompraMemLocalDataSource implements CompraLocalDataSource{

    private static CompraMemLocalDataSource instance = null;

    private Map<String, Compra> storage = new TreeMap<>();

    private CompraMemLocalDataSource() {

    }

    @Override
    public void save(Compra compra) {
        storage.put(compra.getId(), compra);
    }

    @Override
    public List<Compra> findAll() {
        return new ArrayList<>(storage.values());
    }

    public static CompraMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new CompraMemLocalDataSource();
        }
        return instance;
    }


}
