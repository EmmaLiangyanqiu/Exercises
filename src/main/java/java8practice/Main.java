package java8practice;

import java.util.*;

/**
 * Created by Emma on 2018/9/14.
 */
public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        method1(transactions);
    }


        /*
        * 1.
        * */
        public static  void method1(List<Transaction>  list){
            Collections.sort(list,new Comparator<Transaction>(){
                @Override
                public int compare(Transaction o1, Transaction o2) {
                    if(o1.getValue() < o2.getValue()){
                        return 1;
                    }
                    if(o1.getValue() == o2.getValue()){
                        return 0;
                    }
                    return -1;
            }});

            for (Transaction transaction : list) {
                if (transaction.getYear()==2011){
                    System.out.println(transaction.getValue());
            }
        }
    }

    /*
    * 7.
    * */
    public void max(List<Transaction> list){
        Transaction transaction=Collections.max(list)
    }



    }

