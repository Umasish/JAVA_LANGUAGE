import java.util.*;
// class Greedy1maximumActivities{
//     public static void main(String[] args) {
//         int start[] = { 1,3,0,5,8,5};
//         int end[]={2,4,6,7,9,9};
//         ArrayList<Integer> ans = new ArrayList<>();

//         int maxAct = 1;

//         //choose a0 as first activity
//         ans.add(0);

//         int lastEnd = end[0];
        
//         for(int i=0;i<end.length;i++){
//             if(start[i]>=lastEnd){
//                 maxAct++;
//                 lastEnd = end[i];
//                 ans.add(i);
//             }
//         }
//         System.out.println("maximum activities is " +maxAct);
//         for(int i=0;i<ans.size();i++){
//             System.out.print("A"+ans.get(i)+" ");
//         }

//     }
// }

// if end array are not sorted

class Greedy1maximumActivities{
    public static void main(String[] args) {
        int start[] = { 1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};  

        //sort the end array
        int activities[][] = new int [start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        ArrayList<Integer> ans = new ArrayList<>();

        int maxAct = 1;

        //choose a0 as first activity
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];
        
        for(int i=0;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                lastEnd = activities[i][2];
                ans.add(activities[i][0]);
            }
        }
        System.out.println("maximum activities is " +maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }

    }
}