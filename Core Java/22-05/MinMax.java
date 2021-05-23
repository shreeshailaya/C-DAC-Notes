class MinMax
{
	int min, max;
	//int [] arrx = new int[5];
	int [] arrx={2,4,6,8,1};
	if(arrx[0]>arrx[1])
	{
		max=arrx[0];
		min=arrx[1];	
	} else {
		min=arrx[0];
		max=arrx[1];
		}
	for(int i=2;i<lenght.arrx;i++)
	{
		if(arrx[i]<min)
		{
			min=arrx[i];
		}
		if(arrx[i]>max){
			max = arrx[i];
		}
	}
	System.out.println("Min="+min+"Max="+max);
}	