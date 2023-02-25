package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Compra;
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

public class CompraFileLocalDataSource implements CompraLocalDataSource{

    private static CompraFileLocalDataSource instance = null;

    private String nameFile = "compras.txt";

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Compra>>() {
    }.getType();

    private CompraFileLocalDataSource() {
    }

    public void save(Compra compra) {
        List<Compra> compras = findAll();
        compras.add(compra);
        saveToFile(compras);
    }

    public void saveList(List<Compra> compras) {
        saveToFile(compras);
    }

    private void saveToFile(List<Compra> compras) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(compras));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public List<Compra> findAll() {
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
        return new ArrayList<Compra>();
    }

    public static CompraFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new CompraFileLocalDataSource();
        }
        return instance;
    }

}
