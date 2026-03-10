/* Functions and Methods : Functions are the block of code used to perform specific tasks and are reusable
  Syntax:
            returntype funcname(){
                //body
                return statement
            }

    Syntax (WITH PARAMETERS):
            returntype funcname(type para1 , type para2){
                //body
                return statement
            }

*/


// //function to print hello world 
// public class code3 {
//         public static void printhelloworld(){              //Funtion declaration and defination
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         return;
//     }
//     public static void main(String args[]){
//         printhelloworld();                             //Function call
//     }
// }


// //Function to caluclate the sum
// import java.util.*;
// public class code3{
//     public static int CaluclateSum(int a,int b){                         //function declaration - formal parameters
//         int sum = a +b;
//         return sum;
//     }
//     public static void main(String args[]){                              
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = CaluclateSum(a,b);                                     ////function call - actual parameters or arguments
//         System.out.println("The sum of the numbers is "+sum);
//     }
// }

// //Swaping of numbers by using call by value 
// public class code3{
//     public static void swap(int a, int b){
//         int temp = a;
//         a = b;
//         b = temp;
//     }
//     public static void main(String args[]){
//         int a = 5;
//         int b = 10;
//         swap(a,b);
//         System.out.println("a = "+a);
//         System.out.println("b = "+b);
//     }
// } //output : a = 5, b = 10   here the values are swapped because call by value only passes the copy of the actual parameter ,it will not pass the original parameter
//   //Note : Java always uses call by value

// //function to find the product of two numbers
// import java.util.*;
// public class code3{
//     public static int product(int a,int b){
//         int product = a*b ;
//         return product;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two numbers :");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("The product of two numbers is "+product(a,b));
//     }
// }

// //Function to caluclate the factorial of number n
// import java.util.*;
// public class code3{
//     public static int fact(int n){
//         int fact = 1;
//         for(int i = 1 ;i <= n; i++){
//             fact *= i;
//         }return fact;
//     }    
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to find the factorial :");
//         int n = sc.nextInt();
//         int fact = fact(n);
//         System.out.println("The factorial of the number is "+fact);
//     }
// }

// //Function to caluclate binomial co efficinet : ncr = n! / r!(n-r)!
// import java.util.*;
// public class code3{
//     //function to calucalte the factorial
//     public static int fact(int n){                                        
//         int fact = 1;
//         for(int i = 1 ;i <= n ;i++){
//             fact = fact*i;
//         }return fact;
//     }
//     //function to caluclate binomial co efficient
//     public static float bincoeff(int n,int r){
//         int fact_n = fact(n);
//         int fact_r = fact(r);
//         int fact_nmr = fact(n-r);
//         float bincoeff = fact_n / (fact_r * fact_nmr);
//         return bincoeff;
//     }
//     //input taking and function call for binomial co efficient
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the values of n and r:");
//         int n = sc.nextInt();
//         int r = sc.nextInt();
//         float bincoeff = bincoeff(n,r);
//         System.out.println("The binomial co efficient is :"+bincoeff);
//     }
// }

// /* Function overloading : Multiple functions with same name but different parameters (NOTE : FUNCTION OVERLOADING not depends on return type , only depends on parameters )*/

// //function overloading using different number of parameters
// public class code3{
//     //function to add two numbers
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     //function to add 3 numbers
//     public static int sum(int a,int b,int c){
//         return a+b+c;
//     }
//     //function call
//     public static void main(String args[]){
//         System.out.println(sum(2,3));
//         System.out.println(sum(2,3,5));
//     }
// }

// //Function overloading using diffrent data types
// public class code3{
//     //function for product of int data type
//     public static int product(int a,int b){
//         return a*b;
//     }
//     //function for product of float data type
//     public static float product(float a,float b){
//         return a*b;
//     }
//     //function call
//     public static void main(String args[]){
//         System.out.println(product(2,3));
//         System.out.println(product(2.5f,3.5f));
//     }
// }

// //function to check whether a number is prime or not
// import java.util.*;
// public class code3{
//     public static boolean Isprime(int n){
//         boolean Isprime = true;
//         for(int i = 2 ; i <= Math.sqrt(n) ;i++){
//             if (n % i == 0){
//                 Isprime = false;
//             }
//         }return Isprime;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to check:");
//         int n = sc.nextInt();
//         boolean Isprime = Isprime(n);
//         if(Isprime == true){
//             System.out.println(n+" is a prime number");
//         }else{
//             System.out.println(n+" is not a prime number");
//         }
//     }
// }

// //Function to print the prime numbers in the range
// import java.util.*;
// public class code3{
//     //to check prime or not 
//     public static boolean Isprime(int n){
//         for(int i = 2 ;i <= Math.sqrt(n) ;i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }return true;
//     }
//     //to call Isprime and to print the number if it is prime
//     public static void primeinrange(int n){
//         for(int i = 2 ;i <= n ;i++){
//             if(Isprime(i)){
//                 System.out.print(i+" ");
//             }
//         }
//     }
//     //input and function call
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the range :");
//         int n = sc.nextInt();
//         primeinrange(n);
//     }
// }

// //Function to convert binary to decimal numbers 
// import java.util.*;
// public class code3{
//     public static int bintodeci(int n){
//         int deci = 0;
//         int pow = 0;
//         while(n > 0){
//             int lastdigit = n % 10;
//             deci = deci + (lastdigit *(int)Math.pow(2,pow));     //Math.pow(a,b) return double . Hence it is type casted to int
//             pow += 1;
//             n = n / 10 ;
//         }return deci;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the binary number :");
//         int n = sc.nextInt();
//         int deci = bintodeci(n);
//         System.out.println("The Decimal of "+ n +" = "+deci);
//     }
// }

// //FUnction to convert decimal to binary (Hint : Divide the decimal number by two till it becomes zero and add the reminders)
// import java.util.*;
// public class code3{
//     public static int decitobin(int n){
//         int binum = 0;
//         int pow = 0;
//         while(n > 0){
//             int rem = n % 2;
//             binum = binum + (rem * (int)Math.pow(10,pow));
//             pow ++;
//             n = n / 2;
//         }return binum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the decimal number :");
//         int n = sc.nextInt();
//         int binum = decitobin(n);
//         System.out.println("The binary of "+ n + " is "+binum);
//      }
// }

/* Scope : places where the variable can be used , In simple words the range of the variable
   Types : Method scope :- A variable created in the method can be used only after its defination and within the method
           Block scope  :- A variable created within the blcok i.e { ------------ } can be used only within the block
 */

// //Function to caluclate the avg of three numbers
// public class code3{
//     public static int avg(int a, int b, int c){
//         int avg = (a+b+c) / 3;
//         System.out.println("The average of three numbers is "+avg);
//         return avg;
//     }
//     public static void main(String args[]){
//         int avg = avg(3,4,5);
//     }
// }

// //function to check whether a number is even or odd
// import java.util.*;
// public class code3{
//     public static boolean Iseven(int n){
//         if(n % 2 == 0){
//             return true;
//         }return false;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter an integer :");
//         int n = sc.nextInt();
//         System.out.println("Is even :"+Iseven(n));
//     }
// }

// //Function to check whether a number is panlinf=drome or not 
// import java.util.*;
// public class code3{
//     //to get reverse of the number
//     public static int rev(int n){
//         int rev = 0;
//         while(n > 0){
//             int last_digit = n % 10;
//             rev = (rev * 10) + last_digit;
//             n = n / 10;
//         }return rev;
//     }
//     //to call rev and to check palindrome or not 
//     public static boolean Ispalin(int n){
//         int rev = rev(n);
//         if(n == rev){
//             return true;
//         }return false;
//     }
//     //function call and inputs
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number :");
//         int n = sc.nextInt();
//         boolean Ispalin = Ispalin(n);
//         if(Ispalin){
//             System.out.println(n+" is a palindrome");
//         }else{
//             System.out.println(n+" is not a palindrome");
//         }
//     }
// }

// //function to find the sum of digits in an integer
// import java.util.*;
// public class code3{
//     public static int digitsum(int n){
//         int digitsum = 0;
//         while(n > 0){
//             int last_digit = n % 10;
//             digitsum += last_digit;
//             n /= 10;
//         }return digitsum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter an integer :");
//         int n = sc.nextInt();
//         int digitsum = digitsum(n);
//         System.out.println("The sum of the digits is "+digitsum);
//     }
// }