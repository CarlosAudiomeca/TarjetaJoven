package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Promocion;
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

public class PromocionFileLocalDataSource implements PromocionLocalDataSource{

    private static PromocionFileLocalDataSource instance = null;

    private String nameFile = "promociones.txt";

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Promocion>>() {
    }.getType();

    private PromocionFileLocalDataSource() {
    }

    public void save(Promocion promocion) {
        List<Promocion> promocions = findAll();
        promocions.add(promocion);
        saveToFile(promocions);
    }

    public void saveList(List<Promocion> promocions) {
        saveToFile(promocions);
    }

    private void saveToFile(List<Promocion> promocions) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(promocions));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public List<Promocion> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()){
                myObj.createNewFile();
            }
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
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            throw new RuntimeException(e);
        }
        return new ArrayList<Promocion>();
    }

    public static PromocionFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PromocionFileLocalDataSource();
        }
        return instance;
    }

}
