package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "0"; // holds the history starting at "0"
  private String operator = ""; // holds the individual operation to be appended to history
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () { // returns current total
    return total;
  }
  
  public void add (int value) { // adds parameter to total value
	  total += value;
	  operator = " + " + value; 
	  history += operator;
  }

  public void subtract (int value) { // subtracts parameter from total value
	  total -= value;
	  operator = " - " + value;
	  history += operator;
  }

  public String toString () { // returns the history of transactions
    return history;
  }

  public void clear() { // clears the "memory"
	  history = "0";
	  total = 0;
  }

}
