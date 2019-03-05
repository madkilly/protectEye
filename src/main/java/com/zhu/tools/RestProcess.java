package com.zhu.tools;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RestProcess extends JFrame {

	private static final long serialVersionUID = 1L;
	private int X = 0;
	private int Y = 0;
	private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

	public RestProcess() {
		super("歇歇眼");
		setUndecorated(true);
		setShape(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
		setBounds(X, Y, screen.width, screen.height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		try {
			
			InputStream imageIn = this.getClass().getClassLoader().getResourceAsStream("rest.png");
			//setIconImage(ImageIO.read(new File(image)));
			setContentPane(new JLabel(new ImageIcon(ImageIO.read(imageIn))));
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
	
}