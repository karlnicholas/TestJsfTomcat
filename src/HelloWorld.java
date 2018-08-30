
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld")
public class HelloWorld {

	private String name;
	private String message;
	private List<String> names;
	private Node tree;
	
	public HelloWorld() {
		names = new ArrayList<>(Arrays.asList("Karl", "Kelly", "Kristin"));
		tree = new Node();
		tree.setData("P1");
		tree.setChildren(new ArrayList<>());
		Node c1 = new Node();
		c1.setData("C1/1");
		tree.getChildren().add(c1);
		Node c2 = new Node();
		c2.setChildren(new ArrayList<>());
		c2.setData("C1/2");
		tree.getChildren().add(c2);
		Node c3 = new Node();
		c3.setData("C1/2-1/1");
		c2.getChildren().add(c3);
	}

	public void createMessage() {
		message = "Hello, " + name + "!";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage() {
		message = "Hello, " + name + "!";
	}

	public List<String> getNames() {
		return names;
	}

	public Node getTree() {
		return tree;
	}
}