package games.flappybird;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {

    private final RendererRepaintListener rendererRepaint;

    public Renderer(RendererRepaintListener rendererRepaint) {
        this.rendererRepaint = rendererRepaint;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        rendererRepaint.onRepaint(g);
    }

    interface RendererRepaintListener {
        void onRepaint(Graphics g);
    }
}
