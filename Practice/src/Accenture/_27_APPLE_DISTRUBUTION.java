package Accenture;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.plaf.PanelUI;

public class _27_APPLE_DISTRUBUTION {
    public static void ifFair(int n, int mi, int ma, int w) {
        int totalWeight = n * w;
        if (mi * n <= totalWeight && ma * n >= totalWeight) {
            if (totalWeight % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args){
        ifFair(3,100,300,200);
    }

}
