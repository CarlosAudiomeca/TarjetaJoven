package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Empresa;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaFileLocalDataSource implements EmpresaLocalDataSource{

    private static EmpresaFileLocalDataSource instance = null;

    private String nameFile = "empresas.txt";

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Empresa>>() {
    }.getType();

    private EmpresaFileLocalDataSource() {
    }

    public void save(Empresa empresa) {
        List<Empresa> empresas = findAll();
        empresas.add(empresa);
        saveToFile(empresas);
    }

    public void saveList(List<Empresa> empresas) {
        saveToFile(empresas);
    }

    private void saveToFile(List<Empresa> empresas) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(empresas));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public List<Empresa> findAll() {
        try {
            File myObj = new File(nameFile);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeAlumnList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        }
        return new ArrayList<Empresa>();
    }

    public static EmpresaFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new EmpresaFileLocalDataSource();
        }
        return instance;
    }

}
