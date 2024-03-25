#include<stdio.h>

void display(int arr[],int size){
    int i;
    for ( i = 0; i < size; i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
}

void insertionSort(int * arr , int size){
    int i, j , key;
    for (i = 1; i <= size-1; i++)
    {
        key=arr[i];
        j=i-1;
        while (j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
}
int  main()
{
    int arr[]={43,76,75,33,93,57,6,38,83,64};
    int size=sizeof(arr)/sizeof(int);
    display(arr,size);
    insertionSort(arr,size);
    display(arr,size);
return 0;
}