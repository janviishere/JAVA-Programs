import java.awt.*;
import java.applet.*;
import java.awt.Graphics;


//HelloWorld class extends Applet
public class MyApplet extends Applet
{
	//overriding paint() method
	@Override public void paint(Graphics g)
	{
	g.drawString("Hello World",100,100);
	}
}


