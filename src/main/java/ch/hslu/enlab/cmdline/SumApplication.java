package ch.hslu.enlab.cmdline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SumApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as input parameters.");
            return;
        }
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
