package Classes;

import java.io.*;
public class ExamManager {

   private QuestionBank qBank;

//======================================(1)============================================
public ExamManager(String courseName){
   
qBank = new QuestionBank(courseName);

File f= new File(courseName.toLowerCase()+".ser");
   
if((f).exists()){

try{
qBank.loadQuestions(courseName.toLowerCase()+".ser");
}
catch (Exception ex) {

          }
}                   
else
System.out.println("The file isn't exists");

        
}
   
//======================================(2)============================================
public boolean addNewQuestion(Question q){
   
    return qBank.addQuestion(q);}
    
//======================================(3)============================================
public void removeChapterQuestions(String chapterName){
   
 int nOCq=qBank.countChapterQuestions(chapterName);
      
 Question []  CQ = qBank.getChapterQuestion(nOCq,chapterName);
     
 String [] ID=new String[nOCq];
      
 for(int i=0;i<nOCq;i++){
 
   ID[i]=CQ[i].getqID();}
      
 qBank.removeAllQuestion(ID);}
  
   
   
//======================================(4)============================================
   
public double generateExam(String header, int n, String chapterName, boolean withAnswer) throws FileNotFoundException{
   
      double grade=0;
      
      
      PrintWriter PR=new PrintWriter(new FileOutputStream(new File(qBank.getCourseName()+"Exam.txt")));
      
      try{
      PR.println(header);
      
      if( chapterName == null ||chapterName.equals("") ){
      
    Question array []= new Question [qBank.getRandomQuestions(n).length];
    
    array=qBank.getRandomQuestions(n);
      for(int i=0;i<n;i++){
      
        if(withAnswer){
         PR.println(array[i].formattedQwithA());
         grade+=array[i].getpGrade();}
    
           else {
           PR.println(array[i].formattedQ());
           grade+=array[i].getpGrade();}}
   }
   
      
   else {
  
      for(int i=0;i<qBank.getChapterQuestion(n,chapterName).length;i++){
      
       grade+=qBank.getChapterQuestion(n,chapterName)[i].getpGrade();
      if(withAnswer)
        PR.println(qBank.getChapterQuestion(n,chapterName)[i].formattedQwithA());
          else 
          PR.println(qBank.getChapterQuestion(n,chapterName)[i].formattedQ());}
     

   }
   }
  finally{
   PR.close();
 }
   return grade;}
   
   
   
//======================================(5)============================================

   public void exportQBank()throws IOException{
      qBank.saveQuestions();
   }
public QuestionBank getqBank(){

return qBank;
}
public void setqBank( QuestionBank x){

x=qBank;
}

}