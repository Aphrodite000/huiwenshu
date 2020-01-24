public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else{
            //反转数字相等，则就是回文数
            StringBuilder sb=new StringBuilder();
            int count=0;
            for(int i=x;i>0;i/=10){
                sb.append(i%10);
                count++;
            }
            double sum=0;
            for(int i=0;i<count;i++){
                double b=(sb.charAt(i)-48)*Math.pow(10,count-1-i);
                sum=sum+b;
            }
            double y=(double) x;
            if(y==sum){
                return true;
            }
            return false;
        }
    }
}
