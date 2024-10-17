import  java.util.*;
public class Main {
    public static void main(String[] args) {


        calculator cal = new calculator();
        while(true){
            System.out.println("1. please Enter 1 for Addition ");
            System.out.println("2. please Enter 2 for Substrcation ");
            System.out.println("3. please Enter 3 for Multiplication ");
            System.out.println("4. please Enter 4 for Division ");
            System.out.println("5. To terminate , Enter 5");
            System.out.print("Input : ");
            Scanner sc = new Scanner((System.in));
            int option = sc.nextInt();



            switch(option){
                case 1 : {
                    System.out.print("Please Enter 1st number for Addition : ");
                    double num1 = sc.nextDouble();
                    System.out.println();
                    System.out.print("Please Enter 2nd number for Addition : ");
                    double num2 = sc.nextDouble();
                    double ans =  cal.add(num1,num2);
                    System.out.println("Summation of "+num1 + " and " + num2 + " is : " + ans);
                    break;
                }
                case 2 : {
                    System.out.print("Please Enter 1st number for Substrcation : ");
                    double num1 = sc.nextDouble();
                    System.out.println();
                    System.out.print("Please Enter 2nd number for Substrcation : ");
                    double num2 = sc.nextDouble();
                    double ans = cal.sub(num1, num2);
                    System.out.println("Substrcation of "+num1 + " and " + num2 + " is : " + ans);
                    break;
                }
                case 3 : {
                    System.out.print("Please Enter 1st number for Multiplication : ");
                    double num1 = sc.nextDouble();
                    System.out.println();
                    System.out.print("Please Enter 2nd number for Multiplication : ");
                    double num2 = sc.nextDouble();
                    double ans = cal.mul(num1, num2);
                    System.out.println("Multiplication of "+num1 + " and " + num2 + " is : " + ans);
                    break;
                }
                case 4 : {
                    System.out.print("Please Enter 1st number for Division : ");
                    double num1 = sc.nextDouble();
                    System.out.println();
                    System.out.print("Please Enter 2nd number for Division : ");
                    double num2 = sc.nextDouble();
                    double ans = cal.div(num1, num2);
                    System.out.println("Division of "+num1 + " and " + num2 + " is : " + ans);
                    break;
                }
                case 5 : {
                    System.out.println("Exiting...");
                    return;
                }
                default: {
                    System.out.println("Error: Please Enter valid input");
                    break;
                }
            }

        }

//        System.out.println("Addition : "+ cal.add());
//        System.out.println("Substraction : "+ cal.sub());
//        System.out.println("Multiplication : "+ cal.mul());
//        System.out.println("Division : "+ cal.div());
    }
}