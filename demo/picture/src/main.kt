import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {

    // 内存中创建 100x100 图片
    var image = BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    var x = 0 .. 99
    var y = 0 .. 99
    image.apply {
        for (i in x) {
            for (j in y) {
                image.setRGB(i, j, 0xff00ff)
            }
        }
    }

    ImageIO.write(image, "bmp", File("./a.bmp"))
}