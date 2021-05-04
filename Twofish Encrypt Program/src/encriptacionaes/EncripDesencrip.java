package encriptacionaes;

import java.awt.Color;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.lang.String;
import java.io.FileOutputStream ;
import java.io.OutputStream ;

public class EncripDesencrip extends javax.swing.JFrame {
    private int operacion;
    public EncripDesencrip() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
    }
    public void inicializar() {
        if (operacion == 0) {
            lbl1.setText("Text the file name");
            lbl2.setText("Process State");
            btnEncripDesencrip.setText("Mode ECB");
            btnBuscar.setText("Mode CBC");
            btnCFB.setText("Mode CFB");
        } else if (operacion == 1) {
            lbl1.setText("Text the file name");
            lbl2.setText("Process State");
            btnEncripDesencrip.setText("Mode ECB");
            btnBuscar.setText("Mode CBC");
            btnCFB.setText("Mode CFB");
        }
    }
    @SuppressWarnings("unchecked")
    public void initComponents() {

        btnBuscar = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta1 = new javax.swing.JTextArea();
        lbl2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta2 = new javax.swing.JTextArea();
        btnEncripDesencrip = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtClave = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        lblConteo = new javax.swing.JLabel();
        btnCFB = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setBackground(new java.awt.Color(51, 130, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Mode CBC");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        btnCFB.setBackground(new java.awt.Color(51, 130, 255));
        btnCFB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCFB.setForeground(new java.awt.Color(255, 255, 255));
        btnCFB.setText("Mode CFB");
        btnCFB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCFBActionPerformed(evt);
            }
        });
        lbl1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl1.setText("Text the file name");

        txta1.setColumns(10);
        txta1.setRows(3);
        jScrollPane1.setViewportView(txta1);

        lbl2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl2.setText("Process State");

        txta2.setColumns(10);
        txta2.setRows(3);
        jScrollPane2.setViewportView(txta2);

        btnEncripDesencrip.setBackground(new java.awt.Color(51, 130, 255));
        btnEncripDesencrip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEncripDesencrip.setForeground(new java.awt.Color(255, 255, 255));
        btnEncripDesencrip.setText("Mode ECB");
        btnEncripDesencrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncripDesencripActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(51, 130, 255));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Return");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtClave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveKeyTyped(evt);
            }
        });

        lbl3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl3.setText("Clave :");

        lblConteo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblConteo.setText("Empty");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnEncripDesencrip)
                                    .addComponent(btnBuscar)
                                    .addComponent(btnCFB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           )
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblConteo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(btnEncripDesencrip)
                    .addComponent(btnBuscar)
                     .addComponent(btnCFB)
                        )
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3)
                    .addComponent(lblConteo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    private void btnCFBActionPerformed (java.awt.event.ActionEvent evt) {
        String t = txta1.getText();
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(this);
        File f = jfc.getSelectedFile();
        byte[] s = new byte[]{(byte) 0xA9, (byte) 0x67, (byte) 0xB3, (byte) 0xE8, (byte) 0x04,
                (byte) 0xFD, (byte) 0xA3, (byte) 0x76, (byte) 0x9A,
                (byte) 0x92, (byte) 0x80, (byte) 0x78, (byte) 0xE4,
                (byte) 0xDD, (byte) 0xD1, (byte) 0x38};
        byte[] buffer = new byte[16];
        byte[] c1 = new byte[14];
        byte[] io = new byte[14];
        int len;
        int count = 0;
        yihuo xo = new yihuo();
        if (operacion == 0) {
            try {
                FileInputStream fis = new FileInputStream(f);
                OutputStream out = null;
                String fcs = write.createFile("D:/", t);
                out = new FileOutputStream(fcs, true);
                while (((len = fis.read(buffer)) != -1)) {
                    c1 = test.Decript(s, txtClave.getText());
                    io = xo.XOR(c1, buffer);
                    out.write(io);
                    out.flush();
                    for(int i=0;i<len;i++) {
                    s[i] = io[i];}
                }
                txta2.append("CFB Ecription Finished!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex + "\nNo File",
                        "Warning!!!", JOptionPane.WARNING_MESSAGE);
            }
        } else if (operacion == 1) {
            try {
                FileInputStream fis = new FileInputStream(f);
                OutputStream out = null;
                String fcs = write.createFile("D:/", t);
                out = new FileOutputStream(fcs, true);
                while (((len = fis.read(buffer)) != -1)) {
                    c1= test.Decript(s, txtClave.getText());
                    io = xo.XOR(c1, buffer);
                    out.write(io);
                    out.flush();
                    for(int i=0;i<len;i++) {
                    s[i] = buffer[i];}
                }
                txta2.append("CFB Ecription Finished!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex + "\nNo File",
                        "Warning!!!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        String t = txta1.getText();
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(this);
        File f = jfc.getSelectedFile();
        byte [] buffer =new byte[16];
        byte [] comm = new byte[]{(byte) 0xA9, (byte) 0x67, (byte) 0xB3, (byte) 0xE8, (byte) 0x04,
                (byte) 0xFD, (byte) 0xA3, (byte) 0x76, (byte) 0x9A,
                (byte) 0x92, (byte) 0x80, (byte) 0x78, (byte) 0xE4,
                (byte) 0xDD, (byte) 0xD1, (byte) 0x38};
        byte [] c0 = new byte[16];
        byte [] c1 = new byte[16];
        int len;
        int count =0;
        yihuo xo = new yihuo();
        if(operacion==0){
                try {
                    FileInputStream fis = new FileInputStream(f);
                    OutputStream out = null ;
                    String fcs= write.createFile("D:/",t);
                    out = new FileOutputStream(fcs,true)  ;
                    while(((len=fis.read(buffer))!=-1)) {
                        c0 = xo.XOR(comm,buffer);
                        c1=test.Decript(c0,txtClave.getText());
                        out.write(test.Decript(c0,txtClave.getText()));
                        for(int i=0;i<len;i++) {
                        comm[i]= c1[i];}} txta2.append("CBC Ecription Finished!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex + "\nNo File",
                            "Warning!!!", JOptionPane.WARNING_MESSAGE);
                }
            }else if(operacion == 1){
            try {
                FileInputStream fis = new FileInputStream(f);
                OutputStream out = null ;
                String fcs= write.createFile("D:/",t);
                out = new FileOutputStream(fcs,true)  ;
                while((len=fis.read(buffer))!=-1) {
                    c0 = buffer;
                        c1 = decrip.Decript(c0,txtClave.getText());
                        out.write(xo.XOR(comm,c1));
                        for(int i=0;i<len;i++){
                        comm[i] = buffer[i];}
                }  txta2.append("CBC Ecription Finished!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex + "\nNo File",
                        "Warning!!!", JOptionPane.WARNING_MESSAGE);
            }}}
    public static byte[] strToByteArray(String str) {
        if (str == null) {
            return null;
        }
        byte[] byteArray = str.getBytes();
        return byteArray;
    }
    public void btnEncripDesencripActionPerformed (java.awt.event.ActionEvent evt) {
        String t = txta1.getText();
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(this);
        File f = jfc.getSelectedFile();
        byte [] buffer =new byte[16];
        byte [] c1 = new byte[16];
        int len;
        int count=0;
       if(operacion==0){
        try {
            FileInputStream fis = new FileInputStream(f);
            OutputStream out = null ;
            String key = txtClave.getText();
            String fcs= write.createFile("D:/",t);
            out = new FileOutputStream(fcs,true)  ;
            while((len=fis.read(buffer))!=-1) {
                c1 = test.Decript(buffer,key);
                    out.write(c1);
                }
            fis.close();
            out.close(); count++;
            txta2.append("Finished!");
                } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + "\nNo File",
                    "Warning!!!", JOptionPane.WARNING_MESSAGE);
        }} else if (operacion==1){
           try {
               FileInputStream fis = new FileInputStream(f);
               OutputStream out = null ;
               String key = txtClave.getText();
               String fcs= write.createFile("D:/",t);
               out = new FileOutputStream(fcs,true)  ;
               while((len=fis.read(buffer))!=-1) {
                   c1 = decrip.Decript(buffer,key);
                       out.write(c1);
                   }
               fis.close();
               out.close();
               txta2.append("Finished!");
           } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, ex + "\nNo File",
                       "Warning!!!", JOptionPane.WARNING_MESSAGE);
       }}
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {
        UIinicial p = new UIinicial();
        p.setVisible(true);
        this.setVisible(false);
    }
    private void txtClaveKeyTyped(java.awt.event.KeyEvent evt) {
        Ripemd_256 ripe = new Ripemd_256();
        byte[] hashCode = ripe.getHashCode(txtClave.getText());
        lblConteo.setText(byteArrayToHexStr(hashCode));
    }
    public static String byteArrayToHexStr(byte[] byteArray) {
        if (byteArray == null){
            return null;
        }
        char[] hexArray = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[byteArray.length * 2];
        for (int j = 0; j < byteArray.length; j++) {
            int v = byteArray[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EncripDesencrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncripDesencrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncripDesencrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncripDesencrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncripDesencrip().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEncripDesencrip;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblConteo;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextArea txta1;
    private javax.swing.JTextArea txta2;
    private javax.swing.JButton btnCFB;
    public int getOperacion() {
        return operacion;
    }
    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }
    
}
