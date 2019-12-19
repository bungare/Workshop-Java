public class VariableTest {

  public static void main(String[] args) {
    int itemPrice = 250000;
    double discount = 2.5;
    boolean isTrue = true;
    long yourMoney = 1000000;
    short counter = 0;

    System.out.println("Item Price = " + itemPrice);
    System.out.println("Discount = " + discount);
    System.out.println("True = " + isTrue);
    System.out.println("Your Money = " + yourMoney);
    System.out.println("counter = " + counter);

    yourMoney = yourMoney - itemPrice;
    System.out.println(yourMoney);

    yourMoney = (long) (yourMoney - (itemPrice - (itemPrice / 100 * discount)));
    System.out.println(yourMoney);

    System.out.println(counter++);
    System.out.println(
        ++counter);  /*hasilnya 2 karena dia melanjutkan penjumlah 0+1 diatas = 1 jadi --> 1+1*/

    boolean notTrue = !isTrue;
    System.out.println(notTrue);

  }
}
