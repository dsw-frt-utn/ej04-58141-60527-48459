package views;

public class PMenu extends javax.swing.JFrame {

    private javax.swing.JButton listarVehiculosButton;
    private javax.swing.JButton agregarVehiculoButton;
    private javax.swing.JLabel tituloLabel;

    public PMenu() {
        initComponents();
        setTitle("Menú Principal");
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        tituloLabel = new javax.swing.JLabel();
        listarVehiculosButton = new javax.swing.JButton();
        agregarVehiculoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        tituloLabel.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 28));
        tituloLabel.setForeground(java.awt.Color.BLACK);
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Menu Principal");

        listarVehiculosButton.setText("Listar Vehiculos");
        listarVehiculosButton.addActionListener(this::listarVehiculosButtonActionPerformed);

        agregarVehiculoButton.setText("Agregar vehiculo");
        agregarVehiculoButton.addActionListener(this::agregarVehiculoButtonActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(listarVehiculosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(agregarVehiculoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addComponent(tituloLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listarVehiculosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarVehiculoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }

    private void listarVehiculosButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ListarVehiculosView view1 = new ListarVehiculosView();
        view1.setVisible(true);
    }

    private void agregarVehiculoButtonActionPerformed(java.awt.event.ActionEvent evt) {
                
         IngresarVehiculoView view2 = new IngresarVehiculoView();
         view2.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new PMenu().setVisible(true));
    }
}
