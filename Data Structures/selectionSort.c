#include<stdio.h>

void display(int arr[],int size){
    int i;
    for ( i = 0; i < size; i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
}

void selectionSort(int * arr , int size){
    int i, j, minIndex , temp;
    for (i = 0; i < size; i++)
    {
        minIndex=i;
        for (j = i+1; j < size; j++)
        {
            if (arr[j]<arr[minIndex])
            {
                minIndex=j;
            }
        }
        temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
}
int  main()
{
    int arr[]={43,76,75,33,93,57,6,38,83,64};
    int size=sizeof(arr)/sizeof(int);
    display(arr,size);
    selectionSort(arr,size);
    display(arr,size);
return 0;
}