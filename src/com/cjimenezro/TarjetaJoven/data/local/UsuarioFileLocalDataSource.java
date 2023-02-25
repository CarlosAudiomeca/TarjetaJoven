package com.cjimenezro.TarjetaJoven.data.local;

import com.cjimenezro.TarjetaJoven.domain.models.Usuario;
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

public class UsuarioFileLocalDataSource implements UsuarioLocalDataSource{

    private static UsuarioFileLocalDataSource instance = null;

    private String nameFile = "usuarios.txt";

    private Gson gson = new Gson();

    private final Type typeAlumnList = new TypeToken<ArrayList<Usuario>>() {
    }.getType();

    private UsuarioFileLocalDataSource() {
    }

    public void save(Usuario usuario) {
        List<Usuario> usuarios = findAll();
        usuarios.add(usuario);
        saveToFile(usuarios);
    }

    public void saveList(List<Usuario> usuarios) {
        saveToFile(usuarios);
    }

    private void saveToFile(List<Usuario> usuarios) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(usuarios));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public List<Usuario> findAll() {
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
        return new ArrayList<Usuario>();
    }

    public static UsuarioFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new UsuarioFileLocalDataSource();
        }
        return instance;
    }

}
