//Greedy Algorithm 

/* is a problem solving technique where we make a local optimum choice at each step and hope to achieve global optimum */


// //Activity selection : 
// /* Given the start(un sorted) and ending time(sorted) of the activity, find the max no of activity a person can do 
//    given a person can do only one activity at a time */
// import java.util.*;
// import java.util.ArrayList;
// public class code18{
//     public static void main(String args[]){
//         int start[] = { 1, 3, 0 ,5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};  
//         ArrayList<Integer>act = new ArrayList<>();  //to store the activities performed 
//         //firsst activity
//         int maxAct = 1;
//         act.add(0);
//         int lastEnd = end[0];
//         //next activities
//         for(int i = 1; i < end.length; i++){
//             if(start[i] >= lastEnd){
//                 maxAct ++;
//                 act.add(i);
//                 lastEnd = end[i];
//             }
//         }
//         System.out.println("Max Number of activities done by a person "+maxAct);
//         System.out.print("The activities are : ");
//         for(int i = 0; i < act.size(); i++){
//             System.out.print("A"+act.get(i)+" ");
//         }
//     }
// }

// //if end time is not sorted
// import java.util.*;
// import java.util.ArrayList;
// public class code18{
//     public static void main(String args[]){
//         int start[] = { 1, 0, 3, 5, 8, 5};
//         int end[] = {2, 6, 4, 7, 9, 9};

//         //sorting
//         int activities[][] = new int[start.length][3];
//         for(int i = 0; i < start.length; i++){
//             activities[i][0] = i;        //col 1 = index of the activity
//             activities[i][1] = start[i]; //col 2 = starting time of the activity
//             activities[i][2] = end[i];   //col 3 = ending time of the activity
//         }
//         //lamda function to sort
//         Arrays.sort(activities , Comparator.comparingDouble( o -> o[2]));  //sorting based on col 3 i.e end time
        
//         ArrayList<Integer>act = new ArrayList<>();  //to store the activities performed 
//         //firsst activity
//         int maxAct = 1;
//         act.add(activities[0][0]);
//         int lastEnd = activities[0][2];
//         //next activities
//         for(int i = 1; i < activities.length; i++){
//             if(activities[i][1] >= lastEnd){
//                 maxAct ++;
//                 act.add(activities[i][0]);
//                 lastEnd = activities[i][2];
//             }
//         }
//         System.out.println("Max Number of activities done by a person is "+maxAct);
//         System.out.print("The activities are : ");
//         for(int i = 0; i < act.size(); i++){
//             System.out.print("A"+act.get(i)+" ");
//         }
//     }
// }

// //Fractinal knapsack 
// /* Given the weight and value of the item and also the weight of the knapsack(bag).
//    Find the max value achieved by adding the items to the knapsack
// */
// import java.util.*;
// public class code18{
//     public static void main(String args[]){
//         int val[] = {60, 100, 120};
//         int weight[] = {10, 20, 30};
//         int w = 50; //total weight of the kanpsack

//         //sorting 
//         double ratio[][] = new double[val.length][2];  //creating a sorted array ratio that hold the idx and ratio of value/weight
//         for(int i = 0; i < val.length; i++){
//             ratio[i][0] = i;                          //col 1 = idx
//             ratio[i][1] = val[i] / (double)weight[i]; //col 2 = ration of value/weight
//         }
//         //lamda function to sort based on ratio
//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//         int capacity = w;  //intially full capacity as kanpsack is empty
//         int value = 0;
//         for(int i = ratio.length - 1; i >= 0 ; i--){  //higher the ratio of value/weight , better the choice of item placed in the knapsack
//             int idx = (int)ratio[i][0];
//             if(capacity >= weight[idx]){    //adding complete item
//                 value += val[idx];
//                 capacity -= weight[idx];
//             }
//             else{                          //adding partial item
//                 value += ratio[i][1] * capacity;
//                 capacity = 0;
//                 break;
//             }
//         }
//         System.out.println("The max value of item stored in the kanpsack is "+value);
//     }
// }

// //Minimum absolute diffrence : minimum sum of absolute diffrences of all pair of numbers
// /* For the absolute difference to be minimum , two numbers in the pair should be close to each other 
//    For that first sort the give list of numbers then find the absolute difference */
// import java.util.*;
// public class code18{
//     public static void main(String args[]){
//         int A[] = {1, 2, 3};
//         int B[] = {2, 1, 3};
//         Arrays.sort(A);
//         Arrays.sort(B);
//         int minDiff = 0;
//         for(int i = 0; i < A.length; i++){
//             minDiff += Math.abs(A[i] - B[i]);
//         }
//         System.out.println("Minimum absolute diffrence is "+minDiff);
//     }
// }

// //Max length chain of pair 
// /* Given the pairs of number , make a chain such that the last number of the previous pair is less than the current pair , 
//    return the maximum possible length of chain that can be posiible 
// */
// import java.util.*;
// public class code18{
//     public static void main(String args[]){
//         int pairs[][] = {{5,24} , {39,60} , {5,28} , {27,40} ,{50,90}};
//         Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
//         //first pair of the chain
//         int Maxlength = 1;
//         int chainEnd = pairs[0][1];
//         //remaining pairs used in the chain
//         for(int i = 0; i < pairs.length; i++){
//             if(pairs[i][0] > chainEnd){
//                 Maxlength ++;
//                 chainEnd = pairs[i][1];
//             }
//         }
//         System.out.println("The max length of the chain is "+Maxlength);
//     }
// }

// //Indian coins
// /* Minimum number of notes to meks change for value V */
// import java.util.*;
// public class code18{
//     public static void main(String args[]){
//         Integer coins[] = {1, 2, 5, 20, 50, 100, 500, 2000};
//         Arrays.sort(coins, Comparator.reverseOrder()); 
//         int noteCount = 0;
//         int amount = 1059;
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i = 0; i < coins.length; i++){
//             if(coins[i] <= amount){
//                 while(coins[i] <= amount){
//                     noteCount ++;
//                     ans.add(coins[i]);
//                     amount -= coins[i];
//                 }
//             }
//         }  
//         System.out.println("Min number of notes used to make the change is "+noteCount);
//         System.out.print("The notes used are : ");
//         for(int i = 0; i < ans.size(); i++){
//             System.out.print(ans.get(i) + " ");
//         } 
//     }
// }

// //Job Sequencing Problem
// /*Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline.
//   It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1.
//   Maximize the total profit if only one job can be scheduled at a time 
// */
// import java.util.*;
// public class code18{
//     static class Job{
//         int deadline;
//         int profit;
//         int id;

//         public Job(int i, int d, int p){
//             this.id = i;
//             this.deadline = d;
//             this.profit = p;
//         }
//     }
//     public static void main(String args[]){
//         int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 20}};
//         ArrayList<Job> jobs = new ArrayList<>();
//         for(int i = 0; i < jobInfo.length; i++){
//             jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
//         }
//         Collections.sort(jobs , (obj1,obj2) -> obj2.profit - obj1.profit); //decreasing order sorting on profit
//         ArrayList<Integer> seq = new ArrayList<>();
//         int time = 0;
//         for(int i = 0; i < jobs.size(); i++){
//             Job cur = jobs.get(i);
//             if(cur.deadline > time){
//                 seq.add(cur.id);
//                 time ++;
//             }
//         }
//         System.out.println("Max jobs = "+seq.size());
//         System.out.print("The completed jobs are :");
//         for(int i = 0; i < seq.size(); i++){
//             System.out.print(seq.get(i)+"");
//         }
//         System.out.println();
//     }
// }

// //Chocola Problem : min cost to ct the board into squares
// /*We are given a bar of chocolate composed of m×n square pieces. One should break the chocolate into single squares.
//  Each break of a part of the chocolate is charged a cost expressed by a positive integer.
//  This cost does not depend on the size of the part that is being broken but only depends on the line the break goes along.
//  Let us denote the costs of breaking along consecutive vertical lines with x1, x2, ..., xm-1 
//  and along horizontal lines with y1, y2, ..., yn-1. Compute the minimal cost of breaking the whole chocolate into single squares
// */
// import java.util.*;
// public class code18{
//     public static void main(String args[]){
//         int n = 4, m = 6;                    //n - rows , m - col
//         Integer costHor[] = {4, 1, 2};       //cost of horizonatal cuts 
//         Integer costVer[] = {2, 1, 3, 1, 4}; //cost of vertical cuts
//         Arrays.sort(costHor, Collections.reverseOrder());
//         Arrays.sort(costVer, Collections.reverseOrder());
//         int h = 0, v = 0;   //pointer to costHor and costVer
//         int hp = 1, vp = 1; //number of current horizontal and vertical pieces
//         int cost = 0;
//         while(h < costHor.length && v < costVer.length){
//             if(costHor[h] >= costVer[v]){   //horizontal cut
//                 cost += vp * costHor[h];
//                 hp ++;
//                 h++;
//             }else{                          //vertical cut
//                 cost += hp * costVer[v];
//                 vp ++;
//                 v ++;
//             }
//         }
//         while( h < costHor.length){
//             cost += vp * costHor[h];
//             hp ++;
//             h++;
//         }
//         while( v < costVer.length){
//             cost += hp * costVer[v];
//             vp ++;
//             v ++;
//         }
//         System.out.println("The cost of cutting is "+cost);
//     }
// }