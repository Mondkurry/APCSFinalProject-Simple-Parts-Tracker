import java.util.*;

//For referance COTS is an acronym for Comercial off the shelf which means that the part is readily available from a vendor and no machining is required

public class COTSPart
{
    ArrayList<Integer> partList = new ArrayList<Integer>();
    private int partIndex;
    private int partNum = partIndex + 1;
    
    private String vendor;
    
    public COTSPart(Integer partNum, boolean Machining)
    {
        this.partNum = partNum;
        
    }
    
    public void setPartNum()
    {
        partList.add(partIndex+1);
    }
    
    public int getPartNum()
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
        output = "Custom Part Number: " +getPartNum()+"\n"+vendor;
        return output;
    }
}
