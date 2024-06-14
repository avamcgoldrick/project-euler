public class Problem2 {
    public static void main(String[] args) {
        int addend1 = 0;
        int addend2 = 1;
        int currentSum = 0;
        int totalSum = 0;

        while(currentSum < 4000000 - addend1){
            currentSum = addend1 + addend2;
            
            if(currentSum % 2 == 0){
                totalSum += currentSum;
            }
            
            addend1 = addend2;
            addend2 = currentSum;
        }
        
        System.out.println(totalSum);
    }  
}
