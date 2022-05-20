package bitmap.transform;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Bitmap {


    String readPath;
    String writePath;

    public Bitmap(String readPath, String writePath) {

        this.readPath = readPath;
        this.writePath = writePath;
    }

    public void transform(String arg) throws IOException {
        if (arg == "redBG") {
            BufferedImage image = null;
            File f = new File(this.readPath);
            image = ImageIO.read(f);
            for (int i = 0; i < image.getWidth(); i++) {
                for (int j = 0; j < image.getHeight(); j++) {
                    if (image.getRGB(i, j) == -131076 && (i < 25 || i > 80)) {
                        image.setRGB(i, j, 255 * 65536 + 0 * 256 + 0);
                    }
                    if (image.getRGB(i, j) == -131076 && (j < 25 || j > 80)) {
                        image.setRGB(i, j, 255 * 65536 + 0 * 256 + 0);
                    }
                }
            }
            File f2 = new File(this.writePath);
            ImageIO.write(image, "bmp", f2);
        }
        if (arg == "jail") {
            BufferedImage image = null;
            File f = new File(this.readPath);
            image = ImageIO.read(f);
            for (int i = 0; i < image.getWidth(); i++) {
                for (int j = 0; j < image.getHeight(); j++) {
                    if ((i > 20 && i < 20 )){
                        image.setRGB(i, j, 128*65536+128*256+128);
                    }
                    if ((i > 10 && i <20)){
                     image.setRGB(i, j, 128*65536+128*256+128);
                    }
                    if ((i > 50 && i <60)){
                        image.setRGB(i, j, 128*65536+128*256+128);
                    }
                    if ((i > 90 && i <100)){
                        image.setRGB(i, j, 128*65536+128*256+128);
                    }
                }
            }
            File f2 = new File(this.writePath);
            ImageIO.write(image, "bmp", f2);
        }
        }
    }


