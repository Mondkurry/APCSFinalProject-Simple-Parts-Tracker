import java.util.*;

public class Mechanism//#21 Mechanism is-a PartList or collection of parts.
{
    public static void main (String[] args)
    {
        String yes = "yes";
        String no = "no";

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Do you want to add a new Mechanism?");
            String addMechanism = input.nextLine().toLowerCase();//#7 String Methods (3/3)
            //
            int index = 0; //Counter
            //#3 integer (1/3)
            PartList mechanismList = new PartList();// Creates a parts List for each Mechanism which is comprised of both custom and commercial parts
            String nameOfMechanism = "";

            do{// Do while loop used so that the user gets asked to add a custom part 2 times as a confirmation when exiting the program
                if (yes.equals(addMechanism))//#7 String method (2/3)
                //#2 if Else with throw error(1/2)
                // Checks if user wants to add mechanism
                {
                    System.out.println("Name your Mechanism: ");
                    nameOfMechanism += input.nextLine();// Asks user for input for Mechanism name

                    System.out.println("true or false Add Part?");//#17 JScanner (1/1)
                    boolean addMoreParts = input.nextBoolean(); // Asks user if they want to add a part

                    while(addMoreParts)//#1 Relational Operators(1/4)
                    //#18 Nested loop(1/1) EC
                    {
                        input.nextLine(); // Clear line enter
                        System.out.println("Input COTS Part or Custom Part");
                        String COTSOrCustom = input.nextLine(); //Distinguishes between a COTS Part and Custom Part because it has an overloaded multiArg

                        switch(COTSOrCustom){ //#5 Switch Statement (1/1)
                            // Switch statement to decide whether user wants a COTS or Custom Part

                            case "Custom Part": //Asks for the inputs required to make a Custom Part
                                System.out.println("Enter the Part Name: ");
                                String partName = input.nextLine();
                                System.out.println("(true or false)CAM done: ");//#17 More JScanner throughout(1/1)
                                boolean CAMDone = input.nextBoolean();
                                System.out.println("(true or false)Machining done: ");
                                boolean machiningDone = input.nextBoolean();
                                mechanismList.addPart(partName,CAMDone,machiningDone);// Inputs entered into the PartList
                                break;

                            case "COTS Part":
                                System.out.println("Enter the part Name: ");// Gathers user inputs for parts
                                String name = input.nextLine();
                                System.out.println("Enter the Vendor Name: ");// Gathers user inputs for parts
                                String vendor = input.nextLine();
                                System.out.println("Price: ");
                                double price = input.nextDouble(); //#3 Double(3/3)

                                price = Math.pow(price,1.12); //#6 Math.pow(1/2)
                                //tax and shipping included in price

                                System.out.println("(true or false)Purchased: ");
                                boolean purchased = input.nextBoolean();
                                mechanismList.addPart(name, vendor,price, purchased);// User inputs entered into the Part List
                                break;

                            default:
                                throw new IllegalArgumentException("Arguments must be COTS Part or Custom Part");
                        }

                        input.nextLine(); // Clear line enter
                        System.out.println("true or false Add another Part?");// Asks user if they want to enter more parts or exit the program
                        addMoreParts = input.nextBoolean();
                    }//#4 While Loop(1/4)
                }
                else if(no.equals(addMechanism))
                {
                    System.out.print("Subsystem finished"); // Confirmation that program has been exited
                }
                else if(addMechanism != "yes" || addMechanism != "no" )//#1 Relational operator(2/4)
                //#1 Logical operator(3/4)
                {
                    // Input can only be yes or no, error thrown for exceptions
                    throw new IllegalArgumentException("Arguments must be yes or no");
                }
                index++;
            }while(index<2);//#4 Do while(2/4)\





            System.out.println("\n\nMechanism name: "+ nameOfMechanism);// Output
            System.out.println(mechanismList);
        }
    }
}
