package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    Server s = new Server();
        System.out.println("Initializing Server.....");
        s.startServer();
    }
}
