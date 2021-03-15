package Conexao;

import java.net.HttpURLConnection;
import java.net.URL;

import java.util.List;

import Fabricas.*;

public class Conexao {

	public List<?> fazerConexao(String a, String URL_API) {

		HttpURLConnection con = null;
		try {
			URL url = new URL(URL_API);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();

			switch (con.getResponseCode()) {
			case 200:
				if (a.equals("marca")) {
					FactoryMarca fm = new FactoryMarca();
					return fm.criar(url);
				} else if (a.equals("modelo")) {
					FactoryModelo fm = new FactoryModelo();
					return fm.criar(url);
				} else if (a.equals("anoModelo")) {
					FactoryAnoModelo fm = new FactoryAnoModelo();
					return fm.criar(url);
				} else if (a.equals("carro")) {
					FactoryCarro fm = new FactoryCarro();
					return fm.criar(url);
				}

			case 500:
				System.out.println("Status 500");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				con.disconnect();
		}
		return null;

	}

	public boolean testarConexao() {
		String URL_API = "http://fipeapi.appspot.com/api/1/carros/marcas.json";

		HttpURLConnection con = null;
		try {
			URL url = new URL(URL_API);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();

			switch (con.getResponseCode()) {
			case 200:
				return true;

			case 500:
				return false;

			}
		} catch (Exception e) {
			return false;

		} finally {
			if (con != null)
				con.disconnect();
		}
		return false;

	}

}