/*
 * Copyright (c) 2014, Estudio Escarlata. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 * 
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 * 
 *   - Neither the name of Estudio Escarlata or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.studyscarlet.media.plotgraph.view;

import com.studyscarlet.media.plotgraph.application.Application;
import com.studyscarlet.media.plotgraph.enums.EEvents;
import com.studyscarlet.media.plotgraph.interfaces.IController;
import com.studyscarlet.media.plotgraph.interfaces.IView;
import com.studyscarlet.media.plotgraph.interfaces.IViewMain;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.beans.PropertyVetoException;
import javax.swing.DefaultDesktopManager;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * com.studyscarlet.media.plotgraph.view.MainView:
 * Esta clase representa...
 *
 * @author Angel Emilio de Le&oacute;n Guti&eacute;rrez (adeleon.bdem@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class MainView extends javax.swing.JFrame implements IViewMain {
    
    /**
     * Para el serializado.
     */
    private static final long serialVersionUID = 2204301893098925698L;

    /**
     * Para el logger.
     */
    private final Logger logger = LoggerFactory.getLogger(MainView.class);
    
    /** Creates new form MainView */
    public MainView() {
        initComponents();
        
        // Agregar los componentes hechos a la medida
        jScrMain.getViewport().add(jDskMain);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTlbMain = new javax.swing.JToolBar();
        jBtnSalir = new javax.swing.JButton();
        jBtnGrafica = new javax.swing.JButton();
        jBtnAcercaDe = new javax.swing.JButton();
        jPanStatus = new javax.swing.JPanel();
        jPanMessage = new javax.swing.JPanel();
        jLblMessage = new javax.swing.JLabel();
        jLblAvance = new javax.swing.JLabel();
        jScrMain = new javax.swing.JScrollPane();
        jMnuMain = new javax.swing.JMenuBar();
        jMnuArchivo = new javax.swing.JMenu();
        jMnuGrafica = new javax.swing.JMenuItem();
        jMnuSalir = new javax.swing.JMenuItem();
        jMnuAyuda = new javax.swing.JMenu();
        jMnuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Application.getInstance().getProductName() + " v." + Application.getInstance().getProductVersion());
        setPreferredSize(new java.awt.Dimension(640, 480));

        jTlbMain.setRollover(true);

        jBtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studyscarlet/media/plotgraph/icons/application_exit_32.png"))); // NOI18N
        jBtnSalir.setMnemonic('S');
        jBtnSalir.setText("Salir");
        jBtnSalir.setToolTipText(EEvents.EV_QUIT.getTooltip());
        jBtnSalir.setActionCommand(EEvents.EV_QUIT.getValue());
        jBtnSalir.setFocusable(false);
        jBtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnSalir.setMaximumSize(new java.awt.Dimension(82, 64));
        jBtnSalir.setMinimumSize(new java.awt.Dimension(82, 64));
        jBtnSalir.setPreferredSize(new java.awt.Dimension(90, 64));
        jBtnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTlbMain.add(jBtnSalir);

        jBtnGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studyscarlet/media/plotgraph/icons/chart_curve_32.png"))); // NOI18N
        jBtnGrafica.setMnemonic('G');
        jBtnGrafica.setText("Gráfica");
        jBtnGrafica.setToolTipText(EEvents.EV_GRAPH.getTooltip());
        jBtnGrafica.setActionCommand(EEvents.EV_GRAPH.getValue());
        jBtnGrafica.setFocusable(false);
        jBtnGrafica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnGrafica.setPreferredSize(new java.awt.Dimension(90, 64));
        jBtnGrafica.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTlbMain.add(jBtnGrafica);

        jBtnAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studyscarlet/media/plotgraph/icons/info_32.png"))); // NOI18N
        jBtnAcercaDe.setMnemonic('A');
        jBtnAcercaDe.setText("Acerca de");
        jBtnAcercaDe.setToolTipText(EEvents.EV_ABOUT.getTooltip());
        jBtnAcercaDe.setActionCommand(EEvents.EV_ABOUT.getValue());
        jBtnAcercaDe.setFocusable(false);
        jBtnAcercaDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnAcercaDe.setPreferredSize(new java.awt.Dimension(90, 64));
        jBtnAcercaDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTlbMain.add(jBtnAcercaDe);

        getContentPane().add(jTlbMain, java.awt.BorderLayout.NORTH);

        jPanStatus.setLayout(new javax.swing.BoxLayout(jPanStatus, javax.swing.BoxLayout.LINE_AXIS));

        jPanMessage.setLayout(new java.awt.BorderLayout());

        jLblMessage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanMessage.add(jLblMessage, java.awt.BorderLayout.CENTER);

        jPanStatus.add(jPanMessage);

        jLblAvance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLblAvance.setMaximumSize(new java.awt.Dimension(96, 25));
        jLblAvance.setMinimumSize(new java.awt.Dimension(96, 25));
        jLblAvance.setPreferredSize(new java.awt.Dimension(96, 25));
        jPanStatus.add(jLblAvance);

        getContentPane().add(jPanStatus, java.awt.BorderLayout.PAGE_END);

        jScrMain.setAutoscrolls(true);
        getContentPane().add(jScrMain, java.awt.BorderLayout.CENTER);

        jMnuArchivo.setLabel("Archivo");

        jMnuGrafica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMnuGrafica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studyscarlet/media/plotgraph/icons/chart_curve_16.png"))); // NOI18N
        jMnuGrafica.setMnemonic('G');
        jMnuGrafica.setText("Gráfica");
        jMnuGrafica.setToolTipText(EEvents.EV_GRAPH.getTooltip());
        jMnuGrafica.setActionCommand(EEvents.EV_GRAPH.getValue());
        jMnuArchivo.add(jMnuGrafica);

        jMnuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studyscarlet/media/plotgraph/icons/application_exit_16.png"))); // NOI18N
        jMnuSalir.setMnemonic('S');
        jMnuSalir.setText("Salir");
        jMnuSalir.setToolTipText(EEvents.EV_QUIT.getTooltip());
        jMnuSalir.setActionCommand(EEvents.EV_QUIT.getValue());
        jMnuArchivo.add(jMnuSalir);

        jMnuMain.add(jMnuArchivo);

        jMnuAyuda.setText("Ayuda");

        jMnuAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        jMnuAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/studyscarlet/media/plotgraph/icons/info_16.png"))); // NOI18N
        jMnuAcercaDe.setMnemonic('A');
        jMnuAcercaDe.setText("Acerca de ...");
        jMnuAcercaDe.setToolTipText(EEvents.EV_ABOUT.getTooltip());
        jMnuAcercaDe.setActionCommand(EEvents.EV_ABOUT.getValue());
        jMnuAyuda.add(jMnuAcercaDe);

        jMnuMain.add(jMnuAyuda);

        setJMenuBar(jMnuMain);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAcercaDe;
    private javax.swing.JButton jBtnGrafica;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLblAvance;
    private javax.swing.JLabel jLblMessage;
    private javax.swing.JMenuItem jMnuAcercaDe;
    private javax.swing.JMenu jMnuArchivo;
    private javax.swing.JMenu jMnuAyuda;
    private javax.swing.JMenuItem jMnuGrafica;
    private javax.swing.JMenuBar jMnuMain;
    private javax.swing.JMenuItem jMnuSalir;
    private javax.swing.JPanel jPanMessage;
    private javax.swing.JPanel jPanStatus;
    private javax.swing.JScrollPane jScrMain;
    private javax.swing.JToolBar jTlbMain;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setListeners(IController controller) {
        // Listeners para los botones
        jBtnAcercaDe.addActionListener(controller);
        jBtnSalir.addActionListener(controller);
        jBtnGrafica.addActionListener(controller);
        // Listeners para los menus
        jMnuAcercaDe.addActionListener(controller);
        jMnuSalir.addActionListener(controller);
        jMnuGrafica.addActionListener(controller);
    }

    @Override
    public void showView() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.debug("Error al instanciar L&F {}", ex.getMessage());
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        final MainView thisView = this;
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                thisView.setExtendedState(JFrame.MAXIMIZED_BOTH);
                thisView.setVisible(true);
            }
        });
    }
    
    @Override
    public void hideView() {
        if (this.isVisible()) {
            this.setVisible(false);
        }
    }
    
    @Override
    public void cleanView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroyView() {
        this.hideView();
        this.dispose();
    }
    
    @Override
    public JDesktopPane getDesktop() {
        return jDskMain;
    }

    @Override
    public JFrame getMainFrame() {
        return this;
    }

    @Override
    public JComponent toComponent() {
        return jDskMain;
    }

    @Override
    public JComponent getMainComponent() {
        return jDskMain;
    }

    /////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////
    private MDIDesktopPane jDskMain = new MDIDesktopPane();
    
    /**
     * An extension of WDesktopPane that supports often used MDI functionality. This
     * class also handles setting scroll bars for when windows move too far to the
     * left or bottom, providing the MDIDesktopPane is in a ScrollPane.
     */
    class MDIDesktopPane extends JDesktopPane {

        /**
         * Para el serializado
         */
        private static final long serialVersionUID = -7197725429096732076L;
        
        private static final int FRAME_OFFSET = 20;
        
        private final MDIDesktopManager manager;

        public MDIDesktopPane() {
            manager = new MDIDesktopManager(this);
            setDesktopManager(manager);
            setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
        }

        @Override
        public void setBounds(int x, int y, int w, int h) {
            super.setBounds(x, y, w, h);
            checkDesktopSize();
        }

        public Component add(JInternalFrame frame) {
            JInternalFrame[] array = getAllFrames();

            Component retval = super.add(frame);
            checkDesktopSize();

            moveToFront(frame);
            frame.setVisible(true);
            try {
                frame.setSelected(true);
            } catch (PropertyVetoException e) {
                frame.toBack();
            }
            return retval;
        }

        @Override
        public void remove(Component c) {
            super.remove(c);
            checkDesktopSize();
        }

        /**
         * Cascade all internal frames
         */
        public void cascadeFrames() {
            int x = 0;
            int y = 0;
            JInternalFrame allFrames[] = getAllFrames();

            manager.setNormalSize();
            int frameHeight = (getBounds().height - 5) - allFrames.length * FRAME_OFFSET;
            int frameWidth = (getBounds().width - 5) - allFrames.length * FRAME_OFFSET;
            for (int i = allFrames.length - 1; i >= 0; i--) {
                allFrames[i].setSize(frameWidth, frameHeight);
                allFrames[i].setLocation(x, y);
                x = x + FRAME_OFFSET;
                y = y + FRAME_OFFSET;
            }
        }

        /**
         * Tile all internal frames
         */
        public void tileFrames() {
            java.awt.Component allFrames[] = getAllFrames();
            manager.setNormalSize();
            int frameHeight = getBounds().height / allFrames.length;
            int y = 0;
            for (int i = 0; i < allFrames.length; i++) {
                allFrames[i].setSize(getBounds().width, frameHeight);
                allFrames[i].setLocation(0, y);
                y = y + frameHeight;
            }
        }

        /**
         * Sets all component size properties ( maximum, minimum, preferred) to the
         * given dimension.
         */
        public void setAllSize(Dimension d) {
            setMinimumSize(d);
            setMaximumSize(d);
            setPreferredSize(d);
        }

        /**
         * Sets all component size properties ( maximum, minimum, preferred) to the
         * given width and height.
         */
        public void setAllSize(int width, int height) {
            setAllSize(new Dimension(width, height));
        }

        private void checkDesktopSize() {
            if (getParent() != null && isVisible()) {
                manager.resizeDesktop();
            }
        }
    }

    /**
     * Private class used to replace the standard DesktopManager for JDesktopPane.
     * Used to provide scrollbar functionality.
     */
    class MDIDesktopManager extends DefaultDesktopManager {
        
        /**
         * Para el serializado.
         */
        private static final long serialVersionUID = -1906603985799689181L;

        private MDIDesktopPane desktop;

        public MDIDesktopManager(MDIDesktopPane desktop) {
            this.desktop = desktop;
        }

        @Override
        public void endResizingFrame(JComponent f) {
            super.endResizingFrame(f);
            resizeDesktop();
        }

        @Override
        public void endDraggingFrame(JComponent f) {
            super.endDraggingFrame(f);
            resizeDesktop();
        }
        
        protected boolean isInSetNormalSize = false;

        public void setNormalSize() {
            if (!isInSetNormalSize) {
                logger.debug("setNormalSize");
                isInSetNormalSize = true;
                
                JScrollPane scrollPane = getScrollPane();
                int x = 0;
                int y = 0;
                Insets scrollInsets = getScrollPaneInsets();

                if (scrollPane != null) {
                    Dimension d = scrollPane.getVisibleRect().getSize();
                    if (scrollPane.getBorder() != null) {
                        d.setSize(d.getWidth() - scrollInsets.left - scrollInsets.right, d.getHeight() - scrollInsets.top - scrollInsets.bottom);
                    }

                    d.setSize(d.getWidth() - 20, d.getHeight() - 20);
                    desktop.setAllSize(x, y);
                    scrollPane.invalidate();
                    scrollPane.validate();
                    desktop.invalidate();
                    desktop.validate();
                }                
                isInSetNormalSize = false;
            }
        }

        private Insets getScrollPaneInsets() {
            JScrollPane scrollPane = getScrollPane();
            if (scrollPane == null) {
                return new Insets(0, 0, 0, 0);
            } else {
                return getScrollPane().getBorder().getBorderInsets(scrollPane);
            }
        }

        private JScrollPane getScrollPane() {
            if (desktop.getParent() instanceof JViewport) {
                JViewport viewPort = (JViewport) desktop.getParent();
                if (viewPort.getParent() instanceof JScrollPane) {
                    return (JScrollPane) viewPort.getParent();
                }
            }
            return null;
        }

        protected boolean isInResizeDesktop = false;
        
        protected void resizeDesktop() {
            if (!isInResizeDesktop) {
                // estamos dentro de resizeDesktop...
                logger.debug("resizeDesktop");
                isInResizeDesktop = true;
                JScrollPane scrollPane = getScrollPane();
                Insets scrollInsets = getScrollPaneInsets();

                if (scrollPane != null) {
                    
                    Dimension d = scrollPane.getVisibleRect().getSize();
                    int x = 0;
                    int y = 0;
                    int xmin = 0;
                    int ymin = 0;
                     
                    JInternalFrame allFrames[] = desktop.getAllFrames();
                    for (JInternalFrame allFrame : allFrames) {
                        if (allFrame.getX() + allFrame.getWidth() > x) {
                            x = allFrame.getX() + allFrame.getWidth();
                        }
                        if (allFrame.getX() < xmin) {
                            xmin = allFrame.getX();
                        }
                        if (allFrame.getY() + allFrame.getHeight() > y) {
                            y = allFrame.getY() + allFrame.getHeight();
                        }
                        if (allFrame.getY() < ymin) {
                            ymin = allFrame.getY();
                        }
                    }
                    // mover todos los frames en la misma medida que se
                    // salen por la izquierda o por arriba.                    
                    if (xmin < 0 || ymin < 0) {
                        for (JInternalFrame allFrame : allFrames) {
                            allFrame.setLocation(
                                    allFrame.getX() - xmin, 
                                    allFrame.getY() - ymin);
                        }
                        // recalcular los tamaños, para ver si aún necesitamos
                        // ampliar el tamaño del desktop
                        x = y = xmin = ymin = 0;
                        for (JInternalFrame allFrame : allFrames) {
                            if (allFrame.getX() + allFrame.getWidth() > x) {
                                x = allFrame.getX() + allFrame.getWidth();
                            }
                            if (allFrame.getX() < xmin) {
                                xmin = allFrame.getX();
                            }
                            if (allFrame.getY() + allFrame.getHeight() > y) {
                                y = allFrame.getY() + allFrame.getHeight();
                            }
                            if (allFrame.getY() < ymin) {
                                ymin = allFrame.getY();
                            }
                        }
                    }
                    if (scrollPane.getBorder() != null) {
                        d.setSize(d.getWidth() - scrollInsets.left - scrollInsets.right,
                            d.getHeight() - scrollInsets.top - scrollInsets.bottom);
                    }
                    if (x <= d.getWidth()) {
                        x = ((int) d.getWidth()) - 20;
                    }
                    if (y <= d.getHeight()) {
                        y = ((int) d.getHeight()) - 20;
                    }
                    // ajustar los negativos
                    if (xmin < 0) {
                        x -= xmin;
                    }
                    if (ymin < 0) {
                        // Ajuste debido a que lo más que agrega son 20 y
                        // con eso no se muestran los scrolls.
                        if (ymin >= -20) {
                            ymin -= -20;
                        }
                        y -= ymin;
                    }
                    desktop.setAllSize(x, y);
                    // ahora ajustar la posición del desktop.
                    // desktop.setLocation(xmin, ymin);
                    // JViewport view = scrollPane.getViewport();
                    // view.setViewSize(new Dimension(x, y));
                    // view.setViewPosition(new Point(-xmin, -ymin));
                    // desktop.invalidate();
                    // desktop.validate();
                    scrollPane.invalidate();
                    scrollPane.validate();
                    logger.debug("ScrollPane: {} x {}", 
                            scrollPane.getWidth(), scrollPane.getHeight());
                    logger.debug("desktop: {} x {} @ ({}, {})", 
                            desktop.getWidth(), desktop.getHeight(),
                            desktop.getX(), desktop.getY());
                    logger.debug("ScrollBars position: X:{}, Y:{}", 
                            scrollPane.getHorizontalScrollBar().getValue(),
                            scrollPane.getVerticalScrollBar().getValue());
                    logger.debug("ScrollBars maxs: X:[{}-{}], Y:[{}-{}]",
                            scrollPane.getHorizontalScrollBar().getMinimum(),
                            scrollPane.getHorizontalScrollBar().getMaximum(),
                            scrollPane.getVerticalScrollBar().getMinimum(),
                            scrollPane.getVerticalScrollBar().getMaximum());
                }
                // saliendo de resizeDesktop...
                isInResizeDesktop = false;
            }
        }
    }
    /////////////////////////////////////////////
    /////////////////////////////////////////////

}
