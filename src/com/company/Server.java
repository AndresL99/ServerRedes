package com.company;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Server extends Connection
{
    public Server() throws IOException
    {
        super("Server");
    }

    public void startServer()
    {
        try
        {
            System.out.println("Waiting....");
            cs = ss.accept();
            System.out.println("Online...");

            clientOutPut = new DataOutputStream(cs.getOutputStream()); // Se obtiene el flujo de salida para el envio de mensajes.
            clientOutPut.writeUTF("Write a message...: "); // Envio de mensajes utilizando el flujo de salida.

            BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream())); // Se obtiene el flujo de entrada desde el cliente.

            while((serverMessage = br.readLine()) != null) // Mientras haya mensajes se muestran por pantalla.
            {
                System.out.println(serverMessage);
            }

            System.out.println("Connection closed!."); // Se cierra la conexión.
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
