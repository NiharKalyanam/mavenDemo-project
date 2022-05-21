package com.learnmaven.mavendemo;

/**
 * Hello world!
 *
 */
import org.apache.log4j.Logger;
public class App 
{
	final static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.debug(new Calculator().add(10, 10));
        logger.debug(new Calculator().sub(10, 10));
        logger.debug(new Calculator().multiple(10, 10));
        logger.debug(new Calculator().divison(10, 10));
    }
}
