import java.util.Stack;
public class Stack8NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int nxtGre[]= new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGre[i]=-1;
            }
            else{
                nxtGre[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nxtGre.length;i++){
            System.out.print(nxtGre[i]+" ");
        }
    }
}
