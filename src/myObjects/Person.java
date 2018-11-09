package myObjects;

public abstract class Person {
	protected int id;
    protected String name;
    
    public Person(String name) {
    	this.name = name;
    }
    
    public abstract void printInfo();
    
    ///// getters and setters ///////
    
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
    
    
}
