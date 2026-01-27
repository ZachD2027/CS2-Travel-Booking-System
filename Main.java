import java.util.Scanner;

public class Main {

   public static void main(String []args) {

      //Test out the cnstructor for Trip objects
      SubmarineTrip trip1 = new SubmarineTrip();
      System.out.print(trip1);

      Scanner input = new Scanner(System.in);
      // LOOP for booking trips with client input
      boolean continueBooking = true; // flag to control loop
      while (continueBooking) {
         // 1. Call static bookTravel method to create object
         SubmarineTrip currentTrip = bookTrip(input);
         // 2. Display the object's details
         System.out.println(currentTrip);
         // 3. Ask user if they want to continue booking
         System.out.println("Do you want to book another Submarine trip? (y/n)");
         String response = input.nextLine();
         if ( response.equals("n") ) {
            continueBooking = false; // stop the loop
         }

      }


   } // end main method

   // Methods don't have to just be for object classes!
   // Write a reusable process for creating objects
   public static SubmarineTrip bookTrip(Scanner scan) {
      // 1. Create a blank travel object
      SubmarineTrip newTrip = new SubmarineTrip();

      // 2. Ask client for deatils
      System.out.println("What is your name?");
      String clientName = scan.nextLine();
      System.out.println("Where do you want to go?");
      String clientDestination = scan.nextLine();
      System.out.println("How many days?");
      int clientDuration = scan.nextInt();
      System.out.println("Are you alive? Type true or false");
      boolean clientAlive = scan.nextBoolean();
      

      // 3. Call mutator methods (setters) to update the object
      newTrip.setTravelerName(clientName);
      newTrip.setDestination(clientDestination);
      newTrip.setDurationInHours(clientDuration);
      newTrip.setIsAlive(clientAlive);
      newTrip.setTotalCost();
      

      // 4. Return the completed travel object
      return newTrip;
   }


} // end Main class
