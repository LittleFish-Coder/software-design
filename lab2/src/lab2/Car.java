package lab2;

import java.lang.ref.WeakReference;

public class Car {
	private Engine engine;
	
	public Car() {
		this.engine = new Engine();
	}
	
	public WeakReference<Engine> getEngineReference() {
		return new WeakReference<>(engine);
	}
}
