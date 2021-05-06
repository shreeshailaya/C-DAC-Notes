//Basic Arthmatic with two numbers using switch case

#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main() {
	int a, b;
	printf("\n\t Enter the value of A and B\n\t");
	scanf("%d %d", &a, &b);
	printf("\n1.Add \n 2.Sub \n3.Div \n 4.Multiply");
	int sw;
	scanf("%d", &sw);


	switch (sw) {
	case 1:
		printf("\n\t %d + %d = %d \t\n", a, b, a + b);
		break;
	case 2:
		printf("\n\t %d - %d = %d \t\n", a, b, a - b);
		break;
	case 3:
		printf("\n\t %d / %d = %d \t\n", a, b, a / b);
		break;
	case 4:
		printf("\n\t %d * %d = %d \t\n", a, b, a * b);
		break;
	default:
		printf("\n\t Enter Valid Option");
	}
	return 0;
}