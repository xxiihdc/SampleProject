/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ductr.entity.ultils;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author ductr
 */
public class XImage {
    public static Image getAppIcon(){
        URL url = XImage.class.getResource("/com/ductr/icons/fpt.png");
        return new ImageIcon(url).getImage();
        
        
    }
    
}
