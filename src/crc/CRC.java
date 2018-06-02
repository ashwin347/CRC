/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crc;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.io.IOException;
/**
 *
 * @author Eshwin Rio
 */
public class CRC {
    public boolean testConnection(){
        try{
            URL u = new URL("https://www.google.com");
            try{
                URLConnection uc = u.openConnection();
                uc.connect();
                return true;
            }catch(IOException ioe){
                return false;
            }
        }catch(MalformedURLException e){
            return false;
        }
    }
}
