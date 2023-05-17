package View;
import Model.NameModel;
import java.util.List;

public class NameView {

	public void displayNames(List<String> names) {
		System.out.println("Names: ");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
	
    public void displayMessage(String message) {
        System.out.println(message);
    }	
}
