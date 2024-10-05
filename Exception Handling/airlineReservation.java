import java.util.*;

class airlineReservation 
{
    public static void main(String[] args) throws java.lang.Exception 
	{
        int flightno;
        Scanner sc = new Scanner(System.in);
        int[] seats = {2, 4, 6};

        try
		{
            System.out.println("Available Flights:");
            System.out.println("1. Flight 1 - Seats Available: " + seats[0]);
            System.out.println("2. Flight 2 - Seats Available: " + seats[1]);
            System.out.println("3. Flight 3 - Seats Available: " + seats[2]);

            while (true) 
			{
                System.out.println("Enter the flight number between (1-3) to book, or 0 to exit:");
                flightno = sc.nextInt();

                if (flightno == 0) 
				{
                    break; 
                }

                if (flightno < 1 || flightno > 3) 
				{
                    throw new java.lang.Exception("Invalid flight number selected..."); 
                }

                if (seats[flightno - 1] > 0) 
				{
                    seats[flightno - 1]--;
                    System.out.println("You successfully booked a seat in Flight " + flightno + "!");
                    System.out.println("Seats remaining for Flight " + flightno + ": " + seats[flightno - 1]);
                } 
				else 
				{
                    System.out.println("Sorry, no seats available on Flight " + flightno + ".");
                }
            }

        } 
		catch (java.lang.Exception e) 
		{ 
            System.out.println("Error: " + e.getMessage());
        } 
		finally
		{
            System.out.println("Thank you for using the Airline Reservation System.");
        }

        sc.close();
    }
}
