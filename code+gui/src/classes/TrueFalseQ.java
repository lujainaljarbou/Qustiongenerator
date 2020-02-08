package Classes;

public class TrueFalseQ extends Question {

private boolean correctAnswer; 


public TrueFalseQ (String text, String qID, double pGrade,boolean correctAnswer ){
super(text,qID,pGrade);

this.correctAnswer=correctAnswer;}

public TrueFalseQ(Question q){
super(q);
correctAnswer=((TrueFalseQ)q).correctAnswer;}


public String formattedQ(){ 
return "True or False\n"+qID+":"+text; }

public String formattedQwithA(){ 
return formattedQ()+"  Correct Answer is:"+correctAnswer;}


public void setcorrectAnswer(boolean correctAnswer){

this.correctAnswer=correctAnswer;
}

public boolean getcorrectAnswer(){

return correctAnswer;}


}