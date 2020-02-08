
package GUIFrames;

import Classes.*;

import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.*;

public class QuestionBankViewer extends javax.swing.JFrame {
    
    ButtonGroup B_G = new ButtonGroup();
    ExamManager E_Manager;
    String Course_name;
    
         
        
       
      
  
    public QuestionBankViewer(String Course) {
        
        initComponents();
        
        getContentPane().setBackground(new java.awt.Color(255, 243, 134));
       
        setTitle(Course + "Questions Bank");
        
        ImageIcon img1 = new ImageIcon("src/pic/hammer-and-pick_2692.png");
       jLabel19.setIcon(img1);
       
        ImageIcon img2 = new ImageIcon("src/pic/hear-no-evil-monkey_1f649.png");
        jLabel2.setIcon(img2);
        
        ImageIcon img3 = new ImageIcon("src/pic/see-no-evil-monkey_1f648.png");
        jLabel1.setIcon(img3);
        ImageIcon img4 = new ImageIcon("src/pic/speak-no-evil-monkey_1f64a.png");
        jLabel8.setIcon(img4);
        ImageIcon img5 = new ImageIcon("src/pic/wastebasket_1f5d1.png");
        jLabel20.setIcon(img5);
        
        Course_name = Course;
        E_Manager = new ExamManager(Course);
        B_G.add(MCQ);
        B_G.add(TFQ);
        B_G.add(FBQ);
        AnswersForMCQ.setVisible(false);
        
        this.addWindowListener( new WindowAdapter() {
            
            public void windowClosing(WindowEvent windowEvent) {
                int answer = JOptionPane.showConfirmDialog(null, "Do you want to save the New changes?", "Finally", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                
                if (answer == JOptionPane.YES_OPTION) {
                    try {
                        
                        E_Manager.exportQBank();
                        JOptionPane.showMessageDialog(null, "All the  Questions have been Successfully saved", "Congratulations!!", JOptionPane.INFORMATION_MESSAGE);
                        
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Oops", "Exam Manager", JOptionPane.WARNING_MESSAGE);}}  
              else {      
                    JOptionPane.showMessageDialog(null, "Thank you ", "Message", JOptionPane.INFORMATION_MESSAGE);}
                
                System.exit(0);}}
        );
    }
                

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addQButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FBQ = new javax.swing.JRadioButton();
        MCQ = new javax.swing.JRadioButton();
        TFQ = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        AnswersForMCQ = new javax.swing.JPanel();
        Choice2 = new javax.swing.JTextField();
        Choice1 = new javax.swing.JTextField();
        Choice3 = new javax.swing.JTextField();
        Choice4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        QuestionText = new javax.swing.JTextField();
        QuestionID = new javax.swing.JTextField();
        CorrectAnswer = new javax.swing.JTextField();
        QuestionGrade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        withAnswer = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        examArea = new javax.swing.JTextArea();
        GenerateExButton = new javax.swing.JButton();
        ChapterName = new javax.swing.JTextField();
        ExamHeader = new javax.swing.JTextField();
        nOq = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        RemoveChName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        RemoveButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(200, 604));
        setName("examViewer"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1020, 560));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Question"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Choose the type of the Question:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel4.setText("Question ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 30));

        addQButton.setBackground(new java.awt.Color(255, 255, 255));
        addQButton.setText("Add Question");
        addQButton.setBorder(null);
        addQButton.setBorderPainted(false);
        addQButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addQButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 160, 40));

        jLabel5.setText("Question Text");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 30));

        jLabel6.setText("Possiable Grades");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 30));

        FBQ.setText("Fill Blank");
        FBQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBQActionPerformed(evt);
            }
        });
        jPanel2.add(FBQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        MCQ.setText("MCQ");
        MCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCQActionPerformed(evt);
            }
        });
        jPanel2.add(MCQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        TFQ.setText("True/False");
        TFQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFQActionPerformed(evt);
            }
        });
        jPanel2.add(TFQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel7.setText("Correct Answer");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 30));

        AnswersForMCQ.setBackground(new java.awt.Color(255, 255, 255));
        AnswersForMCQ.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Answers for MCQ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        AnswersForMCQ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Choice2.setBackground(new java.awt.Color(244, 244, 244));
        Choice2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        AnswersForMCQ.add(Choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 30));

        Choice1.setBackground(new java.awt.Color(244, 244, 244));
        Choice1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        AnswersForMCQ.add(Choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 30));

        Choice3.setBackground(new java.awt.Color(244, 244, 244));
        Choice3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        AnswersForMCQ.add(Choice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 170, 30));

        Choice4.setBackground(new java.awt.Color(244, 244, 244));
        Choice4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        AnswersForMCQ.add(Choice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 170, 30));

        jLabel14.setText("4");
        AnswersForMCQ.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 86, 20, 20));

        jLabel15.setText("1");
        AnswersForMCQ.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 20, 30));

        jLabel16.setText("2");
        AnswersForMCQ.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 20, 30));

        jLabel17.setText("3");
        AnswersForMCQ.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 46, 20, 20));

        jPanel2.add(AnswersForMCQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 440, 140));

        QuestionText.setBackground(new java.awt.Color(244, 244, 244));
        QuestionText.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        QuestionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionTextActionPerformed(evt);
            }
        });
        jPanel2.add(QuestionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 310, 30));

        QuestionID.setBackground(new java.awt.Color(244, 244, 244));
        QuestionID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.add(QuestionID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 310, 30));

        CorrectAnswer.setBackground(new java.awt.Color(244, 244, 244));
        CorrectAnswer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.add(CorrectAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 310, 30));

        QuestionGrade.setBackground(new java.awt.Color(244, 244, 244));
        QuestionGrade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.add(QuestionGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 310, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/lujenaziz/Downloads/New Folder With Items/speak-no-evil-monkey_1f64a.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/lujenaziz/Downloads/New Folder With Items/hear-no-evil-monkey_1f649.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/lujenaziz/Downloads/New Folder With Items/see-no-evil-monkey_1f648.png")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 480, 520));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Generate Exam"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Number of Questions");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 30));

        jLabel10.setText("Exam Header");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 30));

        jLabel11.setText("Chapter Name");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 30));

        withAnswer.setBackground(new java.awt.Color(244, 244, 244));
        withAnswer.setText("With Answers");
        withAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withAnswerActionPerformed(evt);
            }
        });
        jPanel3.add(withAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        examArea.setEditable(false);
        examArea.setBackground(new java.awt.Color(244, 244, 244));
        examArea.setColumns(20);
        examArea.setRows(5);
        jScrollPane1.setViewportView(examArea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 450, 150));

        GenerateExButton.setBackground(new java.awt.Color(244, 244, 244));
        GenerateExButton.setText("Generate Exam");
        GenerateExButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateExButtonActionPerformed(evt);
            }
        });
        jPanel3.add(GenerateExButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 40));

        ChapterName.setBackground(new java.awt.Color(244, 244, 244));
        ChapterName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        ChapterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChapterNameActionPerformed(evt);
            }
        });
        jPanel3.add(ChapterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 290, 30));

        ExamHeader.setBackground(new java.awt.Color(244, 244, 244));
        ExamHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        ExamHeader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExamHeaderActionPerformed(evt);
            }
        });
        jPanel3.add(ExamHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 290, 30));

        nOq.setBackground(new java.awt.Color(244, 244, 244));
        nOq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        nOq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nOqActionPerformed(evt);
            }
        });
        jPanel3.add(nOq, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 290, 30));
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 480, 390));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Delete Chapter Questions"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RemoveChName.setBackground(new java.awt.Color(244, 244, 244));
        RemoveChName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel4.add(RemoveChName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 190, 30));

        jLabel13.setText("Chapter Name");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 50));

        RemoveButton.setBackground(new java.awt.Color(255, 255, 255));
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        jPanel4.add(RemoveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 110, 40));
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 480, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCQActionPerformed
        
        AnswersForMCQ.setVisible(true);
        

    }//GEN-LAST:event_MCQActionPerformed

    private void TFQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFQActionPerformed
        
        AnswersForMCQ.setVisible(false);
    }//GEN-LAST:event_TFQActionPerformed

    private void FBQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBQActionPerformed
        
        AnswersForMCQ.setVisible(false);

    }//GEN-LAST:event_FBQActionPerformed

    private void addQButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQButtonActionPerformed

        
        if (isEmptyFiled(QuestionText, "Question Text")||isEmptyFiled(QuestionID, "Question ID")||isEmptyFiled(QuestionGrade, "Question Possible Grade")|| !(isNumeric(QuestionGrade, "Question Possible Grade"))) 
            return;
            
       
        
        if ((MCQ.isSelected() || TFQ.isSelected() || FBQ.isSelected())) {
        }
        else {
             JOptionPane.showMessageDialog(this, "Question type field is required.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
           
        
        
        if (isEmptyFiled(CorrectAnswer, "Question Correct Answer")) {
            return;}
        
        
        if (MCQ.isSelected()) {
            
            if (isEmptyFiled(Choice1, "First Choice")||isEmptyFiled(Choice2, "Second Choice")||isEmptyFiled(Choice3, "Third Choice")||isEmptyFiled(Choice4, "Fourth Choice")) {
                return;}
            
        
            if (!isNumeric(CorrectAnswer, "Question Correct Answer")) {
                
                return;}
            
            
            int Index = Integer.parseInt(CorrectAnswer.getText());
            
            if (Index < 0 || Index > 3) {
                JOptionPane.showMessageDialog(this, " MCQ should be a number from 0 to 3", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
        }
        
        if (TFQ.isSelected()) {
            
            if (!( CorrectAnswer.getText().equals("true") || CorrectAnswer.getText().equals("false") ) ) {
                JOptionPane.showMessageDialog(this, "Answer for this quastion should be only 'true' or 'false' plz correct it ", "Error", JOptionPane.WARNING_MESSAGE);
                return;}}
            
            
        
        String qText = QuestionText.getText().trim();
        String qID = QuestionID.getText().trim();
        double grade = Double.parseDouble(QuestionGrade.getText().trim());
        
        boolean Added;
        
        if (MCQ.isSelected()) {
            
            String[] choices = { Choice1.getText().trim(),Choice2.getText().trim(), Choice3.getText().trim(), Choice4.getText().trim()};
            int correctAnswerIndex = Integer.parseInt(CorrectAnswer.getText());
            
            Added = E_Manager.addNewQuestion(new MCQ(qText, qID, grade, correctAnswerIndex, choices));
            
        } else if (TFQ.isSelected()) {
            
            boolean answer = Boolean.parseBoolean(CorrectAnswer.getText().trim());
            Added = E_Manager.addNewQuestion(new TrueFalseQ(qText, qID, grade, answer));
            
        } else {
            Added = E_Manager.addNewQuestion(new FillBlankQ(qText, qID, grade, CorrectAnswer.getText().trim()));
            System.out.println(Added);
        }
        
        if (Added) {
            JOptionPane.showMessageDialog(this, "Added successfully !", "Add Question", JOptionPane.INFORMATION_MESSAGE);}
        else {JOptionPane.showMessageDialog(this, "Oops \nMake sure the question is not added before.", "Add Question", JOptionPane.WARNING_MESSAGE);}
        
        clearFields();

    }//GEN-LAST:event_addQButtonActionPerformed

    private void ExamHeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExamHeaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExamHeaderActionPerformed

    private void nOqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nOqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nOqActionPerformed

    private void ChapterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChapterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChapterNameActionPerformed

    private void GenerateExButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateExButtonActionPerformed

    
        if ((isEmptyFiled(ExamHeader, "Exam Header"))||(isEmptyFiled(nOq, "Number of Questions"))||(! isNumeric(nOq, "Number of Questions"))) 
            return;
        
       if (!(ChapterName.getText().equals(""))){
    int count =  E_Manager.getqBank().countChapterQuestions(ChapterName.getText());
     
     try{
    if (count <=0)
        throw new Exception("The chapet name is wrong");}
     catch(Exception ex){
         JOptionPane.showMessageDialog(this, ex.getMessage(), "Generate Exam", JOptionPane.WARNING_MESSAGE);
         clearFields();
         return;
     }}
     
         
     
      
        int nOqi;
        boolean withAnswer1 = withAnswer.isSelected();
       
         
         
        try { nOqi = Integer.parseInt(nOq.getText().trim());}
            
         catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Integers Numbers only!!!", "Error", JOptionPane.WARNING_MESSAGE);
            return;}
        

      
        
        
        try {
              examArea.setText("");
              
            E_Manager.generateExam(ExamHeader.getText(),nOqi, ChapterName.getText().trim(), withAnswer1);

            Scanner sc = new Scanner(new File(Course_name + "Exam.txt"));
          
            
           
            while (sc.hasNextLine()) {
                examArea.append(sc.nextLine()+"\n");}
            
            
            JOptionPane.showMessageDialog(this, "Exam has been generated ", "Generate Exam", JOptionPane.INFORMATION_MESSAGE);
        }
            
catch(IllegalArgumentException ex){
    JOptionPane.showMessageDialog(this, "لا يوجد العدد المطلوب من الأسئلة", "Error", JOptionPane.WARNING_MESSAGE);
}
         catch (Exception ex) {
          
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
            
        }        
        clearFields();

    }//GEN-LAST:event_GenerateExButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed

       
        if (isEmptyFiled(RemoveChName, "Chapter Name")) {
            return;}
        
        int count =  E_Manager.getqBank().countChapterQuestions(RemoveChName.getText());
        try{
    if (count <=0){
        throw new Exception("The chapet name is wrong");}}
     catch(Exception ex){
         JOptionPane.showMessageDialog(this, ex.getMessage(), "Generate Exam", JOptionPane.WARNING_MESSAGE);
         clearFields();
         return;
     }
        
        E_Manager.removeChapterQuestions(RemoveChName.getText());
        JOptionPane.showMessageDialog(this, RemoveChName.getText() + " questions removed successfully !!", "Questions Removed", JOptionPane.INFORMATION_MESSAGE);
clearFields();
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void withAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withAnswerActionPerformed

    private void QuestionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionTextActionPerformed
    
    public void clearFields() {
        
        QuestionText.setText("");
        QuestionID.setText("");
        QuestionGrade.setText("");
        CorrectAnswer.setText("");
        Choice1.setText("");
        Choice2.setText("");
        Choice3.setText("");
        Choice4.setText("");
        ExamHeader.setText("");
        nOq.setText("");
        ChapterName.setText("");
       RemoveChName.setText("");
        withAnswer.setSelected(false);
        B_G.clearSelection();
    }
    
    private boolean isEmptyFiled(JTextField f, String fName) {
        
        if (f.getText().trim().equals("")) {
          JOptionPane.showMessageDialog(this, fName + " Field is empty ", "Warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    private boolean isNumeric(JTextField f, String fName) {
        
        try {
            Double.parseDouble(f.getText().trim());
            return true; }
         catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Numbers only in " + fName , "Warning", JOptionPane.WARNING_MESSAGE);
            return false;}
        
        
    }

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(QuestionBankViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionBankViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionBankViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionBankViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionBankViewer(args[0]).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AnswersForMCQ;
    private javax.swing.JTextField ChapterName;
    private javax.swing.JTextField Choice1;
    private javax.swing.JTextField Choice2;
    private javax.swing.JTextField Choice3;
    private javax.swing.JTextField Choice4;
    private javax.swing.JTextField CorrectAnswer;
    private javax.swing.JTextField ExamHeader;
    private javax.swing.JRadioButton FBQ;
    private javax.swing.JButton GenerateExButton;
    private javax.swing.JRadioButton MCQ;
    private javax.swing.JTextField QuestionGrade;
    private javax.swing.JTextField QuestionID;
    private javax.swing.JTextField QuestionText;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JTextField RemoveChName;
    private javax.swing.JRadioButton TFQ;
    private javax.swing.JButton addQButton;
    private javax.swing.JTextArea examArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nOq;
    private javax.swing.JCheckBox withAnswer;
    // End of variables declaration//GEN-END:variables
}
