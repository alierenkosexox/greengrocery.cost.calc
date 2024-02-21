import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pearP = 2.14, appleP=3.67 , tomatoP=1.11 , bananaP = 0.95 , eggplantP= 0.95, totalcost=0;
        //products and prices

        System.out.println("-->> WELCOME TO PATİKA GREENGROCERY <<--"); //price list and welcome
        System.out.println("----------------------------------------");
        System.out.println("Price list:");
        System.out.println("Pear Price: 2.14");
        System.out.println("Apple Price 3.67");
        System.out.println("Tomatoes Price:  1.11");
        System.out.println("Banana Price 0.95");
        System.out.println("Eggplant Price 5.0");
        System.out.println(",-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-,-");

        double pearkg,applekg,tomatokg,bananakg,eggplantkg; //how many kilos were sold info

        Scanner input = new Scanner(System.in);  //collecting weight info

        System.out.print("Pear kg : ");
        pearkg = input.nextDouble();            //input pear kg
        totalcost +=pearkg*pearP;

        System.out.print("Apple kg : ");
        applekg = input.nextDouble();           //input apple kg
        totalcost +=applekg*appleP;

        System.out.print("Tomato kg : ");
        tomatokg = input.nextDouble();              //input tamato kg
        totalcost +=tomatokg*tomatoP;

        System.out.print("Banana kg : ");
        bananakg = input.nextDouble();              //input banana kg
        totalcost +=bananakg*bananaP;

        System.out.print("Eggplant kg : ");
        eggplantkg = input.nextDouble();               //input eggplant kg
        totalcost += eggplantkg*eggplantP;

        System.out.println("Total price :"+ totalcost);   //write the total price

    }                                         //Ölüm ve yaşam ikisinin de bir nedeni yoktur\\
}  // Ali Eren KÖSE 21/02/2024 06:37        //  İnsanlar doğar çünkü annler bebek ister,    \\
                                        //ya da tanrı safında savaşacak savaşçıya ihtiyaç vardır.\\