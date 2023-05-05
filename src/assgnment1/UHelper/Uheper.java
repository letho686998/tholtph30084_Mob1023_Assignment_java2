/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assgnment1.UHelper;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class Uheper {

    public static boolean checkEmail(JTextField tf, String mss) {
        if (!tf.getText().matches("\\w+@\\w+\\.\\w+")) {
            JOptionPane.showMessageDialog(null, mss);
            tf.requestFocus();
            return true;

        }
        return false;
    }

 

    public static boolean checkRong(JTextField tf, String mss) {
        if (tf.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, mss);
            tf.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean checkTrungManv(JTextField tf, String mss, String manv) {
        if (tf.getText().equalsIgnoreCase(manv)) {
            JOptionPane.showMessageDialog(null, mss);
            tf.requestFocus();
            return true;
        }
        return false;
    }

    public static boolean checkTuoi(JTextField tf, String mss) {

        int tuoi = Integer.parseInt(tf.getText());
        if (tuoi < 16 || tuoi > 55) {
            JOptionPane.showMessageDialog(null, mss);
            tf.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean checkLuong(JTextField tf, String mss) {
        float luong = Float.parseFloat(tf.getText());
        if (luong < 5000000) {
            JOptionPane.showMessageDialog(null, mss);
            tf.requestFocus();
            return true;
        }
        return false;
    }
}
