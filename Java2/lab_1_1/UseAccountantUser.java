package lab_1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by:  Andrew Sotnikov aka Luca Brasi
 * date:        25.04.17
 */
public class UseAccountantUser {

    public static void main(String[] args) throws IOException {


        AccountantUser account = new AccountantUser();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String\n");

        while (true) {

            String s = input.readLine();
            if (s.equals("")) {
                break;
            }
            account.testUsers(s);

        }
        account.exitFromDb();


    }

}
