package p_s_p_challenge;

import data_classes.User;
import j_panels.PanelMain;
import listeners.FrameWindowListener;

import javax.swing.*;
import java.awt.*;


public class PSPChallenge {

    public static User actualUser;

    public static JFrame frame;

    public static String changeUserProfileOrder = "";
    public static boolean isLoggedIn = false;

    public PSPChallenge() {
    }


    public static void main(String[] args) {

        frame = new JFrame("Gestión de usuarios y procesos");


        // añadimos un windowListener de apertura y cierre de ventana
        frame.addWindowListener(new FrameWindowListener(frame));


        frame.setContentPane(new PanelMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        //vuelve visible el frame
        frame.setVisible(true);

        //Coloca la ventana en el centro de la pantalla
        frame.setLocationRelativeTo(null);

        //cambia el icono de la aplicación
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icon = pantalla.getImage("src/resources/img/server.png");
        frame.setIconImage(icon);
    }


}