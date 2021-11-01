package com.acrylic.rgbtoascii;

public class CharMapRGBToAscii implements RGBToAscii {

    private final char[] charMap;
    private static final float WHITE_HEX = (255 << 16) | (255 << 8) | 255;

    @Deprecated
    public static CharMapRGBToAscii sequentialAscii(int min, int max) {
        char[] chars = new char[max - min + 1];
        for (int i = min; i <= max; i++)
            chars[i - min] = Character.forDigit(i, 10);
        return new CharMapRGBToAscii(chars);
    }

    public CharMapRGBToAscii(char[] charMap) {
        this.charMap = charMap;
    }

    @Override
    public char convertFromRGB(int r, int g, int b, int a) {
        float rgbHex = (r << 16) | (g << 8) | b;
        return charMap[(rgbHex == WHITE_HEX) ? charMap.length - 1 :
                                               ((int) (Math.floor((rgbHex * charMap.length) / WHITE_HEX)))];
    }
}
