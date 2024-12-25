
package form;

import net.miginfocom.swing.MigLayout;


public class Home extends javax.swing.JLayeredPane {


    public Home() {
        initComponents();
        init();
    }
    
    private void init(){
        setLayout(new MigLayout(" fillx, filly","0[180!]5[fill, 100%]10[150!]0","0[fill]0"));
        this.add(new Menu_Left());
        this.add(new Chat());
        this.add(new Menu_Right());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
