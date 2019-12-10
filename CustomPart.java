import java.util.*;

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
        output = "Custom Part Number: " +getCustomPartNum()+"\nCAM Done: "+ CAM + "\nMachining done: "+partMachining;
        return output;
    }
}
