public class FizzBuzz {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){ // iterates between 1~100
            if(i%15 == 0){ // Prints FizzBuzz if divisible by 3 and 5
                System.out.println(i+ "FizzBuzz");
            }
            else if(i%5 == 0){ // Prints Buzz if divisible by 5
                System.out.println(i+ "Buzz");
            }
            else if(i%3 ==0){ // Prints Fizz if divisible by 3
                System.out.println(i+ "Fizz");
            }
            else // If none of the above conditions are true, just print the number
                System.out.println(i);
        }
    }
}
