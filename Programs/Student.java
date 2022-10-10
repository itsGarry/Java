package pojo;

public class Student {

	private int id;
	private String name;
	private Contect contect;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Contect getContect() {
		return contect;
	}
	public void setContect(Contect contect) {
		this.contect = contect;
	}
	public Student(int id, String name, Contect contect) {
		super();
		this.id = id;
		this.name = name;
		this.contect = contect;
	}
	public Student() {
		super();
	}

	
		

}
