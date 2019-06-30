package OverloadingOverRidding;

class Parent 
{ 
    void show() { System.out.println("Parent's show()"); } 
} 
  
// Inherited class 
class Child extends Parent 
{ 
    // This method overrides show() of Parent 
   
    void show() { System.out.println("Child's show()"); } 
} 
  
