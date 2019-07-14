package projet;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.TableModel;


public class NewJFrame extends JFrame implements ActionListener {

    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Menu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Votre guide");
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/asus/Documents/NetBeansProjects/projet/src/projet/icons8_Globe_20px.png")
        );

        jPanel4.setEnabled(false);
        jPanel4.setVisible(false);

        jButton2.setText("Retourner");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("All");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Bus");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Train");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Boat");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Plane");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/icons8_Bus_20px_1.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/icons8_Train_20px.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/icons8_Sail_Boat_20px.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/icons8_Airplane_Mode_On_20px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)))
                    .addComponent(jLabel9)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5))
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Heure Départ", "Heure Arrivé", "Prix", "Type de transport"
            }
        ));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1010, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 149, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 71, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(233, 240, 233));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/Webp.net-resizeimage.jpg"))); // NOI18N
        jLabel1.setText("dd");

        jLabel2.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel2.setText("Sélectionnez votre destination");

        jLabel3.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel3.setText("bienvenue A VOTR GUIDE");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/icons8_Customer_15px.png"))); // NOI18N

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/icons8_Lock_15px.png"))); // NOI18N

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Admin Login");

        jPanel3.setBackground(new java.awt.Color(30, 49, 92));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sélectionner lieu", "sousse", "nabeul", "tunis", "monastir", "gabes", "kef", "djerba", "bizert", "zaghouan", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sélectionner lieu", "sousse", "nabeul", "tunis", "monastir", "gabes", "kef", "djerba", "bizert", "zaghouan", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(106, 117, 146));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(106, 117, 146));
        jLabel4.setText("Départ :");

        jLabel5.setBackground(new java.awt.Color(170, 172, 177));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(106, 117, 146));
        jLabel5.setText("Arrivé :");

        jButton1.setBackground(new java.awt.Color(213, 217, 223));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/icons8_Airplane_Take_Off_15px.png"))); // NOI18N
        jButton1.setText("Continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(38, 66, 119));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(110, 110, 110)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Menu.getAccessibleContext().setAccessibleName("");
        Menu.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
s1=(String) jComboBox1.getSelectedItem();

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
s2=(String) jComboBox2.getSelectedItem();
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   if (jComboBox1.getSelectedIndex()==0 ||jComboBox2.getSelectedIndex()==0 ||jComboBox2.getSelectedIndex()==jComboBox1.getSelectedIndex() )
            JOptionPane.showMessageDialog(Menu, "SVP séléctionner un voyage","Attention",JOptionPane.INFORMATION_MESSAGE);
          else
   {jPanel2.setVisible(false);
   jPanel4.setVisible(true);
      String maRequete = "SELECT DISTINCT * FROM voyage WHERE depart = '"+s1+"' AND arrive = '"+s2+"';";
      select(maRequete);
   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      jPanel2.setVisible(true);
   jPanel4.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
String maRequete = "SELECT DISTINCT * FROM voyage WHERE depart = '"+s1+"' AND arrive = '"+s2+"' AND type ='"+jRadioButton4.getText()+"';";
      select(maRequete);    // TODO add your handling code here:
             // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
     String maRequete = "SELECT DISTINCT * FROM voyage WHERE depart = '"+s1+"' AND arrive = '"+s2+"' AND type ='"+jRadioButton5.getText()+"';";
      select(maRequete);    // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed


void nn(){
this.setContentPane(Menu);}
    
    private void administration(){
    
JButton ajout,modif,supp;
    jPanel4.removeAll();
jPanel4.setBackground(new java.awt.Color(121, 140, 170));
jPanel4.setLayout(null);
Menu.setVisible(false);
jPanel4.setVisible(false);
                        
JLabel img=new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage("C:\\Users\\asus\\Documents\\NetBeansProjects\\projet\\src\\projet\\Webp.net-resizeimage1.jpg")));
this.setContentPane(img);
this.setLayout(null);
this.setLocationRelativeTo(null);
 this.add(ajout=new JButton ("Ajouter une voyage"));
ajout.setBounds(450,120,200 ,30);
this.add(modif=new JButton ("Modifier une voyage"));
modif.setBounds(450,180,200 ,30);
this.add(supp=new JButton ("Supprimer une voyage"));
supp.setBounds(450,240,200 ,30);

ajout.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
Menu.setVisible(true);
nn();
            jPanel4.setVisible(true);
            JButton a,b;
            JTextField a1,a2,a3,a4,a5,a6;
            JLabel l1;
            Menu.setLayout(null);
Menu.add(a=new JButton ("Ajouter"));
a.setBounds(350,300,200 ,30);
Menu.add(b=new JButton ("Nouveau Voyage"));
b.setBounds(560,300,200 ,30);

Menu.add(l1=new JLabel("Heure départ"));
l1.setBounds(100,40,100,30);
 Menu .add(a1=new JTextField(10));
 a1.setBounds(200,40,100,30);
Menu.add(l1=new JLabel("Heure D'arriveé"));
l1.setBounds(320,40,100,30);
 Menu .add(a2=new JTextField(10));
 a2.setBounds(450,40,100,30);
Menu.add(l1=new JLabel("Prix"));
l1.setBounds(570,40,30,30);
 Menu .add(a3=new JTextField(10));
 a3.setBounds(690,40,100,30);
Menu.add(l1=new JLabel("Type transport"));
l1.setBounds(810,40,100,30);
 Menu .add(a4=new JTextField(10));
 a4.setBounds(930,40,100,30);
Menu.add(l1=new JLabel("Ville départ"));
l1.setBounds(270,140,100,30);
 Menu .add(a5=new JTextField(10));
 a5.setBounds(350,140,100,30);
Menu.add(l1=new JLabel("Ville D'arrive"));
l1.setBounds(460,140,200,30);
 Menu .add(a6=new JTextField(10));
 a6.setBounds(550,140,100,30);
 
 b.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                a1.setText("");
                a2.setText("");
                a3.setText("");
                a4.setText("");
                a5.setText("");
                a6.setText("");
                }});
 a.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/projet", "root", "root");
	String g="insert into voyage values ('"+a1.getText()  +  "','"+a2.getText()+"' ,'"+a3.getText()+"','"+a4.getText()+"','"+a5.getText()+"','"+a6.getText()+"');";
	Statement s= cnx.createStatement();
	
	int x=s.executeUpdate(g);
	if(x == 1)
		System.out.println("Insertion effectuée avec succès.");
		else
		System.out.println("Pas d'insertion.");
		} catch (ClassNotFoundException | SQLException e) {
                    // TODO Auto-generated catch block

		}
                    // TODO Auto-generated catch block
                    

                    
                }
            });    
        
        }
    });

modif.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
      Menu.setVisible(true);
nn();
            jPanel4.setVisible(true);
              JButton a;
     Menu.setLayout(new BoxLayout(Menu,BoxLayout.Y_AXIS));

               JScrollPane jScrollPane2;
                jScrollPane2 = new javax.swing.JScrollPane();
               JTable jTable3 = new javax.swing.JTable();
                      jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null}
            },
            new String [] {
                "Heure Départ", "Heure Arrivé", "Prix", "Type de transport","Depart","Arrive"
            }
        ));
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable3);
		String maRequete = "SELECT DISTINCT * FROM voyage";
    try{
     Class.forName("com.mysql.jdbc.Driver");
       
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root", "root");
            Statement Statement = cnx.createStatement();
             ResultSet rs = Statement.executeQuery(maRequete);
                int i=0,j;
                if(!rs.next())
                    cleartable(jTable3);
                else{
				while(rs.next()){
                        
                                    for(j=0;j<6;j++)
                                    jTable3.setValueAt(rs.getString(j+1), i, j);
                                 i++;        
                                }
                                rs.close();
                                Statement.close();}
 } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }      
   
                Menu.add(jScrollPane2);

jTable3.addMouseListener(new MouseAdapter(){
    @Override
    public void mouseClicked(MouseEvent evnt) { 
         row = jTable3 .getSelectedRow();
        TableModel model=jTable3.getModel();
        System.out.println(row);
     /*                               for(int j=5;j>=0;j--)
                       s9=" "+jTable3.getValueAt(row, j).toString()+s9;*/
        s9="Heure départ: "+jTable3.getValueAt(row, 0).toString()+" Heure arrivé : "+jTable3.getValueAt(row, 1).toString()+" prix: "+jTable3.getValueAt(row, 2).toString()+" type : "+jTable3.getValueAt(row, 3).toString()+" ville départ : "+jTable3.getValueAt(row, 5).toString()+" ville ariveé : "+jTable3.getValueAt(row, 4).toString();
    }
});
               Menu.add(a=new JButton("Next"));
        a.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(row==-1)
                       JOptionPane.showMessageDialog(Menu, "SVP séléctionner un lieu","Attention",JOptionPane.INFORMATION_MESSAGE);
                else{
                    
 Menu.removeAll();
 Menu.setVisible(false);
                JButton a,b;
            JTextField a1,a2,a3,a4,a5,a6;
            JLabel l1;
            Menu.setLayout(null);
Menu.add(a=new JButton ("Modifier"));
a.setBounds(350,300,200 ,30);
Menu.add(b=new JButton ("Back"));
b.setBounds(560,300,200 ,30);

Menu.add(l=new JLabel(s9));
l.setBounds(190, 180, 790,100);
Menu.add(l1=new JLabel("Heure départ"));
l1.setBounds(100,40,100,30);
 Menu .add(a1=new JTextField(10));
 a1.setBounds(200,40,100,30);
Menu.add(l1=new JLabel("Heure D'arriveé"));
l1.setBounds(320,40,100,30);
 Menu .add(a2=new JTextField(10));
 a2.setBounds(450,40,100,30);
Menu.add(l1=new JLabel("Prix"));
l1.setBounds(555,40,30,30);
 Menu .add(a3=new JTextField(10));
 a3.setBounds(590,40,100,30);
Menu.add(l1=new JLabel("Type transport"));
l1.setBounds(710,40,100,30);
 Menu .add(a4=new JTextField(10));
 a4.setBounds(830,40,100,30);
Menu.add(l1=new JLabel("Ville départ"));
l1.setBounds(270,140,100,30);
 Menu .add(a5=new JTextField(10));
 a5.setBounds(350,140,100,30);
Menu.add(l1=new JLabel("Ville D'aorrive"));
l1.setBounds(460,140,200,30);
 Menu .add(a6=new JTextField(10));
 a6.setBounds(550,140,100,30);
 Menu.setVisible(true);
 a.addActionListener(new ActionListener (){
     @Override
     public void actionPerformed(ActionEvent ae) {
 s="UPDATE voyage SET heured='"+a1.getText()+"'  , heurea='"+a2.getText()+"' , prix ='"+a3.getText()+"' , type ='"+a4.getText()+"' ,depart='"+a5.getText()+"', arrive='"+a6.getText()+"'     WHERE heured ='"+jTable3.getValueAt(row, 0).toString()+"' AND heurea = '"+jTable3.getValueAt(row, 1).toString()+"' AND type = '"+jTable3.getValueAt(row, 3).toString()+"' ;";
    try{
     Class.forName("com.mysql.jdbc.Driver");
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root", "root");
            Statement Statement = cnx.createStatement();
             int nb = Statement.executeUpdate(s);
        Statement.close();
    } catch (   ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                
    }
     
     
     }
 });
            
            
            } }
        });
        }
    });


supp.addActionListener(new ActionListener(){
          @Override
        public void actionPerformed(ActionEvent ae) {
       Menu.setVisible(true);
nn();
            jPanel4.setVisible(true);
             JButton a;
            Menu.setLayout(new BoxLayout(Menu,BoxLayout.Y_AXIS));

               JScrollPane jScrollPane2;
                jScrollPane2 = new javax.swing.JScrollPane();
               JTable jTable3 = new javax.swing.JTable();
                      jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null}
            },
            new String [] {
                "Heure Départ", "Heure Arrivé", "Prix", "Type de transport","Depart","Arrive"
            }
        ));
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable3);
		String maRequete = "SELECT DISTINCT * FROM voyage";
    try{
     Class.forName("com.mysql.jdbc.Driver");
       
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root", "root");
            Statement Statement = cnx.createStatement();
             ResultSet rs = Statement.executeQuery(maRequete);
                int i=0,j;
                if(!rs.next())
                    cleartable(jTable3);
                else{
				while(rs.next()){
                        
                                    for(j=0;j<6;j++)
                                    jTable3.setValueAt(rs.getString(j+1), i, j);
                                 i++;        
                                }
                                rs.close();
                                Statement.close();}
 } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }      
   
                Menu.add(jScrollPane2);

jTable3.addMouseListener(new MouseAdapter(){
    @Override
    public void mouseClicked(MouseEvent evnt) { 
        int  row = jTable3 .getSelectedRow();
        TableModel model=jTable3.getModel();
        
        s="DELETE FROM voyage WHERE heured ='"+jTable3.getValueAt(row, 0).toString()+"' AND heurea = '"+jTable3.getValueAt(row, 1).toString()+"' AND type = '"+jTable3.getValueAt(row, 3).toString()+"' ;";
    }
});
               Menu.add(a=new JButton("Supprimer"));
    a.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
            if(row==-1)
                       JOptionPane.showMessageDialog(Menu, "SVP séléctionner un voyage","Attention",JOptionPane.INFORMATION_MESSAGE);
            else {
    try{
     Class.forName("com.mysql.jdbc.Driver");
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root", "root");
            Statement Statement = cnx.createStatement();
             int nb = Statement.executeUpdate(s);
        
                                Statement.close();
    } catch (   ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }}
        });
        }
    });
           


}
        
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
        
        if ("root".equals(jPasswordField1.getText())&&"root".equals(jTextField1.getText())) {
       jPanel2.setVisible(false);
   jPanel4.setVisible(true);
       administration();
        } else { 
            JOptionPane.showMessageDialog(Menu, "Utilisateur ou le mot de passe est incorrect ","ERREUR",JOptionPane.ERROR_MESSAGE);
            
        } 
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void cleartable(JTable table){
        int j,i;
    for(i=0;i<table.getRowCount();i++)
    for( j=0;j<4;j++)
        table.setValueAt("", i, j);
        }
    
    private void select(String req){
    
          try {     Class.forName("com.mysql.jdbc.Driver");
       
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root", "root");
            Statement Statement = cnx.createStatement();
             ResultSet rs = Statement.executeQuery(req);
                int i=0,j;
                   cleartable(jTable2);
               		while(rs.next()){
                        
                                    for(j=0;j<4;j++)
                                    jTable2.setValueAt(rs.getString(j+1), i, j);
                                 i++;        
                                }
                                rs.close();
                                Statement.close();
                        
 } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    String maRequete = "SELECT DISTINCT * FROM voyage WHERE UPPER( depart) = UPPER('"+s1+"') AND UPPER(arrive )=UPPER( '"+s2+"');";
      select(maRequete);    // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    String maRequete = "SELECT DISTINCT * FROM voyage WHERE depart = '"+s1+"' AND arrive = '"+s2+"' AND type ='"+jRadioButton2.getText()+"';";
      select(maRequete);    // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
    String maRequete = "SELECT DISTINCT * FROM voyage WHERE depart = '"+s1+"' AND arrive = '"+s2+"' AND type ='"+jRadioButton3.getText()+"';";
      select(maRequete);    // TODO add your handling code here:
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
   String s,s1,s2;
    int row=-1;
    JLabel img,l;
         String s9=null;
   
   @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
