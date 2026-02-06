# Morris Traversal (Inorder and Preorder)

## Overview
This repository demonstrates the implementation of **Morris Traversal**, a space-optimized algorithm for traversing a Binary Tree **without recursion and without using an explicit stack**.

The project includes:
- Morris Inorder Traversal
- Morris Preorder Traversal

Morris Traversal achieves traversal using **O(1) auxiliary space** by temporarily modifying the tree structure and restoring it after the traversal is complete.

---

## What is Morris Traversal?
Morris Traversal is a Binary Tree traversal technique that avoids additional memory usage by creating **temporary threads** between nodes using right pointers.

### Key Characteristics
- Time Complexity: `O(n)`
- Space Complexity: `O(1)`
- No recursion
- No stack
- Tree structure remains unchanged after traversal

---

## Motivation
Standard traversal techniques have the following limitations:
- Recursive traversals consume call stack space
- Iterative traversals require an explicit stack

Morris Traversal eliminates these limitations and is particularly useful in:
- Memory-constrained systems
- Low-level system design
- Interview scenarios requiring space optimization

---

## Traversals Implemented

### Morris Inorder Traversal (Left → Node → Right)
In Morris Inorder Traversal, the node is visited **when the temporary thread is removed**.  
This ensures the left subtree is fully processed before visiting the node.

#### Core Idea
- Find the inorder predecessor
- Create a temporary thread if none exists
- Remove the thread after returning from the left subtree

---

### Morris Preorder Traversal (Node → Left → Right)
In Morris Preorder Traversal, the node is visited **when the temporary thread is created**.  
This ensures the node is processed before its left subtree.

#### Core Idea
- Visit the node before moving to the left subtree
- Threading logic remains identical to inorder traversal

---

## How the Algorithm Works
1. Start from the root node
2. If the left child is null, visit the node and move to the right
3. Otherwise, find the inorder predecessor
4. Create or remove temporary threads as needed
5. Continue until the entire tree is traversed

---

## Project Structure
- `MorrisInorder.java`  
  Implementation of Morris Inorder Traversal

- `MorrisPreorder.java`  
  Implementation of Morris Preorder Traversal

Each implementation uses constant extra space and restores the original tree structure.

---

## Conclusion
This project demonstrates how Binary Tree traversal can be performed efficiently without additional memory by leveraging pointer manipulation. Morris Traversal is an important algorithm for understanding space optimization and advanced tree traversal techniques.

---

## Intended Audience
- Computer Science students
- Interview preparation
- Algorithm learners
- Backend and system-level developers
