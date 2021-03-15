package Objetos;

public class Modelo {

	private String key;
	private String name;
	private int id;
	private String fipe_name;

	public Modelo() {

	}

	public Modelo(String key, String name, int id, String fipe_name) {
		setKey(key);
		setName(name);
		setId(id);
		setFipe_name(fipe_name);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
