package com.company;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

public class Server
{
    private ServerSocket serverSocket;

    public void start(int port) throws Exception
    {
        serverSocket = new ServerSocket(port);
        while (true)
        {
            new Client(serverSocket.accept()).start();
        }
    }

    public void stop() throws Exception
    {
        serverSocket.close();
    }
}
