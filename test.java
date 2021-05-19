package Minions;

import java.util.*;
import java.io.IOException;
import java.io.*;

/*
Ищем совпадения среди имен и фамилий
*/

public class test  {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine(); // должна заменять в тексте первые буквы всех слов на заглавные
        //String emojiString = "Вставте сюда эмоджи через ctrl+v";
        //На один emojiString приходится 2 чара (т.к. не влезает в 16 бит)
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(new String(chars));
    }
}
