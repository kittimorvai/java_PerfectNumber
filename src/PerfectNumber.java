public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber (int number){
        int check;
        int sum = 0;
        if (number < 1){
            return false;
        } else {
            for (int i = 1; i <= number/2; i++){
                check = number % i;
                if(check == 0){
                    sum += i;
                }
            }
            if (sum == number){
                return true;
            }
        }
        return false;
    }

}
