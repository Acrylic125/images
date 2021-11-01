package com.acrylic;

public final class AsciiString {

    // 1st [] represents rows.
    // 2nd [] represents columns.
    private final char[][] asciiRowColumns;
    private final int sizeX, sizeY;

    public AsciiString(int sizeX, int sizeY) {
        this.asciiRowColumns = new char[sizeY][sizeX];
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public char[][] getAscii() {
        return asciiRowColumns;
    }

    public char getCharAt(int x, int y) {
        return asciiRowColumns[y][x];
    }

    public AsciiString setCharacter(int x, int y, char character) {
        asciiRowColumns[y][x] = character;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < sizeY; i++) {
            builder.append(asciiRowColumns[i]);
            if (i < (sizeY - 1))
                builder.append("\n");
        }
        return builder.toString();
    }
}
