import java.text.SimpleDateFormat;

public class Threads extends Thread {
    /**
     * 1. using Runnable interface
     * 2. extends Thread class
     */

    private String threadName;

    public Threads(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i = 1; i < 10; i++) {
            System.out.println("Thread " + this.threadName + " repeating " + i );
        }
    }
SimpleDateFormat
}

/**
 * Java - SE, EE (Web Applications), ME
 * Advanced Java
 * Serving Web Application using Java Servlets
 * 1. Tomcat Server
 * 2. Create Folder Structure for we project
 * 2. Java Servlet Code
 */
