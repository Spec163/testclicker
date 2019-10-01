package clicker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClicker {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("input.txt"));

        FirstTread firstTread = new FirstTread();
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();

        firstTread.test(sc.nextInt(), sc.nextInt());
        secondThread.test(sc.nextInt(), sc.nextInt());
        thirdThread.test(sc.nextInt(), sc.nextInt());

    }
}
