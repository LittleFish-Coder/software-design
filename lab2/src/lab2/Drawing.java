package lab2;

import java.util.List;
import java.util.ArrayList;

public abstract class Drawing {
	private List<Drawing> group = new ArrayList<>();
	
	public void add(Drawing d) {
		group.add(d);
	}
}
