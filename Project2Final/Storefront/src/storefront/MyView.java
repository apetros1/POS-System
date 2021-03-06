package storefront;

import java.awt.event.ActionListener;

public class MyView extends javax.swing.JFrame {

    /**
     * Creates new form MyView
     */
    public MyView() {
        initComponents();
        cart_list.setModel(dlm);
    }
    public void addItemListener(ActionListener listener){
        this.banana_button.addActionListener(listener);
        this.apple_button.addActionListener(listener);
        this.grapes_button.addActionListener(listener);
        this.grapefruit_button.addActionListener(listener);
        this.orange_button.addActionListener(listener);
        this.celery_button.addActionListener(listener);
        this.spinach_button.addActionListener(listener);
        this.kale_button.addActionListener(listener);
        this.carrots_button.addActionListener(listener);
        this.broccoli_button.addActionListener(listener);
        this.chicken_button.addActionListener(listener);
        this.beef_button.addActionListener(listener);
        this.pork_button.addActionListener(listener);
        this.turkey_button.addActionListener(listener);
        this.fish_button.addActionListener(listener);
    }
    public void addCardListener(ActionListener listener){
        this.card_button.addActionListener(listener);
    }
    public void addCashListener(ActionListener listener){
        this.cash_button.addActionListener(listener);
    }
    public void addSuspendListener(ActionListener listener){
        this.suspend_button.addActionListener(listener);
    }
    public void addCloseListener(ActionListener listener){
        this.close_button.addActionListener(listener);
    }
    public void addDeleteListener(ActionListener listener){
        this.delete_button.addActionListener(listener);
    }
    public javax.swing.JList getCart() {
        return this.cart_list;
    }
    public javax.swing.JTextField getSubtotal() {
        return txtSubtotal;
    }
    public javax.swing.JTextField getTax() {
        return txtTax;
    }
    public javax.swing.JTextField getTotal() {
        return txtTotal;
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
        banana_button = new javax.swing.JButton();
        apple_button = new javax.swing.JButton();
        grapes_button = new javax.swing.JButton();
        grapefruit_button = new javax.swing.JButton();
        kale_button = new javax.swing.JButton();
        orange_button = new javax.swing.JButton();
        spinach_button = new javax.swing.JButton();
        celery_button = new javax.swing.JButton();
        carrots_button = new javax.swing.JButton();
        broccoli_button = new javax.swing.JButton();
        chicken_button = new javax.swing.JButton();
        beef_button = new javax.swing.JButton();
        pork_button = new javax.swing.JButton();
        turkey_button = new javax.swing.JButton();
        fish_button = new javax.swing.JButton();
        labelFruits = new javax.swing.JLabel();
        labelVeggies = new javax.swing.JLabel();
        labelMeats = new javax.swing.JLabel();
        labelItems = new javax.swing.JLabel();
        card_button = new javax.swing.JButton();
        cash_button = new javax.swing.JButton();
        suspend_button = new javax.swing.JButton();
        labelSubtotal = new javax.swing.JLabel();
        labelTax = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtTax = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        labelCart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cart_list = new javax.swing.JList<>();
        delete_button = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        close_button = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Storefront - Project 2");

        banana_button.setText("Banana");

        apple_button.setText("Apple");

        grapes_button.setText("Grapes");

        grapefruit_button.setText("Grapefruit");

        kale_button.setText("Kale");

        orange_button.setText("Orange");

        spinach_button.setText("Spinach");

        celery_button.setText("Celery");

        carrots_button.setText("Carrots");

        broccoli_button.setText("Broccoli");

        chicken_button.setText("Chicken");

        beef_button.setText("Beef");

        pork_button.setText("Pork");

        turkey_button.setText("Turkey");

        fish_button.setText("Fish");

        labelFruits.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelFruits.setText("Fruits");

        labelVeggies.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelVeggies.setText("Vegetables");

        labelMeats.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelMeats.setText("Meats");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(labelFruits)
                        .addGap(47, 47, 47)
                        .addComponent(labelVeggies)
                        .addGap(45, 45, 45)
                        .addComponent(labelMeats))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orange_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apple_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grapes_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grapefruit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(banana_button, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(carrots_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinach_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kale_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(celery_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(broccoli_button, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chicken_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beef_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pork_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(turkey_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fish_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMeats, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelFruits)
                                .addComponent(labelVeggies)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(banana_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apple_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grapes_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(grapefruit_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orange_button))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(celery_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinach_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kale_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(carrots_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(broccoli_button))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(chicken_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(beef_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pork_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(turkey_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fish_button)))))
                .addContainerGap())
        );

        labelItems.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelItems.setText("ITEM LIST");

        card_button.setText("Card");

        cash_button.setText("Cash");

        suspend_button.setText("Suspend");

        labelSubtotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelSubtotal.setText("Subtotal:");

        labelTax.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTax.setText("Tax:");

        labelTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTotal.setText("Total:");

        txtSubtotal.setEditable(false);
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtSubtotal.setText("$0.00");

        txtTax.setEditable(false);
        txtTax.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtTax.setText("$0.00");

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtTotal.setText("$0.00");

        labelCart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCart.setText("CART");

        cart_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(cart_list);

        delete_button.setText("Delete");

        jMenuBar1.setToolTipText("");

        mnuFile.setText("File");

        close_button.setText("Close");
        mnuFile.add(close_button);

        jMenuBar1.add(mnuFile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(labelCart))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(card_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cash_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(suspend_button, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(delete_button)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelSubtotal))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelTax, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelTotal, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTax, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(txtTotal)
                                    .addComponent(txtSubtotal))
                                .addGap(18, 18, 18)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(labelItems)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelItems)
                    .addComponent(labelCart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSubtotal)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete_button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTax)
                            .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTotal)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card_button)
                    .addComponent(cash_button)
                    .addComponent(suspend_button))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apple_button;
    private javax.swing.JButton banana_button;
    private javax.swing.JButton beef_button;
    private javax.swing.JButton broccoli_button;
    private javax.swing.JButton card_button;
    private javax.swing.JButton carrots_button;
    private javax.swing.JList<String> cart_list;
    private javax.swing.JButton cash_button;
    private javax.swing.JButton celery_button;
    private javax.swing.JButton chicken_button;
    private javax.swing.JMenuItem close_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JButton fish_button;
    private javax.swing.JButton grapefruit_button;
    private javax.swing.JButton grapes_button;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kale_button;
    private javax.swing.JLabel labelCart;
    private javax.swing.JLabel labelFruits;
    private javax.swing.JLabel labelItems;
    private javax.swing.JLabel labelMeats;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTax;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelVeggies;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JButton orange_button;
    private javax.swing.JButton pork_button;
    private javax.swing.JButton spinach_button;
    private javax.swing.JButton suspend_button;
    private javax.swing.JButton turkey_button;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    
    javax.swing.DefaultListModel dlm = new javax.swing.DefaultListModel();
}
