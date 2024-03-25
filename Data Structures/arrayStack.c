#include<stdio.h>
#include<stdlib.h>
#define SIZE 5

int top=-1, arr[SIZE];

void push(){
    int data;
    if (top==SIZE -1)
    {
        printf("Stack Overflow \n \n");
    }
    else
    {
        printf("Enter element to be inserted ");
        scanf("%d",&data);
        top=top+1;
        arr[top]=data;
        printf("%d is inserted\n \n", data);
    }
}
void pop(){
    if(top ==-1){
        printf("Stack Underflow \n \n");
    }else{
        printf("%d is deleted\n \n", arr[top]);
        top=top-1;
    }
}
void peek(){
    if (top == -1)
    {
        printf("Underflow!!\n \n");
    }
    else
    {
        printf("Elements present in the stack: ");
        for (int i = top; i>=0 ; i--)
        {
            printf("%d ", arr[i]);
        }
        printf("\n \n");
    }
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
            push();
        }else if (choice==2)
        {
            pop();
        }else if (choice==3)
        {
            peek();
        }else if (choice==0)
        {
            break;
        }
    }
return 0;
}