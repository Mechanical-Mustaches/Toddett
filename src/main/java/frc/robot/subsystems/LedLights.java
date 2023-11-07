package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LedLights extends SubsystemBase {
    //9 represents the port number
    AddressableLED m_led = new AddressableLED(9);
    AddressableLEDBuffer m_ledBuffer = new AddressableLEDBuffer(6);
    

    public LedLights(){
        m_led.setLength(m_ledBuffer.getLength());
        m_led.setData(m_ledBuffer);
        m_led.start();
    }

    public void setColor(int red, int green, int blue){
       for (var i = 0; i < m_ledBuffer.getLength(); i++){
            m_ledBuffer.setRGB(i, red, green, blue);
       }

        m_led.setData(m_ledBuffer);
    }

    public void rainbow(){
        int m_rainbowFirstPixelHue = 180;
        for (var i = 0; i < m_ledBuffer.getLength(); i++) {
            // Calculate the hue - hue is easier for rainbows because the color
            // shape is a circle so only one value needs to precess
            final var hue = (m_rainbowFirstPixelHue + (i * 180 / m_ledBuffer.getLength())) % 180;
            // Set the value
            m_ledBuffer.setHSV(i, hue, 255, 128);
          }
          // Increase by to make the rainbow "move"
          m_rainbowFirstPixelHue += 3;
          // Check bounds
          m_rainbowFirstPixelHue %= 180;
    }

    public void defaultColor(){
        for (var i = 0; i < m_ledBuffer.getLength(); i++){
            m_ledBuffer.setRGB(i, 0, 0, 100);
       }

        m_led.setData(m_ledBuffer);

    }

    // private void rainbow(){
    //     for (var i = 0; i < m_ledBuffer.getLength(); i++){
    //         final var hue = (m_rainbowFirstPixelHue + (i * 180/m_ledBuffer.getLength())) % 180;

    //         m_ledBuffer.setHSV(i, hue, 225, 128);
    //     }
    // }
    
}
