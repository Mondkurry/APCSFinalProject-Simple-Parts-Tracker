public abstract class preBuiltMechanism
{
    public void init()
    {
        System.out.println("Adding Mechanism...");

        addMechanism();

        System.out.println("Mechanism Added");
    }
    public abstract void addMechanism();
}
