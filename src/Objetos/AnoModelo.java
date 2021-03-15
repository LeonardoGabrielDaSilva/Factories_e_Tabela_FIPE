package Objetos;

public class AnoModelo {

	
	private String fipe_codigo;
	private String name;
	private String key;
	private String veiculo;
	private String id;
	
	public AnoModelo() {
		
	}
	
	public AnoModelo(String fipe_codigo, String name, String key, String veiculo, String id) {
		setFipe_codigo(fipe_codigo);
		setName(name);
		setKey(key);
		setVeiculo(veiculo);
		setId(id);
	}
	
	public String getFipe_codigo() {
		return fipe_codigo;
	}
	public void setFipe_codigo(String fipe_codigo) {
		this.fipe_codigo = fipe_codigo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
