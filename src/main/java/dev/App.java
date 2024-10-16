package dev;

import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class App
{
    public static void main(String[] args)
    {
        try {
            // Conversion de la chaîne "App" en ASCII art
            String asciiArt = FigletFont.convertOneLine("App");

            // Affichage de l'ASCII art
            System.out.println(asciiArt);
        } catch (IOException e) {
            // Gestion de l'exception IOException
            System.err.println("Une erreur s'est produite lors de la conversion en ASCII art : " + e.getMessage());
        }
    }
}
