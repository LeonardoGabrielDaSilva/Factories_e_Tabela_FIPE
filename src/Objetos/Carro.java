package Objetos;

public class Carro {
	
	private int id;
	private int ano_modelo;
	private String marca;
	private String name;
	private String preco;
	private String combustivel;
	private String referencia;
	private String fipe_codigo;
	private String key;
	
	public Carro() {
		
	}
	public Carro(int id, int ano_modelo, String marca, String name, String preco, String combustivel, String referencia, String fipe_codigo, String key) {
		setId(id);
		setAno_modelo(ano_modelo);
		setMarca(marca);
		setName(name);
		setPreco(preco);
		setCombustivel(combustivel);
		setReferencia(referencia);
		setFipe_codigo(fipe_codigo);
		setKey(key);
	}
	
	@Override
	public String toString() {
		return "Carro [id=" + id + ", ano_modelo=" + ano_modelo + ", marca=" + marca + ", name=" + name + ", preco="
				+ preco + ", combustivel=" + combustivel + ", referencia=" + referencia + ", fipe_codigo=" + fipe_codigo
				+ ", key=" + key + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAno_modelo() {
		return ano_modelo;
	}
	public void setAno_modelo(int ano_modelo) {
		this.ano_modelo = ano_modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getFipe_codigo() {
		return fipe_codigo;
	}
	public void setFipe_codigo(String fipe_codigo) {
		this.fipe_codigo = fipe_codigo;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	

}
