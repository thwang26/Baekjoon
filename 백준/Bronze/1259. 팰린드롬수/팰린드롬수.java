import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.IntToLongFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import java.util.Arrays;

public class Main {

    //백준
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String n;
        while(true){
            boolean p = true;
            n = scan.nextLine();
            if(n.equals("0")) break;
            for(int i = 0 ; i <= n.length()/2-1 ; i++){
                if(n.charAt(i)!=n.charAt(n.length()-1-i)){
                    p = false;
                    break;
                }
            }
            System.out.println(p ? "yes" : "no");
        }
    }
}