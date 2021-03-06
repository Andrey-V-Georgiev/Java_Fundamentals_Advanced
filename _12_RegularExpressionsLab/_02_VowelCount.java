package _12_RegularExpressionsLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_VowelCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Pattern pattern = Pattern.compile("[AUOIEYauoiey]");
        Matcher matcher = pattern.matcher(reader.readLine());

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println("Vowels: " + counter);

    }
}
