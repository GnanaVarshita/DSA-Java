package Singly;

import Circular.CLL;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head= node;

        if(tail==null){
            tail=head;
        }

        size+=1;
    }

    public void insertLast(int val){

        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }

        Node node= new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }

        Node secondLast=get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next=null;

        return val;
    }
    public Node get(int index){
        Node node= head;
        for (int i = 0; i <index ; i++) {
            node= node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node =head;
        while(node!=null){
            if(node.value==value){ //Complexity -O(n)
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public int deleteFirst(){
        int val = head.value;
        head= head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private void insertRec(int val, int index){
         head=insertRec(val,index,head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index==0){
          Node temp = new Node(val,node);
            size++;
            return temp;
        }

       node.next= insertRec(val,index--,node.next);
        return node;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next =next;
        }
    }

    //questions

    public void duplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    //two sorted list merge these
    public static LL merge(LL first,LL second){
          Node f = first.head;
          Node s= second.head;

          LL ans = new LL();

          while(f!=null&&s!=null){
              if(f.value<s.value){
                  ans.insertLast(f);
                  f= f.next;
              }

              else{
                  ans.insertLast(s);
                  s=s.next;
              }
          }

          while(f!=null){
              ans.insertLast(f.value);
              f=f.next;
          }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }

    //Linked list cycle

//find the start of the cycle
    public ListNode detectCycle(ListNode head){
        int length =0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null&& fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
               length = lengthCycle(slow);
               break;
            }
        }
        //find the start
        ListNode f=head;
        ListNode s= head;

        while(length>0){
            s= s.next;
            length--;
        }

        //keep moving both forward and the will meet at cycle start
        while(f!=s){
            s=s.next;
            f=f.next;
        }


    }

    //Happy Number
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow=findSquare(slow);
            fast =findSquare(findSquare(fast));

        }
        while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;


    }

    private int findSquare(int number){
        int ans =0;
        while(number>0){
            int rem = number%10;
            ans+=rem*rem;
            number= number/10;

        }
        return ans;

    }

    //Middle of the linked list.
    public ListNode middleNode(ListNode head){
        ListNode f= head;
        ListNode s=head;

        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;

        }
    }
}

