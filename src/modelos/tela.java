/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author tanak
 */
public class tela extends javax.swing.JFrame {

    private String numeroNaTela = "";
    private String resultado = "";
    double numero1 = 0.0;
    double numero2 = 0.0;
    private char op = ' ';

    /**
     * Creates new form tela
     */
    public tela() {
        initComponents();
        setLocationRelativeTo(null);
        tArea_resultado.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tArea_resultado = new javax.swing.JTextArea();
        btn_numero_sete = new javax.swing.JButton();
        btn_numero_quatro = new javax.swing.JButton();
        btn_numero_um = new javax.swing.JButton();
        btn_numero_oito = new javax.swing.JButton();
        btn_numero_cinco = new javax.swing.JButton();
        btn_numero_dois = new javax.swing.JButton();
        btn_numero_nove = new javax.swing.JButton();
        btn_numero_seis = new javax.swing.JButton();
        btn_numero_tres = new javax.swing.JButton();
        btn_op_subtracao = new javax.swing.JButton();
        btn_op_divisao = new javax.swing.JButton();
        btn_op_multiplicacao = new javax.swing.JButton();
        btn_op_soma = new javax.swing.JButton();
        btn_op_resultado = new javax.swing.JButton();
        btn_numero_zero = new javax.swing.JButton();
        btn_fracionado = new javax.swing.JButton();
        btn_op_pow = new javax.swing.JButton();
        btn_op_raizQuadrada = new javax.swing.JButton();
        btn_op_clear = new javax.swing.JButton();

        jButton11.setText("jButton11");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        tArea_resultado.setEditable(false);
        tArea_resultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jScrollPane1.setViewportView(tArea_resultado);

        btn_numero_sete.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_numero_sete.setText("7");
        btn_numero_sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numero_seteActionPerformed(evt);
            }
        });

        btn_numero_quatro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_numero_quatro.setText("4");
        btn_numero_quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numero_quatroActionPerformed(evt);
            }
        });

        btn_numero_um.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_numero_um.setText("1");
        btn_numero_um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numero_umActionPerformed(evt);
            }
        });

        btn_numero_oito.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_numero_oito.setText("8");
        btn_numero_oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numero_oitoActionPerformed(evt);
            }
        });

        btn_numero_cinco.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_numero_cinco.setText("5");
        btn_numero_cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numero_cincoActionPerformed(evt);
            }
        });

        btn_numero_dois.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_numero_dois.setText("2");
        btn_numero_dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numero_doisActionPerformed(evt);
            }
        });

        btn_numero_nove.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_numero_nove.setText("9");
        btn_numero_nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numero_noveActionPerformed(evt);
            }
        });

        btn_numero_seis.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_numero_seis.setText("6");
        btn_numero_seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numero_seisActionPerformed(evt);
            }
        });

        btn_numero_tres.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_numero_tres.setText("3");
        btn_numero_tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numero_tresActionPerformed(evt);
            }
        });

        btn_op_subtracao.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_op_subtracao.setText("-");
        btn_op_subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op_subtracaoActionPerformed(evt);
            }
        });

        btn_op_divisao.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_op_divisao.setText("÷");
        btn_op_divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op_divisaoActionPerformed(evt);
            }
        });

        btn_op_multiplicacao.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_op_multiplicacao.setText("X");
        btn_op_multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op_multiplicacaoActionPerformed(evt);
            }
        });

        btn_op_soma.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_op_soma.setText("+");
        btn_op_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op_somaActionPerformed(evt);
            }
        });

        btn_op_resultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_op_resultado.setText("=");
        btn_op_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op_resultadoActionPerformed(evt);
            }
        });

        btn_numero_zero.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_numero_zero.setText("0");
        btn_numero_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numero_zeroActionPerformed(evt);
            }
        });

        btn_fracionado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_fracionado.setText(",");
        btn_fracionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fracionadoActionPerformed(evt);
            }
        });

        btn_op_pow.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_op_pow.setText("x²");
        btn_op_pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op_powActionPerformed(evt);
            }
        });

        btn_op_raizQuadrada.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_op_raizQuadrada.setText("√");
        btn_op_raizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op_raizQuadradaActionPerformed(evt);
            }
        });

        btn_op_clear.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_op_clear.setText("C");
        btn_op_clear.setPreferredSize(new java.awt.Dimension(60, 88));
        btn_op_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_op_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_op_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_op_subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_op_divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_op_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_op_pow, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_numero_sete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_numero_um, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_numero_quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btn_numero_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_numero_cinco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_numero_oito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_numero_dois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_fracionado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_numero_nove, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_numero_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_numero_tres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_op_multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_op_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_op_raizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_op_subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_op_divisao, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(btn_op_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn_op_soma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_numero_nove, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_numero_oito, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_numero_sete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_op_multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_numero_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_numero_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_op_raizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_numero_quatro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_numero_dois, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_numero_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_numero_um, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_numero_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_op_pow, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_fracionado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_op_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_numero_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numero_tresActionPerformed
        numeroNaTela += "3";
        carregaTexto(numeroNaTela);

    }//GEN-LAST:event_btn_numero_tresActionPerformed

    private void btn_op_raizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op_raizQuadradaActionPerformed
        btn_op('√');
    }//GEN-LAST:event_btn_op_raizQuadradaActionPerformed

    private void btn_op_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op_somaActionPerformed
        btn_op('+');
    }//GEN-LAST:event_btn_op_somaActionPerformed

    private void btn_numero_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numero_zeroActionPerformed
        numeroNaTela += "0";
        carregaTexto(numeroNaTela);

    }//GEN-LAST:event_btn_numero_zeroActionPerformed

    private void btn_numero_umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numero_umActionPerformed
        numeroNaTela += "1";
        carregaTexto(numeroNaTela);

    }//GEN-LAST:event_btn_numero_umActionPerformed

    private void btn_numero_doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numero_doisActionPerformed
        numeroNaTela += "2";
        carregaTexto(numeroNaTela);
    }//GEN-LAST:event_btn_numero_doisActionPerformed

    private void btn_numero_quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numero_quatroActionPerformed
        numeroNaTela += "4";
        carregaTexto(numeroNaTela);
    }//GEN-LAST:event_btn_numero_quatroActionPerformed

    private void btn_numero_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numero_cincoActionPerformed
        numeroNaTela += "5";
        carregaTexto(numeroNaTela);
    }//GEN-LAST:event_btn_numero_cincoActionPerformed

    private void btn_numero_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numero_seisActionPerformed
        numeroNaTela += "6";
        carregaTexto(numeroNaTela);
    }//GEN-LAST:event_btn_numero_seisActionPerformed

    private void btn_numero_seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numero_seteActionPerformed

        numeroNaTela += "7";
        carregaTexto(numeroNaTela);
    }//GEN-LAST:event_btn_numero_seteActionPerformed

    private void btn_numero_oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numero_oitoActionPerformed
        numeroNaTela += "8";
        carregaTexto(numeroNaTela);
    }//GEN-LAST:event_btn_numero_oitoActionPerformed

    private void btn_numero_noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numero_noveActionPerformed
        numeroNaTela += "9";
        carregaTexto(numeroNaTela);
    }//GEN-LAST:event_btn_numero_noveActionPerformed

    private void btn_fracionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fracionadoActionPerformed
        numeroNaTela += ".";
        carregaTexto(numeroNaTela);
    }//GEN-LAST:event_btn_fracionadoActionPerformed

    private void btn_op_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op_resultadoActionPerformed
        int comecoNumero2 = numeroNaTela.lastIndexOf("\n");
        if (comecoNumero2 > 0) {
            resultado(numeroNaTela, op);
        }
    }//GEN-LAST:event_btn_op_resultadoActionPerformed

    private void btn_op_subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op_subtracaoActionPerformed
        btn_op('-');
    }//GEN-LAST:event_btn_op_subtracaoActionPerformed

    private void btn_op_divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op_divisaoActionPerformed
        btn_op('÷');
    }//GEN-LAST:event_btn_op_divisaoActionPerformed

    private void btn_op_multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op_multiplicacaoActionPerformed
        {
            btn_op('X');
        }    }//GEN-LAST:event_btn_op_multiplicacaoActionPerformed

    private void btn_op_powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op_powActionPerformed
        btn_op('^');
    }//GEN-LAST:event_btn_op_powActionPerformed

    private void btn_op_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_op_clearActionPerformed
        limpaValores();
        carregaTexto(numeroNaTela);
    }//GEN-LAST:event_btn_op_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    public void carregaTexto(String texto) {
        tArea_resultado.setText(texto);
    }

    public String resultado(String numero, char op) {
        if (existeCalculo(numeroNaTela)) {
            int comecoSegundoNumero = numeroNaTela.lastIndexOf("\n");
            int fimPrimeiroNummero = numeroNaTela.indexOf("\n");
            if (fimPrimeiroNummero == -1) {
                numero1 = Double.parseDouble(numeroNaTela);
            } else {
//  *   caso exista mais de um número na tela
                numero1 = Double.parseDouble(numeroNaTela.substring(0, fimPrimeiroNummero));
            }
//            if (op != '²' && op != '√') {
            numero2 = Double.parseDouble(numeroNaTela.substring(comecoSegundoNumero + 1));
//            }
            switch (op) {
                case '+':
                    resultado = String.valueOf(numero1 + numero2);
                    break;
                case '-':
                    resultado = String.valueOf(numero1 - numero2);
                    break;
                case 'X':
                    resultado = String.valueOf(numero1 * numero2);
                    break;
                case '÷':
                    resultado = String.valueOf(numero1 / numero2);
                    break;
                case '√':
                    resultado = String.valueOf(Math.pow(numero2, (1 / numero1)));
                    break;
                case '^':
                    resultado = String.valueOf(Math.pow(numero1, numero2));
                    break;
                default:
                    resultado = "falha no calculo";
                    break;

            }
            if (ehInteiro(resultado)) {
//   * caso seja um numero inteiro mostrar ele sem casas decimais.

                resultado = String.valueOf((int) (Double.parseDouble(resultado)));
            }
            limpaValores();
            carregaTexto(resultado);

        } else {
            JOptionPane.showMessageDialog(this, "Calculo incompleto, digite um calculo válido");
        }
        return resultado;
    }

    private boolean ehInteiro(String resultado) {
        int ponto = resultado.indexOf(".");
        long x = 1;

        if (resultado.length() < 15) {
            x = Long.parseLong(resultado.substring(ponto + 1));

        }
        return x == 0;//   * caso o número seja inteiro, mostrar sem o ".0".

    }

    public void limpaValores() {
        numeroNaTela = "";
        numero1 = 0.0;
        numero2 = 0.0;
        op = ' ';
    }

    public void btn_op(char operacaoRealizada) {

        if (op == ' ') {
            if (numeroNaTela.equals("")) {
//    * só pegar o número caso não seja uma string vazia
                limpaValores();
                JOptionPane.showMessageDialog(this, "digite um número antes do simbolo da conta");
            } else {
                numero1 = Double.parseDouble(numeroNaTela);
            }
//            if (operacaoRealizada == '²' || operacaoRealizada == '√') {
//                resultado(numeroNaTela, operacaoRealizada);
//            } else {
            op = operacaoRealizada;
            numeroNaTela += "\n" + op + " \n";
            carregaTexto(numeroNaTela);
//            }
        } else {
            resultado(numeroNaTela, op);
        }
    }

    private boolean existeCalculo(String numerosNaTela) {
        boolean calculoCorreto = false;

        char[] calculosAceitos = {'+', '-', 'X', '÷', '^', '√'};

        for (int i = 0; i < calculosAceitos.length; i++) {
            if (numerosNaTela.indexOf(calculosAceitos[i]) != -1) {//caso encontre o simbolo correspondente
                calculoCorreto = true;
                break;
            }
        }
        return calculoCorreto;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fracionado;
    private javax.swing.JButton btn_numero_cinco;
    private javax.swing.JButton btn_numero_dois;
    private javax.swing.JButton btn_numero_nove;
    private javax.swing.JButton btn_numero_oito;
    private javax.swing.JButton btn_numero_quatro;
    private javax.swing.JButton btn_numero_seis;
    private javax.swing.JButton btn_numero_sete;
    private javax.swing.JButton btn_numero_tres;
    private javax.swing.JButton btn_numero_um;
    private javax.swing.JButton btn_numero_zero;
    private javax.swing.JButton btn_op_clear;
    private javax.swing.JButton btn_op_divisao;
    private javax.swing.JButton btn_op_multiplicacao;
    private javax.swing.JButton btn_op_pow;
    private javax.swing.JButton btn_op_raizQuadrada;
    private javax.swing.JButton btn_op_resultado;
    private javax.swing.JButton btn_op_soma;
    private javax.swing.JButton btn_op_subtracao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tArea_resultado;
    // End of variables declaration//GEN-END:variables
}
