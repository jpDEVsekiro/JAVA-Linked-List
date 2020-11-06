/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
public class linkedlist {

    linkedlist next;
    int data;

    public linkedlist(int data) {
        this.data = data;
    }

    public static class LinkedList {

        linkedlist head;

        public void append(int data) {   //add in the tail
            if (head == null) {
                head = new linkedlist(data);
                return;
            }
            linkedlist current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new linkedlist(data);
        }

        public void prepend(int data) {    //add in the head
            linkedlist newHead = new linkedlist(data);
            newHead.next = head;
            head = newHead;
        }

        public void deleteWithValue(int data) {  //dele the value you chose 
            if (head == null) {   //verificar se a cabeça é nula 
                return;
            }
            if (head.data == data) {   //verificar se a cabeça jão não é o valor
                head = head.next;
                return;
            }
            linkedlist current = head;    //primeiro 
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }

        public void show() {
            linkedlist current = head;
            while (current.next != null) {
                System.out.println("" + current.data);
                current = current.next;
            }
            System.out.println("" + current.data);
        }
    }

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.append(5);
        a.append(9);
        a.append(1);
        a.append(2);
        a.append(3);
        a.append(654);
        a.append(566);
        a.append(564);
        a.append(554);
        a.append(512);
        a.append(21);
        a.append(11);
        a.append(963);
        a.append(666);
        a.prepend(666);
        a.deleteWithValue(11);

        a.show();

    }
}
