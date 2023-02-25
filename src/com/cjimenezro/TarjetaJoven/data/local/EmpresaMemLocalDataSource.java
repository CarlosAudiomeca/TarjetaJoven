package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmpresaMemLocalDataSource implements EmpresaLocalDataSource{

    private static EmpresaMemLocalDataSource instance = null;

    private Map<String, Empresa> storage = new TreeMap<>();

    private EmpresaMemLocalDataSource() {

    }

    @Override
    public void save(Empresa empresa) {
        storage.put(empresa.getId(), empresa);
    }

    @Override
    public List<Empresa> findAll() {
        return new ArrayList<>(storage.values());
    }

    public static EmpresaMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new EmpresaMemLocalDataSource();
        }
        return instance;
    }


}
