class Volume 
{
	int height,width,depth;
	public Volume()
	{
		System.out.println("In the Volme Constructor");
		System.out.println(""+height*width*depth);
		System.out.println("____________________________");
	}
	public Volume(int height, int width, int depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
		System.out.println("The Volume is"+height*width*depth);
		System.out.println("____________________________");
	}
}