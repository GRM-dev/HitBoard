/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

/**
 * @author Levvy055
 *
 */
public class MainForm implements Initializable {
	private HashMap<SideNodeName, Node> sideNodes;

	@FXML
	private Pane mainPane;
	@FXML
	private VBox vBoxLeft;

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
			addAllNodesToLeftPanel();
		} catch (IOException e) {
			e.printStackTrace();
		}
		changeNodeTo(SideNodeName.DASHBOARD);
	}

	/**
	 * Changes page depending on nodeName parameter
	 * 
	 * @param dashboard
	 */
	private void changeNodeTo(SideNodeName nodeName) {
		mainPane.getChildren().clear();
		mainPane.getChildren().add(sideNodes.get(nodeName));
	}

	/**
	 * Loads Nodes to sideNodes map field
	 * 
	 * @throws IOException
	 * 
	 */
	private void loadNodes() throws IOException {
		loadNode(SideNodeName.DASHBOARD, "/views/DashBoard.fxml");
		loadNode(SideNodeName.STATS, "/views/Stats.fxml");
	}

	private void loadNode(SideNodeName nodeName, String fileName)
			throws IOException {
		sideNodes.put(nodeName,
				FXMLLoader.load(getClass().getResource(fileName)));
	}

	/**
	 * Adds button to each of all nodes from sideNodes to left panel
	 */
	private void addAllNodesToLeftPanel() {
		Button[] buttons = new Button[15];
		for (Iterator<SideNodeName> it = sideNodes.keySet().iterator(); it
				.hasNext();) {
			SideNodeName nodeName = it.next();
			Button btn = new Button(nodeName.getName());
			btn.setOnAction(event -> {
				changeNodeTo(nodeName);
			});
			buttons[nodeName.ordinal()] = btn;
		}
		for (Button button : buttons) {
			if (button != null) {
				vBoxLeft.getChildren().add(button);
			}
		}
	}
}
