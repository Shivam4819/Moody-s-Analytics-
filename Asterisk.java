/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moody.sanalytics;

import java.util.Scanner;

/**
 *
 * @author shivam
 */
public class Asterisk {

    public void mainfun(){
        Scanner sc=new Scanner(System.in);
        int n=0,sum=0,count=0,j=0;
        String str=sc.nextLine(); 
        int flag=checkValidOrNot(str);
        if (flag==0){
            System.out.println("valid");
            validString(str);
        }
        else{
            System.out.println("invalid");
        }
    }
    
    public void validString(String str){
        System.out.println("welcome to valid string operation");
        int[] num=new int[2];
        int count=0,j=0,sum=1,result=0,flag=0;
        String[] str2=str.split("");
        for(int i=0;i<str2.length;i++){
            if(str.charAt(i)!='*'){
                //System.out.println("num["+j+"]->"+num[j]);
                num[j]=Integer.parseInt(str2[i]);
                System.out.println("num["+j+"]->"+num[j]);
                j++;
                if(count==1){
                    sum=num[0]*num[1];
                    num[1]=sum;
                    result=result+sum;
                    flag=1;
                    System.out.println("from1...."+sum);
                }
                else if(count==2){
                    sum=(int)Math.pow(num[0], num[1]);
                    num[1]=sum;
                    result=result+sum;
                    System.out.println("from2...."+sum);
                }
                if(j>1)
                    j=0;
            }
            else{
                if(count>=2){
                    count=0;
                    count++;
                }
                else if(flag==1){
                    count=1;
                    flag=0;
                }
                else
                    count++;
            }
        }
        System.out.println("sum->"+sum);
    }
    
    public int checkValidOrNot(String str){
        int valid=0,invalid=1;
        if(str.charAt(0)=='*'||str.charAt(str.length()-1)=='*'){
            return invalid;
        }
        for(int i=0;i<str.length();i++){
            if(i<str.length()){
                if(str.charAt(i)=='*'){
                    if(str.charAt(i+1)=='*'){
                        if(str.charAt(i+2)=='*'){
                            return invalid;
                        }
                    }
                }
            }
        }
        return valid;
    }
}
