package com.acrylic;

import java.awt.*;

public final class ImageScalarData {

    private final Point scaledImagePoint, originalImagePoint;

    public ImageScalarData(Point asciiImagePoint, Point originalImagePoint) {
        this.scaledImagePoint = asciiImagePoint;
        this.originalImagePoint = originalImagePoint;
    }

    public Point getScaledImagePoint() {
        return scaledImagePoint;
    }

    public Point getOriginalImagePoint() {
        return originalImagePoint;
    }
}
