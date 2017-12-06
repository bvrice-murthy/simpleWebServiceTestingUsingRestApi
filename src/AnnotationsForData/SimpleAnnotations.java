package AnnotationsForData;

import org.testng.annotations.Test;

public class SimpleAnnotations {
	@Info(name="Murthy")
	private String name; 
	
	@Info(name="bvricemurthy@gmail.com")
	private String emailID; 
	
	public String getname(){
		System.out.println(name);
		return name;
	}
	
	public String getemailId(){
		System.out.println(emailID);
		return emailID;
	}
	
	@Test
	public void main(){
		SimpleAnnotations annotations = new SimpleAnnotations();
		annotations.getemailId();
		annotations.getname();
	}
}
