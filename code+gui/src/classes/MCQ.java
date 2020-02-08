package Classes;


public class MCQ extends Question{

private int correctAnswer;

private String[] choices=new String[4];

public MCQ(String text,String qID,double pGrade , int correctAnswer,String [] choices){
super(text,qID,pGrade);
this.correctAnswer=correctAnswer;
this.choices=choices;}

public MCQ(Question q){

super(q);

correctAnswer=((MCQ)q).correctAnswer;

choices=((MCQ)q).choices;
//this.(q.text,q.qID,q.pGrade,((MCQ)q).correctAnswer,((MCQ)q).choices);
}

public String formattedQ(){
String formattedQ="Choose the correct answer:\n"+qID+":"+text;
for(int i=0;i<choices.length;i++)
formattedQ+="\n"+(i+1)+":"+choices[i];
return  formattedQ;}

public String formattedQwithA(){
return formattedQ()+"\nCorrect Answer is "+(correctAnswer+1);}

public void setcorrectAnswer( int correctAnswer){

this.correctAnswer=correctAnswer;
} 
public void setchoices(String [] choices){

this.choices=choices;
}

public int getcorrectAnswer(){

return correctAnswer;
}

public String [] getchoices(){

return choices;
}

}

