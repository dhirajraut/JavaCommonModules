package com.galaxy.java.common.modules.SimpleLoggingThread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Thread simpleLoggingThread = new Thread(new SimpleLoggingThread(5));
        simpleLoggingThread.start();
    }
}
