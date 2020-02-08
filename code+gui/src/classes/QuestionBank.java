package Classes;

import java.io.*;

public class QuestionBank {

private String courseName;

private int nOfQ;

private Question qList[];

//======================================(Ctor)=========================================

QuestionBank(String courseName){

this.courseName=courseName;

qList= new Question[100];

nOfQ=0;}

//======================================(1)============================================
public boolean addQuestion(Question q){

if(nOfQ==qList.length)
return false ;

if ( findQuestion(q)!= -1)
return false;

if( q instanceof MCQ){
qList[nOfQ++]= new MCQ(q);}

else if( q instanceof TrueFalseQ){

qList[nOfQ++]= new TrueFalseQ(q);}

else if( q instanceof FillBlankQ){

qList[nOfQ++]= new FillBlankQ(q);}
 

return true; 
}

//======================================(2)============================================

public int findQuestion (Question q){

for ( int i =0;i<nOfQ;i++){
/* we can but it like that :
if((qList[i].qID.toLowerCase()).equals(q.qID.toLowerCase()) || (qList[i].getText().toLowerCase()).equals(q.getText().toLowerCase()))*/
if ((qList[i].qID.toLowerCase()).equals(q.qID.toLowerCase())){

return i ;}

if ((qList[i].getText().toLowerCase()).equals(q.getText().toLowerCase())){

return i;}


}

return -1;
}
//======================================(3)============================================
public void removeAllQuestion(String ids []){

for (int i =0;i<ids.length;i++){
    
     for(int j=0;j<nOfQ;j++){
    
    
        if (qList[j].getqID().toLowerCase().equals(ids[i].toLowerCase())){
    
          for(int h =j;h<nOfQ-1;h++){
          
            qList[h]=qList[h+1]; }
       
            qList[--nOfQ] = null;
            break;}
      

    }
  }
}
//======================================(4)============================================
public int countChapterQuestions (String cName){  

String chap = cName.toLowerCase();

int count=0;

for(int i=0;i<nOfQ;i++)
if ((((qList[i].getqID()).substring(0,(qList[i].getqID().indexOf('_')))).toLowerCase()).equals(chap))
count++;

return count;}
//======================================(5)============================================
 public int loadQuestions(String fname) throws IOException,ClassNotFoundException{

int count=0;
if (!fname.substring(0, fname.indexOf(".")).toLowerCase().equals(courseName.toLowerCase()))

throw new IllegalArgumentException("File name DOSE'T equal to course name !!");

ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname));

while(true ){
try{
if(addQuestion((Question)ois.readObject()))
count++;
}
catch(EOFException e){
break;}
}

ois.close();

return count; 
}
 
//======================================(6)============================================

public void saveQuestions() throws FileNotFoundException, IOException {

ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(courseName.toLowerCase() + ".ser"));

try {

for (int i = 0; i < nOfQ; i++) {

oos.writeObject(qList[i]); }}
            
finally {
oos.close();}

System.out.println("\u2606 questions have been saved \u2606");
    }//end saveQuestions

//======================================(7)============================================

public Question [] getRandomQuestions(int n){

Question array [] = new Question[n];

if(nOfQ<n){
throw new IllegalArgumentException() ;}

else{
boolean L=true;
int counter =0;
int f =0;

Question x[] = getqList();

for ( int i =0;i<x.length;i++){
if (x[i]!=null)
counter++;
}
int k=(int)(Math.random()*counter);
Question array2[] = new Question[counter];

for ( int i=0;i<counter;i++){
if (x[i]!=null)
array2[f++]=x[i];
}

for ( int i =0,j=0;i<n;i++){
 L=true;
while (L){
   if (array2[k]==null){
    k=(int)(Math.random()*counter);}
    else
    L=false;
    }
if( array2[k] instanceof MCQ){
array[j++]= new MCQ(array2[k]);}

else if(array2[k] instanceof TrueFalseQ){

array[j++]= new TrueFalseQ(array2[k]);}

else if( array2[k] instanceof FillBlankQ){

array[j++]= new FillBlankQ(array2[k]);} 

array2[k]=null;

}
return array ;
}
}
//======================================(8)============================================

public Question[] getChapterQuestion(int n, String cName) {

cName = cName.toLowerCase();
        
        int count =countChapterQuestions(cName);
         Question[] questions;
         
        if(count<n){

questions=new Question[count];

for(int i=0,j=0;i<nOfQ&&j<count;i++){

if(qList[i].getqID().substring(0,(qList[i].getqID().indexOf("_"))).toLowerCase().equals(cName.toLowerCase()))

if( qList[i] instanceof MCQ){

questions[j++]= new MCQ(qList[i]);}

else if( qList[i] instanceof TrueFalseQ){

questions[j++]= new TrueFalseQ(qList[i]);}

else if( qList[i] instanceof FillBlankQ){

questions[j++]= new FillBlankQ(qList[i]);} 

}
return questions;
}

else{
questions=new Question[n];

for(int i=0,j=0;i<nOfQ&&j<n;i++){

if(qList[i].getqID().substring(0,qList[i].getqID().indexOf("_")).toLowerCase().equals(cName.toLowerCase()))

if( qList[i] instanceof MCQ){

questions[j++]= new MCQ(qList[i]);}

else if( qList[i] instanceof TrueFalseQ){

questions[j++]= new TrueFalseQ(qList[i]);
}

else if( qList[i] instanceof FillBlankQ){

questions[j++]= new FillBlankQ(qList[i]);} 

}
return questions; 
}


}

//======================================(Getters)============================================
public String getCourseName(){

return courseName;

}

public Question[] getqList(){

return qList;
}
public int getnOfQ(){

return nOfQ;}

//======================================(Setters)============================================

public void setCourseName(String courseName ){

this.courseName=courseName;}

public void setqList(Question[] qList){

this.qList=qList;}


public void setnOfQ(int nOfQ){

this.nOfQ=nOfQ;}
 

}//class
