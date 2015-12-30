package NewSisXerox.Classes;

import java.text.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.PlainDocument;

/**
 * @author Rui Rossi dos Santos
 */
public class Validador extends PlainDocument {

    public static boolean vldStringMinMax(String valor, int min, int max) {
        valor = valor.trim();
        if (valor.length() < min || valor.length() > max) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean vldInteiro(String valor, int minimo) {
        try {
            for (int i = 0; i < valor.length(); i++) {
                if (valor.charAt(i) == '.') {
                    valor = valor.substring(0, i) + valor.substring(i + 1, valor.length());
                }
            }

            int i = Integer.parseInt(valor);
            if (i < minimo) {
                return false;
            } else {
                return true;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean vldDecimal(String valor, double minimo) {
        try {
            valor = valor.replaceAll(",", ".");
            double d = Double.parseDouble(valor);
            if (d < minimo) {
                return false;
            } else {
                return true;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean vldFone(String valor) {
        if (valor == null) {
            return false;
        }
        valor = valor.trim();

        if (valor.length() != 13) {
            return false;
        }
        if (valor.charAt(0) != '(' || valor.charAt(3) != ')' || valor.charAt(8) != '-') {
            return false;
        }

        valor = valor.substring(1, 3) + valor.substring(4, 8) + valor.substring(9, 13);

        if (valor.length() != 10) {
            return false;
        }

        for (int i = 0; i < valor.length(); i++) {
            if (valor.charAt(i) < '0' || valor.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean vldData(String valor) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        try {
            df.parse(valor);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static boolean vldCep(String valor) {
        if (valor == null) {
            return false;
        }
        valor = valor.trim();

        if (valor.length() != 9) {
            return false;
        }
        if (valor.charAt(5) != '-') {
            return false;
        }

        valor = valor.substring(0, 5) + valor.substring(6, 9);

        for (int i = 0; i < valor.length(); i++) {
            if (valor.charAt(i) < '0' || valor.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }

    public static boolean vldCnpj(String valor) {
        if (valor == null) {
            return false;
        }
        valor = valor.trim();

        if (valor.length() != 18) {
            return false;
        }
        if (valor.charAt(2) != '.' || valor.charAt(6) != '.' || valor.charAt(10) != '/'
                || valor.charAt(15) != '-') {
            return false;
        }

        valor = valor.substring(0, 2) + valor.substring(3, 6) + valor.substring(7, 10)
                + valor.substring(11, 15) + valor.substring(16, 18);

        for (int i = 0; i < valor.length(); i++) {
            if (valor.charAt(i) < '0' || valor.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }

    //Verifica se a Frame já está aberta
    public static Boolean verificaFrame(JDesktopPane jDesktopPane, JInternalFrame frame) {
        Boolean valor = false;
        JInternalFrame[] results;
        results = jDesktopPane.getAllFrames();
        for (int i = 0; i < results.length; i++) {
            if (results[i].equals(frame)) {
                valor = true;
                break;
            }
        }
        return valor;
    }
//      http://www.guj.com.br/8002-validacao-de-email
    ///////////////////////////////////
    ////                          ////
    //// Valida E-mail           ////
    ////                        ////
    ///////////////////////////////

    public static boolean isEmailValid(String email) {
        if ((email == null) || (email.trim().length() == 0)) {
            return false;
        }

        String emailPattern = "\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b";
        Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    ///////////////////////////////////
    ////                          ////
    //// Valor por Extenso       ////
    ////                        ////
    ///////////////////////////////
    public static String valorPorExtenso(double vlr) {
        if (vlr == 0) {
            return ("zero");
        }

        long inteiro = (long) Math.abs(vlr); // parte inteira do valor
        double resto = vlr - inteiro;       // parte fracionÃ¡ria do valor

        String vlrS = String.valueOf(inteiro);
        if (vlrS.length() > 15) {
            return ("Erro: valor superior a 999 trilhões.");
        }

        String s = "", saux, vlrP;
        String centavos = String.valueOf((int) Math.round(resto * 100));

        String[] unidade = {"", "um", "dois", "três", "quatro", "cinco",
            "seis", "sete", "oito", "nove", "dez", "onze",
            "doze", "treze", "quatorze", "quinze", "dezesseis",
            "dezessete", "dezoito", "dezenove"};
        String[] centena = {"", "cento", "duzentos", "trezentos",
            "quatrocentos", "quinhentos", "seiscentos",
            "setecentos", "oitocentos", "novecentos"};
        String[] dezena = {"", "", "vinte", "trinta", "quarenta", "cinquenta",
            "sessenta", "setenta", "oitenta", "noventa"};
        String[] qualificaS = {"", "mil", "milhão", "bilhão", "trilhão"};
        String[] qualificaP = {"", "mil", "milhões", "bilhões", "trilhões"};

// definindo o extenso da parte inteira do valor
        int n, unid, dez, cent, tam, i = 0;
        boolean umReal = false, tem = false;
        while (!vlrS.equals("0")) {
            tam = vlrS.length();
            if (tam > 3) {
                vlrP = vlrS.substring(tam - 3, tam);
                vlrS = vlrS.substring(0, tam - 3);
            } else { // Ãºltima parte do valor
                vlrP = vlrS;
                vlrS = "0";
            }
            if (!vlrP.equals("000")) {
                saux = "";
                if (vlrP.equals("100")) {
                    saux = "cem";
                } else {
                    n = Integer.parseInt(vlrP, 10);  // para n = 371, tem-se:
                    cent = n / 100;                  // cent = 3 (centena trezentos)
                    dez = (n % 100) / 10;            // dez  = 7 (dezena setenta)
                    unid = (n % 100) % 10;           // unid = 1 (unidade um)
                    if (cent != 0) {
                        saux = centena[cent];
                    }
                    if ((dez != 0) || (unid != 0)) {
                        if ((n % 100) <= 19) {
                            if (saux.length() != 0) {
                                saux = saux + " e " + unidade[n % 100];
                            } else {
                                saux = unidade[n % 100];
                            }
                        } else {
                            if (saux.length() != 0) {
                                saux = saux + " e " + dezena[dez];
                            } else {
                                saux = dezena[dez];
                            }
                            if (unid != 0) {
                                if (saux.length() != 0) {
                                    saux = saux + " e " + unidade[unid];
                                } else {
                                    saux = unidade[unid];
                                }
                            }
                        }
                    }
                }
                if (vlrP.equals("1") || vlrP.equals("001")) {
                    if (i == 0) // 1a. parte do valor (um real)
                    {
                        umReal = true;
                    } else {
                        saux = saux + " " + qualificaS[i];
                    }
                } else if (i != 0) {
                    saux = saux + " " + qualificaP[i];
                }
                if (s.length() != 0) {
                    s = saux + ", " + s;
                } else {
                    s = saux;
                }
            }
            if (((i == 0) || (i == 1)) && s.length() != 0) {
                tem = true; // tem centena ou mil no valor
            }
            i = i + 1; // prÃ³ximo qualificador: 1- mil, 2- milhÃ£o, 3- bilhÃ£o, ...
        }

        if (s.length() != 0) {
            if (umReal) {
                s = s + " real";
            } else if (tem) {
                s = s + " reais";
            } else {
                s = s + " de reais";
            }
        }

// definindo o extenso dos centavos do valor
        if (!centavos.equals("0")) { // valor com centavos
            if (s.length() != 0) // se nÃ£o Ã© valor somente com centavos
            {
                s = s + " e ";
            }
            if (centavos.equals("1")) {
                s = s + "um centavo";
            } else {
                n = Integer.parseInt(centavos, 10);
                if (n <= 19) {
                    s = s + unidade[n];
                } else {             // para n = 37, tem-se:
                    unid = n % 10;   // unid = 37 % 10 = 7 (unidade sete)
                    dez = n / 10;    // dez  = 37 / 10 = 3 (dezena trinta)
                    s = s + dezena[dez];
                    if (unid != 0) {
                        s = s + " e " + unidade[unid];
                    }
                }
                s = s + " centavos";
            }
        }
        return (s);
    }   
}
