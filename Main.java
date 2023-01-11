import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1Ost, num2Ost, num3Ost, num4Ost, num5Ost, num6Ost; /*num 1 Ostatok - каждый раз от числа отщепляем по
        одной цифре с конца*/
        int[] historyNums = {};
        int histPlace = 0;
        for (;;){
            Scanner numEntered = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num = numEntered.nextInt();
            if (num>99999&&num<1000000) {
                num = historyNums[histPlace++];
                num1Ost = num % 10;
                num = num / 10;
                num2Ost = num % 10;
                num = num / 10;
                num3Ost = num % 10;
                num = num / 10;
                num4Ost = num % 10;
                num = num / 10;
                num5Ost = num % 10;
                num = num / 10;
                num6Ost = num % 10;
                if ((num1Ost + num2Ost + num3Ost) == (num4Ost + num5Ost + num6Ost))
                    System.out.println("Число счастливое!");
                else
                    System.out.println("Число не явл/ счастливым((");
            } else if (num==007) {
                System.out.println("Выведены элементы массива история");
                System.out.println(historyNums);
            } else
                System.out.println("Введите шестизначное число");
        }
    }
}