import java.util.*;

//For referance COTS is an acronym for Comercial off the shelf which means that the part is readily available from a vendor and no machining is required

public class COTSPart
{
    private String vendor;
    ArrayList<Integer> partList = new ArrayList<Integer>();
    private int price;
    /*import java.util.*;

public class CustomPart
{
    ArrayList<Integer> partList = new ArrayList<Integer>();
    private int partIndex = 1;
    private int partNum = partIndex - 1;
    private boolean CAM;
    private boolean partMachining;
    
    public CustomPart(Integer partNum, boolean CAM, boolean partMachining)
    {
        this.partNum = partNum;
        this.CAM = CAM;
        this.partMachining = partMachining;
    }
    
    public void setPartNum()
    {
        partList.add(partIndex);
        partIndex++;
    }
    
    public int getCustomPartNum()
    {
        return partIndex;
    }
    
    public void CAMFinished(int partIndex)
    {
        boolean CAM = true;
    }
    
    public String toString()
    {
        String output = new String();
        output = "Custom Part Number: " +getPartNum()+"\nCAM Done: "+ CAM + "\nMachining done: "+partMachining;
        return output;
    }
}

       */
    
    public COTSPart(String vendor, int price)
    {
        this.partList = partList.add(vendor, price);
    }
    
    public void addCOTSPart(String COTSPart, int Price)
    {
        
    }
    
    public String toString()
    {
        String output = new String();
        output = "Custom Part Number: " +getPartNum()+"\n"+vendor;
        return output;
    }
}
