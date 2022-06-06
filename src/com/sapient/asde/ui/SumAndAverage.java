package com.sapient.asde.ui;

public class SumAndAverage {
    public static void main(String[] args) {
        int sum=0;
        try{
            if(args.length==0){
                throw new IllegalArgumentException("Enter commandline arguments");
            }
            for(String arg : args){
                sum += Integer.parseInt(arg);
            }
            double average = (double)sum/args.length;
            System.out.println("Average Value: "+ average);
        } catch(NumberFormatException e){
            e.printStackTrace();
        } catch(IllegalArgumentException e){
          e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

