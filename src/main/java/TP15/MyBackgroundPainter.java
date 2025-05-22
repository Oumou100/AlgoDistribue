package TP15;

import io.jbotsim.core.Topology;
import io.jbotsim.ui.painting.BackgroundPainter;
import io.jbotsim.ui.painting.UIComponent;

import java.awt.*;

public class MyBackgroundPainter implements BackgroundPainter {

    @Override
    public void paintBackground(UIComponent c, Topology tp){
        Graphics2D g = (Graphics2D) c.getComponent();
        g.setColor(Color.GRAY);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image image = tk.getImage(getClass().getResource("/TP15.png"));
        g.drawImage(image, 0, 0, null);
        for (int i = 0; i < tp.getWidth(); i++){
            for (int j = 0; j < tp.getHeight(); j++){
                g.drawLine(i*50, 0, i*50, tp.getHeight());
                g.drawLine(0, j*50, tp.getWidth(), j*50);
            }
        }
    }
}
