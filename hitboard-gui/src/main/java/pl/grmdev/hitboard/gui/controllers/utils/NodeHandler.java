/**
 * 
 */
package pl.grmdev.hitboard.gui.controllers.utils;

import java.lang.reflect.Field;

import javafx.scene.Node;
/**
 * @author Levvy055
 */
public class NodeHandler {
	
	private Class<? extends HbNode> hbNodeClass;
	private Node node;
	
	public NodeHandler(Class<? extends HbNode> clazz, Node node) {
		this.hbNodeClass = clazz;
		this.node = node;
	}
	
	public Class<? extends HbNode> getHbNodeClass() {
		return hbNodeClass;
	}
	
	public HbNode getHbNode() throws Exception {
		Field instanceField = hbNodeClass.getDeclaredField("instance");
		instanceField.setAccessible(true);
		HbNode hbNode = (HbNode) instanceField.get(null);
		instanceField.setAccessible(false);
		return hbNode;
	}
	
	public Node getNode() {
		return node;
	}
}
