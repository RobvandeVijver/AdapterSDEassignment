package com.hz;

/**
 * Adapter class
 */
public class Adapter {

    /**
     * Properties
     */
    private ConsoleReader reader;
    private String[] passValues = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

    /**
     * Constructor
     * @param reader
     */
    public Adapter(ConsoleReader reader) {
        this.reader = reader;
    }

    /**
     * Checks the userInput and returns
     * @return True or Fasle
     */
    public boolean correctMessage() {
        // read = user input
        String read = this.reader.readLine();

        // checks if the value is one of the passValues
        for(String s :passValues){

            // if the value is the same as one of the passValue array return true
            if (read.equals(s)) {
                return true;
            }

            // if the read doens't exist in the passValue array it returns false
        } return false;
    }

}
