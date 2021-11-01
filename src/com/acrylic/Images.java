package com.acrylic;

import com.acrylic.AsciiString;
import com.acrylic.ImageScalarIterator;
import com.acrylic.RasterScalarProcessor;
import com.acrylic.rgbtoascii.CharMapRGBToAscii;
import com.acrylic.rgbtoascii.RGBToAscii;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

public final class Images {

    public static AsciiString toAsciiString(RasterScalarProcessor rasterScalarProcessor, RGBToAscii rgbToAscii) {
        ImageScalarIterator iterator = rasterScalarProcessor.iterator();
        AsciiString asciiString = new AsciiString(iterator.getScaledImageWidth(), iterator.getScaledImageHeight());

        final int[] rgb = new int[4]; // Use 4 for RGBA images.
        iterator.forEachRemaining((data) -> {
            final Point oPoint = data.getOriginalImagePoint();
            final Point sPoint = data.getScaledImagePoint();
            rasterScalarProcessor.getRaster().getPixel(oPoint.x, oPoint.y, rgb);
            asciiString.setCharacter(sPoint.x, sPoint.y, rgbToAscii.convertFromRGB(rgb[0], rgb[1], rgb[2], rgb[3]));
        });
        return asciiString;
    }

    public static AsciiString toAsciiString(BufferedImage image, RGBToAscii rgbToAscii, int width, int height) throws MalformedURLException {
        RasterScalarProcessor processor = new RasterScalarProcessor(image.getRaster(), width, height);
        return Images.toAsciiString(processor, rgbToAscii);
    }

    /**
     *
     * @param min The min
     * @param max The max
     * @return CharMapRGBToAscii that has ascii chars from min to max.
     * @deprecated THIS IS FOR FUN!
     */
    @Deprecated
    public static CharMapRGBToAscii sequentialAscii(int min, int max) {
        char[] chars = new char[max - min + 1];
        for (int i = min; i <= max; i++)
            chars[i - min] = Character.forDigit(i, 10);
        return new CharMapRGBToAscii(chars);
    }

}
