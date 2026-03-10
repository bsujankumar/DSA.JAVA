//adavanced array problems


// //Max sub array sum (Brutal force - means more time complexity = O(n**3))
// public class code6{
//   public static int maxsum(int numbers[]){
//     int maxsum = Integer.MIN_VALUE;
//     for(int i = 0; i < numbers.length; i++){
//       for(int j = i; j < numbers.length; j++){
//         int subsum = 0;
//         for(int k = i; k <= j; k++){
//           subsum += numbers[k];
//         }
//         if(subsum > maxsum){
//           maxsum = subsum;
//         }
//       }
//     }return maxsum;
//   }
//   public static void main(String args[]){
//     int numbers[] = {1, -2, 3, -1, -4};
//     System.out.println("Maximum sum of the subarray is "+maxsum(numbers));
//   }
// }

// //optimised sub array sum (prifix sum - reduced time complexity = O(n**2))
// public class code6{
//   public static int maxsum(int numbers[]){
//     int maxsum = Integer.MIN_VALUE;
//     //creating an array named prefix stores the sum of subarray 
//     int prefix[] = new int[numbers.length];
//     prefix[0] = numbers[0];
//     for(int i = 1; i < prefix.length; i++){
//       prefix[i] = prefix[i-1] + numbers[i];
//     }
//     //sum of sub other sub arrays 
//     for(int i = 0; i < numbers.length; i++){
//       for(int j = i; j < numbers.length; j++){
//         int subsum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];

//         if(subsum > maxsum){
//           maxsum = subsum;
//         }
//       }
//     }return maxsum;
//   }
//   public static void main(String args[]){
//     int numbers[] = {1, -2, 3, -1, -4};
//     System.out.println("Maximum sum of the subarray is "+maxsum(numbers));
//   }
// }

// //highly optimised sum of sub array (Kadane's algorithum where time complexity = O(n) and here negetive sum are considered as 0)
// public class code6{
//   public static int kadanes(int numbers[]){
//     int ms = Integer.MIN_VALUE;
//     int ss = 0;
//     for(int i = 0; i < numbers.length; i++){
//       ss += numbers[i];
//       if(ss < 0){
//         ss = 0;
//       }
//       ms = Math.max(ss,ms);
//     }
//     return ms;
//   }
//   public static void main(String args[]){
//     int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//     System.out.println("Maximum sum of sub array is "+kadanes(numbers));
//   }
// }

// //trapped rain water ( Most optimised way as time complexity = O(n) as the code runs linearly depending upon the number of bars )
// public class code6{
//     public static int trappedRainwater(int height[]){
//         int leftmaxbound[] = new int[height.length];
//         int rightmaxbound[] = new int[height.length];

//         //storing left max boundary in array
//         leftmaxbound[0] = height[0];
//         for(int i = 1; i < leftmaxbound.length; i++){
//             leftmaxbound[i] = Math.max(leftmaxbound[i-1],height[i]);
//         }
        
//         //storing right max boundary in array
//         rightmaxbound[rightmaxbound.length - 1] = height[height.length-1];
//         for(int i = rightmaxbound.length - 2; i >= 0; i--){
//             rightmaxbound[i] = Math.max(rightmaxbound[i+1],height[i]);
//         }

//         //caluclating waterlevel and tarpped rain water 
//         int trappedrainwater = 0;
//         for(int i = 0;i < height.length; i++){
//             int waterlevel = Math.min(leftmaxbound[i],rightmaxbound[i]);         //waterlevel = min(left max bound , right max bound)
//             trappedrainwater += waterlevel - height[i];                          //tarppedd water = (water level - bar height) * width     (here width = 1)
//         }
//         return trappedrainwater;
//     }
//     public static void main(String args[]){
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println("Trapped rain water = "+trappedRainwater(height));
//     }
// }

// //best time to buy or sell the stocks to gain amx profit
// public class code6{
//     public static int maxprofit(int price[]){
//         int buyprice = Integer.MAX_VALUE;                          //buy price should be smallest
//         int maxprofit = 0;
//         for(int i = 0; i < price.length; i++){
//             int sellprice = price[i];
//             if(buyprice < sellprice){
//                 int profit = sellprice - buyprice;
//                 maxprofit = Math.max(maxprofit,profit);
//             }else{
//             buyprice = sellprice;
//             }
//         }
//         return maxprofit;
//     }
//     public static void main(String args[]){
//         int price[] = {7, 1, 5, 3, 6, 4};
//         System.out.println("Maximum profit = "+maxprofit(price));
//     }
// }

// //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
// public class code6{
//     public static boolean compare(int nums[]){
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i+1; j < nums.length; j++){
//                 if(nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }return false;
//     }
//     public static void main(String args[]){
//         int nums[] = {1, 3, 6, 7, 3};
//         System.out.println(compare(nums));
//     }
// }

/*Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, 
and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets*/
