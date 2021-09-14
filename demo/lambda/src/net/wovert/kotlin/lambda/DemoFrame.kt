package net.wovert.kotlin.lambda

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame

fun main() {
    val jFrame = JFrame("My JFrame")
    var jButton = JButton("My JButton")

    jFrame.addWindowListener(object: WindowListener {
        override fun windowOpened(e: WindowEvent?) {
            println("windowOpened")
        }

        override fun windowClosing(e: WindowEvent?) {
            println("windowClosing")
        }

        override fun windowClosed(e: WindowEvent?) {
            println("windowClosed")
        }

        override fun windowIconified(e: WindowEvent?) {
            println("windowIconified")
        }

        override fun windowDeiconified(e: WindowEvent?) {
            println("windowDeiconified")
        }

        override fun windowActivated(e: WindowEvent?) {
            println("windowActivated")
        }

        override fun windowDeactivated(e: WindowEvent?) {
            println("windowDeactivated")
        }

    })

//    jButton.addActionListener(object: ActionListener {
//        override fun actionPerformed(e: ActionEvent?) {
//            println("Button pressed")
//        }
//    })
    /**
     * 对象是函数式接口的一个实例（即只拥有一个抽象方法的接口）
     * 那么可以通过 Lambda 表达式调用，其中 Lambda 表达式前面加上接口的类型
     */
//    jButton.addActionListener(ActionListener {
//        println("Button pressed")
//    })

    jButton.addActionListener({ println("Button pressed")} )

    jFrame.add(jButton)
    jFrame.pack()
    jFrame.isVisible = true
    jFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
}