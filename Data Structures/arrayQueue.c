#include<stdio.h>
#include<stdlib.h>
#define SIZE 10

int front=-1, rear=-1, arr[SIZE];

void insert(){
    int data;
    printf("Enter element to be inserted ");
    scanf("%d",&data);
    if (rear==SIZE-1)
    {
        printf("Stack Overflow\n \n");
    }
    else if (front==-1 && rear==-1)
    {
        front=rear=0;
        arr[rear]=data;
        printf("%d is inserted\n \n",data);
    }
    else{
        rear++;
        arr[rear]=data;
        printf("%d is inserted\n \n",data);
    }
}
void delete(){
    if(front == -1){
        printf("\nUnderflow \n \n");
    }else{
        printf("%d is deleted from stack\n \n",arr[front]);
        front++;
    }
}
void traverse(){
    for (int i = front; i <= rear; i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n \n");
}

int  main()
{
    int choice=-1;
    while (choice != 0)
    {
        printf("Enter 1 to push \nEnter 2 to pop \nEnter 3 to peek \nEnter 0 to exit \n");
        scanf("%d", &choice);
        if (choice==1)
        {
            insert();
        }else if (choice==2)
        {
            delete();
        }else if (choice==3)
        {
            traverse();
        }else if (choice==0)
        {
            break;
        }
    }
return 0;
}
