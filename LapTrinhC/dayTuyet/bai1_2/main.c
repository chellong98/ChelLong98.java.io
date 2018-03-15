#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n;
    printf("nhap n:> ");
    scanf("%d", &n);
    int a[n];
    printf("nhap mang:>\n");
    int i;
    for(i=0; i<n; i++) {
        printf("a[%d]> ",i);
        scanf("%d", &a[i]);
    }
    int sum=0;
    for(i=0; i<n; i++) {
        sum+=a[i];
    }
    printf("tong day:> %d\n", sum);
    printf("trung binh cong day:> %.2f\n", (float)sum/n);
    int max = a[0], min =a[0];
    for(i=0; i<n; i++) {
        if(max>a[i]) {
            max = a[i];
        }
        if(min < a[i]) {
            min = a[i];
        }
    }
    printf("max = %d\tmin = %d\n" ,max, min);
    printf("nhap phan tu x:> ");
    int x;
    scanf("%d", &x);
    printf("phan tu chan < %d la:> ", x);
    for(i=0; i<n; i++) {
        if(a[i]%2==0 && a[i]<x) {
            printf("%d\t", a[i]);
        }
    }
    return 0;
}
