package edu.cnm.deepdive;

public class Frobenius {

  public static boolean isMcNugget(int value) {
    // TODO Return true if value can be expressed as the sum of integral multiples (including
    //  multiplication by zero) of the 3 original McNugget pack sizes; return false otherwise.
    return value >= 0
        && ( value == 0
        || isMcNugget(value -20)
        || isMcNugget(value - 9)
        || isMcNugget(value - 6)
    );
  }
}
