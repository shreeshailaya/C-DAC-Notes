

public class Graph {
	private int noofnodes;
	private Linklist list[];
	public Graph()
	{
		noofnodes=5;
		list=new Linklist[noofnodes];
     }
	public Graph(int no)
	{
		noofnodes=no;
		list=new Linklist[noofnodes];
		for(int i=0;i<noofnodes;i++)
			list[i]=new Linklist();
     }
	public void addEdge(int soursedata,int destdata)
	{
		list[soursedata].addNode(destdata);
		list[destdata].addNode(soursedata);
	}
	public void display()
	{
		for(int i=0;i<noofnodes;i++)
		{
			System.out.println(" List : " +i);
			list[i].display();
		}
			
	}
	

}
