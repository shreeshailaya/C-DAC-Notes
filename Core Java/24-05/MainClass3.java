class MainClass3
{
	public static void main(String [] args)
	{
		AreaBox [] arr;
		arr = new AreaBox[3];
		arr[0]=new AreaBox(2,2,2);
		arr[1]=new AreaBox(3,3,3);
		arr[2]=new AreaBox(4,4,4);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].displayArea();
		}
	}
}
