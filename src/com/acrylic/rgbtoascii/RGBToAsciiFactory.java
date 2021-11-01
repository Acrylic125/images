package com.acrylic.rgbtoascii;

import com.acrylic.AsciiString;
import com.acrylic.ImageScalarIterator;
import com.acrylic.RasterScalarProcessor;

import java.awt.*;

public final class RGBToAsciiFactory {

    public static AsciiString toAsciiString(RasterScalarProcessor rasterScalarProcessor, RGBToAscii rgbToAscii) {
        ImageScalarIterator iterator = rasterScalarProcessor.iterator();
        AsciiString asciiString = new AsciiString(iterator.getScaledImageWidth(), iterator.getScaledImageHeight());

        final int[] rgb = new int[4]; // Use 4 for RGBA images.
        iterator.forEachRemaining((data) -> {
            final Point oPoint = data.getOriginalImagePoint();
            final Point sPoint = data.getScaledImagePoint();
            rasterScalarProcessor.getRaster().getPixel(oPoint.x, oPoint.y, rgb);
            asciiString.setCharacter(sPoint.x, sPoint.y, rgbToAscii.convertFromRGB(rgb[0], rgb[1], rgb[2]));
        });
        return asciiString;
    }

}
