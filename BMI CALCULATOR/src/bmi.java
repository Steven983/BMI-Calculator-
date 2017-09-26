import java.util.Scanner;

public class bmi{

    public static void main( String []args) {

        Scanner scanner = new Scanner( System.in);

        double userWeight;
        double userHeight;
        double bmi;

        System.out.println( "Enter your weight in KG");
        userWeight = scanner.nextDouble();

        System.out.println("Enter your height in feet with no spaces inbetween the numbers");
        userHeight = scanner.nextDouble();

        bmi = ( userWeight * 703 / ( userHeight * userHeight));

        if(bmi <18.5){
            System.out.println("Underweight");
        } else if(bmi <26 ){
            System.out.println("Optimal weight");
        } else {

            System.out.println("Overweight");
        }

    }

}




