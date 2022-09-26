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
        this.file = "C:\\Users\\Sebastian\\Documents\\KaltseisSebastian";
        Scanner scanner = new Scanner(this.file);
        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if(!line.equals("0"))
            {
                String[] temp= line.split("");
            }

        }
    }
}
