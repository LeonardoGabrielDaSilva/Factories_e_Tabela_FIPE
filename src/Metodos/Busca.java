package Metodos;

import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import Exportacao.ExportaMarcas;
import Exportacao.ExportaModelos;
import Objetos.*;

public class Busca {

	private static List<Marca> listaMarca = new ArrayList<Marca>();
	private static List<Modelo> listaModelo = new ArrayList<Modelo>();

	@SuppressWarnings("unchecked")
	public List<Marca> buscarListaMarcas() {
		Conexao conexao = new Conexao();
		listaMarca = (List<Marca>) conexao.fazerConexao("marca", "http://fipeapi.appspot.com/api/1/carros/marcas.json");
		return listaMarca;

	}

	@SuppressWarnings("unchecked")
	public Carro buscarCarro(Marca marca, Modelo modelo, AnoModelo anoModelo) {
		Conexao conexao = new Conexao();
		List<Carro> lista = (List<Carro>) conexao.fazerConexao("carro",
				"http://fipeapi.appspot.com/api/1/carros/veiculo/" + marca.getId() + "/" + modelo.getId() + "/"
						+ anoModelo.getId() + ".json");
		return lista.get(0);
	}

	@SuppressWarnings("unchecked")
	public List<Modelo> buscarListaModelos(Marca marca) {
		Conexao conexao = new Conexao();
		listaModelo = (List<Modelo>) conexao.fazerConexao("modelo",
				"http://fipeapi.appspot.com/api/1/carros/veiculos/" + marca.getId() + ".json");
		return listaModelo;
	}

	@SuppressWarnings("unchecked")
	public List<AnoModelo> buscarListaAnoModelos(Marca marca, Modelo modelo) {
		Conexao conexao = new Conexao();
		return (List<AnoModelo>) conexao.fazerConexao("anoModelo",
				"http://fipeapi.appspot.com/api/1/carros/veiculo/" + marca.getId() + "/" + modelo.getId() + ".json");
	}

	public List<Marca> limparListaMarcas() {
		listaMarca = null;
		return null;
	}

	public List<Modelo> limparListaModelos() {
		listaModelo = null;
		return null;
	}

	public void ExportarListaMarcas(String local) {
		ExportaMarcas em = new ExportaMarcas();
		em.exportarMarca(listaMarca, local);
	}

	public void ExportarListaModelos(String local) {
		ExportaModelos em = new ExportaModelos();
		em.exportarModelo(listaModelo, local);
	}

	public boolean testarConexao() {
		Conexao conexao = new Conexao();
		return conexao.testarConexao();
	}
}
