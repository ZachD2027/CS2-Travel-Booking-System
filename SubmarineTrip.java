public class SubmarineTrip {
// 1. INSTANCE VARIABLES (data)
private static int processFee = 250000; // class variable
private String travelerName;
private String destination;
private int durationInHours;
private boolean isAlive;
private double totalCost;
// 2. CONSTRUCTORS (default + parameterized)
public SubmarineTrip() {
    this.travelerName = "DefaultClient";
    this.destination = "Titanic Wreck";
    this.durationInHours =8;
    this.isAlive = false;
    this.totalCost = processFee * durationInHours;
}
public SubmarineTrip(String name, String destination, int duration, boolean alive) {
    this.travelerName = name;
    this.destination = destination;
    this.durationInHours = duration;
    this.isAlive = alive;
    this.totalCost = processFee * durationInHours;
}

// GETTERS
public String getTravelerName() {
    return travelerName;
}

public String getDestination() {
    return destination;
}

public int getDurationInHours() {
    return durationInHours;
}

public boolean getIsAlive() {
    return isAlive;
}

public double getTotalCost() {
    return totalCost;
}

public static int getProcessFee() {
    return processFee;
}

// SETTERS
public void setTravelerName(String travelerName) {
    this.travelerName = travelerName;
}

public void setDestination(String destination) {
    this.destination = destination;
}

public void setDurationInHours(int durationInHours) {
    this.durationInHours = durationInHours;
}

public void setIsAlive(boolean isAlive) {
    this.isAlive = isAlive;
}

public void setTotalCost() {
    this.totalCost = processFee * this.durationInHours;
}
 public String toString() {
    String tripDetails = "-----------------------------------------\n" +
    "     SUBMARINE TRIP ITINERARY    \n" +
    "-----------------------------------------\n" +
    "TRAVELER NAME:  " + travelerName + "\n" +
    "DESTINATION:    " + destination + "\n" +
    "DURATION:       " + durationInHours + " Hours\n" +
    "STATUS:         " + (isAlive ? "Alive" : "Not Alive") + "\n" +
    "-----------------------------------------\n" +
    "TOTAL COST:   $" + totalCost + "\n" +
    "-----------------------------------------\n" +
    "  Thank you for choosing DeepSea Tours!  \n";
    return tripDetails;
}



}