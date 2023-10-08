package netbanking;
import com.raven.connection.DatabaseConnection;
import com.raven.model.ModelUser;
import com.raven.service.ServiceUser;
import java.awt.Color;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author Admin
 */
public class send_cheque extends javax.swing.JFrame {

    /**
     * Creates new form send_cheque
     */
    private ModelUser currentUser;
    private ServiceUser service;
    private Connection con;
        
    public send_cheque(ModelUser user, Connection con, ServiceUser service) {
        initComponents();
    this.currentUser = user;
        this.con = con;
         this.service = service;
//         BigDecimal Balance = currentUser.getBalance();
        
    }
     public ModelUser getCurrentUser()
    {
        return currentUser;
    }
     public ServiceUser getServiceUser()
     {
         return service;
     }
    
   
   public send_cheque()
   {
       
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cheqbank = new javax.swing.JComboBox<>();
        d1 = new javax.swing.JTextField();
        d2 = new javax.swing.JTextField();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();
        y4 = new javax.swing.JTextField();
        D1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        M1 = new javax.swing.JLabel();
        M2 = new javax.swing.JLabel();
        Y2 = new javax.swing.JLabel();
        Y4 = new javax.swing.JLabel();
        Rupees = new javax.swing.JPanel();
        pay = new javax.swing.JLabel();
        name_payee = new javax.swing.JTextField();
        bearer = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        amt_word1 = new javax.swing.JTextField();
        amt_word2 = new javax.swing.JTextField();
        payoff = new javax.swing.JLabel();
        amt_no = new javax.swing.JTextField();
        AC_NO = new javax.swing.JLabel();
        acc_no = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Y3 = new javax.swing.JLabel();
        Y1 = new javax.swing.JLabel();
        BACK = new javax.swing.JButton();
        SUBMIT1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 144, 191));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        cheqbank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BANK", "Axis Bank", "Bank of Baroda", "HDFC Bank", "ICICI Bank", "Kotak Bank", "Punjab National Bank", "State Bank of India", "Union Bank of India", " " }));

        d1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                d1KeyPressed(evt);
            }
        });

        d2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                d2KeyPressed(evt);
            }
        });

        m1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                m1KeyPressed(evt);
            }
        });

        m2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                m2KeyPressed(evt);
            }
        });

        y1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                y1KeyPressed(evt);
            }
        });

        y2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                y2KeyPressed(evt);
            }
        });

        y3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                y3KeyPressed(evt);
            }
        });

        y4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                y4KeyPressed(evt);
            }
        });

        D1.setText(" D");

        D2.setText("D");

        M1.setText(" M");

        M2.setText(" M");

        Y2.setText("Y");

        Y4.setText("Y");

        Rupees.setBackground(new java.awt.Color(102, 255, 255));

        pay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pay.setText("Pay");

        name_payee.setForeground(new java.awt.Color(204, 204, 204));
        name_payee.setText("Account Number of payee");
        name_payee.setToolTipText("");
        name_payee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_payeeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                name_payeeFocusLost(evt);
            }
        });
        name_payee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name_payeeKeyPressed(evt);
            }
        });

        bearer.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bearer.setText("Bearer");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Rupees");

        amt_word1.setForeground(new java.awt.Color(204, 204, 204));
        amt_word1.setText("Amount in rupees");
        amt_word1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amt_word1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                amt_word1FocusLost(evt);
            }
        });
        amt_word1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amt_word1KeyPressed(evt);
            }
        });

        payoff.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        payoff.setText("Pay off");

        amt_no.setForeground(new java.awt.Color(204, 204, 204));
        amt_no.setText("Amount in Numbers");
        amt_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amt_noFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                amt_noFocusLost(evt);
            }
        });
        amt_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amt_noKeyPressed(evt);
            }
        });

        AC_NO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        AC_NO.setText("A/C. No.");

        acc_no.setForeground(new java.awt.Color(204, 204, 204));
        acc_no.setText("Account Number of Reciever");
        acc_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                acc_noFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                acc_noFocusLost(evt);
            }
        });
        acc_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acc_noKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout RupeesLayout = new javax.swing.GroupLayout(Rupees);
        Rupees.setLayout(RupeesLayout);
        RupeesLayout.setHorizontalGroup(
            RupeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RupeesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(RupeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RupeesLayout.createSequentialGroup()
                        .addGroup(RupeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RupeesLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(amt_word1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RupeesLayout.createSequentialGroup()
                                .addComponent(amt_word2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(payoff, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amt_no, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(RupeesLayout.createSequentialGroup()
                        .addGroup(RupeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RupeesLayout.createSequentialGroup()
                                .addComponent(AC_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RupeesLayout.createSequentialGroup()
                                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name_payee, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bearer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        RupeesLayout.setVerticalGroup(
            RupeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RupeesLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(RupeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pay)
                    .addComponent(name_payee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bearer))
                .addGap(18, 18, 18)
                .addGroup(RupeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(amt_word1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RupeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amt_word2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payoff)
                    .addComponent(amt_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RupeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AC_NO)
                    .addComponent(acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("DIGITAL SIGNATURE");

        Y3.setText("Y");

        Y1.setText(" Y");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cheqbank, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(D2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Y2)
                        .addGap(22, 22, 22)
                        .addComponent(Y3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Y4)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addComponent(Rupees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheqbank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Y4)
                    .addComponent(Y3)
                    .addComponent(Y2)
                    .addComponent(Y1)
                    .addComponent(M2)
                    .addComponent(M1)
                    .addComponent(D2)
                    .addComponent(D1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(Rupees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        BACK.setBackground(new java.awt.Color(167, 216, 255));
        BACK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BACK.setText("BACK");
        BACK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 73, 146), 3));
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        jPanel1.add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 110, 40));

        SUBMIT1.setBackground(new java.awt.Color(167, 216, 255));
        SUBMIT1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SUBMIT1.setText("SUBMIT");
        SUBMIT1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 73, 146), 3));
        SUBMIT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMIT1ActionPerformed(evt);
            }
        });
        jPanel1.add(SUBMIT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 110, 40));

        jButton1.setBackground(new java.awt.Color(167, 216, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton1.setText("RESET");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(31, 73, 146), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void name_payeeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_payeeFocusLost
        // TODO add your handling code here:
        if(name_payee.getText().equals("")){
            name_payee.setText("Account Number of payee");
            name_payee.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_name_payeeFocusLost
    }
    private void name_payeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_payeeFocusGained
        // TODO add your handling code here:
        if(name_payee.getText().equals("Account Number of payee")){
            name_payee.setText("");
            name_payee.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_name_payeeFocusGained

    private void amt_word1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amt_word1FocusLost
        // TODO add your handling code here:
        if(amt_word1.getText().equals("")){
            amt_word1.setText("Amount in rupees");
            amt_word1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_amt_word1FocusLost

    private void amt_word1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amt_word1FocusGained
        // TODO add your handling code here:
        if(amt_word1.getText().equals("Amount in rupees")){
            amt_word1.setText("");
            amt_word1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_amt_word1FocusGained

    private void amt_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amt_noFocusLost
        // TODO add your handling code here:
        if(amt_no.getText().equals("")){
            amt_no.setText("Amount in Numbers");
            amt_no.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_amt_noFocusLost

    private void amt_noFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amt_noFocusGained
        // TODO add your handling code here:
        if(amt_no.getText().equals("Amount in Numbers")){
            amt_no.setText("");
            amt_no.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_amt_noFocusGained

    private void acc_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_acc_noFocusLost
        // TODO add your handling code here:
        if(acc_no.getText().equals("")){
            acc_no.setText("Account Number of Reciever");
            acc_no.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_acc_noFocusLost

    private void acc_noFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_acc_noFocusGained
        // TODO add your handling code here:
        if(acc_no.getText().equals("Account Number of Reciever")){
            acc_no.setText("");
            acc_no.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_acc_noFocusGained

    private void SUBMIT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMIT1ActionPerformed
        if(name_payee.getText().length()<=0 || amt_word1.getText().length()<=0 || amt_no.getText().length()<=0 || acc_no.getText().length()<=0 || d1.getText().length()<=0 || d2.getText().length()<=0 || m1.getText().length()<=0 || m2.getText().length()<=0 || y1.getText().length()<=0 || y2.getText().length()<=0 || y3.getText().length()<=0 || y4.getText().length()<=0){
            JOptionPane.showMessageDialog(null, "Enter all information");
        }
        else{
        
        String sender = name_payee.getText();
        long receiverAccountNumber = Long.parseLong(acc_no.getText());
        double amount = Double.parseDouble(amt_no.getText());

try {
    // Get the current user and initialize the senderUser object
    ModelUser user = getCurrentUser();
    ModelUser senderUser = new ModelUser();
    senderUser.setAccountNumber((int) Long.parseLong(sender));

    // Get the sender's details from the database
    ServiceUser serviceUser = new ServiceUser();
    ModelUser senderName = serviceUser.getUserByAccountNumber(senderUser.getAccountNumber());

    // Call the sendCheck method to perform the transaction
    serviceUser.sendCheck(senderName, receiverAccountNumber, amount);

    // Display a success message to the user
    JOptionPane.showMessageDialog(null, "Transaction successful", "Success", JOptionPane.INFORMATION_MESSAGE);
} catch (SQLException ex) {
    // Display an error message to the user if there was an issue with the transaction
    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
        }
    }//GEN-LAST:event_SUBMIT1ActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        Menu1 ch=new Menu1(currentUser,con,service);
        ch.setVisible(true);
        this.toBack();
        dispose();
    }//GEN-LAST:event_BACKActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        name_payee.setText(null);
        amt_word1.setText(null);
        amt_word2.setText(null);
        amt_no.setText(null);
        acc_no.setText(null);
        d1.setText(null);
        d2.setText(null);
        m1.setText(null);
        m2.setText(null);
        y1.setText(null);
        y2.setText(null);
        y3.setText(null);
        y4.setText(null);
        cheqbank.setSelectedIndex(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void name_payeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_payeeKeyPressed
        // no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            name_payee.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            name_payee.setEditable(true);
        }
    }//GEN-LAST:event_name_payeeKeyPressed

    private void amt_word1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amt_word1KeyPressed
        // no number or special characters can be entered
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
        amt_word1.setEditable(false);
        JOptionPane.showMessageDialog(null, "Only alphabets and spaces are allowed.");
        amt_word1.setEditable(true);
        }
    }//GEN-LAST:event_amt_word1KeyPressed

    private void amt_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amt_noKeyPressed
        // no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            amt_no.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            amt_no.setEditable(true);
        }
    }//GEN-LAST:event_amt_noKeyPressed

    private void acc_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acc_noKeyPressed
        // no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            acc_no.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            acc_no.setEditable(true);
        }
    }//GEN-LAST:event_acc_noKeyPressed

    private void d1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d1KeyPressed
        // no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            d1.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            d1.setEditable(true);
        }
    }//GEN-LAST:event_d1KeyPressed

    private void d2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d2KeyPressed
        // no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            d2.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            d2.setEditable(true);
        }
    }//GEN-LAST:event_d2KeyPressed

    private void m1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m1KeyPressed
        // no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            m1.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            m1.setEditable(true);
        }
    }//GEN-LAST:event_m1KeyPressed

    private void m2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m2KeyPressed
// no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            m2.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            m2.setEditable(true);
        }    }//GEN-LAST:event_m2KeyPressed

    private void y1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y1KeyPressed
// no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            y1.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            y1.setEditable(true);
        }    }//GEN-LAST:event_y1KeyPressed

    private void y2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y2KeyPressed
// no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            y2.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            y2.setEditable(true);
        }    }//GEN-LAST:event_y2KeyPressed

    private void y3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y3KeyPressed
// no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            y3.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            y3.setEditable(true);
        }    }//GEN-LAST:event_y3KeyPressed

    private void y4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_y4KeyPressed
// no string or special characters can be entered
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && !Character.isWhitespace(c) && !Character.isISOControl(c)) {
            y4.setEditable(false);
            JOptionPane.showMessageDialog(null, "Alphabets and Special characters are not allowed.");
            y4.setEditable(true);
        }    }//GEN-LAST:event_y4KeyPressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException {
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
            java.util.logging.Logger.getLogger(send_cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(send_cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(send_cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(send_cheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 try {
            DatabaseConnection.getInstance().connectToDatabase();
            System.out.println("Connection Succesfully to main page");
        } catch (SQLException e) {
 
            e.printStackTrace();
            System.out.println("Connection not Succesfully to main page");
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ServiceUser service = new ServiceUser();
                new send_cheque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AC_NO;
    private javax.swing.JButton BACK;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel M1;
    private javax.swing.JLabel M2;
    private javax.swing.JPanel Rupees;
    private javax.swing.JButton SUBMIT1;
    private javax.swing.JLabel Y1;
    private javax.swing.JLabel Y2;
    private javax.swing.JLabel Y3;
    private javax.swing.JLabel Y4;
    private javax.swing.JTextField acc_no;
    private javax.swing.JTextField amt_no;
    private javax.swing.JTextField amt_word1;
    private javax.swing.JTextField amt_word2;
    private javax.swing.JLabel bearer;
    private javax.swing.JComboBox<String> cheqbank;
    private javax.swing.JTextField d1;
    private javax.swing.JTextField d2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField name_payee;
    private javax.swing.JLabel pay;
    private javax.swing.JLabel payoff;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    private javax.swing.JTextField y4;
    // End of variables declaration//GEN-END:variables
}