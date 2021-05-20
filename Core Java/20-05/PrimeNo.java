class PrimeNo
{
	public static void main(String args[])
	{
		int i,temp=0,no=8;
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				temp++;
			}
		}if(temp==0){
			System.out.println(" prime");
		}else{
			System.out.println("Not Prime No");
		}
	}
}