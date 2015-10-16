/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import pl.grmdev.hitboard.gui.controllers.utils.HbNode;
/**
 * @author Levvy055
 */
public class Stats implements Initializable, HbNode {
	
	private static Stats instance;
	
	/*
	 * (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		instance = this;
	}
	
	/*
	 * (non-Javadoc)
	 * @see pl.grmdev.hitboard.gui.controllers.HbNode#updateAll()
	 */
	@Override
	public void updateAll() {
		// TODO Auto-generated method stub
	}
}
