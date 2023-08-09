import java.util.*;
public class RankingStudents
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int[] score = new int[n];
        int pos = sc.nextInt(); String[] name = new String[n];
        for(int i = 0; i < n; i++)
        {
            name[i] = sc.next();
            score[i] = sc.nextInt();
        }   String temp1 = "";
        int temp=0;
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < n-1; j++)
            {
                if(score[j]>score[j+1])
                {
                    temp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = temp;
                    
                    temp1 = name[j];
                    name[j] = name[j+1];
                    name[j+1] = temp1;
                }
            }
        }
        System.out.println(name[n-pos]);
    }
}
