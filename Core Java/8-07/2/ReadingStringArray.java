import java.io.*;
 
 public class ReadingStringArray
 {
     public static void main(String args[]) throws IOException
     {
         
         /* create a BufferedReader using System.in */
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         String str[] = new String[80];
         
         System.out.println("Enter some lines of text (Enter 'stop' to quit) : ");
         for(int i=0; i<80; i++)
         {
             str[i] = br.readLine();
             if(str[i].equals("stop"))
             {
                 break;
             }
         }
         
         System.out.println("\nHere is your file :");
         
         /* now display the lines */
         for(int i=0; i<80; i++)
         {
             if(str[i].equals("stop"))
             {
                 break;
             }
             System.out.println(str[i]);
         }
         System.out.println();
         System.out.println("Thank You!");
     }
 }