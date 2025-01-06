package TalentBattle;
import java.util.Scanner;

public class Clock_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a * b;

        /*
        int result= c%12;
        return result==0 ? 12 : result;
         */
        if (c > 12) {
            System.out.println(c - 12);
        } else {
            System.out.println(c);
        }
    }
}

/*
formal parameters: only scope in the function ;
actual parameters: parameters;
java basics syntax - static, main, void - please see once;
basic formulaas of cube etc...
ceil, round, max , min , fllor
conversions ... data varibles

logical psuedocodes
patterns
interface
matrix

bitwise operator
pattern
string operations
hashmap
dp
akshada problem
decimal binarrt logic

 */