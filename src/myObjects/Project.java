package myObjects;

public class Project {
	private String name;
	private int id;
	
	public Project(String name) {
		this.name = name;
	}
	
	public void printInfo() {
    	System.out.println("ID cua project: " + id);
    	System.out.println("Ten project: " + name);
    	System.out.println("---------------------");
    }
	
	
	
}
