package Problem1;


public class Student {  
	
	private int id;
	private String name;
	private String contno;
	
	public Student() { 
		super();
	}
	
	public Student(int id, String name, String contno) 
	{
		super();
		this.id = id;
		this.name = name;
		this.contno = contno;
	}

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

	public String getContno() {
		return contno;
	}

	public void setContno(String contno) { 
		this.contno = contno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contno=" + contno + "]";
	}

	public static void fillset() {
		// TODO Auto-generated method stub
		
	}
}