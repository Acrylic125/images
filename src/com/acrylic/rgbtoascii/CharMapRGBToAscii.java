package com.acrylic.rgbtoascii;

public class CharMapRGBToAscii implements RGBToAscii {

    private final char[] charMap;
    private static final float WHITE_HEX = (255 << 16) | (255 << 8) | 255;

    public CharMapRGBToAscii(char[] charMap) {
        this.charMap = charMap;
    }

    @Override
    public char convertFromRGB(int r, int g, int b) {
        float rgbHex = (r << 16) | (g << 8) | b;
        return charMap[(rgbHex == WHITE_HEX) ? charMap.length - 1 :
                                               ((int) (Math.floor((rgbHex * charMap.length) / WHITE_HEX)))];
    }
}
