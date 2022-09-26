package net.htlgrieskirchen.pos2.kaltseisSebastian;

import java.util.Scanner;

public class NumberTester {

    public String file;
    public NumberTest oddTester;
    public NumberTest primeTester;
    public NumberTest palindromeTester;

    public NumberTester(String file) {
        this.file = file;
    }

    public void setOddEvenTester(NumberTest oddTester)
    {
            this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester)
    {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester)
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

            switch (line) {
                case "1" -> {
                    setOddEvenTester((odd) -> (odd % 2 == 0));
                    System.out.println("EVEN");
                    setOddEvenTester((oddTester) -> (oddTester % 2 != 0));
                    System.out.println("NOT EVEN");
                }
                case "2" -> {
                    setPrimeTester((primeTester) -> (primeTester / 2 == 0) && (primeTester / 3 == 0));
                    System.out.println("PRIME");
                }
                case "3" -> setPalindromeTester((palindromeTester) ->
                {
                    String palin = Integer.toString(palindromeTester);
                    if (palin.endsWith("321")) {
                        System.out.println("PALINDROME");
                    }
                    return true;
                });
            }

        }
    }
}
