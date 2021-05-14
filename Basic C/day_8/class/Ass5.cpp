#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

// Array With Function
void Accept(int[], int);
void Display(int[], int);
int Sum(int[], int);
void main()
{
	int a[5];
	int i,total;

	// If you want to pass array to function pass base address
	Accept(a, 5);
	Display(a, 5);
	total = Sum(a, 5);
	printf("\n\n\t Total : %d", total);
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
int Sum(int a[], int s)
{
	int sm = 0;
	for (i = 0; i < s; i++)
		sm=sm + a[i];
	return sm;
}







