import java.util.*;

public class COTSPart implements GetName

{
    public String name;
    private final String vendor;
    ArrayList<Integer> partList = new ArrayList<Integer>();
    private double price;// Price of item before tax
    //#3 Double(2/3)
    private boolean purchased;// Is the item Purchased
    //#3 Boolean(3/3)
    //#9 Instance variables(1/6)

    public COTSPart(String name, String vendor, double price, boolean purchased) //#9 Multi arg(2/6)
    {
        this.name = name;
        this.vendor = vendor;
        this.price = price;
        this.purchased = purchased;
    }

    public boolean checkAvailability()//#10 Student designed method(6/7)
    //Checks for part availability based on a random function
    {
        if (Math.random()*10<4)//#2 If else statement (2/2)
        //#6 Math.random (2/2)
        {
            purchased = false;
        }
        else
        {
            purchased = true;
        }
        return purchased;
    }

    public String getName()//#20 Called from Interface
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPurchased(boolean isPurchased)//#9 Setter method (5/6)
    //#10 setter method (1/7)
    //Sets the item to purchased if it has been purchased
    {
        isPurchased = purchased;
    }

    public double getPrice()//#9 Getter method (4/6)
    //#10 getter method (2/7)
    //returns price
    {
        return price;
    }

    public String getShortName() //#10 Student Designed method(5/7)
    //Returns the first 10 Characters of a vendors name if it is greater than 10 to cut down on the length
    {
        if (vendor.length() >= 10)
        {
            return vendor.substring(0, 9) + "...";//#7 String method with Substring(1/3)
            //#9 processor method (6/6)
        }
        else
        {
            return vendor;
        }
    }


    public String toString()
    {
        String output = new String();
        output = "\nPart Name: "+getName()+"\nVendor Name: " +getShortName()+"\nPrice incl. Tax and Shipping: "+getPrice() + "\npurchased: " + checkAvailability() ;
        return output;
    }
}
