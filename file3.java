import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file3 {
    public static void main(String args[]) throws IOException {

        BufferedWriter fout = new BufferedWriter(new FileWriter("output.txt"));
        BufferedReader fin = new BufferedReader(new FileReader("output.txt"));
       try {   
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the your Name : ");
            String name = sc.next();
            fout.write(name+" ");
            System.out.print("Enter your Address : ");
            String address = sc.next();
            fout.write(address);
            sc.close();
            fout.flush();
            String line;
            while((line =fin.readLine()) !=null)
            {
                 String Word[] = line.split(" ");
                 System.out.println("The Name is "+Word[0]+" and Address is " + Word[1]);
            }

            }catch(IOException e){System.out.println("Error");

    }
fout.close();
fin.close();
}
}
