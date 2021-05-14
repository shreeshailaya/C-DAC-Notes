#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

// Array With Function
void Accept(int[],int);
void Display(int[], int);

void main5()
{
	int a[5], b[8], c[3];
	int i;

	// If you want to pass array to function pass base address
	Accept(a, 5);
	Accept(b, 8);
	Accept(c, 3);
	Display(a, 5);
	Display(b, 8);
	Display(c, 3);
}
int i;
void Accept(int arr[], int size)
{
	printf("\n\n\t Enter %d Elements ", size);
	for (i = 0; i < size; i++)
		scanf("%d", &arr[i]);
}
void Display(int arr[], int size)
{
	printf("\n\n\t Array \n\n ", size);
	for (i = 0; i < size; i++)
		printf(" %d ", arr[i]);
}




	


	
