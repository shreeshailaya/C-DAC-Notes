


public class Node {
	private int data;
	private Node link;
	public Node()
	{
		data=0;
		link=null;
	}
	public Node(int data)
	{
		this.data=data;
		this.link=null;
	}
	public void display()
	{
		System.out.print("  "+data);
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
}
