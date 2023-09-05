import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen doğduğunuz ayı girin : ");
        month = inp.nextInt();

        System.out.print("Lütfen doğduğunuz günü girin : ");
        day = inp.nextInt();

        switch (month) {
            case 1:
                if (day < 22) {
                    System.out.println("Oğlak Burcusunuz.");
                } else {
                    System.out.println("Kova Burcusunuz.");
                }
           break;
            case 2:
                if (day < 23) {
                    System.out.println("Kova Burcusunuz.");
                } else {
                    System.out.println("Balık Burcusunuz.");
                }
                break;
            case 3:
                if (day < 21) {
                    System.out.println("Balık Burcusunuz.");
                } else {
                    System.out.println("Koç Burcusunuz.");
                }
                break;
            case 4:
                if (day < 22) {
                    System.out.println("Koç Burcusunuz.");
                } else {
                    System.out.println("Boğa Burcusunuz.");

                }
                break;
            case 5:
                if (day < 22) {
                    System.out.println("Boğa Burcusunuz.");
                } else {
                    System.out.println("İkizler Burcusunuz.");

                }
                break;
            case 6:
                if (day < 24) {
                    System.out.println("İkizler Burcusunuz.");
                } else {
                    System.out.println("Yengeç Burcusunuz.");

                }
                break;
            case 7:
                if (day < 24) {
                    System.out.println("Yengeç Burcusunuz.");
                } else {
                    System.out.println("Aslan Burcusunuz.");

                }
                break;
            case 8:
                if (day < 24) {
                    System.out.println("Aslan Burcusunuz.");
                } else {
                    System.out.println("Başak Burcusunuz.");

                }
                break;
            case 9:
                if (day < 24) {
                    System.out.println("Başak Burcusunuz.");
                } else {
                    System.out.println("Terazi Burcusunuz.");
                }
               break;
            case 10:
                if (day < 23) {
                    System.out.println("Terazi Burcusunuz.");
                } else {
                    System.out.println("Akrep Burcusunuz.");

                }
                break;
            case 11:
                if (day < 23) {
                    System.out.println("Akrep Burcusunuz.");
                } else {
                    System.out.println("Yay Burcusunuz.");

                }
                break;
            case 12:
                if (day < 23) {
                    System.out.println("Yay Burcusunuz.");
                } else {
                    System.out.println("Oğlak Burcusunuz.");
                }
                break;
        }
    }
}
