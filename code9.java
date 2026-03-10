/*Strings in java : Stringa are immutable*/

// import java.util.*;
// public class code9{
//     public static void main(String args[]){
//         //array of characters
//         char arr[] = {'a', 'b', 'c', 'd'};   
//         //String syntax
//         String str0 = "Sujan";                
//         String str1 = new String("xyz@123");    
        
//         // //inputs in strings
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter your name:");
//         // String name = sc.nextLine();             //sc.nextLine() : for taking the full line as input ,not only the first word.
//         // System.out.println(name);
//         // System.out.println(name.length());       //string.length() : gives the length of the string

//         //String concatination
//         String firstname = "Sujan";
//         String secondname = "Kumar";
//         String fullname = firstname + " " + secondname;
//         System.out.println(fullname);

//         //string.charAt(index) : gives the character of the string at a particular index
//         String place = "Kotehswara";
//         for(int i = 0; i < place.length(); i++){
//             System.out.print(place.charAt(i) + " ");
//         }
//         System.out.println();

//         //string comparision
//         String s1 = "Tony";
//         String s2 = "Tony";
//         String s3 = new String("Tony");
//         /* here S1 == s2 but s1 != s3 becaues even in s3 "new" keyword is used to store s3 as it creates a new spaace to store s3.
//            Hence we cannot use "==" to compare two string in all cases.
//            Therefore we use s1.equals(s3) function which returns true or false 
//         */
//         if(s1.equals(s3)){
//             System.out.println("Strings are equal");
//         }else{
//             System.out.println("Strings are not equal");
//         }

//         //substrings : string.substring(start index , end index(exclusive))
//         String str = "Hellow World";
//         System.out.println(str.substring(0,7));

//         //Largest string in set of strings : 
//         /*
//         Lexicographic comparison i.e based on ascii value of the characters using compareTo() finction
//         s1.compareTo(s2) : if it is equals to zero then s1 and s2 are equal
//                             if it is less than zero then s1 is less than s2
//                             if it is greater than zero then s1 i greater than s3
//                             here A != a

//         s1.comaparetoignoreCase(s2) : here A == a
//         */
//         String fruits[] = {"apple", "banana", "pine"};
//         String largest = fruits[0];
//         for(int i = 1; i < fruits.length; i++){
//             if(largest.compareTo(fruits[i]) < 0){
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);


//     }
// }


// //check whether a string is a palindrome or not
// import java.util.*;
// public class code9{
//     public static boolean Ispalin(String str){
//         int first = 0;
//         int last = str.length() - 1;
//         while(first < last){
//             if(str.charAt(first) != str.charAt(last)){
//                 return false;
//             }
//             first ++;
//             last --;
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String str = sc.nextLine();
//         System.out.println(Ispalin(str));
//     }
// }

// //shortest path
// public class code9{
//     public static int shortestpath(String path){
//         int x = 0;
//         int y = 0;
//         for(int i = 0; i < path.length(); i++){
//             if(path.charAt(i) == 'N'){             //each turn = 1 units 
//                 y++;                               //north means +ve y-axis 
//             }
//             else if(path.charAt(i) == 'S'){
//                 y--;                               //south means -ve y-axis 
//             }
//             else if(path.charAt(i) == 'E'){
//                 x++;                               //east means +ve x-axis 
//             }
//             else{
//                 x--;                               //west means -ve x-axis 
//             }
//         }
//         int shortestpath = (int)Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
//         return shortestpath;
//     }
//     public static void main(String args[]){
//         String path = "WNEENESENNN";
//         System.out.println(shortestpath(path));
//     }
// }

// //Substrings without inbuilt
// public class code9{
//     public static void substring(String str, int si, int ei){
//         String substr ="";
//         for(int i = 0; i < ei; i++){
//             substr += str.charAt(i);
//         }
//         System.out.println(substr);
//     }
//     public static void main(String args[]){
//         String str = "Hellow World";
//         int si = 0;
//         int ei = 7;   //exclusive
//         substring(str, si, ei);
//     }
// }

// /* StringBuilder :
//    a data type to store string, used when there is large number of iterations on string to reduce time complexity
//    Syntax: 
//    StringBuilder sb = new StringBuilder("string");
//    Function to access the string stored in StringBuilder : sb.toString();
// */
// public class code9{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("");
//         for(char ch = 'a'; ch <= 'z'; ch++){
//             sb.append(ch);            //adds the character to sb
//         }
//         System.out.println(sb);       //here time complexity = O(26) but if we use sb+=ch the it is O(n**2)
//     }
// }

// //convert the first letters of the word in the string to uppercase
// public class code9{
//     public static String toUpperCase(String str){
//         StringBuilder sb = new StringBuilder("");                   //creating an empty StringBuilder sb
        
//         //coverting the first character of str to uppercase
//         char ch = Character.toUpperCase(str.charAt(0));             //Character.toUpperCase(ch) coverts LC to UC character
//         sb.append(ch);                                              //appending the UC character to StringBuilder sb

//         for(int i = 1; i < str.length(); i++){
//             if(str.charAt(i) == ' ' && i < str.length()-1){         //accesing the space
//                 sb.append(str.charAt(i));                           //appending the space to StringBuilder sb as it is
//                 i++;                                                //accesing the character next to space
//                 sb.append(Character.toUpperCase(str.charAt(i)));    //conveting the character after space to UC and appending it to sb
//             }else{
//                 sb.append(str.charAt(i));                           //appending the remaining characters as it is to sb
//             }
//         }
//         return sb.toString();                                       //returns the string stored in StringBuilder sb
//     }
//     public static void main(String args[]){
//         String str = "hi my self sujan";
//         System.out.println(toUpperCase(str));
//     }
// }


// //String compression : i.e abbbccdde => ab3c2d2e
// public class code9{
//     public static String compression(String str){
//         StringBuilder sb = new StringBuilder("");
//         for(int i = 0; i < str.length(); i++){
//             Integer count = 1;                                      //creation of class variable so that to use variable.toString() function
//             while( i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             sb.append(str.charAt(i));
//             if(count > 1){
//                 sb.append(count.toString());
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         String str = "abbbccdddde";
//         System.out.println(compression(str));
//     }
// }

// //valid palindrom 
// import java.util.*;
// public class code9 {
//     public static  boolean isPalindrome(String s){
//         String lower = s.toLowerCase();
//         StringBuilder sb = new StringBuilder("");
//         for(int i = 0; i < lower.length(); i++){
//             char c = lower.charAt(i);
//             if((c >='a' && c <= 'z') || (c >= '1' && c <= '9')){
//                 sb.append(lower.charAt(i));
//             }
//         }
//         int first = 0;
//         int last = sb.length()-1;
//         while(first < last){
//             if(sb.charAt(first) != sb.charAt(last)){
//                 return false;
//             }
//             first ++;
//             last --;
//         }
//         return true;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enetr the string:");
//         String s = sc.nextLine();
//         System.out.println(isPalindrome(s));
//     }
// }