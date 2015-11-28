/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NewSisXerox.Classes;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Allan
 * Deixa os campos JTextField com as letras maiúsculas
 * http://www.guj.com.br/java/108023-converter-para-maiusculas---netbeans-61
 * 
 */
public class UpperCaseField extends JTextField {

    protected Document createDefaultModel() {
        return new UpperCaseDocument();
    }

    static class UpperCaseDocument extends PlainDocument {

        public void insertString(int offs, String str, AttributeSet a)
                throws BadLocationException {

            if (str == null) {
                return;
            }
            char[] upper = str.toCharArray();
            for (int i = 0; i < upper.length; i++) {
                upper[i] = Character.toUpperCase(upper[i]);
            }
            super.insertString(offs, new String(upper), a);
        }
    }
}
