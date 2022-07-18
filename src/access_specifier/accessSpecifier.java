// we have to remove the comment mark to run the specific program


package access_specifier;
/*

//1. Class is having Default access modifier



class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 


public class accessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display();
	}
}
*/


//2. using private access specifiers
class Preaccess_Specifier 
{ 
 private void display() 
  { 
      System.out.println("You are using private access specifier"); 
  } 
} 

public class accessSpecifier {

	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		Preaccess_Specifier  obj = new Preaccess_Specifier(); 
      //obj.display();

	}
}








