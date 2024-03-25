#include<stdio.h>
#include<stdlib.h>
#define SIZE 5

int front=-1 , rear=-1, arr[SIZE];

void insert(){
    int data;
    printf("Enter data to be inserted ");
    scanf("%d",&data);
    if((rear==SIZE-1 && front==0) || (front!=0 && (rear%SIZE)==front-1)){
        printf("Queue is Full\n \n");
        return;
    }
    else if (front==-1 && rear==-1)
    {
        rear=front=0;
        arr[rear]=data;
    }
    else if (front!=0 && rear==SIZE-1)
    {
        rear=0;
        arr[rear]=data;
    }
    else{
        rear++;
        arr[rear]=data;
    }
    printf("%d is inserted \n \n", data);
}

void delete(){
    if (front==-1){
        printf("Queue is empty \n \n");
        return;
    }
    else if (front==rear)
    {
        printf("%d is deleted \n \n",arr[front]);
        front=rear=-1;
    }
    else if (front==SIZE-1)
    {
        printf("%d is deleted \n \n",arr[front]);
        front=0;
    }
    else
    {
        printf("%d is deleted \n \n",arr[front]);
        front++;
    }
}

void display(){
    int i;
    if (front<=rear)
    {
        for ( i = front; i <= rear; i++)
        {
            printf("%d ",arr[i]);
        }
        printf("\n \n");
    }
    else{
        for ( i = front; i < SIZE; i++)
        {
            printf("%d ",arr[i]);
        }
        for ( i = 0; i <= rear; i++)
        {
            printf("%d ",arr[i]);
        }
        printf("\n \n");
    }
}

int  main()
{
    int choice=-1;
    while(choice!=0){
        printf("Enter 1 to insert \nEnter 2 to delete \nEnter 3 to display \nEnter 0 to exit\n");
        scanf("%d",&choice);
        if(choice==1){
            insert();
        }
        else if (choice==2)
        {
            delete();
        }
        else if (choice==3)
        {
            display();
        }
        else if (choice==0)
        {
            break;
        }
    }
return 0;
}
