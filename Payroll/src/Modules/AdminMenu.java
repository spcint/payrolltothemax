
package Modules;
import payroll.*;
import java.util.Calendar;
import java.util.Scanner;

/**
 * This module handles all the administrative actions such as editing
 * employee information, making time corrections, and printing out pay checks.
 * @author Blake
 */
public class AdminMenu
{
    /**
     *  Loops through the Administrator Menu
     *  @return     false to stop looping
     */
    public boolean Update()
    {
        //Menu selection variables
        int menuSelection = 1;
        Scanner in = new Scanner(System.in);

        System.out.format("\nCurrent time: %tT\n\n", Calendar.getInstance());
        System.out.println("1 - Create Employee Record");
        System.out.println("2 - Edit/View Existing Employee Record");
        System.out.println("3 - Test");
        System.out.println("4 - View Employee List");
        System.out.println("5 - Back to Main Menu");
        System.out.print("Selection: ");
        if (in.hasNextInt())
            menuSelection = in.nextInt();
        System.out.println("");

        switch(menuSelection)
        {
            //Create Employee Record
            case 1:
                Globals.currentState = Globals.State.CreateEmployee;
                return false;
            //Edit/View Existing Employee Record
            case 2:
                Globals.currentState = Globals.State.EditEmployee;
                return false;
            //Test Reading/Writing
            case 3:
                Globals.currentState = Globals.State.Test;
                return false;
            //Print the employee list to the screen
            case 4:
                Globals.currentState = Globals.State.EmployeeList;
                return false;
            case 5:
                Globals.currentState = Globals.State.MainMenu;
                return false;
            default:
                System.out.println("Invalid choice.");
                break;
        }
            
        //Keep looping
        return true;
    }

}