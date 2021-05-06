#define _CRT_SECURE_NO_WARNINGS

/* Program to check student result
   marks >35 to <60 pass
   marks>=60 < 75 pass with A grade
   marks>=75 pass with dist
   */

#include<stdio.h>
void main()
{
	int marks;
	printf("\n\n\t Enter Marks ");
	scanf("%d", &marks);

	if (marks > 35 && marks < 60)
	{
		printf("\n\n\t Student is pass");
	}
	else if (marks >= 60 && marks < 75)
	{
		printf("\n\t Student pass with A Grade ");
	}
	else if(marks>=75)
		printf("\n\t Distin");



}

