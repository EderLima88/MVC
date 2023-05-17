package Model;

import java.util.ArrayList;
import java.util.List;

public class NameModel {
	
	private List names;
	
	public NameModel() {
		names = new ArrayList<>();
	}	
	
	public void addName(String name) {
		names.add(name);
	}
	
	public void removeName(String name) {
		names.remove(name);
	}
	
	public List getNames() {
		return names;
	}
	
}
