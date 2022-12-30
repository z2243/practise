package argsP;

import java.util.Arrays;

public class argsPractise {
    // javac args.java
    // cd..
    // java argsP.argsPractise -g cruel world
    public static void main(String[] args) {
        //[]
        System.out.println(Arrays.toString(args));
        if(args.length == 0 || args[0].equals("-h")){
            System.out.print("Hello,");
        }else if(args[0].equals("-g")){
            System.out.print("Goobye,");
        }
        //Goobye, cruel world
        for (int i = 1; i < args.length; i++) {
            System.out.print(" "+args[i]);
        }
    }
}
