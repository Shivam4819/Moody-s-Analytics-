/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moody.sanalytics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shivam
 */
public class LearningFromPast {
    public void trading(){
         Scanner sc=new Scanner(System.in);
        int n=0,sum=0;
        n=sc.nextInt();
        int[] values=new int[3];
        int[] result=new int[n];
        
        for(int i=0;i<n;i++){
            values[0]=sc.nextInt();
            values[1]=sc.nextInt();
            values[2]=sc.nextInt();
            Arrays.sort(values);
            result[i]=values[1]+values[2];
        }
        Arrays.sort(result);
        
        System.out.println("sum->"+result[n-1]);
    }
}
