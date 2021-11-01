package com.acrylic.example;

import com.acrylic.Images;
import com.acrylic.rgbtoascii.CharMapRGBToAscii;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

public class Example1 {

    public static final CharMapRGBToAscii DEFAULT_CHAR_MAP = new CharMapRGBToAscii(new char[] {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    });
    public static final int WIDTH = 40, HEIGHT = 20;

    public static void main(String[] args) {
        try {
            printFractal();
            printHeart();
            printSunrise();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Image: https://upload.wikimedia.org/wikipedia/commons/2/21/Mandel_zoom_00_mandelbrot_set.jpg
     *
     * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
     * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
     * aaaaaaaaaaaaaaaaaaaaaaaaaabdgbaaaaaaaaaa
     * aaaaaaaaaaaaaaaaaaaaaaaaabsaafbaaaaaaaaa
     * aaaaaaaaaaaaaaaaaaaaabcbcciaagcbaabaaaaa
     * aaaaaaaaaaaaaaaaaaaaabkaaaaaaaaagzxaaaaa
     * aaaaaaaaaaaaaaaaaaaagiaaaaaaaaaaaibaaaaa
     * aaaaaaaaaaaaaecbdbbbhaaaaaaaaaaaaaaraaaa
     * aaaaaaaaaaaabcaaaaseaaaaaaaaaaaaaazbaaaa
     * aaaaaaaaaabofkaaaaagaaaaaaaaaaaaaagaaaaa
     * aaaadfagtjtaaaaaaaaaaaaaaaaaaaaaaebaaaaa
     * aaaaaaaaaabielaaaaafaaaaaaaaaaaaaagaaaaa
     * aaaaaaaaaaaabcaaaaseaaaaaaaaaaaaaatbaaaa
     * aaaaaaaaaaaaaecbdbbbjaaaaaaaaaaaaaavaaaa
     * aaaaaaaaaaaaaaaaaaaahlaaaaaaaaaaasbaaaaa
     * aaaaaaaaaaaaaaaaaaaaabifaaaaaaaagywaaaaa
     * aaaaaaaaaaaaaaaaaaaaabbbbciaagbbaabaaaaa
     * aaaaaaaaaaaaaaaaaaaaaaaaabwaaqbaaaaaaaaa
     * aaaaaaaaaaaaaaaaaaaaaaaaaabcgbaaaaaaaaaa
     * aaaaaaaaaaaaaaaaaaaaaaaaaaanaaaaaaaaaaaa
     */
    public static void printFractal() throws IOException {
        System.out.println("======= Fractal =======");
        System.out.println(Images.toAsciiString(ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/2/21/Mandel_zoom_00_mandelbrot_set.jpg")),
                                                DEFAULT_CHAR_MAP, WIDTH, HEIGHT));
    }

    /**
     * Image: https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Heart_coraz%C3%B3n.svg/1200px-Heart_coraz%C3%B3n.svg.png
     *
     * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
     * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
     * aaaaaaaaazzzzzaaaaaaaaaaaaazzzzzaaaaaaaa
     * aaaaaazzzzzzzzzzzzaaaaazzzzzzzzzzzzaaaaa
     * aaaazzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzaaa
     * aaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaa
     * aaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaa
     * aaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaa
     * aaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaa
     * aaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaa
     * aaaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaaa
     * aaaaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaaaa
     * aaaaaaazzzzzzzzzzzzzzzzzzzzzzzzzzzaaaaaa
     * aaaaaaaaazzzzzzzzzzzzzzzzzzzzzzzaaaaaaaa
     * aaaaaaaaaaazzzzzzzzzzzzzzzzzzzaaaaaaaaaa
     * aaaaaaaaaaaaazzzzzzzzzzzzzzzaaaaaaaaaaaa
     * aaaaaaaaaaaaaaaazzzzzzzzzaaaaaaaaaaaaaaa
     * aaaaaaaaaaaaaaaaaazzzzzaaaaaaaaaaaaaaaaa
     * aaaaaaaaaaaaaaaaaaaazaaaaaaaaaaaaaaaaaaa
     * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
     */
    public static void printHeart() throws IOException {
        System.out.println("======= Heart =======");
        System.out.println(Images.toAsciiString(ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Heart_coraz%C3%B3n.svg/1200px-Heart_coraz%C3%B3n.svg.png")),
                DEFAULT_CHAR_MAP, WIDTH, HEIGHT));
    }

    /**
     * https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/sunrise-quotes-21-1586892331.jpg
     *
     * bacedeurqqppqrsuuvwzzzzzzyxyxtnpsulmtdjc
     * bbadbfjtspkhhnrpqssxzzzzzyvxvsssvvqhcmnd
     * aaebgevtssspmnrttwxzzzzzzwvyyxxxotjddfkw
     * cgcafinzzzyvuutyzzzzzzzzzzzzzzzxizggzkdf
     * gjdcekjzzzzzzzzzzzzzzzzzzzzzzzzufgmfrrho
     * hcbfhfyzzzzzzzzzzzzzzzzzzzzzzzzzlfunhjkf
     * geedcgozzzzzzzzzzzzzzzzzzzzzzzzvwooqznhp
     * ceddbzjszzzzzzzzzzzzzzzzzzzzzzzzpmsolfrb
     * fcfbfzpzzzzzzzzzzzzzzzzzzzzzzzzzpmqzhhei
     * bcccpmzzzzzzzzzzvzzzzzzzzzzzzzzzzxzopehg
     * abepywtrtvsuvuuwwvvxzyyzzyzytrovpypshded
     * gahptuvsvsuwwstvyzzzzzzyyxxvwzvturlghfeb
     * ahgegihlkmonrrstxxxzywyvvwuuprecmnmfjgec
     * icehemljffcdgghijjjnlovoiqmmnijjllljaada
     * fecilifghjmndllundkknngkhjjigfdcmnksfcfb
     * fhgefifggleemohmjgfhjkijildjgiffgefdgkef
     * ggffehgchkefbjbicfehikhgfghkdebgeefffccc
     * bcgdeiidkdckeifeecdoofgdhfddceeebdddgfjc
     * cccchfjcbbffbdfcapafecfhfefdlkhededbdiic
     * baaaabidcejcedcdahecidgmbceebccabcceeeeg
     */
    public static void printSunrise() throws IOException {
        System.out.println("======= Sunrise =======");
        System.out.println(Images.toAsciiString(ImageIO.read(new URL("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/sunrise-quotes-21-1586892331.jpg")),
                DEFAULT_CHAR_MAP, WIDTH, HEIGHT));
    }


}
