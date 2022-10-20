 public class Main {  
      class Node{  
            int data;  
            Node previous;  
            Node next;  
      
            public Node(int data) {  
                this.data = data;  
            }  
        }  
      
      
        Node head, tail = null;  
      
     
        public void addNode(int data) {  
           
            Node newNode = new Node(data);  
      
         
            if(head == null) {  

                head = tail = newNode;  
               
                head.previous = null;  
               
                tail.next = null;  
            }  
            else {  
                  
                tail.next = newNode;  
              
                newNode.previous = tail;  
             
                tail = newNode;  
               
                tail.next = null;  
            }  
        }  
      
       
        public int minimumNode() {  
            //Node current will point to head  
            Node current = head;  
            int min;  
      
            //Checks if list is empty  
            if(head == null) {  
                System.out.println("List is empty");  
                return 0;  
            }  
            else {  
                 
                min = head.data;  
                while(current != null) {  
                     
      
                    if(min > current.data)  
                        min = current.data;  
                    current = current.next;  
                }  
            }  
            return min;  
        }  
      
        
        public int maximumNode() {  
           
            Node current = head;  
            int max;  
      
            //Checks if list is empty  
            if(head == null) {  
                System.out.println("List is empty");  
                return 0;  
            }  
            else {  
                //Initially, max will store the value of head's data  
                max = head.data;  
              
             
                while(current != null) {  
                    if(current.data > max)  
                        max = current.data;  
                    current = current.next;  
                }  
            }  
            return max;  
        }  
      
        public static void main(String[] args) {  
      
            Main dList = new Main();  
            //Add nodes to the list  
            dList.addNode(5);  
            dList.addNode(7);  
            dList.addNode(9);  
            dList.addNode(1);  
            dList.addNode(2);  
      
            //Prints the minimum value node in the list  
            System.out.println("Minimum value node in the list: "+ dList.minimumNode());  
            //Prints the maximum value node in the list  
            System.out.println("Maximum value node in the list: "+ dList.maximumNode());  
        }  
    }  