
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld")
public class HelloWorld {

	private String name;
	private String message;
	private List<String> names;
	
	public HelloWorld() {
		names = new ArrayList<>(Arrays.asList("Karl", "Kelly", "Kristin"));
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

}