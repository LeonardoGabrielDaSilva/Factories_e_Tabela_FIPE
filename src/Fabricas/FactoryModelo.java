package Fabricas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Objetos.Modelo;

public class FactoryModelo implements IFactory {

	@Override
	public List<?> criar(URL url) {
		List<Modelo> lista = new ArrayList<Modelo>();

		try (BufferedReader bR = new BufferedReader(new InputStreamReader(url.openStream()))) {
			Type listType = new TypeToken<ArrayList<Modelo>>() {
			}.getType();
			lista = new Gson().fromJson(bR, listType);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

}
