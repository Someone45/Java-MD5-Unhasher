import java.net.URL;
import java.net.http.*;
import java.io.*;
import java.util.Scanner;

public class Tester{

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your hash?");
        String hash = scanner.nextLine();
        scanner.close();
        System.out.println();
        URL url = new URL("http://www.nitrxgen.net/md5db/" + hash);
        BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                    url.openStream()));
        
        String inputLine;
        
        while ((inputLine = in.readLine()) != null)
            System.out.println("Your hash is: " + inputLine);
        
        in.close();
    }

}