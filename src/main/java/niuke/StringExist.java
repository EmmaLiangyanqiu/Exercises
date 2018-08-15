package main.java.niuke;

import java.util.Scanner;

/**
 * Created by Emma on 2018/8/6.
 */
public class StringExist {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (input.hasNextLine()) {
            String strshort = input.nextLine();
            String strlong = input.nextLine();
            System.out.println(boolIsAllCharExist(strlong, strshort));
        }
    }

    public  static  boolean boolIsAllCharExist(String strlong,String strshort) {
        int size=strshort.length();
        for (int i = 0; i <size ; i++) {
            if(!strlong.contains(Character.toString(strshort.charAt(i)))){
                return false;
            }
        }
        return true;
    }

}
