import java.util.*;
public class Removecomposite{
    public static void solution(ArrayList<Integer> rs) {
        for(int i=rs.size()-1;i>=0;i--){
            if(isprime(rs.get(i))==false){
                rs.remove(i);
            }
        }
        
    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int c=2;c<n;c++){
            if(n%c==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of integers you want to input");
        int n=sc.nextInt();
        ArrayList<Integer>rs=new ArrayList<>();
        System.out.println("Enter the "+n+ "Integers:");
        for(int i=0;i<n;i++){
            rs.add(sc.nextInt());
        }
        solution(rs);
        System.out.println("Modified List Without Composites"+rs);
    }
}
