/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mylittlepet;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.jrockit.jfr.ContentType;
import static com.oracle.jrockit.jfr.ContentType.Class;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author kornelia
 */
public class JSONFile {
    public static ObjectMapper MAPPER = new ObjectMapper();
    private static String name;

    public JSONFile() {
    }

    public JSONFile(String name) {
        JSONFile.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        JSONFile.name = name;
    }
    
    public void writeToFile(Object o) {
        try {
            MAPPER.writeValue(new File(this.getName()+".json"), o);
        } catch (IOException ex) {
            Logger.getLogger(JSONFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public Pet readFromFile() {
        try {
            return MAPPER.readValue(new File(this.getName()),  Pet.class);
        } catch (IOException ex) {
            Logger.getLogger(JSONFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        Pet p = new Pet();
        return p;
    }
}
