/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package babysitterpay;

/**
 *
 * @author ddeantonio32
 */
public class BabysitterPay
{

    /**
     * @param args the command line arguments
     */
    public static void payrate()
    {
        double startTimeHr = 0.0;
        double endTimeHr = 0.0;
        double startTimeMin = 0;
        double endTimeMin = 0.0;
        
        double totalTime1 = 0.0;
        double totalTime2 = 0.0;
        double totalTime3 = 0.0;
        
        double subTotal1 = 0.0;
        double subTotal2 = 0.0;
        double subTotal3 = 0.0;
        
        double totalPay = 0.0;
        
        double payScale1 = .073;
        double payScale2 = .068;
        double payScale3 = .148;
         
        System.out.println("Enter Start Time Hour");
        startTimeHr = SavitchIn.readLineInt();
        System.out.println("Enter Start Time Minute");
        startTimeMin = SavitchIn.readLineInt();
        System.out.println("Enter End Time Hour");
        endTimeHr = SavitchIn.readLineInt();
        System.out.println("Enter End Time Minutes");
        endTimeMin = SavitchIn.readLineInt();
        
        //this first if statement checks to see if the start time is between 6pm and 8pm               
        if ((startTimeHr >= 6) && (startTimeHr < 8))
        {
            //this if statement checks to see if the time ends between 6pm and 8pm
            //if so, then calculates the total time and multiplies it by the payScale1
            if  ((endTimeHr >= 6) && (endTimeHr < 8))
            {
                totalTime1 = ((startTimeHr -6) * 60) + startTimeMin; 
                subTotal1 = (120 - totalTime1) * payScale1;
            }            
            else if ((endTimeHr >= 8) && (endTimeHr < 12))
            {
                totalTime1 = ((startTimeHr -6) * 60) + startTimeMin; 
                subTotal1 = (120 - totalTime1) * payScale1;
                totalTime2 = ((endTimeHr -6) * 60) + endTimeMin; 
                subTotal2 = (240 - totalTime2) * payScale2;
            }
            else if ((endTimeHr >= 12) && (endTimeHr <= 4))
            { 
                if ((endTimeHr  >= 1) && (endTimeHr <= 4))
                {
                    startTimeHr = startTimeHr + 12;
                }
            totalTime3 = ((startTimeHr -6) * 60) + startTimeMin; 
            subTotal3 = (totalTime3 - 600) * payScale3;
            }
        }        
        System.out.println("First Total time " + totalTime1);
        System.out.println("First Total " + (String.format("%.2f",subTotal1)));
        
        
//        if ((startTimeHr >= 8) && (startTimeHr < 12))            
//        {
//            if ((endTimeHr >= 8) && (endTimeHr < 12))
//            {
//                totalTime2 = ((startTimeHr -6) * 60) + startTimeMin; 
//                subTotal2 = (240 - totalTime2) * payScale2;
//            }
//            else if ((endTimeHr >= 12) && (endTimeHr <= 4))
//            { 
//                if ((endTimeHr  >= 1) && (endTimeHr <= 4))
//                {
//                    startTimeHr = startTimeHr + 12;
//                }
//            totalTime3 = ((startTimeHr -6) * 60) + startTimeMin; 
//            subTotal3 = (totalTime3 - 600) * payScale3;
//            }
//        }        
        System.out.println("Second Total time " + totalTime2);
        System.out.println("Second Total " + (String.format("%.2f",subTotal2)));
        
        
//        if ((startTimeHr >= 12) && (startTimeHr <= 4))
//        { 
//            if ((endTimeHr  >= 1) && (endTimeHr <= 4))
//            {
//                startTimeHr = startTimeHr + 12;
//            }
//            totalTime3 = ((startTimeHr -6) * 60) + startTimeMin; 
//            subTotal3 = (totalTime3 - 600) * payScale3;
//        }        
        System.out.println("Third Total time " + totalTime3);
        System.out.println("Third Total " + (String.format("%.2f",subTotal3)));
        
        totalPay = subTotal1 + subTotal2 + subTotal3;
        System.out.println("Final Total " + (String.format("%.2f",totalPay)));
    }
    
    public static void main(String[] args)
    {
        payrate();
    }
    
}
