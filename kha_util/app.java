
package kha_util;

import java.util.Scanner;

public class app {
    public static double PI = 3.1415;

    public static int getInteger() {
        int n;
        Scanner sc = new Scanner(System.in);
        try{
            do{
                try{
                    System.out.println("Input integer");
                    n = Integer.parseInt(sc.nextLine());
                    return n;
                }
                catch(Exception e){
                    System.out.println("Again!!!");
                }
            }while(true);
            
        }
        finally{
            sc.close();
        }
    }
}
