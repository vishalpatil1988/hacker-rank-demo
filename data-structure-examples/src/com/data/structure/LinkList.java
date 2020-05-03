package com.data.structure;

public class LinkList {
	
	Node head = null;
	
	private class Node{
		int data;
		Node next;
	}
	
	public void insert(LinkList list, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(list.head == null) {
			head = newNode;
		}else {
			Node last = list.head;
			while(last.next !=null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}
	
	public void insertBiginning(LinkList list, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = list.head;
		list.head = newNode;
	}
	
	
	public void insert(LinkList list, int data, int pos) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		Node temp = head;
		if(pos == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}
		for(int i=0;i<pos-1;i++) {
			if(temp.next !=null) {
				temp = temp.next;
			}
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	
	public void delete(LinkList list, int pos) {
		Node temp = head;
		if(pos == 1) {
			head = temp.next;
		}
		for(int i=1;i<pos-1;i++) {
				temp = temp.next;
		}
		Node temp2 = temp.next.next;
		temp.next = temp2;
	}
	
	public void reverse(LinkList list) {
		Node next = null;
		Node current = list.head;
		Node prev = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void printList(LinkList list) {
		Node currNode = list.head;
		while (currNode !=null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.insert(linkList, 1, 1);
		linkList.insert(linkList, 2, 2);
		linkList.insert(linkList, 3, 3);
		linkList.insert(linkList, 4, 4);
		linkList.insert(linkList, 5, 5);
		linkList.insert(linkList, 6, 6);
		
		
		linkList.printList(linkList);
		System.out.println("-------");
		linkList.reverse(linkList);
		//linkList.delete(linkList, 1);
		linkList.printList(linkList);
		
		
	}

}
