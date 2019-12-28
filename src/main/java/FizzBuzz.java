public class FizzBuzz {
    public static String to(int number) {
        if (number%3==0){
            return "Fizz";
        }
        if(number%5==0){
            return "Buzz";
        }
        if(number%5 ==0&& number%3==0){
            return"FizzBuzz";
        }
        return null;
    }
}
