package counter;

import javax.swing.*;
import java.awt.*;

public class BinaryFrame extends JFrame implements CounterObserver{

    private int count;

    public BinaryFrame()
    {
        getContentPane().setLayout(null);
        setSize(300,200);
        setTitle("Binary Frame");
        setCount(0);

        BinaryFrame.SymWindow aSymWindow = new BinaryFrame.SymWindow();
        this.addWindowListener(aSymWindow);
    }

    @Override
    public void update(int count) {
        setCount(count);
    }


    class SymWindow extends java.awt.event.WindowAdapter
    {
        public void windowClosing(java.awt.event.WindowEvent event)
        {
            Object object = event.getSource();
            if (object == BinaryFrame.this)
                RectFrame_WindowClosing(event);
        }
    }

    void RectFrame_WindowClosing(java.awt.event.WindowEvent event)
    {
        dispose();		 // dispose of the Frame.
    }


    public void setCount (int cnt){
        count=cnt;
        repaint();
    }

    public  void  paint(  Graphics display  )  {
        // clear display first
        Dimension sizes = getSize();
        display.clearRect(0,0,sizes.width,sizes.height);

        int x = 50;
        int y = 30;

        // Magnify value by 5 to get a bigger visual effect
        int height =  count*9;
        int width = count*9;

        display.setColor( Color.red );
        display.fillOval(x, y, Math.abs(width), Math.abs( height ) );
    }
}
