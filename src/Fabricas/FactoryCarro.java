package Fabricas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Objetos.Carro;


public class FactoryCarro implements IFactory {

	@Override
	public List<?> criar(URL url) {
		List<Carro> lista = new ArrayList<Carro>();

		try (BufferedReader bR = new BufferedReader(new InputStreamReader(url.openStream()))) {
			Type listType = new TypeToken<Carro>() {
			}.getType();
			Carro carro = new Gson().fromJson(bR, listType);
			lista.add(carro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;

	}
	

}
