#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
float AreaCircle(int);// DEclaration
void main8()
{
	int rad;
	float area;
	printf("\n\n\t Enter Value Of Radius ");
	scanf("%d", &rad);
	area = AreaCircle(rad); //call
	printf("\n\n\t Area : %f", area);
	printf("\n\n\n");
}
float AreaCircle(int r)
{
	float res;
	res = 3.14 * r * r;
	return res;
}

