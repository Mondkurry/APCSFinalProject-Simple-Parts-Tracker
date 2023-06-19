public class preBuiltShooter extends preBuiltMechanism
{
    public void addMechanism()
    {
        System.out.println("Adding Mechanism: Ball Shooter");
        PartList Shooter = new PartList();

        System.out.println("Adding COTS Motors");
        Shooter.addPart("Falcon 500 Motor", "VexPro",140.0, false);

        System.out.println("Adding Side Plates");
        Shooter.addPart("Side Plates", true, true);

        System.out.println("Adding Flywheel");
        Shooter.addPart("SDS Flywheel", "McmasterCarr", 80, true);

        System.out.println("Adding Bearings");
        Shooter.addPart("1/2in Hex Bearings","VexPro",4.95, true);

        System.out.println("Adding hexShaft");
        Shooter.addPart("Hex Shaft 12in", true, false);

        System.out.println("\nShooter:"+Shooter);
    }
}
