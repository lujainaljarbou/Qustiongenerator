
package GUIFrames;


import java.awt.Color;
import java.io.*;
import javax.swing.*;




public class Home extends javax.swing.JFrame {

    DefaultComboBoxModel Box_model1 = new DefaultComboBoxModel();

   
    public Home() {
        initComponents();
         getContentPane().setBackground(new java.awt.Color(238, 238, 238));
         jPanel2.setBackground(new Color (255,255,255,100));
         
         ImageIcon img = new ImageIcon("src/pic/6d4ba145bda7edfa730a5bfa13ccda30.jpg");
        jLabel1.setIcon(img);
        PrevoiusCourses.setModel(Box_model1);
        
        InsertFilesNames();
        }

    private void InsertFilesNames() {

        File cur = new File(".");
        String[] fList = cur.list();

       
        for(int i=0;i<fList.length;i++){
         

            if (fList[i].endsWith(".ser")) {
                Box_model1.addElement(fList[i].substring(0, fList[i].indexOf(".")));}}}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PrevoiusCourses = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        NewCourse = new javax.swing.JTextField();
        OQBButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exam Manager");
        setBackground(new java.awt.Color(0, 153, 153));
        setBounds(new java.awt.Rectangle(200, 100, 345, 560));
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(350, 340));
        setPreferredSize(new java.awt.Dimension(340, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(360, 440));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("open"));
        jPanel2.setMinimumSize(new java.awt.Dimension(150, 210));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("New Course");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 30));

        PrevoiusCourses.setBackground(new java.awt.Color(244, 244, 244));
        PrevoiusCourses.setForeground(new java.awt.Color(0, 102, 204));
        PrevoiusCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevoiusCoursesActionPerformed(evt);
            }
        });
        jPanel2.add(PrevoiusCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Prevois Courses");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        NewCourse.setBackground(new java.awt.Color(244, 244, 244));
        NewCourse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        NewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCourseActionPerformed(evt);
            }
        });
        jPanel2.add(NewCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 30));

        OQBButton.setBackground(new java.awt.Color(255, 255, 255));
        OQBButton.setForeground(new java.awt.Color(204, 204, 204));
        OQBButton.setText("Open Questions Bank");
        OQBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OQBButtonActionPerformed(evt);
            }
        });
        jPanel2.add(OQBButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 250, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/lujenaziz/Downloads/6d4ba145bda7edfa730a5bfa13ccda30.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCourseActionPerformed
       
    }//GEN-LAST:event_NewCourseActionPerformed

    private void OQBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OQBButtonActionPerformed
       String x = PrevoiusCourses.getSelectedItem().toString();
        String C = "";
if (NewCourse.getText().equals("") && x .equals("")){
    JOptionPane.showMessageDialog(null, "يجب ان تضع اسم للملف او ان تختار ملف سابق", "ِخطأ", JOptionPane.WARNING_MESSAGE);
    return;
}
else {
    
        if (!NewCourse.getText().trim().equals("")) {
            C = NewCourse.getText();}
        
         else if (!(x.equals(""))) {
                C = "" + PrevoiusCourses.getSelectedItem();} }
         
        

this.dispose();
        QuestionBankViewer.main(new String[]{C});

    }//GEN-LAST:event_OQBButtonActionPerformed

    private void PrevoiusCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevoiusCoursesActionPerformed
       
    }//GEN-LAST:event_PrevoiusCoursesActionPerformed

   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NewCourse;
    private javax.swing.JButton OQBButton;
    private javax.swing.JComboBox PrevoiusCourses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
