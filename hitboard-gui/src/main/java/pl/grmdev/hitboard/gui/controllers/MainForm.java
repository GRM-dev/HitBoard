/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.layout.Pane;

/**
 * @author Levvy055
 *
 */
public class MainForm implements Initializable {
	private HashMap<SideNodeName, Node> sideNodes;

	@FXML
	private Pane mainPane;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		sideNodes = new HashMap<>();
		try {
			loadNodes();
		} catch (IOException e) {
			e.printStackTrace();
		}
		changeNodeTo(SideNodeName.DASHBOARD);
	}

	/**
	 * @param dashboard
	 */
	private void changeNodeTo(SideNodeName nodeName) {
		mainPane.getChildren().clear();
		mainPane.getChildren().add(sideNodes.get(nodeName));
	}

	/**
	 * @throws IOException
	 * 
	 */
	private void loadNodes() throws IOException {
		sideNodes.put(SideNodeName.DASHBOARD, FXMLLoader
				.load(getClass().getResource("/views/DashBoard.fxml")));
	}

}
