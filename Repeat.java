import java.io.*;
import java.util.Scanner;
public class Repeat {
    public static void main(String args[])
    {
        int n,i,j,count=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {a[i]=s.nextInt();
        }
        
        for(i=1;i<n;i++)
        {for(j=0;j<i;j++)
        {if(a[i]==a[j])
        {
            System.out.println(a[i]);
        }}}}
    }
    

