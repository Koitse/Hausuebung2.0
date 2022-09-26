package net.htlgrieskirchen.pos2.kaltseisSebastian;

import java.io.FileReader;
import java.util.Scanner;

public class NumberTester {

    public String file;
    public TestNumber oddTester;
    public TestNumber primeTester;
    public TestNumber palindromeTester;

    public NumberTester(String file) {
        this.file = file;
    }

    public void setOddEvenTester(TestNumber oddTester)
    {
            this.oddTester = oddTester;
    }

    public void setPrimeTester(TestNumber primeTester)
    {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(TestNumber palindromeTester)
    {
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){
        this.file = "C:\\Users\\Sebastian\\Documents\\Hausuebung2.0";
        Scanner scanner = new Scanner(this.file);
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[] temp = new String[0];
            if(!line.equals("0"))
            {
               temp = line.split("");
            }

            switch (line)
            {

                case "1" : setOddEvenTester((odd)->(odd%2==0));
                    System.out.println("EVEN");
                break;

                case "2": TestNumber isPrime = (s)->{

                    return false;
                };
                break;
                case "3": setPalindromeTester((palindromeTester)->
                {
                  String palin =  Integer.toString(palindromeTester);
                  if(palin.endsWith("321"))
                  {
                      System.out.println("PALINDROME");
                  }
                  return true;
                });

            }

        }
    }
}
