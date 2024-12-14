package Explorer;
		import java.util.Scanner; 
		public class Main {
			public static Scanner reader = new Scanner(System.in); 
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
			
			    
			    
			    
			    public static void q2(Node<Integer> a1) {
			        
			        while (a1 != null) {
			        	System.out.println(a1.getValue());
			            a1 = a1.getNext();  
			        }

			    }
			    
			    
		        public static String f3(Node<Integer> a1) {
			        
			        if(a1 == null) {
			        	return "";
			        }
			        System.out.println(a1.getValue());
			        a1 = a1.getNext();  
			        return f3(a1);

			    }
		        
		        public static void f4(Node<Integer> a1) {
			        
			        if(a1 != null) {
			        	f4(a1.getNext());
			        	System.out.println(a1.getValue());
			        }

			    }
		        
		        
		        
		        public static Node<Integer> q3() {
		        	 System.out.println("Please enter a number: ");  
					 int a= reader.nextInt();
					 Node<Integer> a1 = new Node<Integer>(a);
		        	 if(a1.getValue() ==-1) {
		        		 return null;
		        	 }
		        	 
		        	 System.out.println("Please enter a number: ");  
		        	 int b = reader.nextInt(); 
		        	 Node<Integer> a2 = new Node<Integer>(b);
		             Node<Integer> a3=a2;
		             a2=a1;
		            		 
			         while(a3.getValue() != -1) {
			             a2.setNext(a3); 
			             a2=a3;
			             System.out.println("Please enter a number: ");  
			             b = reader.nextInt(); 
			             a3 = new Node<Integer>(b);
			        }
			        return a1;

			    }
		        
			
		        
		        public static void q4(Node<Integer> a1) {
			        while (a1 != null) {
			            if (a1.getValue()%2==0) {
			            	System.out.println(a1.getValue());
			            }
			            a1 = a1.getNext();  
			        }
			    }
		        
		        
		        
		        
		        
		        public static boolean f5(Node<Integer> a1, int x) {
			        
			        if(a1 != null && a1.getValue()!=x) {
			            return false;
			          
			        }
			        if(a1.getValue()==x) {
			        	return true;
			        }

			        return f5(a1.getNext(),x);
			    }
			
		        
		        public static Node<Integer> q6(Node<Integer> a1, int x){
		        	 Node<Integer> a2 = a1;
		        	 Node<Integer> a3=a2.getNext();
		        	 
		        	   while (a3.getValue() != null) {
		        	      if(a3.getValue().equals(x)){
		        	         a2.setNext(a3.getNext());
		        	         return a1;
		        	         }
		        	      else{
		        	    	  a2.setNext(a3); 
		     	              a2=a3;
		        	          a3=a3.getNext();
		        	      }
		        	   }
		        	   return a1;
		        	  } 
		        
		        
		        
		        public static Node<Integer> q7(Node<Integer> a1, int x){
		     	   Node<Integer> a2 = a1;
		     	   Node<Integer> a3=a2.getNext();
		     	   int i=1;
		     	   if(x==1) {
		     		   return a3;
		     	   }
		     	   while (a3.getValue() != null) {
		     	      if(i==x-1){
		     	         a2.setNext(a3.getNext());
		     	         return a1;
		     	         }
		     	      else{
		     	    	 a2.setNext(a3); 
			             a2=a3;
		   	             a3=a3.getNext();
		     	      }
		     	      i++;
		     	   }
		     	    return a1;
		     	  }
		        	

		        public static boolean q8(Node<Integer> a1, Node<Integer> b1,Node<Integer> c1){
		           if(a1==null) {
		        	   return true;
		           }
		           if(b1==null) {
		        	   return false;
		           }
		          
		      	   if(!b1.getValue().equals(a1.getValue())) {
		      		   return q8(a1,b1.getNext(),c1);
		      	   }
		      	
		      	   //if(b1.getValue().equals(a1.getValue())) {
		    	   return q8(a1.getNext(),c1,c1);
		    	   //}
		        }
		        
		        
		        
		        public static void q9(Node<Integer> a1, Node<Integer> b1){
		        	Node<Integer> b2 = b1;
		        	while(a1 != null) {
		        		if(b2.getValue().equals(a1.getValue())) {
		        			System.out.println(a1.getValue());
		        			b2=b2.getNext();
		        		}
		        		else {
		        			b2=b2.getNext();
		        		}
		        		if(b2==null) {
		              	   b2=b1;
		              	   a1=a1.getNext();
		              	   }
		        	}
		        	
		         }
		        
		        public static Node<Integer> q10(Node<Integer> a1, Node<Integer> b1){
		        	Node<Integer> b2 = b1;
		        	
		        	while(a1 != null) {
		        		if(b2.getValue().equals(a1.getValue())) {
		        			
		        			b2=b2.getNext();
		        		}
		        		else {
		        			b2=b2.getNext();
		        		}
		        		if(b2==null) {
		              	   b2=b1;
		              	   a1=a1.getNext();
		              	   }
		        	}
		        	return c1;
		        	
		         }
		         	
		        
		        public static Node<Integer> q11(Node<Integer> a1, Node<Integer> b1){
		        	Node<Integer> b2 = b1;
		        	Node<Integer> a2 = a1;
		       	    Node<Integer> a3=a2.getNext();
		        	while(a3 != null) {
		        		if(b2.getValue().equals(a3.getValue())) {
		        			a2.setNext(a3.getNext());
		        			a2=a3.getNext();
		        			a3=a3.getNext().getNext();
		        			b2=b2.getNext();
		        		}
		        		else {
		        			a2=a3;
		        			a3=a3.getNext();
		        			b2=b2.getNext();
		        		}
		        		if(b2==null) {
		              	   b2=b1;
		              	   a2=a2.getNext();
		              	   }
		        	}
		        	return a1;
		        	
		         }
			
			
		    public static void main(String[] args) {
		    	
		    	  int x = 10;  
		          int y = 50;  
		          int num = 25;  
		          
		          Node<Integer> a1 = new Node<Integer>(6);
		          Node<Integer> a2 = new Node<Integer>(5);
		          a1.setNext(a2);
		          
		          Node<Integer> b1 = new Node<Integer>(6);
		          Node<Integer> b2 = new Node<Integer>(7);
		          b1.setNext(b2);

		          Node<Integer> randomList = f1(x, y);
		          System.out.println("Random Linked List: " + randomList);

		          Node<Integer> randomList2 = f1(x, y);
		          System.out.println("Random Linked List: " + randomList2);
		          
		          int c = f2(randomList, num);
		          System.out.println("Occurrences of " + num+ ": " + c);
		          
		          System.out.println(f5(randomList,26));
		          
		         System.out.println(q11(a1,b1));
		         //q9(a1,b1);
		      }

		    }
