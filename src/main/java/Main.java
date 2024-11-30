package Explorer;
public class Main {
	
	    public static Node<Integer> f1(int x, int y){
	        Node<Integer> a1 = null;   
	        Node<Integer> a2 = null;

	        for (int i = 0; i < 20; i++) {
	        	int r = (int)((Math.random() * (y-x+1))+x); 
	            Node<Integer> a3 = new Node<>(r);

	            if (a1 == null) {
	                a1 = a3;  
	                a2 = a1;
	            } else {
	                a2.setNext(a3);  
	                a2 = a3;  
	            }
	        }

	        return a1;  
	    }
	
	    
	    
	    public static int f2(Node<Integer> a1, int x) {
	        int count = 0;
	        while (a1 != null) {
	            if (a1.getValue().equals(x)) {
	                count++;
	            }
	            a1 = a1.getNext();  
	        }

	        return count;
	    }
	
	
	
    public static void main(String[] args) {
    	  int x = 10;  
          int y = 50;  
          int num = 25;  

          Node<Integer> randomList = f1(x, y);
          System.out.println("Random Linked List: " + randomList);

          int c = f2(randomList, num);
          System.out.println("Occurrences of " + num+ ": " + c);
      }

    }


