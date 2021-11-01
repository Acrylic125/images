package com.acrylic;

import java.awt.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ImageScalarIterator implements Iterator<ImageScalarData> {

    private final int sImageWidth, sImageHeight;
    private final float imageScalarX, imageScalarY;
    private int sImageCursorX = 0, sImageCursorY = 0;

    ImageScalarIterator(int sImageWidth, int sImageHeight,
                        float imageScalarX, float imageScalarY) {
        this.sImageWidth = sImageWidth;
        this.sImageHeight = sImageHeight;
        this.imageScalarX = imageScalarX;
        this.imageScalarY = imageScalarY;
    }

    public static ImageScalarIterator iteratorByScaledImage(int sImageWidth, int sImageHeight,
                                                            float imageScalarX, float imageScalarY) {
        return new ImageScalarIterator(sImageWidth, sImageHeight, imageScalarX, imageScalarY);
    }

    public static ImageScalarIterator iteratorByOriginalImage(int oImageWidth, int oImageHeight,
                                                              float imageScalarX, float imageScalarY) {
        final int scaledImageWidth = (int) Math.floor(oImageWidth * imageScalarX),
                  scaledImageHeight = (int) Math.floor(oImageHeight * imageScalarY);
        return iteratorByScaledImage(scaledImageWidth, scaledImageHeight, imageScalarX, imageScalarY);
    }

    public int getScaledImageWidth() {
        return sImageWidth;
    }

    public int getScaledImageHeight() {
        return sImageHeight;
    }

    @Override
    public boolean hasNext() {
        return sImageCursorY < sImageHeight;
    }

    @Override
    public ImageScalarData next() throws NoSuchElementException {
        ImageScalarData data = new ImageScalarData(
                                    new Point(sImageCursorX, sImageCursorY),
                                    new Point((int) Math.floor(sImageCursorX / imageScalarX), (int) Math.floor(sImageCursorY / imageScalarY)));
        sImageCursorX++;
        if (sImageCursorX >= sImageWidth) {
            sImageCursorY++;
            sImageCursorX = 0;
        }
        return data;
    }
}
