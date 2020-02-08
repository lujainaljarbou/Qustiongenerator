package Classes;


public class FillBlankQ extends Question {

private String correctAnswer;

public FillBlankQ(String text,String qID,double pGrade , String correctAnswer){

super(text,qID,pGrade);

this.correctAnswer=correctAnswer;}

public FillBlankQ(Question q){
super(q.text,q.qID,q.pGrade);

correctAnswer=((FillBlankQ)q).correctAnswer;

}

public String formattedQ(){
return qID+":"+text;}

public String formattedQwithA(){
return formattedQ()+"\nCorrect Answer is "+correctAnswer;}


public String getcorrectAnswer(){


return correctAnswer;}

public void setcorrectAnswer(String correctAnswer){
this.correctAnswer=correctAnswer;}


}
