package com.company;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection
{
    private final Integer port = 3000;
    private final String host = "localhost";

    protected String serverMessage; // Mensajes entrantes en el servidor.
    protected ServerSocket ss; //Socket del servidor.
    protected Socket cs; // Socket del cliente.
    protected DataOutputStream serverOutPut, clientOutPut; // Flujos de dato de salida.

    public Connection(String type) throws IOException
    {
        if(type.equalsIgnoreCase("Server"))
        {
            ss = new ServerSocket(port); // Se crea el socket para el cliente en el puerto 3000.
            cs = new Socket(); // Socket para el cliente.
        }
        else
        {
            cs = new Socket(host,port); //Socket para el cliente en host y port 3000.
        }
    }
}
