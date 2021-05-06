//accept basic salary and total sales and give commisiion according

#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
void main() {
	int b_sal, t_sale,com;
	printf("\n\tEnter Basic Salary");
	scanf("%d", &b_sal);
	printf("\n\tEnter Total Sales");
	scanf("%d", &t_sale);
	if (t_sale >= 5000 && t_sale <= 7000) {
		com = 3 * b_sal / 100;
		printf("\n\t The basic salary is :- %d \n\t The sale that you done :- %d \n",b_sal,t_sale);
		printf("\n\t The Commision you earn is(3%%) :- %d \n\t Total salary is :- %d", com, com + b_sal);
	}
	else if (t_sale >= 7001 && t_sale <= 10000) {
		com = 5 * b_sal / 100;
		printf("\n\t The basic salary is :- %d \n\t The sale that you done :- %d \n", b_sal, t_sale);
		printf("\n\t The Commision you earn is (5%%):- %d \n\t Total salary is :- %d", com, com + b_sal);
	}
	else if (t_sale >= 10001 && t_sale <= 15000) {
		com = 10 * b_sal / 100;
		printf("\n\t The basic salary is :- %d \n\t The sale that you done :- %d \n", b_sal, t_sale);
		printf("\n\t The Commision you earn is(10%%) :- %d \n\t Total salary is :- %d", com, com + b_sal);
	}
	else if (t_sale >= 15001) {
		com = 15 * b_sal / 100;
		printf("\n\t The basic salary is :- %d \n\t The sale that you done :- %d \n", b_sal, t_sale);
		printf("\n\t The Commision you earn is(15%%) :- %d \n\t Total salary is :- %d", com, com + b_sal);
	}
	else {
		com = 0;
		printf("\n\t The basic salary is :- %d \n\t The sale that you done :- %d \n", b_sal, t_sale);
		printf("\n\t The Commision you earn is(0%%) :- %d \n\t Total salary is :- %d", com, com + b_sal);
	}
}