package main;

import java.awt.Color;
import java.awt.Font;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class Main {

	public static void main(String[] args) {
		/* 	Úloha nájsť knižnicu na otvorenie obrázku a pridanie textu do neho
			v gitHube - poslať do piatka.
		*/
		
		ImagePlus image = IJ.openImage("randomImage.jpg");
		
		Font font = new Font("Arial", Font.BOLD, 18);

		ImageProcessor ip = image.getProcessor();
		ip.setColor(Color.GREEN);
		ip.setFont(font);
		ip.drawString("This is a TEXT!", 0, 20);
		
		image.show();

	}

}
