package com.acrylic;

import java.awt.image.Raster;
import java.util.Iterator;

public final class RasterScalarProcessor implements Iterable<ImageScalarData> {

    private final Raster raster;
    private final float scalarX, scalarY;

    public RasterScalarProcessor(Raster raster, float scalarX, float scalarY) {
        this.raster = raster;
        this.scalarX = scalarX;
        this.scalarY = scalarY;
    }

    public Raster getRaster() {
        return raster;
    }

    public float getScalarX() {
        return scalarX;
    }

    public float getScalarY() {
        return scalarY;
    }

    @Override
    public ImageScalarIterator iterator() {
        return ImageScalarIterator.iteratorByOriginalImage(raster.getWidth(), raster.getHeight(), scalarX, scalarY);
    }
}
