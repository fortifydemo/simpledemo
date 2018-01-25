package it.devops;

public class HelloDevOps {
	
	private String message;
	
	public HelloDevOps() {
		this.message = "Hello DevOps";
	}
	
	public String greet() {
		//System.out.println("This is a blocking issue");
		return this.message;
	}

}