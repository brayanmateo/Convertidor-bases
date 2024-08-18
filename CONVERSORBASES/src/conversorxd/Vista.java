package conversorxd;

import conversorxd.Conversor;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ERROR = new javax.swing.JTextField();
        RESULTADO = new javax.swing.JTextField();
        NUMERO1 = new javax.swing.JTextField();
        NUMERO2 = new javax.swing.JTextField();
        Jbaseconvertir = new javax.swing.JTextField();
        BASE = new javax.swing.JTextField();
        SUMA = new javax.swing.JButton();
        CONVERTIR = new javax.swing.JButton();
        RESTA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ERROR:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 80, 30));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 630, 10));

        ERROR.setBackground(new java.awt.Color(204, 204, 204));
        ERROR.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ERROR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 110, 40));

        RESULTADO.setBackground(new java.awt.Color(204, 204, 204));
        RESULTADO.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(RESULTADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 200, 40));

        NUMERO1.setBackground(new java.awt.Color(204, 204, 204));
        NUMERO1.setForeground(new java.awt.Color(0, 0, 0));
        NUMERO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO1ActionPerformed(evt);
            }
        });
        jPanel1.add(NUMERO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 210, 40));

        NUMERO2.setBackground(new java.awt.Color(204, 204, 204));
        NUMERO2.setForeground(new java.awt.Color(0, 0, 0));
        NUMERO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO2ActionPerformed(evt);
            }
        });
        jPanel1.add(NUMERO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 210, 40));

        Jbaseconvertir.setBackground(new java.awt.Color(204, 204, 204));
        Jbaseconvertir.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Jbaseconvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 120, 40));

        BASE.setBackground(new java.awt.Color(204, 204, 204));
        BASE.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(BASE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 210, 40));

        SUMA.setBackground(new java.awt.Color(204, 255, 255));
        SUMA.setForeground(new java.awt.Color(0, 0, 0));
        SUMA.setText("SUMA");
        SUMA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SUMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUMAActionPerformed(evt);
            }
        });
        jPanel1.add(SUMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 120, 50));

        CONVERTIR.setBackground(new java.awt.Color(204, 255, 255));
        CONVERTIR.setForeground(new java.awt.Color(0, 0, 0));
        CONVERTIR.setText("CONVERTIR");
        CONVERTIR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CONVERTIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONVERTIRActionPerformed(evt);
            }
        });
        jPanel1.add(CONVERTIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 120, 50));

        RESTA.setBackground(new java.awt.Color(204, 255, 255));
        RESTA.setForeground(new java.awt.Color(0, 0, 0));
        RESTA.setText("RESTA");
        RESTA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESTAActionPerformed(evt);
            }
        });
        jPanel1.add(RESTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 120, 50));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("BASE A CONVERTIR:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BASE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NUMERO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, 90));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONVERSOR BASES NUMERICAS ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -10, 310, 90));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NUMERO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, 90));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversorxd/Sistema-binario.png"))); // NOI18N
        jLabel2.setText("a");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 660, 510));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("RESULTADO:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CONVERTIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONVERTIRActionPerformed
        String numero = NUMERO1.getText();
        int baseX = Integer.parseInt(BASE.getText());
        int baseY = Integer.parseInt(Jbaseconvertir.getText());
        String baseXStr = BASE.getText();
        String baseYStr = Jbaseconvertir.getText();

        if (numero.isEmpty() || baseXStr.isEmpty() || baseYStr.isEmpty()) {
            RESULTADO.setText("Por favor, complete todos los campos.");
            return;
        }

        if ((baseX >= 2 && baseX <= Conversor.MAX_BASE) && (baseY >= 2 && baseY <= Conversor.MAX_BASE)) {
            String parteEntera = "";
            String parteDecimal = "";

            // Separar la parte entera y decimal del número
            if (numero.contains(".")) {
                String[] partes = numero.split("\\.");
                parteEntera = partes[0];
                parteDecimal = partes[1];
            } else {
                parteEntera = numero;
            }

            // Convertir la parte entera y decimal a la base de destino
            String parteEnteraConvertida = Conversor.convertirDesdeDecimal(
                    (int) Conversor.convertirADecimal(parteEntera, baseX), baseY);
            String parteDecimalConvertida = Conversor.convertirParteDecimalDesdeDecimal(
                    Conversor.convertirParteDecimalADecimal(parteDecimal, baseX), baseY);

            // Calcular el valor original y el valor convertido
            double valorOriginal = Conversor.convertirADecimal(numero, baseX);
            double valorConvertido = Conversor.convertirADecimal(parteEnteraConvertida + "." + parteDecimalConvertida, baseY);

            // Calcular el error de aproximación en porcentaje
            double error = Math.abs((valorOriginal - valorConvertido) / valorOriginal) * 100;

            // Verificar si el error es menor del 1% y mostrarlo en el campo ERROR
            if (error <= 1.0) {
                ERROR.setText(String.format("%.2f%%", error));
            } else {
                ERROR.setText("Error mayor del 1%");
            }

            RESULTADO.setText(parteEnteraConvertida + "." + parteDecimalConvertida); // resultado en el campo de texto de resultado
        } else {
            RESULTADO.setText("Bases inválidas. Ingrese bases entre 2 y " + Conversor.MAX_BASE + ".");
        }
    }//GEN-LAST:event_CONVERTIRActionPerformed

    private void RESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESTAActionPerformed
        String numero1 = NUMERO1.getText();
        String numero2 = NUMERO2.getText();
        int base = Integer.parseInt(BASE.getText());

        String resultado = Conversor.restarEnBase(numero1, numero2, base);
        double valorOriginal = Conversor.convertirADecimal(numero1, base);
        double valorResta = Conversor.convertirADecimal(resultado, base);
        double error = Math.abs((valorResta - valorOriginal) / valorOriginal) * 100;

        if (error <= 1.0) {
           // ERROR.setText(String.format("%.2f%%", error));
        } else {
           // ERROR.setText("Error mayor del 1%");
        }

        RESULTADO.setText(resultado);
    }//GEN-LAST:event_RESTAActionPerformed

    private void NUMERO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUMERO2ActionPerformed

    private void NUMERO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUMERO1ActionPerformed

    private void SUMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUMAActionPerformed
        String numero1 = NUMERO1.getText();
        String numero2 = NUMERO2.getText();
        int base = Integer.parseInt(BASE.getText());

        String resultado = Conversor.sumarEnBase(numero1, numero2, base);
        double valorOriginal = Conversor.convertirADecimal(numero1, base);
        double valorSuma = Conversor.convertirADecimal(resultado, base);
        double error = Math.abs((valorSuma - valorOriginal) / valorOriginal) * 100;

        if (error <= 1.0) {
            // ERROR.setText(String.format("%.2f%%", error));
        } else {
            // ERROR.setText("Error mayor del 1%");
        }

        RESULTADO.setText(resultado);
    }//GEN-LAST:event_SUMAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BASE;
    private javax.swing.JButton CONVERTIR;
    private javax.swing.JTextField ERROR;
    private javax.swing.JTextField Jbaseconvertir;
    private javax.swing.JTextField NUMERO1;
    private javax.swing.JTextField NUMERO2;
    private javax.swing.JButton RESTA;
    private javax.swing.JTextField RESULTADO;
    private javax.swing.JButton SUMA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
