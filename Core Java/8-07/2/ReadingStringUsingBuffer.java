import java.io.*;
 
 public class ReadingStringUsingBuffer
 {
     public static void main(String args[]) throws IOException
     {
         
         /* create a BufferedReader using System.in */
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         String str;
         
         System.out.println("Enter some lines of text (enter 'stop' to quit) : ");
         // read string now
         do
         {
             str = br.readLine();
             System.out.println(str);
             
         } while(!str.equals("stop"));
         System.out.println();
         System.out.println("Thank You!");
     }
  }