/*Write a Java program that reads a file and displays the file on the screen, with a line number
before each line by handling all file related exceptions.*/
import java.util.*;
import java.io.*;
class file1
{
    public static void main(String args[])throws IOException
    {
        int j=1;
        char ch;
        Scanner obj=new Scanner (System.in);
        System.out.print("\nEnter File name: ");
        String str=obj.next();
        FileInputStream f=new FileInputStream(str);
        System.out.println("\nContents of the file are");
        int n=f.available();
        System.out.print(j+": ");
        for(int i=0;i<n;i++)
            {
                ch=(char)f.read();
                System.out.print(ch);
                if(ch=='\n')
                    {
                        System.out.print(++j+": ");
                                               
                    }
                                               
            }
        }
}
   