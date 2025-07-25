import java.util.*;
public class Greedy6JobSequencing {
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        int job[][] = new int [jobsInfo.length][3];
        for(int i=0 ; i<jobsInfo.length;i++){
            job[i][0] = i;
            job[i][1] = jobsInfo[i][0];
            job[i][2] = jobsInfo[i][1];

        }
        Arrays.sort(job,(a,b)->b[2]- a[2]);

        ArrayList<Integer> ans = new ArrayList<>();

        int time = 0;
        for(int i=0;i<job.length;i++){
            if(job[i][1]>time){
                ans.add(job[i][0]);
                time++;
            }
        }
        System.out.println("max job = "+ ans.size());
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
