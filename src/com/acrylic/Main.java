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
            BufferedImage image = ImageIO.read(new URL("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/sunrise-quotes-21-1586892331.jpg"));
            RasterScalarProcessor processor = new RasterScalarProcessor(image.getRaster(), 0.03f, 0.01f);
            AsciiString asciiString = RGBToAsciiFactory.toAsciiString(processor, new CharMapRGBToAscii(
                    new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'z', 'y', '-', '=', '0', '2', '4', '3'}));
            System.out.println(asciiString);
            //            final int[] rgb = new int[3];
//            RasterScalarProcessor processor = new RasterScalarProcessor(image.getRaster(), 2f, 1f);
//            ImageScalarIterator iterator = processor.iterator();
//            BufferedImage scaledDownImage = new BufferedImage(iterator.getScaledImageWidth(), iterator.getScaledImageHeight(), BufferedImage.TYPE_INT_RGB);
//
//            iterator.forEachRemaining((imageScalarData) -> {
//                final Point oPoint = imageScalarData.getOriginalImagePoint();
//                final Point sPoint = imageScalarData.getScaledImagePoint();
//                image.getRaster().getPixel(oPoint.x, oPoint.y, rgb);
//                scaledDownImage.setRGB(sPoint.x, sPoint.y, ((rgb[0] << 16)) | (rgb[1] << 8) | rgb[2]);
//            });
//            File out = new File("test.jpg");
//            ImageIO.write(scaledDownImage, "jpg", out);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
