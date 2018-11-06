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
public class SmallRiskTrading {
    public void tradingRisk(){
                Scanner sc=new Scanner(System.in);
        int n=0,k=0,index=0;
        System.out.println("n->");
        n=sc.nextInt();
        System.out.println("k->");
        k=sc.nextInt();
        double[] p=new double[n];
        double[] x=new double[n];
        double[] q=new double[n];
        double[] result= new double[n];
        double sum=0,temp=0;
        for(int i=0;i<n;i++){
            p[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            x[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            q[i]=sc.nextDouble();
        }
        
        for(int i=0;i<n;i++){
            temp=p[i]*x[i]-(1-p[i])*q[i];
            if(temp>0)
                result[i]=temp;
            temp=0;
        }
        
        double max;
        for(int i=0;i<result.length;i++){
            System.out.println("result[i]->"+result[i]);
        }
        Arrays.sort(result);
        
        for(int j=0;j<k;j++){
            double last=result[n-j-1];
            
                sum=sum+last;
        }
        System.out.printf("%.2f",sum);
    }
}
