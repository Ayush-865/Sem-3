#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node * left;
    struct Node * right;
}
void inOrder(struct Node * p){
    if(p==NULL){
        return;
    }
    inOrder(p->left);
    printf("%d ",p->data);
    inOrder(p->right);
}
void  main()
{
    struct Node * root=NULL;

}