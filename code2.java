
/* Inputs in java using the class "Scanner"
    Syntax:
        * import java.util.*;
        * Scanner sc=new Scanner(System.in);
*/
        
import java.util.*;
public class code2 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        // String input=sc.next();                    //whre sc is an object and next() is a function to take input that is stored in the variable named input
        // System.out.println(input);                 //sc.next():stores the input value without space  i.e if input is "Sujan Shettigar" it will store only "Sujan"

        // String name=sc.nextLine();                 //sc.nextLine():stores the input value with space  i.e if input is "Sujan Shettigar" it will store "Sujan Shettigar" 
        // System.out.println(name);

        // int x=sc.nextInt();                        //sc.nextInt():stores the input value in integer format
        // System.out.println(x);

        // float y=sc.nextFloat();                    //sc.nextFloat():stores the input value in float format
        // System.out.println(y);

        //sum of two numbers by taking the inputs from the user
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of two numbers is:"+sum);

        //product of two numbers by taking the iputs from the user
        int c=sc.nextInt();
        int d=sc.nextInt();
        int product=c*d;
        System.out.println("The product of two numbers is :"+product);

        //area of a circle by taking the inputs from the user
        float rad =sc.nextFloat();
        float area = 3.14f*rad*rad;                                    //3.14f is used to represent the float value of 3.14 , by default 3.14 is considered as double
        System.out.println("The area of teh circle is:"+area);

        /*Conditional statement : if ,else if ,else, switch */

        //checking the eligibility to vote or not by taking the age input from the user
        System.out.println("Enter your age:");
        int age =sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

        //Greatest of three numbers by taking the inputs from the user
        System.out.println("Enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x > y && x > z){
            System.out.println(x+" is the largest of three numbers you entered");
        }else if(y > z){
            System.out.println(y+" is the largest of three numbers you entered");
        }else{
            System.out.println(z+" is the largest of three numbers you entered");
        }


        //check whether a number is odd or even by taking the input from the user
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number");
        }
        
        //Switch case statement application
        System.out.println("Enter the day number:");
        int day = sc.nextInt();
        switch(day){
            case 1: System.out.println("Sunday");
                    break;
            case 2: System.out.println("Monday");
                    break;
            case 3: System.out.println("Tuesday");
                    break;
            case 4: System.out.println("Wednesday");
                    break;
            case 5: System.out.println("Thursday");
                    break;
            case 6: System.out.println("Friday");
                    break;
            case 7: System.out.println("Saturday");
                    break;
            default:System.out.println("Invalid day number");
        }

        /* Ternary operators */
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();
        String type = (num1 % 2 == 0)? "Even" : "Odd";
        System.out.println(type);

        /* Loops in java : While ,do while ,for */

        //print the numbers from 1 to 10 usig while loop skip the number 5 using continue statement
        int h =1;
        while( h <= 10){
            if(h == 5){
                h++;
                continue;
            }
            System.out.println(h);
            h++;
        }

        //demonstation of break statement
        int j=1;
        while(j <= 5){
            if(j == 3){
                break;
            }
            System.out.println(j);
            j++;
        }

        //sum of first n natural numbers
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int sum1 = 0;
        while(n >0){
            sum1 +=n;
            n--;
        }System.out.println("Sum of the natural numbers is :"+sum);

        //print the numbers from 10 to 1 using do while loop
        int k =10;
        do{
            System.out.println(k);
            k--;
        }while(k>=1);

        //find the factorial of the number using for loop
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<= number; i++){
            fact = fact * i;
        }System.out.println("The factorial of the number is :"+fact);

        //sum of digits in the number
        int num2 = 12052006;
        int rem;
        int sum2 =0;
        while (num2 > 0){
            rem = num2 % 10;
            num2 = num2 / 10;
            sum2 += rem;
        }System.out.print("Sum of the digits in the number is :"+sum2);

        //print reverse of the number using loops
        int num3 = 123456789 ;
        int rem1 ;
        while(num3 > 0){
            rem1 = num3 % 10;
            num3 = num3 /10;
            System.out.print(rem1);
        }

        //Reverse the given number and print it
        int num4 = 123456789 ;
        int rev = 0;
        int last_digit;
        while( num4 > 0){
            last_digit = num4 % 10;
            rev =(rev * 10) + last_digit;
            num4 /=10;
        }System.out.println("The reverse of the number is :"+rev);

        //check whether the number is prime or not
        System.out.println("Enter the number to check :");
        int num5 = sc.nextInt();
        int i = 2;
        boolean flag = true ;
        while(i <= Math.sqrt(num5)){                                           //The range is from 2 to n-1 where we use root n insted of n-1 for optimisation
            if(num5 % i == 0){
                flag = false;
            }
            i++;
        }if(flag == true){
            System.out.println(num5+" is a prime number");
        }else{
            System.out.println(num5+" is not a prime number");
        }
    }
}
