/* Bit Manupulation */

/*
 
Bitwise AND & : 0 & 0 = 0
                0 & 1 = 0
                1 & 0 = 0
                1 & 1 = 1

Bitwise OR | : 0 & 0 = 0
               0 & 1 = 1
               1 & 0 = 1
               1 & 1 = 1

Bitwise XOR ^ : 0 & 0 = 0
                0 & 1 = 1
                1 & 0 = 1
                1 & 1 = 0

Binary Ones complement ~ : ~ 0 = 1
                           ~ 1 = 0

Binary left shift <<  : shifted towards left by specified no of bits
Binary right shift >> : shifted towards right by specified no of bits

 */

// public class code10{
//     public static void main(String args[]){
//         System.out.println((5 & 6));            // OUTPUT: 5 & 6 = 101 & 110 = 100 => 4

//         System.out.println((5 | 6));            // OUTPUT: 5 & 6 = 101 | 110 = 111 => 7
    
//         System.out.println((5 ^ 6));            // OUTPUT: 5 & 6 = 101 ^ 110 = 011 => 3

//         System.out.println((~ 5));              // OUTPUT: get the two's complement of that number 
//         System.out.println((~ 0));              // OUTPUT: -1

//         System.out.println((5 << 2));           // OUTPUT: 000101 << 2 = 010100 = 20   
//                                                 // Hint : a << b = a * 2**b  i.e 5 << 2 = 5 * 2**2 = 5 * 4 = 20

//         System.out.println((6 >> 1));           // OUTPUT : 000110 >> 1 = 000011 = 3
//                                                 // Hint : a << b = a / 2**b  i.e 6 << 1 = 6 / 2**1 = 6 * 2 = 3                                 
//     }
//  }

// //check whether a number is even or odd (HINT : FOR EVEN LSB = 0 , FOR ODD LSB = 1)
// import java.util.*;
// public class code10{
//     public static void check(int n){
//         int bitmask = 1;
//         if((n & bitmask) == 1){
//             System.out.println(n+" is a odd number");
//         }else{
//             System.out.println(n+" is a even number");
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enetr a number :");
//         int n = sc.nextInt();
//         check(n);
//     }
// }

// //Get the ith bit 
// import java.util.*;
// public class code10{
//     public static int ithbit(int n, int i){
//         int bitmask = 1 << i;
//         if((n & bitmask) == 0){
//             return 0;
//         }else{
//             return 1;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();
//         System.out.println("Enter the bit position :");
//         int i = sc.nextInt();
//         System.out.println(ithbit(n,i));
//     }
// }

//