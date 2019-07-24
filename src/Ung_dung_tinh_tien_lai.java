import java.util.Scanner;

public class Ung_dung_tinh_tien_lai {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money = 1.0;
        int month =1;
        double interset_rate=1.0;
        money= sr.nextDouble();
        System.out.println("Enter number months: ");
        month=sr.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate= sr.nextDouble();

        double total_interest =0;
        for(int i=0;i<month;i++){
            total_interest=money*(interset_rate/100)/12*3;
        }
        System.out.println("Total of interest: "+total_interest);


    }
}
