/* Java is a portable language as it can be executed on mac or linux or windows
    source code.java -->(compiler) -->byte code.class -->(JVM:java virtual machine) -->native code.exe
*/


/* boilerplatee code 
   
    class public filenmae{
        public static void main(String args[]){
        }
    }
*/ 

public class code1{
    public static void main(String args[]){
        System.out.println("Hello World");         //ln :new line character
        System.out.println("Hello World");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        
        int a=10;                                 //data type variable name = value;    note:underscore and $ can be used as variable
        int b=10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        
        String name="Sujan Shettigar";           //primitive data types
        System.out.println(name);
        char ch = 'a';
        System.out.println(ch);
        int number=100000;
        System.out.println(number);
        float marks=9.9f;
        System.out.println(marks);
        boolean var=true;
        System.out.println(var);
        double largeDecimalNumbers=999999999.9999999;
        System.out.println(largeDecimalNumbers);
        long largeInteger=9999999999L;
        System.out.println(largeInteger);
        byte smallNumber=127;
        System.out.println(smallNumber);
        short smallNumber2=32767;
        System.out.println(smallNumber2);

        //addition of two numbers
        int num1=100;
        int num2=200;
        int sum=num1+num2;
        System.out.println("THe sum of two numbers is:"+sum);
        
        /* Type Conversion (widening conversion or implicit conversion):automatically done by java compiler
            * Type compatible
            * destination type >source type :for example ,int to float is allowed while float to int is not allowed
            * note: byte<short<int<float<long<double

            Type Casting (narrowing conversion or explicit conversion):manually done by programmer

        */

        //type conversion
        int x=100;                   
        double y=x; 
        System.out.println(y);

        char ch1='a';
        int number1=ch1;
        System.out.println(number1);        //returns the ascii value of 'a' which is 97

        //type casting
        float u=23.45f;
        int v=(int)u;
        System.out.println(v);

        /*Type promotion in expressions
         * if two different data types are used in an expression ,the smaller data type (byte,short,char) is promoted to the larger data type(int)
         * if one of the operands is of type double(largest one) ,the whole expression is promoted to double(largest one)
         */

        char ch3='a';
        char ch4='b';
        System.out.println(ch4-ch3);        // first  a and b which are of char data type are converted to int automatically the operation is follwed returning 1 because ascii value of 'b' is 98 and 'a' is 97 so 98-97=1

        
        /* Unary Pre and Post Increment and drecrement opeators */
        int p=5;
        int q=p++;                          //post increment : first assign the value then increment
        System.out.println(p);
        System.out.println(q);
        System.out.println(p+q);
        
        int m=5;
        int n=--m;                          //pre decrement : first decrement the value then assign
        System.out.println(m);
        System.out.println(n);
        System.out.println(m+n);

    }
}




        

