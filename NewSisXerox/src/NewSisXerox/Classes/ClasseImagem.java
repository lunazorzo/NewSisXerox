/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Classes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Allan
 */
public class ClasseImagem extends JDesktopPane {

    Image iiImagem;

    public ClasseImagem(String imagem) {
        try {
            iiImagem = javax.imageio.ImageIO.read(getClass().getResource("/imagens/Brazil_Flag.jpg"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar imagem!" + "\n" + ex.getMessage());
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(iiImagem, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
