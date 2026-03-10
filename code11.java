/*OBJECT ORIENTED PROGRAMMING */

// public class code11{
//     public static void main(String args[]){
//         Pen p1 = new Pen();                  //cretaing an object named p1
//         p1.setcolour("red");                 //accesing the method of class Pen
//         System.out.println(p1.colour);       //accesing Pen p1 colour
//         p1.settip(5);
//         System.out.println(p1.tip);
//         p1.colour = "green";
//         p1.tip = 10;
//         System.out.println(p1.colour);
//         System.out.println(p1.tip);
//     }
// }
// //cretaing a class named Pen
// class Pen{
//     String colour;                       //Attributes
//     int tip;

//     void setcolour(String new_colour){   //Methods 
//         colour = new_colour;
//     }

//     void settip(int new_tip){
//         tip = new_tip;
//     }
// }


// /* Acess modifiers :  private , default , protected , public (NOTE : A CLASS CANNOT BE PRIVATE , PROTECTED IN JAVA AS IT BECOMESS UNUSABLE) */
// public class code11{
//     public static void main(String args[]){
//         Bank b1 = new Bank();
//         b1.name = "Sujan";
//         System.out.println(b1.name);
//         b1.password = "sk";
//         System.out.println(b1.password);       //here password cannot be modified and acessed beacuse the acess modifier is set private
//     }
// }

// class Bank{
//     public String name;             //here the acess modifier is public as name can be acessable to anyone
//     private  String password;       //here the acess modifier is private as password should not be acessble for other .
// }


// Getters and setters : used to acess the methods and attributes when the acess modifier is set private
/* Get : returns the value
   Set : to modify the value

   this : is a keyword used to refer to the curreent object
*/

// public class code11{
//     public static void main(String args[]){
//         Pen p1 = new Pen();
//         p1.setcolour("red");
//         System.out.println(p1.getcolour());         //acessing the atributes using getter
//         p1.settip(5);
//         System.out.println(p1.gettip());
//     }
// }
// class Pen{
//     private String colour;
//     private int tip;

//     String getcolour(){         //getter
//         return this.colour;
//     }

//     int gettip(){              //getter
//         return this.tip;
//     }

//     void setcolour(String colour){    //setter
//         this.colour = colour;
//     }

//     void settip(int tip){             //setter
//         this.tip = tip;
//     }
// }

// Encapsulation : wrapping up of data and methods under a single unit. it also includes data hiders(acesss modifiers)

/* Constructor   : is a special method which is invoked automatically at the time of object creation.

    Constructors have the same name as class or structure.

    Constructors don’t have a return type. (Not even void)

    Constructors are only called once, at object creation.

    Memory allocation happens when constructor is called. 

    Types : 1. Non parameterised :- no parameters passed within the constructor
            2. Parameterised :- parameter is passed within the constructor
            3. Copy constructor :-
*/

// //manually calling the constructor 
// public class code11{
//     public static void main(String args[]){
//         Student s1 = new Student("Sujan",125);
//     }
// }
// class Student{
//     String name;
//     int roll_no;

//     //maually calling constructor
//     Student(String name,int roll_no){
//         this.name = name;
//         this.roll_no = roll_no;
//         System.out.println("COnstructor called manually");
//     }
// }


// //constructor overloading :
// public class code11{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         Student s2 = new Student("Sujan");
//         Student s3 = new Student("Sujan", 18);
//     }
// }
// class Student{
//     String name;
//     int age;

//     //non paramterised constructor
//     Student(){
//         System.out.println("Constructor1 is called");
//     }
//     //paramiterised constuctors
//     Student(String name){
//         this.name = name;
//         System.out.println("Constructor2 is called");
//     }

//     Student(String name,int age){
//         this.name = name;
//         this.age = age;
//         System.out.println("Constructor3 is called");
//   }
// }


// //Copy constructor : copies the properties of object1 into object2
// public class code11{
//     public static void main(String args[]){
//         Student s1 = new Student("Sujan", 18, "SK2006");
//         s1.display();
//         Student s2 = new Student(s1);
//         s2.password = "xyz";
//         s2.display();
//     }
// }
// class Student{
//     String name;
//     int age;
//     String password;
//     //copy constructor : here copy constructor copys the attributes of student s1 to s2 except the password
//     Student(Student s1){         
//         this.name = s1.name;
//         this.age  = s1.age;
//     }

//     Student(String name, int age, String password){
//         this.name = name;
//         this.age = age;
//         this.password = password;
//     }

//     void display(){
//         System.out.println(name + " " + age + " " + password);
//     }
// }


// //shallow and deep copy constructor
// public class code11{
//     public static void main(String args[]){
//         Student s1 = new Student("Sujan", 18);
//         s1.marks[0] = 100;
//         s1.marks[1] = 99;
//         s1.marks[2] = 98;
//         Student s2 = new Student(s1);           //copy constructor called 
//         s1.marks[0] = 95;                       //marks of s1 gets updated
//         for(int i = 0; i < 3; i++){             // o/p: marks of s2 = intial marks of s1 as deep copy constructor is called, even after updating the marks of s1
//             System.out.println(s2.marks[i]);         
//         }
//     }
// }
// class Student{
//     String name;
//     int age;
//     int marks[];
//     // // shallow copy constructor : which copies the reference
//     // Student(Student s1){         
//     //     this.name = s1.name;
//     //     this.age  = s1.age;
//     //     this.marks =s1.marks;
//     // }
//     //deep copy constructor : which copies the actual value
//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.age = s1.age;
//         for(int i = 0; i < marks.length; i++){
//             this.marks[i] = s1.marks[i];
//         }
//     }

//     Student(String name, int age){
//         marks = new int[3];
//         this.name = name;
//         this.age = age;
//     }
// }

//Destructors : In java Garbage collectors by default do the works of destruction.

//inheritence : when the attributes and methods of base class is passed on to the derived class
// public class code11{
//     public static void main(String args[]){
//       Dog d1 = new Dog();
//       d1.barks();          //derived class method
//       d1.eat();           //inherited base class method
//       d1.breadth();       //inherited base class method
//     }
// }
// //Base class or parent class
// class Animal{
//    String colour;
//    void eat(){
//       System.out.println("Eats");
//    }
//    void breadth(){
//       System.out.println("Breadths");
//    }
// }
// //Derived class or child class
// class Dog extends Animal{
//    void barks(){
//       System.out.println("Barks");
//    }
// }


// //multi level inheritence
// public class code11{
//     public static void main(String args[]){
//       Dog d1 = new Dog();
//       d1.barks();         //derived class method
//       d1.legs();          //inherited base class method
//       d1.eat();           //inherited base class method
//       d1.breadth();       //inherited base class method
//     }
// }
// class Animal{
//    String colour;
//    void eat(){
//       System.out.println("Eats");
//    }
//    void breadth(){
//       System.out.println("Breadths");
//    }
// }
// class Mammals extends Animal{
//    void legs(){
//       System.out.println("legs");
//    }
// }
// class Dog extends Mammals{
//    void barks(){
//       System.out.println("Barks");
//    }
// }


// //Hierarchical inheritence
// public class code11{
//    public static void main(String args[]){
//       //creaating objects of class Dog , inheriting methods from class Animal
//       Dog d1 = new Dog();
//       d1.barks();
//       d1.eat();
//       //creaating objects of class Fish , inheriting methods from class Animal
//       Fish f1 = new Fish();
//       f1.swim();
//       f1.eat();
//       //creaating objects of class Bird , inheriting methods from class Animal
//       Bird b1 = new Bird();
//       b1.fly();
//       b1.eat();
//    }
// }
// //Base class or parent class
// class Animal{
//    String colour;
//    void eat(){
//       System.out.println("Eats");
//    }
// }
// //child class 1
// class Dog extends Animal{
//    void barks(){
//       System.out.println("Barks");
//    }
// }
// //child class 2
// class Fish extends Animal{
//    void swim(){
//       System.out.println("Swims");
//    }
// }
// //child class 3
// class Bird extends Animal{
//    void fly(){
//       System.out.println("Flys");
//    }
// }


// //Hybrid inheritence
// public class code11{
//    public static void main(String args[]){
//       //creaating objects of class Fish , inheriting methods from class Animal
//       Fish f1 = new Fish();
//       f1.swim();
//       f1.eat();
//       //creaating objects of class Shark , inheriting methods from class Fish
//       Shark s1 = new Shark();
//       s1.greet();
//       s1.swim();
//       s1.eat();     
//       //creaating objects of class Bird , inheriting methods from class Animal
//       Bird b1 = new Bird();
//       b1.fly();
//       b1.eat();
//       //creaating objects of class Parrot , inheriting methods from class Bird
//       Parrot p1 = new Parrot();
//       p1.greet();
//       p1.fly();
//       p1.eat();
//    }
// }
// //Base class or parent class
// class Animal{
//    String colour;
//    void eat(){
//       System.out.println("Eats");
//    }
// }
// //derived class of Animal
// class Fish extends Animal{
//    void swim(){
//       System.out.println("Swims");
//    }
// }
// //derived class of Fish
// class Shark extends Fish{
//    void greet(){
//       System.out.println("Shark here");
//    }
// }
// //Derived class of Animal
// class Bird extends Animal{
//    void fly(){
//       System.out.println("Flys");
//    }
// }
// //Derived class of Bird
// class Parrot extends Bird{
//    void greet(){
//       System.out.println("Parrot here");
//    }
// }

//Polymorphism : same work done in multiple forms
/*
Types : Compile time polymorphism (Static)
        > Mehod overloading

        Run time polymorphism (Dynamic)
        > Method overriding
*/

// //Method overloading (Compile time polymorphism) : Multiple functions with same name but different parameters
// public class code11{
//    public static void main(String args[]){
//       Caluclator calc = new Caluclator();
//       System.out.println(calc.sum(5,5));
//       System.out.println(calc.sum(5,5,5));
//       System.out.println(calc.sum(3.5f,2.5f));
//    }
// }
// class Caluclator{
//    int sum(int a , int b){
//       return a+b;
//    }
//    int sum(int a , int b, int c){
//       return a+b+c;
//    }
//    float sum(float a,float b){
//       return a+b;
//    }
// }

// //Method overriding (Run time Polymorphism):Parent and child class contain the same function with different defination
// public class code11{
//    public static void main(String args[]){
//       Deer d1 = new Deer();
//       d1.eat();
//    }
// }
// class Animal{
//    void eat(){
//       System.out.println("Eats anything");
//    }
// }
// class Deer extends Animal{
//    void eat(){
//       System.out.println("Eats grass");
//    }
// }


//Pacakges in Java : is a group of similar classes , interfaces and sub packages.
/*
Types : 1.In built packages      : ex - java.util.*
        2. User defined packages 
*/


//Abstraction : Hiding all unnecessary details and showing only the important parts to the user
/*
1.Abstract classes :
   >> cannot create instances (object) of the abstract class
   >> can have abstraction abstract methods 
   >> can have constructors
2.interfaces.
*/

// //abstarct class 
// public class code11{
//    public static void main(String args[]){
//       Horse h = new Horse();
//       h.eat();
//       h.walk();
//       System.out.println(h.colour);   //returns black as it call the parent class constructor first by default
//       Chiken c = new Chiken();
//       c.eat();
//       c.walk();
//       // Animal a = new Animal();   //returs error as objects cannot be created for abstract class
//    }
// }
// abstract class Animal{         //using the keyword abstract to create abstract class
//    String colour;
//    Animal(){                   //crating the parent class constructor
//       colour = "Black";
//    }
//    void eat(){
//       System.out.println("Animal eats");
//    }
//    abstract void walk();      //abstract method : is a method which ha sthe basic idea but not the implementation        
// }
// class Horse extends Animal{
//    void changecolour(){
//       colour = "Dark brown";
//    }
//    void walk(){                               //implementation of inherited abstract method 
//       System.out.println("Walks on 4 legs");
//    }
// }
// class Chiken extends Animal{
//    void changecolour(){
//       colour = "Yellow";
//    }
//    void walk(){                               //implementation of inherited abstract method
//       System.out.println("Walks on 2 legs");
//    }
// }


//interface : is a blue print of class
/*
>> keyword : implements
>> all methods are public , abstract and without implementation
>> Variable in the interface are final,public and static
application : implementation of multiple inheritence
              total abstraction
*/

// //Total abstarction using inteface
// public class code11{
//    public static void main(String args[]){
//       King k = new King();
//       k.move();
//       Queen q = new Queen();
//       q.move();
//    }
// }
// interface Chessplayer{     //creation of interface
//    void move();            //abstarct method (no implementation)
// }
// class King implements Chessplayer{             //class King inherits from interface Chessplayer using the keyword implements
//    public void move(){                         //implementation of abstarct method (here public is used to avoid default function)
//       System.out.println("up,down,right,left,diagonal-by one step");  
//    }
// }
// class Queen implements Chessplayer{
//    public void move(){
//       System.out.println("up,down,right,left,diagonal-all 4 directions");
//    }
// }

// //multiple inheritence using interface
// public class code11{
//    public static void main(String args[]){
//       Bear b = new Bear();
//       b.eat_grass();
//       b.eat_meat();
//    }
// }
// interface Herbivour{
//    void eat_grass();
// }
// interface Carnivour{
//    void eat_meat();
// }
// class Bear implements Herbivour,Carnivour{       //class Bear inheriting from both the interfaces - multiple inheritence
//    public void eat_grass(){
//       System.out.println("Eats grass");
//    }
//    public void eat_meat(){
//       System.out.println("Eats meat");
//    }
// }


// //Static keyword : is used to share the same variable or method of the given class
// public class code11{
//    public static void main(String args[]){
//       Student s1 = new Student();
//       s1.schoolname = "BMS";           
//       Student s2 = new Student();
//       System.out.println(s2.schoolname);   //even if the schoolname is updated for object s1, by default it gets updated to all the objects
//    }
// }
// class Student{
//    String name;
//    int roll_no;

//    static String schoolname; //static variable created

//    void set(String name){
//       this.name = name;
//    }
//    String get(){
//       return this.name;
//    }
// }


//super keyword : used to refer the immediate parent class object
/*
>> to access parent properties
>> to access parent functions
>> to access parent constructors
*/

// public class code11{
//    public static void main(String args[]){
//       Horse h = new Horse();
//    }
// }
// class Animal{
//    Animal(){
//       System.out.println("Animal contructor is called");
//    }
// }
// class Horse extends Animal{
//    Horse(){
//       super(); //super keyword calls the parent class constructor
//       System.out.println("Horse constructor is callled");
//    }
// }


/*NOTES:
>> We can use parent reference to create child objects (viceversa is not allowed)
   eg :- class Parent{}
         class Child extends Parent{}
         Parent p = new Parent(); //Parent class object
         Child c = new Child();   //Child classs object
         Parent p = new Child();  //Child class object using Parent class reference (Here object p can acess only Parent attributes and methods)

>> A Class cannot be private or protected (Access modifiers) as it becomes unsuable(menaing no inheritence, no access to variables and methods)
*/