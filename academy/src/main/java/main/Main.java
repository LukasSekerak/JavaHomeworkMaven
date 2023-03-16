package main;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import ij.IJ;
import ij.ImagePlus;
import ij.io.FileSaver;
import ij.process.ImageProcessor;

public class Main {

	public static void main(String[] args) throws IOException {
		/* 	Úloha nájsť knižnicu na otvorenie obrázku a pridanie textu do neho
			v gitHube - poslať do piatka.
		*/
		
		ImagePlus image = IJ.openImage("randomimage.jpg");
		Font font = new Font("Arial", Font.BOLD, 18);

		ImageProcessor ip = image.getProcessor();
		ip.setColor(Color.RED);
		ip.setFont(font);
		ip.drawString("This is added TEXT!", 0, 20);
		
		FileSaver f = new FileSaver(image);
				
		f.saveAsJpeg("newPicture.jpg");
		
		
	}

}
