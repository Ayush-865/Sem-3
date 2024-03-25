#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

struct node *createNode(int data)
{
    struct node *n = (struct node *)malloc(sizeof(struct node));
    n->data = data;
    n->left = NULL;
    n->right = NULL;
    return n;
}

void preOrder(struct node *root)
{
    if (root != NULL)
    {
        printf("%d ", root->data);
        preOrder(root->left);
        preOrder(root->right);
    }
}

void postOrder(struct node *root)
{
    if (root != NULL)
    {
        postOrder(root->left);
        postOrder(root->right);
        printf("%d ", root->data);
    }
}

void inOrder(struct node *root)
{
    if (root != NULL)
    {
        inOrder(root->left);
        printf("%d ", root->data);
        inOrder(root->right);
    }
}

struct node *searchBST(struct node *root, int key)
{
    if (root == NULL)
    {
        return NULL;
    }
    if (root->data == key)
    {
        return root;
    }
    else if (root->data > key)
    {
        return searchBST(root->left, key);
    }
    else
    {
        return searchBST(root->right, key);
    }
}

struct node *insert(struct node *root, int key)
{
    struct node *prev = NULL;
    while (root != NULL)
    {
        prev = root;
        if (root->data == key)
        {
            return;
        }
        else if (root->data > key)
        {
            root = root->left;
        }
        else
        {
            root = root->right;
        }
    }
    struct node *p = createNode(key);
    if (key < prev->data)
    {
        prev->left = p;
    }
    else
    {
        prev->right = p;
    }
}

int main()
{
    struct node *p0 = createNode(10);
    struct node *p1 = createNode(8);
    struct node *p2 = createNode(13);
    struct node *p3 = createNode(5);
    struct node *p4 = createNode(9);
    struct node *p5 = createNode(12);
    struct node *p6 = createNode(15);

    p0->left = p1;
    p0->right = p2;
    p1->left = p3;
    p1->right = p4;
    p2->left = p5;
    p2->right = p6;

    preOrder(p0);
    printf("\n");
    postOrder(p0);
    printf("\n");
    inOrder(p0);

    // struct node *n = searchBST(p0, 18);
    // if (n != NULL)
    // {
    //     printf("%d", n->data);
    // }
    // else
    // {
    //     printf("Not Found");
    // }

    insert(p0, 20);
    return 0;
}