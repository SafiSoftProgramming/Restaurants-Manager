/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurants_manager;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author safisoft
 */
public class Frame_Size {
    
    public int width (){
    int width = 1600 ;
        return width;
    }
    
    public int height (){
    int height = 900 ;
        return height;
    }
    
    public void makeFrameFullSize(JFrame aFrame) {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    aFrame.setSize(screenSize.width, screenSize.height);
}
    
}
