package conversorxd;

public class Conversor {

    public static final int MAX_BASE = 1024;

    // Verifica si baseY es una potencia de baseX
    public static boolean esPotencia(int baseX, int baseY) {
        return Math.log(baseY) / Math.log(baseX)
                % 1 == 0;
    }

    public static String convertirDesdeDecimal(int numero, int base) {
        StringBuilder baseYNumero = new StringBuilder();
        final String DIGITOS = obtenerSimbolosBase(base);
        final int BASE_Y = base;

        while (numero > 0) {
            int digito = numero % BASE_Y;
            baseYNumero.insert(0, DIGITOS.charAt(digito));
            numero /= BASE_Y;
        }
        return baseYNumero.toString();
    }

    // Obtiene los símbolos correspondientes a una base    
    public static String obtenerSimbolosBase(int base) {
        StringBuilder simbolos = new StringBuilder("0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz");

        for (int i = 62; i < base; i++) {
            simbolos.append((char) (i + 61)); // aqui empezar añadir caracteres ascci despues de la z
        }

        return simbolos.toString();
    }

    // Convierte de base X a base Y directamente si es potencia, sino convierte primero a decimal
    public static String convertirBaseXABaseY(String numero, int baseX, int baseY) {
        if ((baseX >= 2 && baseX <= MAX_BASE) && (baseY >= 2 && baseY <= MAX_BASE)) {
            if (baseX == 10) {
                String[] partes = numero.split("\\.");
                int parteEntera = Integer.parseInt(partes[0]);
                String parteDecimal = "0";

                if (partes.length > 1) {
                    parteDecimal = partes[1];
                }

                String parteEnteraResultado = convertirDesdeDecimal(parteEntera, baseY);
                String parteDecimalResultado = convertirParteDecimalDesdeDecimal(parteDecimalADecimal(parteDecimal, baseX), baseY);

                return parteEnteraResultado + "." + parteDecimalResultado;
            } else {
                double valorDecimal = convertirADecimal(numero, baseX);
                return convertirDesdeDecimal((int) valorDecimal, baseY);
            }
        } else {
            return "Bases inválidas. Ingrese bases entre 2 y " + MAX_BASE + ".";
        }
    }

    public static String convertirPorPotencia(String numero, int baseX, int baseY) {
        if (esPotencia(baseX, baseY)) {
            return convertirDirectamentePorPotencia(numero, baseX, baseY);
        } else if (esPotencia(baseY, baseX)) {
            return convertirDirectamentePorPotenciaInversa(numero, baseY, baseX);
        } else {
            return convertirBaseXABaseY(numero, baseX, baseY);
        }
    }

    public static String convertirDirectamentePorPotencia(String numero, int baseX, int baseY) {
        int longitudGrupo = (int) (Math.log(baseY) / Math.log(baseX));
        StringBuilder resultado = new StringBuilder();

        int i = numero.length() - 1;
        while (i >= 0) {
            int grupo = 0;
            int potencia = 1;

            for (int j = 0; j < longitudGrupo && i >= 0; j++) {
                int digito = Character.digit(numero.charAt(i), baseX);
                grupo += digito * potencia;
                potencia *= baseX;
                i--;
            }

            String conversionGrupo = convertirDesdeDecimal(grupo, baseY);
            resultado.insert(0, conversionGrupo);
        }

        return resultado.toString();
    }

    public static String convertirDirectamentePorPotenciaInversa(String numero, int baseX, int baseY) {
        int longitudGrupo = (int) (Math.log(baseX) / Math.log(baseY));
        StringBuilder resultado = new StringBuilder();

        int i = numero.length() - 1;
        while (i >= 0) {
            int grupo = 0;
            int potencia = 1;

            // Iterar a través de los dígitos en el grupo actual
            for (int j = 0; j < longitudGrupo && i >= 0; j++) {
                int digito = Character.digit(numero.charAt(i), baseX);
                grupo += digito * potencia;
                potencia *= baseX;
                i--;
            }

            String conversionGrupo = convertirDesdeDecimal(grupo, baseY);
            resultado.insert(0, conversionGrupo);
        }

        return resultado.toString();
    }

    public static double convertirParteDecimalADecimal(String numero, int base) {
        double decimal = 0.0;
        final String DIGITOS = obtenerSimbolosBase(base);

        for (int i = 0; i < numero.length(); i++) {
            int valorDigito = DIGITOS.indexOf(numero.charAt(i));
            decimal += valorDigito * Math.pow(base, -1 * (i + 1));
        }
        return decimal;
    }

    public static double convertirADecimal(String numero, int base) {
        double decimal = 0.0;
        final String DIGITOS = obtenerSimbolosBase(base);
        int puntoIndex = numero.indexOf('.');

        if (puntoIndex == -1) {
            puntoIndex = numero.length();
        }

        int potencia = puntoIndex - 1;

        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == '.') {
                continue;
            }

            int valorDigito = DIGITOS.indexOf(numero.charAt(i));
            decimal += valorDigito * Math.pow(base, potencia);
            potencia--;
        }
        return decimal;
    }

    public static String convertirParteDecimalDesdeDecimal(double numero, int base) {
        StringBuilder baseYNumero = new StringBuilder();
        final String DIGITOS = obtenerSimbolosBase(base);
        int maxDigitos = 10;

        for (int i = 0; i < 10; i++) {
            numero *= base;
            int digito = (int) numero;
            baseYNumero.append(DIGITOS.charAt(digito));
            numero -= digito;

            if (numero == 0.0) {
                break;
            }
        }
        return baseYNumero.toString();
    }

    public static double parteDecimalADecimal(String numero, int base) {
        double decimal = 0.0;
        final String DIGITOS = obtenerSimbolosBase(base);

        for (int i = 0; i < numero.length(); i++) {
            int valorDigito = DIGITOS.indexOf(numero.charAt(i));
            decimal += valorDigito * Math.pow(base, -1 * (i + 1));
        }
        return decimal;
    }

    public static String sumarEnBase(String numero1, String numero2, int base) {
        boolean negativo1 = numero1.startsWith("-");
        boolean negativo2 = numero2.startsWith("-");

        // Si un número es negativo, considerarlo mayor en la suma/resta
        if (negativo1 && !negativo2) {
            return restarEnBase(numero2, numero1.substring(1), base);
        } else if (!negativo1 && negativo2) {
            return restarEnBase(numero1, numero2.substring(1), base);
        }

        // Si ambos números son negativos, realizar la suma y agregar el signo negativo
        if (negativo1 && negativo2) {
            return "-" + sumarEnBase(numero1.substring(1), numero2.substring(1), base);
        }

        // Si solo uno es negativo, llamar a la función de resta para manejarlo
        if (negativo1) {
            return restarEnBase(numero1.substring(1), numero2, base);
        } else if (negativo2) {
            return restarEnBase(numero1, numero2.substring(1), base);
        }

        int maxLength = Math.max(numero1.length(), numero2.length());
        StringBuilder paddedNumero1 = new StringBuilder(numero1);
        StringBuilder paddedNumero2 = new StringBuilder(numero2);

        // Rellenar con ceros a la izquierda si las cadenas no tienen la misma longitud
        while (paddedNumero1.length() < maxLength) {
            paddedNumero1.insert(0, "0");
        }

        while (paddedNumero2.length() < maxLength) {
            paddedNumero2.insert(0, "0");
        }

        int carry = 0;
        StringBuilder resultado = new StringBuilder();
        final String DIGITOS = obtenerSimbolosBase(base);

        for (int i = maxLength - 1; i >= 0; i--) {
            int digito1 = DIGITOS.indexOf(paddedNumero1.charAt(i));
            int digito2 = DIGITOS.indexOf(paddedNumero2.charAt(i));

            int suma = digito1 + digito2 + carry;

            // Calcular carry y ajustar para bases superiores
            carry = suma / base;
            suma %= base;

            resultado.insert(0, DIGITOS.charAt(suma));
        }

        // Agregar carry final si es necesario
        if (carry != 0) {
            resultado.insert(0, DIGITOS.charAt(carry));
        }

        return resultado.toString();
    }

    public static String restarEnBase(String numero1, String numero2, int base) {
        // Determinar si los números son negativos
        boolean negativo1 = numero1.startsWith("-");
        boolean negativo2 = numero2.startsWith("-");

        // Realizar operaciones en función de los signos y llamar a las funciones adecuadas
        if (negativo1 && negativo2) {
            return restarEnBase(numero2.substring(1), numero1.substring(1), base);
        } else if (negativo1) {
            return "-" + sumarEnBase(numero1.substring(1), numero2, base);
        } else if (negativo2) {
            return sumarEnBase(numero1, numero2.substring(1), base);
        }

        // Si número2 es mayor, restar número1 de número2 y agregar signo negativo al resultado
        if (numero2EsMayor(numero1, numero2, base)) {
            return "-" + restarEnBase(numero2, numero1, base);
        }

        // Rellenar con ceros a la izquierda para igualar longitudes
        int maxLength = Math.max(numero1.length(), numero2.length());
        StringBuilder paddedNumero1 = new StringBuilder(numero1);
        StringBuilder paddedNumero2 = new StringBuilder(numero2);
        while (paddedNumero1.length() < maxLength) {
            paddedNumero1.insert(0, "0");
        }
        while (paddedNumero2.length() < maxLength) {
            paddedNumero2.insert(0, "0");
        }

        int carry = 0;
        StringBuilder resultado = new StringBuilder();
        final String DIGITOS = obtenerSimbolosBase(base);

        // Realizar resta dígito a dígito
        for (int i = maxLength - 1; i >= 0; i--) {
            int digito1 = DIGITOS.indexOf(paddedNumero1.charAt(i));
            int digito2 = DIGITOS.indexOf(paddedNumero2.charAt(i));

            int resta = digito1 - digito2 - carry;

            // Manejar el acarreo y ajustar para bases superiores
            if (resta < 0) {
                resta += base;
                carry = 1;
            } else {
                carry = 0;
            }

            resultado.insert(0, DIGITOS.charAt(resta));
        }

        // Eliminar ceros no significativos del resultado
        return eliminarCerosSobrantes(resultado.toString());
    }

    public static boolean numero2EsMayor(String numero1, String numero2, int base) {
        // Compara las longitudes de los números
        if (numero1.length() > numero2.length()) {
            return false;  // Si número1 tiene más dígitos, entonces número2 no puede ser mayor
        } else if (numero2.length() > numero1.length()) {
            return true;   // Si número2 tiene más dígitos, entonces número2 es definitivamente mayor
        }

        // Si las longitudes son iguales, comparar dígito a dígito
        final String DIGITOS = obtenerSimbolosBase(base);

        for (int i = 0; i < numero1.length(); i++) {
            int digito1 = DIGITOS.indexOf(numero1.charAt(i)); // Obtener el valor del dígito en número1
            int digito2 = DIGITOS.indexOf(numero2.charAt(i)); // Obtener el valor del dígito en número2

            if (digito1 > digito2) {
                return false;  // Si el dígito en número1 es mayor, número2 no es mayor
            } else if (digito2 > digito1) {
                return true;   // Si el dígito en número2 es mayor, número2 es mayor
            }
        }

        return false;  // Si ambos números son iguales dígito a dígito, entonces número2 no es mayor
    }

    public static String eliminarCerosSobrantes(String numero) {
        int i = 0;
        while (i < numero.length() && numero.charAt(i) == '0') {
            i++;
        }
        return numero.substring(i);
    }

    public static void main(String args[]) {
        // Aquí está el código de inicialización de la interfaz gráfica , esto es pa que la vista no joda.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
}
