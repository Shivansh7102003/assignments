import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
//      Question 1

        Scanner sc = new Scanner(System.in);

        String first_name = sc.next();
        String last_name = sc.next();
        int Roll_Number = sc.nextInt();
        String Field_of_Intrest = sc.next();

        System.out.println("Name:" +first_name  +" "+  last_name);
        System.out.println("Roll Number :" +Roll_Number);
        System.out.println("Field Of Intrest :" +Field_of_Intrest);

//      Question 2

        String first = sc.next();
        String last = sc.next();
        System.out.println(first + last);

//      Question 3
        
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 =sc.nextInt();
        int Total = (mark1 + mark2 + mark3);
        System.out.println("total:" +Total);
        float percentage = (Total)/3;
        System.out.println(percentage +"%");

//      Question 4

        int t= sc.nextInt();
        for (int i = 1; i<= t ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }

//      Question 5

        while (sc.hasNextLine()){
            String c = sc.next();
            String d = sc.next();
            System.out.println(c+d);
        };


    }
}

