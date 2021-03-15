package Exportacao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import Objetos.Modelo;


public class ExportaModelos {

	public void exportarModelo(List<Modelo> lista, String local) {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		try {
			FileWriter writer = new FileWriter(local + ".json");
			writer.write(gson.toJson(lista));
			writer.close();
		} catch(IOException e1) {
			 System.err.println(e1.getMessage());
		}
	}
}
