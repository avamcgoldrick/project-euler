public class Problem3 {
    public static void main(String[] args) {
        long num = 600851475143L;

        for(long i = 2; i < Math.sqrt(num); i++){
            while(num % i == 0){
                num = num / i;
            }
        }
        
        System.out.println(num);
    }
}
