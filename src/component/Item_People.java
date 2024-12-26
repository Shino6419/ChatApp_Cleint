
package component;

import event.PublicEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import model.Model_User_Account;

public class Item_People extends javax.swing.JPanel {
    
    
    public Model_User_Account getUser() {
        return user;
    }
    private boolean mouseOver;
    private final Model_User_Account user;
    
    public Item_People(Model_User_Account user) {
        this.user = user;
        initComponents();
        lb.setText(user.getUserName());
        activeStatus.setActive(user.isStatus());
        init();
    }

    public void updateStatus() {
        activeStatus.setActive(user.isStatus());
    }
    private void init(){
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(new Color(230, 230, 230));
                mouseOver = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(new Color(242, 242, 242));
                mouseOver = false;
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (mouseOver) {
                    PublicEvent.getInstance().getEventMain().selectUser(user);
                }
            }
            
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new swing.ImageAvatar();
        lb = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        activeStatus = new swing.ActiveStatus();

        imageAvatar1.setBorderSize(0);
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        lb.setBackground(new java.awt.Color(229, 229, 229));
        lb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb.setText("Name");

        lb1.setBackground(new java.awt.Color(229, 229, 229));
        lb1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lb1.setForeground(new java.awt.Color(156, 156, 156));
        lb1.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activeStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ActiveStatus activeStatus;
    private swing.ImageAvatar imageAvatar1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    // End of variables declaration//GEN-END:variables
}
