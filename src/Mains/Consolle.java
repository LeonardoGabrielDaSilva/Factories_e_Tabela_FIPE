package Mains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Metodos.Busca;
import Objetos.*;

public class Consolle {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Busca busca = new Busca();

		List<Modelo> listaMo = new ArrayList<Modelo>();
		List<Marca> listaMa = new ArrayList<Marca>();
		List<AnoModelo> listaA = new ArrayList<AnoModelo>();
		Carro carro = new Carro();
		Marca marca = new Marca();
		AnoModelo anoModelo = new AnoModelo();
		Modelo modelo = new Modelo();

		System.out
				.println("1 - BuscarMarca \n" + "2 - BuscarModelo \n" + "3 - BuscarAnoModelo \n" + "4 - BuscarCarro \n"
						+ "5 - LimparMarca \n" + "6 - LimparModelo \n" + "7 - ExportarMarca \n" + "8 - ExportarModelo \n" + "0 - Sair");
		int n = 2;
		while (n != 0) {
			switch (n = read.nextInt()) {
			case 1:
				listaMa = busca.buscarListaMarcas();
				System.out.println("Lista Criada");
				marca = listaMa.get(0);
				break;
			case 2:
				listaMo = busca.buscarListaModelos(marca);
				System.out.println("Lista Criada");
				modelo = listaMo.get(0);
				break;
			case 3:
				listaA = busca.buscarListaAnoModelos(marca, modelo);
				System.out.println("Lista Criada");
				anoModelo = listaA.get(0);
				break;
			case 4:
				carro = busca.buscarCarro(marca, modelo, anoModelo);
				System.out.println("Lista Criada");
				System.out.println(carro.toString());
				break;
			case 5:
				listaMa = busca.limparListaMarcas();
				System.out.println("Lista Limpa");
				break;
			case 6:
				listaMo = busca.limparListaModelos();
				System.out.println("Lista Limpa");
				break;
			case 7:
				System.out.println("Digite local para salvar as marcas");
				String local = read.next() + ".json";
				busca.ExportarListaMarcas(local);
				break;
			case 8:
				System.out.println("Digite local para salvar os modelos");
				local = read.next() + ".json";
				busca.ExportarListaModelos(local);
				break;
			}
		} 
		read.close();

	}

}
