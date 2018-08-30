import java.util.List;

public class Node {
	private String data;
	private List<Node> children;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public List<Node> getChildren() {
		return children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
}
