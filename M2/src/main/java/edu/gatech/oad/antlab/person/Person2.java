
package edu.gatech.oad.antlab.person;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *

 * @author Daniel Martin
 * @version 1.2
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
    String jumbleStr = "";
    while(input.length() != 0) {
        int randomInt = (int)(Math.random() * input.length());
        jumbleStr += (char) input.charAt(randomInt);
        input = input.substring(0, randomInt) + input.substring(randomInt + 1);
    }
    return jumbleStr;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
