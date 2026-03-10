// // 1.average of numbers enterred by the user
// import java.util.*;
// public class practice {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         float avg= (a+b+c)/3;
//         System.out.println("The average of the numbers is "+avg);
//     }
// }


// // 2. Biiling by taking the cost and quantity of the item from the user
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Ente the price and quantity of the item:");
//         float price1 = sc.nextFloat();
//         int quantity1 = sc.nextInt();
//         float price2 = sc.nextFloat();
//         int quantity2 = sc.nextInt();

//         float total1 = price1*quantity1;
//         float total2 = price2*quantity2;

//         float total1gst = total1 + (0.18f*total1);
//         float total2gst = total2 + (0.18f*total2);

//         float billamount = total1gst + total2gst;
//         System.out.println("The total bill amount is :"+billamount);
//     }
// }


// // 3.Income tax calculation by taking the input from the user
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your income:");
//         float income = sc.nextFloat();
        
//         float tax;
//         if( income < 500000){
//             tax = 0;
//         }else if( (income > 500000) && (income < 1000000) ){
//             tax = income * (0.2f);
//         }else{
//             tax = income * (0.3f);
//         }
//         float IAT = income-tax;

//         System.out.println("The tax amount is :"+tax);
//         System.out.println("Income after tax is :"+IAT);

//     }
// }


// // 4. Chech whether the year entered by the user is a leap year or not  (Hint : year is a leap year if it is divisible by 4 and 400 and not divisible by 100)
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter a year:");
//         int year = sc.nextInt();
        
//         if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//             System.out.println(year+" is a leap year");
//         }else{
//             System.out.println(year+" is not a leap year");
//         }
//     }
// }



