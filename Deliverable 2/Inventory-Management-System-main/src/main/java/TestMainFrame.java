package com.project;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author shahn
 */
public class TestMainFrame {


    public static void main(String[] args) throws BackingStoreException {
        try {
            new MainFrame();
            // If you need to do something with the MainFrame instance, add your code here.
        } catch (SQLException | FileNotFoundException | ParseException ex) {
            Logger.getLogger(TestMainFrame.class.getName()).log(
                    Level.SEVERE, "Error while creating MainFrame", ex);
            // Optionally, you can show an error message to the user if necessary.
            // For example: JOptionPane.showMessageDialog(null, "Error while creating MainFrame: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
