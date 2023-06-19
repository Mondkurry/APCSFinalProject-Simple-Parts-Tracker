import java.util.*;

public class PartList//#11 Class composition(1/1) Class receives inputs from both CustomPart.java and COTSPart.java.
{
    // ArrayList to hold COTSParts
    ArrayList<COTSPart> COTSPartList = new ArrayList<>();

    //Array List to hold Custom Parts
    ArrayList<CustomPart> CustomPartList = new ArrayList<>();

    ArrayList<String> COTSPartListNames = new ArrayList<String>();

    //Array List to hold Custom Parts
    ArrayList<String> CustomPartListNames = new ArrayList<String>();

    String[] availableVendors = {"VexPro","AndyMark","McmasterCarr","REV","CTRE", "Amazon"};// String of acceptable vendors

    public void addPart(String name, String vendor, double price, boolean purchased) //#10 Overloaded methods(3/7)
    {
        COTSPartList.add(new COTSPart(name, vendor, price, purchased));// add COTS parts
        //#13 Array List used in student designed class (1/1) (accessed through for loop in toString())
        COTSPartListNames.add(name);
    }
    public void addPart(String partName,boolean CAM,boolean partMachining)//#10 Overloaded methods(4/7)
    {
        CustomPartList.add(new CustomPart(partName, CAM, partMachining));// add Custom parts
        CustomPartListNames.add(partName);
    }

    public String vendors()//#10 Student Designed class(7/7)
    {//Outputs all the possible vendors
        String vendorOutput = new String();
        for(String Vendors: availableVendors)//#4 For each loop (3/4)
        {
            vendorOutput+=Vendors+", "; //#12 Array used in Student designed class (1/1)
        }
        return vendorOutput;
    }

    public int maxPrice()//Checks for the Maximum price of an item
    {
        int maxPrice = 0;
        for (COTSPart part : COTSPartList) {//#14 For each Loop to get max price(1/1)
            maxPrice = Math.max(maxPrice, (int)part.getPrice());//#8 Casting (1/1)
        }
        return maxPrice;
    }

    public String toString()//#9 toString()
    //Prints out COTS and Custom parts in a more formated way
    {
        Collections.sort(COTSPartListNames);//#24 QuickSorts all the COTS Part Names(1/1)
        Collections.sort(CustomPartListNames);//#24 QuickSorts all the Custom Part Names(1/1)

        String output = new String();

        //COTS Parts output
        output = "\nOff the Shelf Parts:\n ";
        for(int i = 0; i<COTSPartList.size(); i++)
        {
            output+= COTSPartList.get(i)+"\n";
            if( COTSPartList.get(i).checkAvailability()== true && COTSPartList.get(i).getPrice() <= 500.0)//#20 checkAvailability is from COTSPart Class
            //#1 Logical Operator (4/4)
            {
                output+= "Purchase Order submitted\n";// Checks if the purchase order can be submmited and submits it for small purchases
            }
        }
        output+= "Max Price for an item: " + maxPrice();
        output+= "\nVendors to buy from: "+ vendors();


        //Custom Parts output
        output += "\n\nCustom Parts: ";
        for(int i = 0; i<CustomPartList.size(); i++)//#4 For Loop (4/4)
        {
            output+= CustomPartList.get(i)+"\n";
        }

        return output;
    }
}
