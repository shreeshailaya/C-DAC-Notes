#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int main11() {
	int sn, en;
	printf("Enter start &end the Number");
	scanf("%d %d", &sn, &en);

	if (sn < en) {
		for (int i = sn; i <= en; i++)
			printf("%d", i);
	}
	else if (sn > en) {
		for (int i = sn; i >= en; i--) {
			printf("%d", i);
		}
	}
	
	return 0;
}