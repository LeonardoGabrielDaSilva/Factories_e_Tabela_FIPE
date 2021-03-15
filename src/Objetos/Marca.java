package Objetos;

public class Marca {

	private String key;
	private int id;
	private String fipe_name;
	private String name;
	
	public Marca(String key, int id, String fipe_name, String name) {
		setKey(key);
		setId(id);
		setFipe_name(fipe_name);
		setName(name);
	}
	
	public Marca() {
		
	}
	
	@Override
	public String toString() {
		return "Marca [key=" + key + ", id=" + id + ", fipe_name=" + fipe_name + ", name=" + name + "]";
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFipe_name() {
		return fipe_name;
	}
	public void setFipe_name(String fipe_name) {
		this.fipe_name = fipe_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
