package Fabricas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Objetos.Marca;

public class FactoryMarca implements IFactory {

	@Override
	public List<?> criar(URL url) {
		List<Marca> lista = new ArrayList<Marca>();

		try (BufferedReader bR = new BufferedReader(new InputStreamReader(url.openStream()))) {
			Type listType = new TypeToken<ArrayList<Marca>>() {
			}.getType();
			lista = new Gson().fromJson(bR, listType);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}

}
