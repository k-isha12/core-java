import java.util.Scanner;
class ElectricityBill{
    /** Fixed Charge: A fixed monthly charge of $50 is applied to every bill.
Unit Rates: The cost per unit is tiered as follows:
    1.First 50 units: $0.75 per unit.
    2.Next 100 units: $1.25 per unit.
    3.Any units beyond 150: $1.75 per unit.
      Additional Surcharge: A 10% surcharge is applied to the 
      total calculated amount (sum of the fixed charge and unit costs).
Your program should output the following:
    The total units consumed.
    The total cost based on the unit rates.
    The final electricity bill, including the fixed charge  */
    public static void main(String args[]){
        System.out.println("enter number of units: ");
        Scanner in=new Scanner(System.in);
        float units=in.nextFloat();
        if(units<0){
            System.out.println("units cannot be neagtive");
        }else{
            System.out.println("Total units consumed: "+units);
            float finalBill= totalBill(units);
            System.out.println("The final electricity bill, including the fixed charge: $"+finalBill); 
        }
        in.close();
    }
    static float totalBill(float units){
        float totalUnitsCost=0.0f;
        if(units<=50){
            totalUnitsCost = units*0.75f;
        }else if(units<=150){
            totalUnitsCost=(50*0.75f)+(units-50)*1.25f;
        }else{
            totalUnitsCost=(50*0.75f)+(100*1.25f)+((units-150)*1.75f);
        }
        float totalWithFixedCharge= totalUnitsCost+50.00f;
        System.out.printf("total cost based on the unit rates: $%2f\n",totalUnitsCost);
        float finalBill=totalWithFixedCharge+(totalWithFixedCharge*0.10f);
        return finalBill;
    }
    
}