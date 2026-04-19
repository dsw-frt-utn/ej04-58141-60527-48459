package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.PMenu;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        PMenu view = new PMenu();
        view.setVisible(true);
    }
}
