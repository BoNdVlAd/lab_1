import java.util.Scanner;



class Calcul {
    int Calc(char a, char b, char n,char m,int C3){

        int RESULT = 0;
        for(char  i = a;i <= n;i++){
            if(i==C3){
                System.out.println("Помилка: Ділення на нуль");
                System.exit(0);}
            for(char j = b;j <= m;j++ ){
                RESULT += (i+j)/(i-C3);
            }
        }
        return RESULT;
    }
}
class Check{
    void check(char a, char b, char n,char m, int C3){
        if (a<0||a>65536||b<0||b>65536||n<0||n>65536||m<0||m>65536){
            System.out.println("Помилка: введені неправильні значення");
            System.exit(0);
        }
    }
}
public class Main {
    public static void main(String[] args) {

        final int C2 = 1;
        final int C3 = 2;
        final int C5 = 3;
        final int C7 = 4;
        final int C = C3;
        int RESULT;
        Scanner f = new Scanner(System.in);
        System.out.println("Введіть значення від 0 до 65536 включно:");
        System.out.print("a : ");
        char a = (char) f.nextInt();
        System.out.print("b : ");
        char b = (char) f.nextInt();
        System.out.print("n : ");
        char n = (char) f.nextInt();
        System.out.print("m : ");
        char m = (char) f.nextInt();
        Check check = new Check();
        check.check(a,b,n,m,C3);
        Calcul CALCUL = new Calcul();
        RESULT = CALCUL.Calc(a,b,n,m,C3);
        System.out.println(RESULT);
    }
}