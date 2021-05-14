#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

void Student()
{
	static int a;
	a++;
	printf("\n\n\t Roll No : %d", a);
}
void main2()
{
	Student();
	Student();
	Student();
	Student();
	Student();
	printf("\n\n\t Enter ");
}