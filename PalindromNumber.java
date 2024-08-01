package Basic;
public class PalindromNumber {

    //Polindrom sayıyı bulmak için metot oluşturuyoruz
    static  boolean isPolindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        //Sayımız sıfıra eşit olana dek döngü devam eder
        while (temp != 0) {
            lastNumber = temp % 10;   
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPolindrom(234432));
    }
}
