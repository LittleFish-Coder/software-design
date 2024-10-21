package lab2;

public class Person {
	private Phone cellphone;
	
	public void talkTo(String no) {
		cellphone.dial(no);
	}
}
