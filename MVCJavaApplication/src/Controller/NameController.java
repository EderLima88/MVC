package Controller;

import Model.NameModel;
import View.NameView;

public class NameController {
	private NameModel model;
	private NameView view;
	
    public NameController(NameModel model, NameView view) {
        this.model = model;
        this.view = view;
    }
	
	public void addName(String name) {
        model.addName(name);
        view.displayMessage("Name added: " + name);
    }

    public void removeName(String name) {
        model.removeName(name);
        view.displayMessage("Name removed: " + name);
    }

    public void displayNames() {
        view.displayNames(model.getNames());
    }
	

}
