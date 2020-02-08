package Classes;

import java.io.Serializable;

public abstract class  Question implements Serializable {

   protected String text;
   protected String qID;
   protected double pGrade;

   public Question (String text, String qID, double pGrade){
   
   
      this.text=text;
      this.qID=qID;
      this.pGrade=pGrade;}
//copy constructor

public Question (Question q){
   this(q.text,q.qID,q.pGrade);
   
     /* text=q.text;
      qID=q.qID;
      pGrade=q.pGrade;*/} 
        
public  abstract String formattedQ(); 

public abstract String formattedQwithA();


//setters
public void setText(String text){
   this.text=text;}

public void setqID(String qID){
   this.qID=qID;}

public void setpGrade(double pGrade){
   this.pGrade=pGrade;}

//getters
public double getpGrade(){

      return pGrade;}

public String getText(){

      return text;}

public String getqID(){

      return qID;}



}
