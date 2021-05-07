#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
/* Perform basic arthmatic operation using menu dirven program 
1. Accept two numbers from user
2. print menu
3. accept choice
4. use switch on option
*/

void main5()
{
	//setp 1
	int no1, no2,choice;
	printf("\n\t Enter Two Numbers ");
	scanf("%d%d", &no1, &no2);
	//Setp -2
	printf("\n\n\t1. Addition\
              \n\t2. Subtraction\
              \n\t3. Multiplication\
              \n\t4. Division\
              \n\t Enter Your chocie ");
	//Step-3
	scanf("%d", &choice);
	switch (choice)
	{
	case 1:
		printf("\n\n\t %d + %d = %d", no1, no2, no1 + no2);
		break;
	case 1+1:
		printf("\n\n\t %d - %d = %d", no1, no2, no1 - no2);
		break;
	case 3:
		printf("\n\n\t %d * %d = %d", no1, no2, no1 * no2);
		break;
	case 4:
		printf("\n\n\t %d / %d = %d", no1, no2, no1 / no2);
		break;
	default:
		printf("\n\n\t Wrong Option !!! ");
	}
	printf("\n\n\n");
}

