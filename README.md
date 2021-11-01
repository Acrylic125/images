# images
A simple image to ascii converter.

## What is this?
This was intended to be a day long project to play around with BufferedImage in java. 
This project converts an Image to ascii characters. 

## Image To Ascii (I2A):
The following examples are processed using a CharMapRGBToAscii converter 
```java
new CharMapRGBToAscii(new char[] {
   'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
});
```
and have an ascii image size of 40x20.

#### Fractal
![alt text](https://upload.wikimedia.org/wikipedia/commons/2/21/Mandel_zoom_00_mandelbrot_set.jpg "Fractal")
```
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
aaaaaaaaaaaaaaaaaaaaaaaaaabdgbaaaaaaaaaa
aaaaaaaaaaaaaaaaaaaaaaaaabsaafbaaaaaaaaa
aaaaaaaaaaaaaaaaaaaaabcbcciaagcbaabaaaaa
aaaaaaaaaaaaaaaaaaaaabkaaaaaaaaagzxaaaaa
aaaaaaaaaaaaaaaaaaaagiaaaaaaaaaaaibaaaaa
aaaaaaaaaaaaaecbdbbbhaaaaaaaaaaaaaaraaaa
aaaaaaaaaaaabcaaaaseaaaaaaaaaaaaaazbaaaa
aaaaaaaaaabofkaaaaagaaaaaaaaaaaaaagaaaaa
aaaadfagtjtaaaaaaaaaaaaaaaaaaaaaaebaaaaa
aaaaaaaaaabielaaaaafaaaaaaaaaaaaaagaaaaa
aaaaaaaaaaaabcaaaaseaaaaaaaaaaaaaatbaaaa
aaaaaaaaaaaaaecbdbbbjaaaaaaaaaaaaaavaaaa
aaaaaaaaaaaaaaaaaaaahlaaaaaaaaaaasbaaaaa
aaaaaaaaaaaaaaaaaaaaabifaaaaaaaagywaaaaa
aaaaaaaaaaaaaaaaaaaaabbbbciaagbbaabaaaaa
aaaaaaaaaaaaaaaaaaaaaaaaabwaaqbaaaaaaaaa
aaaaaaaaaaaaaaaaaaaaaaaaaabcgbaaaaaaaaaa
aaaaaaaaaaaaaaaaaaaaaaaaaaanaaaaaaaaaaaa
```

#### Heart
![alt text](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Heart_coraz%C3%B3n.svg/1200px-Heart_coraz%C3%B3n.svg.png "Heart")
```
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
aaaaaaaaazzzzzaaaaaaaaaaaaazzzzzaaaaaaaa
aaaaaazzzzzzzzzzzzaaaaazzzzzzzzzzzzaaaaa
aaaazzzzzzzzzzzzzzzzazzzzzzzzzzzzzzzzaaa
aaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaa
aaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaa
aaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaa
aaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaa
aaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaa
aaaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaaa
aaaaazzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzaaaa
aaaaaaazzzzzzzzzzzzzzzzzzzzzzzzzzzaaaaaa
aaaaaaaaazzzzzzzzzzzzzzzzzzzzzzzaaaaaaaa
aaaaaaaaaaazzzzzzzzzzzzzzzzzzzaaaaaaaaaa
aaaaaaaaaaaaazzzzzzzzzzzzzzzaaaaaaaaaaaa
aaaaaaaaaaaaaaaazzzzzzzzzaaaaaaaaaaaaaaa
aaaaaaaaaaaaaaaaaazzzzzaaaaaaaaaaaaaaaaa
aaaaaaaaaaaaaaaaaaaazaaaaaaaaaaaaaaaaaaa
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
```

#### Sunrise
![alt text](https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/sunrise-quotes-21-1586892331.jpg "Sunrise")
```
bacedeurqqppqrsuuvwzzzzzzyxyxtnpsulmtdjc
bbadbfjtspkhhnrpqssxzzzzzyvxvsssvvqhcmnd
aaebgevtssspmnrttwxzzzzzzwvyyxxxotjddfkw
cgcafinzzzyvuutyzzzzzzzzzzzzzzzxizggzkdf
gjdcekjzzzzzzzzzzzzzzzzzzzzzzzzufgmfrrho
hcbfhfyzzzzzzzzzzzzzzzzzzzzzzzzzlfunhjkf
geedcgozzzzzzzzzzzzzzzzzzzzzzzzvwooqznhp
ceddbzjszzzzzzzzzzzzzzzzzzzzzzzzpmsolfrb
fcfbfzpzzzzzzzzzzzzzzzzzzzzzzzzzpmqzhhei
bcccpmzzzzzzzzzzvzzzzzzzzzzzzzzzzxzopehg
abepywtrtvsuvuuwwvvxzyyzzyzytrovpypshded
gahptuvsvsuwwstvyzzzzzzyyxxvwzvturlghfeb
ahgegihlkmonrrstxxxzywyvvwuuprecmnmfjgec
icehemljffcdgghijjjnlovoiqmmnijjllljaada
fecilifghjmndllundkknngkhjjigfdcmnksfcfb
fhgefifggleemohmjgfhjkijildjgiffgefdgkef
ggffehgchkefbjbicfehikhgfghkdebgeefffccc
bcgdeiidkdckeifeecdoofgdhfddceeebdddgfjc
cccchfjcbbffbdfcapafecfhfefdlkhededbdiic
baaaabidcejcedcdahecidgmbceebccabcceeeeg
```

### Simple Code Examples:
As a user, I2A makes use of 3 objects, RasterScalarProcessor, RGBToAscii and AsciiString.  

#### RasterScalarProcessor
There are 2 constructors.

- RasterScalarProcessor constructor (with Float) takes in a Raster object as well as the scaling factor to convert to ascii text. This will cause the ascii image to have 0.5 * width of raster, and 0.5 * height of raster.
```java
new RasterScalarProcessor(raster, 0.5f, 0.5f); 
```
- RasterScalarProcessor constructor (with int) takes in a Raster object as well as the width and height of the ascii image.

#### RGBToAscii
This is used as a converter, to convert image pixels to an ascii character. 
See the default implementation, [CharMapRGBToAscii](https://github.com/Acrylic125/images/blob/e514f0084bd0d784745647b65d0f359b3757be40/src/com/acrylic/rgbtoascii/CharMapRGBToAscii.java#L3) for an example.
You can use CharMapRGBToAscii like so:
```java
CharMapRGBToAscii DEFAULT_CHAR_MAP = new CharMapRGBToAscii(new char[] {
   'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
});
```
CharMapRGBToAscii maps a character based on the rgb (converted to decimal) value. In this case, if the RGB dec value is 13, 'a' will be used. Likewise, if the rgb value is 16581375, then 'z' will be used.

#### AsciiString
AsciiString is the returned object when you call Images#toAsciiString(). Call AsciiString#toString() to create the ascii image.

### Samples
Refer to [Example1](https://github.com/Acrylic125/images/blob/master/src/com/acrylic/example/Example1.java) for some references.

