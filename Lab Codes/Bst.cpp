#include <bits/stdc++.h>
using namespace std;
class Node
{
public:
    int val;
    Node *left;
    Node *right;
    Node(int val)
    {
        this->val = val;
        this->left = NULL;
        this->right = NULL;
    }
};

void insert_in_bst(Node *&root, int val)
{
    Node *newnode = new Node(val);
    if (root == NULL)
    {
        root = newnode;
        return;
    }

    if (root->val > val)
    {
        insert_in_bst(root->left, val);
    }
    else
    {
        insert_in_bst(root->right, val);
    }
}

void inorder(Node *root)
{
    if (root == NULL)
    {
        return;
    }
    inorder(root->left);
    cout << root->val << endl;
    inorder(root->right);
}

bool search_value(Node *root, int val)
{
    if (root == NULL)
    {
        return false;
    }

    if (root->val == val)
        return true;

    if (root->val > val)
        return search_value(root->left, val);
    else
        return search_value(root->right, val);
}

int main()
{

    Node *root = NULL;
    int val;
    while (true)
    {
        cin >> val;

        if (val == -1)
        {
            break;
        }
        insert_in_bst(root, val);
    }

    inorder(root);
    if (search_value(root, 20))
        cout << "Yes" << endl;
    else
        cout << "NO" << endl;
    return 0;
}