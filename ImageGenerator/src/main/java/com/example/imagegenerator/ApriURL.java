package com.example.imagegenerator;

import java.awt.*;
import java.net.URI;
import java.util.Scanner;

public class ApriURL {

    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci prompt");
        String Input = tastiera.nextLine();
        String url = "https://image.pollinations.ai/prompt/A%20" + Input;
        apriURL(url);
    }

    public static void apriURL(String url) {
        try {
            URI uri = new URI(url);
            Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
