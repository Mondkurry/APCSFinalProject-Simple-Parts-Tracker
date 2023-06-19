public class CustomPart implements GetName
{
    private String partName;
    private boolean CAM;
    private boolean partMachining;

    public CustomPart()//#9 zero arg (3/6)
    {
        partName = "elevatorTubing";
        //Aluminum 2x1 tubing is used to make lots of our structures in robotics
        CAM = true;
        //CAM Stands for Computer aided machining, it is the coding of the machine in order to make the part
        partMachining = true;
        //Machining is the actual manufactering of the part
    }

    public CustomPart(String partName, boolean CAM, boolean partMachining)
    {
        this.partName = partName;
        this.CAM = CAM;
        this.partMachining = partMachining;
    }

    public void MachinePart()// This method machines the part
    {
        CAM = true;
        partMachining = true;
    }

    public void CAMPart()// This method CAM's the part but doesnt machine it
    {
        CAM = true;
    }

    public boolean getMachiningStatus()// Returns machining status
    {
        return partMachining;
    }

    public String getName()//#20 Called from Interface
    {
        return partName;
    }

    public String toString()
    {
        String output = new String();
        output = "\nCustom Part Name: " +partName+"\nCAM Done: "+ CAM + "\nMachining done: "+getMachiningStatus();
        return output;
    }
}





