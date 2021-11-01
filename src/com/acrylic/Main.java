package com.acrylic;

import com.acrylic.rgbtoascii.CharMapRGBToAscii;
import com.acrylic.rgbtoascii.RGBToAsciiFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        try {
//            BufferedImage image = ImageIO.read(new URL("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/sunrise-quotes-21-1586892331.jpg"));
//            BufferedImage image = ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Heart_coraz%C3%B3n.svg/1200px-Heart_coraz%C3%B3n.svg.png"));
            BufferedImage image = ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/2/21/Mandel_zoom_00_mandelbrot_set.jpg"));
            RasterScalarProcessor processor = new RasterScalarProcessor(image.getRaster(),  40, 20);
            AsciiString asciiString = RGBToAsciiFactory.toAsciiString(processor, CharMapRGBToAscii.sequentialAscii(0, 65525));
            System.out.println(asciiString);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
