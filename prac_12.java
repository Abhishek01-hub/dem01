import java.util.Arrays;
public class prac_12 {
    static int found=0;
    int fun(int i,int[] nums){
        if(i>=nums.length || nums[0]==0) return 0;
        int current=i+nums[i];
        if(current==0 || current>=nums.length) return 0;
        if(current==nums.length-1){
            found=1;
            return 1;
        }
        fun(current,nums);
        return 0;
    }
    public static void main(String[] args) {
        prac_12 o=new prac_12();
        int[] nums={2,5,0,0};
            int res=o.fun(0,nums);
            if(res==1) System.out.println("true");
            else System.out.println("false");
            if(found==1) System.out.println("found");
        }
    }
