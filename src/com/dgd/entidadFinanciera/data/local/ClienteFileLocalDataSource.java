package com.dgd.entidadFinanciera.data.local;

import com.dgd.entidadFinanciera.domain.models.Cliente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ClienteFileLocalDataSource {

    private static ClienteFileLocalDataSource instance = null;

    private Gson gson = new Gson();

    private final Type typeClienteList = new TypeToken<ArrayList<Cliente>>() {
    }.getType();

    private ClienteFileLocalDataSource() {
    }

    public void save(Cliente cliente) {
        List<Cliente> clientes = findAll();
        clientes.add(cliente);
        saveToFile(clientes);
    }

    private void saveToFile(List<Cliente> clientes) {
        try {
            FileWriter myWriter = new FileWriter("clientes.txt");
            myWriter.write(gson.toJson(clientes));
            myWriter.close();
            System.out.println("Cliente guardado correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }


    public Cliente findById(Integer clienteDni) {
        List<Cliente> clientes = findAll();
        for (Cliente cliente : clientes) {
            if (Objects.equals(cliente.getDni(), clienteDni)) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> findAll() {
        try {
            File myObj = new File("clientes.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeClienteList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new ArrayList<Cliente>();
    }

    public static ClienteFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new ClienteFileLocalDataSource();
        }
        return instance;
    }
}
