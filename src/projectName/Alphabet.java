package projectName;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);	
		int f=3;
		while(f<=3) {
			System.out.print("Please Enter Length of your First_Name : ");
			int l=sc.nextInt();
			if(l<10) {
				sc.nextLine();
				
				System.out.println("Please Enter your name");
					
					String name=sc.next().toUpperCase();
					String [] a=name.split("", 0);
				
				System.out.println(Arrays.toString(a));
				
				for(int i=0;i<a.length;i++) {
					switch (a[i]) {
					case "A":{ A();
					break;}
					case "B":{ B();
					 break;}
					case "C":{ C();
					 break;}
					case "D":{ D();
					 break;}
					case "E":{ E();
					 break;}
					case "F":{ F();
					 break;}
					case "G":{ G();
					 break;}
					case "H":{ H();
					 break;}
					case "I":{ I();
					 break;}
					case "J":{ J();
					 break;}
					case "K":{ K();
					 break;}
					case "L":{ L();
					 break;}
					case "M":{ M();
					 break;}
					case "N":{ N();
					 break;}
					case "O":{ O();
					 break;}
					case "P":{ P();
					 break;}
					case "Q":{ Q();
					 break;}
					case "R":{ R();
					 break;}
					case "S":{ S();
					 break;}
					case "T":{ T();
					 break;}
					case "U":{ U();
					 break;}
					case "V":{ V();
					 break;}
					case "W":{ W();
					 break;}
					case "X":{ X();
					 break;}
					case "Y":{ Y();
					 break;}
					case "Z":{ Z();
					 break;
					 }
					}
				}
				System.exit(0);
			}
			else {
				System.out.println("Invalid Length!! Please Enter Length between 1-10 ");
			}
			
		}
	}
//	MAIN METHOD END
	
//	ALPHABET PATTERNS
		
		public static String A() {
			for(int i=0;i<11;i++) {
		    	   for(int j=0;j<10;j++) {
		    		   if(i==1) {
		    			  if(j==0||j==9) {
		    				  System.out.print("  ");
		    			  }
		    			  else {
		    				  System.out.print(" #");
		    			  }
		    			 }
		    		   if(i==2||i==6||i==7) {
		    			   System.out.print(" #");
		    		   }
		    		   if(i==3||i==4||i==5||i==8||i==9||i==10) {
		    			   if(j==0||j==1||j==8||j==9) {
		    				   System.out.print(" #");
		    			   }
		    			   else {
		    				   System.out.print("  ");
		    			   }
		    		   }  			   
		    	   }
		    	   System.out.println();
		       }
			return null;
		}
		public static String B() {
			for(int i=0;i<11;i++) {
		    	   for(int j=0;j<7;j++) {
		    		   if(i==1 ||i==2||i==5||i==6||i==9||i==10) {
		 	    		  if(j==7) {
		 	    			  System.out.print("  ");
		 	    		  }
		    			   System.out.print(" #");
		 	    	  }
		    		   if(i==3||i==4||i==7||i==8) {
		    			   if(j==0||j==1||j==5||j==6) {
		    				   System.out.print("  #");
		    			   }
		    			   else {
		    				   System.out.print(" ");
		    			   }
		    		   }  			   
		    	   }
		    	   System.out.println();
		       }
			return null;
		}
		public static String C() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==10) {
						if(j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==2||i==9) {
						System.out.print(" #");
					}
					if(i==3||i==4||i==5||i==6||i==7||i==8) {
						if(j==0||j==1) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					
				}
				System.out.println();
			}
			
			return null;}
		public static String D() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==10) {
						if(j==0||j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==2||i==9) {
						System.out.print(" #");
					}
					if(i==3||i==4||i==5||i==6||i==7||i==8) {
						if(j==1||j==2||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					
				}
				System.out.println();
			}
			return null;
		}
		public static String E() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==10||i==5||i==6) {
						if(j==0||j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==2||i==9) {
						System.out.print(" #");
					}
					if(i==3||i==4||i==7||i==8) {
						if(j==0||j==1) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					
				}
				System.out.println();
			}
			return null;}
		public static String F() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==5||i==6) {
						if(j==0||j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==2) {
						System.out.print(" #");
					}
					if(i==3||i==4||i==7||i==8||i==9||i==10) {
						if(j==0||j==1) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					
				}
				System.out.println();
			}
			return null;}
		public static String G() {
			for(int i=0;i<11;i++) {
		    	   for(int j=0;j<10;j++) {
		    		   if(i==1 ||i==2||i==9||i==10) {
		 	    		  System.out.print(" #");
		    		   }
		 	    	
		 	    		  if(i==3||i==4) {
		 	    			  if(j==0||j==1) {
		 	    				 System.out.print(" #");
		 	    			  }
		 	    			  else {
		 	    				 System.out.print("  ");
		 	    			  }
		 	    		  }
		 	    		  if(i==5||i==6) {
		 	    			  if(j==0||j==1||j==5||j==6||j==7||j==8||j==9) {
		 	    				  System.out.print(" #");
		 	    			  }
		 	    			  else {
		 	    				 System.out.print("  ");
		 	    			  }
		 	    		  }
		 	    		 if(i==7||i==8) {
		    				  if(j==0||j==1||j==8||j==9) {
		    					 System.out.print(" #");
		    				  }
		    				  else {
		    					 System.out.print("  ");
		    				  }
		    			  }
		    	   }
		    	   System.out.println();
		       }
			return null;}
		public static String H() {
			for(int i=0;i<11;i++) {
		    	   for(int j=0;j<10;j++) {
		    		   
		    		   if(i==1||i==2||i==3||i==4||i==7||i==8||i==9||i==10) {
		    			   if(j==0||j==1||j==8||j==9) {
		    				   System.out.print(" #");
		    			   }
		    			   else {
		    				   System.out.print("  ");
		    			   }
		    		   }
		    		   if(i==5||i==6) {
		    			   System.out.print(" #");
		    		   }
		    	   }
		    	   System.out.println();
		       }
			return null;}
		public static String I() {
			for(int i=0;i<11;i++) {
		    	   for(int j=0;j<10;j++) {
		    		   
		    		   if(i==1||i==2||i==9||i==10) {
		    			System.out.print(" #");
		    		   }
		    		   if(i==3||i==4||i==5||i==6||i==7||i==8) {
		    			   if(j==4||j==5) {
		    				   System.out.print(" #");
		    			   }
		    			   else {
		    				   System.out.print("  ");
		    			   }
		    		   }
		    	   }
		    	   System.out.println();
		       }
			return null;}
		public static String J() {
			for(int i=0;i<11;i++) {
		    	   for(int j=0;j<10;j++) {
		    		   
		    		   if(i==1||i==2) {
		    			System.out.print(" #");
		    		   }
		    		   if(i==3||i==4||i==5||i==6) {
		    			   if(j==4||j==5) {
		    				   System.out.print(" #");
		    			   }
		    			   else {
		    				   System.out.print("  ");
		    			   }
		    		   }
		    		   if(i==7||i==8) {
		    			  if(j==1||j==2||j==4||j==5) {
		    				  System.out.print(" #");
		    			   }
		    			   else {
		    				   System.out.print("  ");
		    			   }   
		    		   }
		    		   if(i==9) {
		    			   if(j==1||j==2||j==3||j==4||j==5) {
		    				   System.out.print(" #");
		    			   }
		    			   else {
		    				   System.out.print("  ");
		    			   }
		    		   }
		    		   if(i==10) {
		    			   if(j==2||j==3||j==4) {
		    				   System.out.print(" #");
		    			   }
		    			   else {
		    				   System.out.print("  ");
		    			   }
		    		   }
		    		   
		    	   }
		    	   System.out.println();
		       }
			return null;}
		public static String K() {
			for(int i=0;i<11;i++) {
		    	   for(int j=0;j<10;j++) {
		    		 if(i==1) {
		    			 if(j==0||j==1||j==2||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==2) {
		    			 if(j==1||j==2||j==7||j==8) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==3) {
		    			 if(j==1||j==2||j==6||j==7) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==4) {
		    			 if(j==1||j==2||j==5||j==6) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==5) {
		    			 if(j==1||j==2||j==3||j==4||j==5) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==6) {
		    			 if(j==1||j==2||j==3||j==4||j==5) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==7) {
		    			 if(j==1||j==2||j==5||j==6) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==8) {
		    			 if(j==1||j==2||j==6||j==7) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==9) {
		    			 if(j==1||j==2||j==7||j==8) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==10) {
		    			 if(j==0||j==1||j==2||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		
		    	   }
		    	   System.out.println();
		       }
			return null;}
		public static String L() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==2||i==3||i==4||i==5||i==6||i==7||i==8) {
						if(j==0||j==1) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}	
					}
					if(i==9||i==10) {
						System.out.print(" #");
					}
				}
				System.out.println();
			}
			return null;}
		public static String M() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==7||i==8||i==9||i==10) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {System.out.print("  ");
						}
					}
						if(i==2) {
							if(j==0||j==2||j==7||j==9) {
								System.out.print(" #");
							}
							else {System.out.print("  ");
							}
						}
						if(i==3) {
							if(j==0||j==1||j==3||j==6||j==8||j==9) {
								System.out.print(" #");
							}
							else {
								System.out.print("  ");
							}
						}
						if(i==4) {
							if(j==0||j==1||j==2||j==4||j==5||j==7||j==8||j==9) {
								System.out.print(" #");
							}
							else {
								System.out.print("  ");
							}
						}
						if(i==5) {
							if(j==0||j==1||j==3||j==6||j==8||j==9) {
								System.out.print(" #");
							}
							else {System.out.print("  ");
							}
						}
						if(i==6) {
							if(j==0||j==1||j==4||j==5||j==8||j==9) {
								System.out.print(" #");
							}
							else {System.out.print("  ");
							}
						}
						
					}
				System.out.println("  ");
				}
			return null;
			}
		public static String N() {
			for(int i=0;i<11;i++) {
		    	   for(int j=0;j<10;j++) {
		    		 if(i==1) {
		    			 if(j==0||j==1||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==2) {
		    			 if(j==0||j==2||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==3) {
		    			 if(j==0||j==1||j==3||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==4) {
		    			 if(j==0||j==1||j==2||j==4||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==5) {
		    			 if(j==0||j==1||j==3||j==5||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==6) {
		    			 if(j==0||j==1||j==4||j==6||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==7) {
		    			 if(j==0||j==1||j==5||j==7||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==8) {
		    			 if(j==0||j==1||j==6||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==9) {
		    			 if(j==0||j==1||j==7||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    		 if(i==10) {
		    			 if(j==0||j==1||j==8||j==9) {
		    				 System.out.print(" #");
		    			 }
		    			 else {
		    				 System.out.print("  ");
		    			 }
		    		 }
		    	   }
		    	   System.out.println();
		       }
			return null;
		}
		public static String O() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==10) {
						if(j==2||j==3||j==4||j==5||j==6||j==7) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==2||i==9) {
						if(j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8) {
						System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==3||i==8) {
						if(j==0||j==1||j==2||j==7||j==8||j==9){
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						} 
					}
					if(i==4||i==5||i==6||i==7) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					
				}
				System.out.println();
			}
			return null;}
		public static String P() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==6) {
						if(j==0||j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==2||i==5) {
						if(j==0||j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==3||i==4) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==7||i==8||i==9||i==10) {
						if(j==0||j==1) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}

			return null;}
		public static String Q() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==8) {
						if(j==2||j==3||j==4||j==5||j==6||j==7) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==2||i==7) {
						if(j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8) {
						System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==3||i==6) {
						if(j==0||j==1||j==2||j==7||j==8||j==9){
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						} 
					}
					if(i==4||i==5) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==9||i==10) {
						if(j==4||j==5||j==6||j==7||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					
				}
				System.out.println();
			}
			return null;}
		public static String R() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==6) {
						if(j==0||j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==2||i==5) {
						if(j==0||j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==3||i==4) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==7) {
						if(j==0||j==1||j==3||j==4||j==5) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==8) {
						if(j==0||j==1||j==4||j==5||j==6) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==9) {
						if(j==0||j==1||j==5||j==6||j==7) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==10) {
						if(j==0||j==1||j==7||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
			return null;
			}
		public static String S() {
			for(int i=0;i<11;i++) {
		    	   for(int j=0;j<10;j++) {
		    		   if(i==1 ||i==2||i==5||i==6||i==9||i==10) {
		 	    		  System.out.print(" #");
		    		   }
		 	    	
		 	    		  if(i==3||i==4) {
		 	    			  if(j==0||j==1) {
		 	    				 System.out.print(" #");
		 	    			  }
		 	    			  else {
		 	    				 System.out.print("  ");
		 	    			  }
		 	    			  
		 	    		  }
		 	    		 if(i==7||i==8) {
		    				  if(j==8||j==9) {
		    					 System.out.print(" #");
		    				  }
		    				  else {
		    					 System.out.print("  ");
		    				  }
		    			  }
		    	   }
		    	   System.out.println();
		       }
			return null;
			 	
		}
		public static String T() {
			for(int i=0;i<11;i++) {
		    	   for(int j=0;j<10;j++) {
		    		   
		    		   if(i==1||i==2) {
		    			System.out.print(" #");
		    		   }
		    		   if(i==3||i==4||i==5||i==6||i==7||i==8||i==9||i==10) {
		    			   if(j==4||j==5) {
		    				   System.out.print(" #");
		    			   }
		    			   else {
		    				   System.out.print("  ");
		    			   }
		    		   }
		    	   }
		    	   System.out.println();
		       }
			return null;}
		public static String U() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==2||i==3||i==4||i==5||i==6||i==7) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==8||i==9) {
						if(j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==10) {
						if(j==4||j==5) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
			return null;}
		public static String V() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1|i==2||i==3||i==4||i==5||i==6||i==7) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==8) {
						if(j==1||j==2||j==7||j==8) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==9) {
						if(j==2||j==3||j==6||j==7) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==10) {
						if(j==4||j==5) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
			return null;}
		public static String W() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==2||i==3||i==4) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==5) {
						if(j==0||j==1||j==4||j==5||j==8||j==9) {
							System.out.print(" #");
						}
						else {System.out.print("  ");
						}
					}
					if(i==6) {
						if(j==0||j==1||j==3||j==6||j==8||j==9) {
							System.out.print(" #");
						}
						else {System.out.print("  ");
						}
					}
					if(i==7) {
						if(j==0||j==1||j==2||j==4||j==5||j==7||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==8) {
						if(j==0||j==1||j==3||j==6||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==9) {
						if(j==0||j==2||j==7||j==9) {
							System.out.print(" #");
						}
						else {System.out.print("  ");
						}
					}
					if(i==10) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {System.out.print("  ");
						}
					}
					
				}
				System.out.println();
			}
			return null;}
		public static String X() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==2) {
						if(j==1||j==2||j==7||j==8) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==3) {
						if(j==2||j==3||j==6||j==7) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==4) {
						if(j==3||j==4||j==5||j==4||j==6) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==5) {
						if(j==4||j==5||j==4||j==5) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==6) {
						if(j==4||j==5||j==4||j==5) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==7) {
						if(j==3||j==4||j==5||j==6) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==8) {
						if(j==2||j==3||j==6||j==7) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==9) {
						if(j==1||j==2||j==7||j==8) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==10) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
			return null;}
		public static String Y() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1) {
						if(j==0||j==1||j==8||j==9) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==2) {
						if(j==1||j==2||j==7||j==8) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==3) {
						if(j==2||j==3||j==6||j==7) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==4) {
						if(j==3||j==4||j==5||j==4||j==6) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==5) {
						if(j==4||j==5||j==4||j==5) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==6||i==7||i==8||i==9||i==10) {
						if(j==4||j==5||j==4||j==5) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
				}
				System.out.println();
			}
			return null;}
		public static String Z() {
			for(int i=0;i<11;i++) {
				for(int j=0;j<10;j++) {
					if(i==1||i==2||i==10) {
						System.out.print(" #");
					}
					if(i==3) {
						if(j==7||j==8) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==4) {
						if(j==6||j==7) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==5) {
						if(j==5||j==6) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==6) {
						if(j==4||j==5) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==7) {
						if(j==3||j==4) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==8) {
						if(j==2||j==3) {
							System.out.print(" #");
						}
						else {
							System.out.print("  ");
						}
					}
					if(i==9) {
						if(j==0) {
							System.out.print("  ");
						}
						else {
							System.out.print(" #");
						}
					}
				}
				System.out.println();
			}
			return null;}
}
