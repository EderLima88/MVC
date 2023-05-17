package Main;

import Controller.NameController;
import Model.NameModel;
import View.NameView;
//Este MVC é para javaApp e não javaWeb
public class Main {

	public static void main(String[] args) {
		NameModel model = new NameModel();
		NameView view = new NameView();
		NameController controller = new NameController(model, view);

		 	controller.addName("Alice");
	        controller.addName("Bob");
	        controller.addName("Charlie");
	        controller.displayNames();		
	}
}
//exemplo de uso do mvc
