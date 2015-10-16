/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.logging.Logger;

import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import pl.grmdev.hitboard.HitBoardCore;
import pl.grmdev.hitboard.gui.controllers.utils.*;
/**
 * @author Levvy055
 */
public class MainForm implements Initializable {
	
	public static MainForm instance;
	private HashMap<SideNodeId, NodeHandler> mainNodes;
	@FXML
	private Pane mainPane;
	@FXML
	private VBox vBoxLeft;
	@FXML
	private Circle circleState;
	@FXML
	private ProgressIndicator piProgressMain;
	@FXML
	private Label lblProgressMain;
	private SideNodeId currentNodeId;
	private Logger logger;
	
	/*
	 * (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL,
	 * java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		instance = this;
		logger = HitBoardCore.getLogger();
		mainNodes = new HashMap<>();
		try {
			loadNodes();
			addAllNodesToLeftPanel();
		} catch (IOException e) {
			e.printStackTrace();
		}
		changeNodeTo(SideNodeId.DASHBOARD);
	}
	
	/**
	 * Gets {@link Circle} objects which shows state of connections
	 * 
	 * @return {@link Circle} object
	 */
	public Circle getStateCircle() {
		return circleState;
	}
	
	/**
	 * Loads Nodes to sideNodes map field
	 * 
	 * @throws IOException
	 */
	private void loadNodes() throws IOException {
		loadNode(SideNodeId.DASHBOARD, "/views/DashBoard.fxml",
				DashBoard.class);
		loadNode(SideNodeId.STATS, "/views/Stats.fxml", Stats.class);
	}
	
	/**
	 * Just load specified in parameters node. Called by {@link #loadNodes()}
	 * 
	 * @param nodeId
	 *            type of {@link SideNodeId}
	 * @param fileName
	 *            name of FXML file to load
	 * @throws IOException
	 *             thrown when specified file is corrupted or doesn't exists
	 */
	private void loadNode(SideNodeId nodeId, String fileName,
			Class<? extends HbNode> clazz) throws IOException {
		NodeHandler nodeHandler;
		try {
			Node node = FXMLLoader.load(getClass().getResource(fileName));
			if (node != null) {
				nodeHandler = new NodeHandler(clazz, node);
				mainNodes.put(nodeId, nodeHandler);
			} else {
				logger.severe("Node is null: " + nodeId.getName());
			}
		} catch (IllegalArgumentException | SecurityException e) {
			logger.severe("Error during loading Node " + nodeId.getName()
					+ " \n" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	/**
	 * Adds button to each of all nodes from sideNodes to left panel
	 */
	private void addAllNodesToLeftPanel() {
		Button[] buttons = new Button[15];
		for (Iterator<SideNodeId> it = mainNodes.keySet().iterator(); it
				.hasNext();) {
			SideNodeId nodeName = it.next();
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
	
	/**
	 * Changes page depending on nodeName parameter
	 * 
	 * @param nodeId
	 */
	private void changeNodeTo(SideNodeId nodeId) {
		mainPane.getChildren().clear();
		mainPane.getChildren().add(mainNodes.get(nodeId).getNode());
		currentNodeId = nodeId;
		try {
			mainNodes.get(nodeId).getHbNode().updateAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public SideNodeId getCurrentNodeId() {
		return currentNodeId;
	}
	
	public HbNode getCurrentNode() throws Exception {
		return mainNodes.get(currentNodeId).getHbNode();
	}
}
