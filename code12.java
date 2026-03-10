/* Recursion : Dividing a problem into smaller instance of similar problem */

/*
Three important stages in recursion:
>> Base case
>> oterative functions 
>> call inner functions 
*/

// //Printing the numbers in decresing order(10 - 1)
// public class code12{
//     public static void printDec(int n){
//         if(n == 1){                                 //Base case
//             System.out.print(n);
//             return;
//         }
//         System.out.print(n+" ");                
//         printDec(n-1);
//     }
//     public static void main(String args[]){
//         int n = 10;
//         printDec(n);
//     }
// }

// //Print the numbers in increasing order(1 - 10)
// public class code12{
//     public static void printInc(int n){
//         if(n == 1){
//             System.out.print(n+" ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n+" ");
//     }
//     public static void main(String args[]){
//         int n = 5;
//         printInc(n);
//     }
// }

// //Factorial of n
// public class code12{
//     public static int fact(int n){
//         if(n == 0){
//             return 1;
//         }
//         int fact_nm1= fact(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
//     }
//     public static void main(String args[]){
//         int n = 5;
//         System.out.println("The factorial of "+n+" is "+fact(n));
//     }
// }

// //Sum of n natural numbers
// public class code12{
//     public static int sum(int n){
//         if(n == 1){
//             return 1;
//         }
//         int sum_nm1 = sum(n-1);
//         int sum = n + sum_nm1;
//         return sum;
//     }
//     public static void main(String args[]){
//         int n = 5;
//         System.out.println("Sum of n natural numbers is "+sum(n));
//     }
// }

// //N th fibinocci number
// public class code12{
//     public static int fib(int n){
//         if(n == 0){
//             return 0;
//         }
//         if(n == 1){
//             return 1;
//         }
//         int fib_nm1 = fib(n-1);
//         int fib_nm2 = fib(n - 2);
//         int fib_n = fib_nm1 + fib_nm2;        //fibinocci(n) = fibinocci(n-1) + fibinocci(n-2) : eg- fib(2) = fib(1) + fib(0) = 1 + 0 = 1
//         return fib_n;
//     }
//     public static void main(String args[]){
//         int n = 5;
//         System.out.println(n +"th fibinocci number is "+fib(n));
//     }
// }

// //check if array is sorted
// public class code12{
//     public static boolean Issorted(int arr[], int i){
//         if(i == arr.length-1){
//             return true;
//         }
//         if(arr[i] > arr[i+1]){
//             return false;
//         }
//         return Issorted(arr,i+1);
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,4,5};
//         int i = 0;   //Starting index
//         System.out.println(Issorted(arr,i));
//     }
// }

// //first occurance of an element in array
// public class code12{
//     public static int firstoccurance(int arr[], int i, int key){
//         if(i == arr.length){
//             return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }
//         int index = firstoccurance(arr,i+1,key);
//         return index;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,5,6,5,8};
//         int i = 0;  //Starting index
//         int key = 1;
//         System.out.println(firstoccurance(arr, i, key));
//     }
// }

// //Last occurance of an element in an array
// public class code12{
//     public static int lastoccurance(int arr[], int i, int key){
//         if(i < 0){
//             return -1;
//         }
//         if(arr[i] == key){
//             return i;
//         }
//         int index = lastoccurance(arr, i-1, key);
//         return index;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,3,5,6,7,5,8};
//         int i = arr.length-1;
//         int key = 5;
//         System.out.println(lastoccurance(arr, i, key));
//     }
// }

// //all occurances
// public class code12{
//     public static void occurance(int arr[], int i, int key){
//         if(i == arr.length){
//             return ;
//         }
//         if(arr[i] == key){
//             System.out.println(i+" ");
//         }
//         occurance(arr, i+1, key);
//     }
//     public static void main(String args[]){
//         int arr[] = {1, 2, 3, 4, 3, 4, 3, 2, 1, 1};
//         int i = 0;
//         int key = 3;
//         occurance(arr, i, key);
//     }
// }

// //print x to the power n [time complexity = O(n)]
// public class code12{
//     public static int pow(int x, int n){
//         if(n == 0){
//             return 1;
//         }
//         // int pow_xnm1 = pow(x, n-1);
//         // int pow_xn = x * pow_xnm1;
//         // return pow_xn;
//         return x * pow(x,n-1);           //upgraded
//     }
//     public static void main(String args[]){
//         int x = 2;
//         int n = 10;
//         System.out.println(pow(x,n));
//     }
// }

// //optimised x to the power n [time complexity = O(logn)]  logic: 2**4 =(2**2) * (2**2) for even  and 2**5 = 2 * (2**2) * (2**2) for odd
// public class code12{
//     public static int pow(int x, int n){
//         if( n == 0){
//             return 1;
//         }
//         int halfPower = pow(x, n/2) ; 
//         int halfPowerSq = halfPower * halfPower; //for even powers
//         //if power is odd
//         if(n % 2 !=0){
//             halfPowerSq = x * halfPowerSq;
//         }
//         return halfPowerSq;

//     }
//     public static void main(String args[]){
//         int x = 2;
//         int n = 10;
//         System.out.println(pow(x,n));
//     }
// }

// //tile problem - Given 2*n board and 2*1 tile, count the number of ways to tile the given board
// public class code12{
//     public static int tileproblem(int n){
//         //base case
//         if(n == 0 || n ==1){   //if board sise is 2*0 or 2*1 then there is zero tile placed and one tile placed respectively i.e 1 possible way
//             return 1;
//         }
//         //vertical choice
//         int fnm1 = tileproblem(n-1);
//         //horizontal choice
//         int fnm2 = tileproblem(n-2);
//         int totalways = fnm1 + fnm2;
//         return totalways;
//     }
//     public static void main(String args[]){
//         int n = 70; //length of the board i.e 2*n
//         System.out.println(tileproblem(n));
//     }
// }

// //remove duplicates in a string(a-z)
// public class code12{
//     public static void removeDuplicates(String str, int i, StringBuilder newstr, boolean map[]){
//         if(i == str.length()){                  //if index = string length then prints the new string(no duplicates)
//             System.out.println(newstr);
//             return;
//         }
//         char currchar = str.charAt(i);         //stores the current character at the index i
//         if(map[currchar - 'a'] == true){       //if map[index of currchar] = true meaning duplicate then the function is called for next character at index i+1
//             //duplicate
//             removeDuplicates(str, i+1, newstr, map);  
//         }else{                                
//             map[currchar - 'a'] = true;        //if not duplicate the array map[index of currchar] gets updated to true
//             removeDuplicates(str, i+1, newstr.append(currchar), map);  //then function is called for next character at the index i+1 and also appending the currchar to newstr
//         }
//     }
//     public static void main(String args[]){
//         String str = "sujanshettigar";
//         int i = 0;
//         StringBuilder newstr = new StringBuilder("");
//         boolean map[] = new boolean[26];
//         removeDuplicates(str, i, newstr, map);
//     }
// }

// //Friends pairing : given n friends, each one can be remain single or can with paired with other friend , each friend can be paired only once , finsd the total of ways friends can remain singl eor paired
// public class code12{
//     public static int friendsPairing(int n){
//         //base case
//         if(n == 1 || n == 2){
//             return n;
//         }
//         //single
//         int fnm1 = friendsPairing(n-1);    //n-1 means n is total friends and 1 is friend who is single
//         //paired
//         int fnm2 = friendsPairing(n-2);    //n-2 means n is total friends and 2 is friends who is paired 
//         int pairways = (n-1) * fnm2;  
//         int totalways = fnm1 + pairways;
//         return totalways ;    
//     }
//     public static void main(String args[]){
//         int n = 3; //no of friends
//         System.out.println(friendsPairing(n));
//     }
// }

// //Binary String problem : print all binary strings of size n without consecutive ones (eg for binary string :"1010010")
// public class code12{
//     public static void binaryString(int n, int lastplace, String str){
//         if(n == 0){
//             System.out.println(str);
//             return;
//         }
//         binaryString(n-1, 0,str+"0");
//         if(lastplace == 0){
//             binaryString(n-1, 1, str+"1");
//         }
//     }
//     public static void main (String args[]){
//         int n = 3; //string length
//         int lastplace = 0; 
//         String str = ""; 
//         binaryString(n, lastplace, str);
//     }
// }

//problems

// /*
//  1> You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”. 
//  Use a recursive function to solve this problem.NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.
// */
// public class code12{
//     public static void printDigits(int number, String digits[]){
//         if(number == 0){
//             return;
//         }
//         int lastdigit = number % 10;
//         printDigits(number/10, digits);
//         System.out.print(digits[lastdigit]+" ");
//     }
//     public static void main(String args[]){
//         String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//         int number = 12345;
//         printDigits(number, digits);
//     }
// }

// //Length of a string
// public class code12{
//     public static int length(String str){
//         if(str.equals("")){
//             return 0;
//         }
//         return 1 + length(str.substring(1));
//     }
//     public static void main(String args[]){
//         String str = "Sujan";
//         System.out.println(length(str));
//     }
// }


