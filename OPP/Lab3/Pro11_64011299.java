public class Pro11_64011299 {
        public static void main(String[] args) {
             for(int n=2,count =0;count < 100;n++){
                if(isPalindrome(n) && isPrime(n)){
                    System.out.print(n + " ");
                       count++;
                    if(count % 10 == 0)
                      System.out.println();
                }
            }
        }
    
        public static boolean isPrime(int x){
            if(x <=1){
                return false;
            }
            for(int i=2;i<= x/2;i++){
                if(x%i ==0){
                    return false;
                }
            }
            return true;
        }
    
        public static boolean isPalindrome(int x){
            int temp =x;
            int r,sum=0;
            while(x >0){
                r = x%10;
                sum = (sum*10) + r;
                x = x/10;
            }
    
            if(temp ==sum)
                return true;
            else
                return false;
        }
}
