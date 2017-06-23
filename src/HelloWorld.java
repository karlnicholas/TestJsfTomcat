
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloWorld", eager = true)
@SessionScoped
public class HelloWorld {

	private String name;
	private String message;

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

}