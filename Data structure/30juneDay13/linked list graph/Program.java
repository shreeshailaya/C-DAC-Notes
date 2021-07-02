
public class Program {
	public static void main(String[] args) {
		
		Graph g=new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(3, 2);
		g.addEdge(1, 4);
		g.display();
	}

}
