/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triviagame;

/**
 *
 * @author eliha
 */
public class TriviaGame {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        private String triviaq;
        private int correct;
        private String[] Answer;
   
    public void setTriviaq (String tq){
        triviaq = tq;
    }
    public void setCorrect(int ans){//the correct answer
        correct = ans;
    }
    public void setAnswer(String[] ansW){//ansW - stands for "wrong answer"
        Answer = ansW;
    }
/*    public void setWrongAnswer2(String ansW2){//ansW - stands for "wrong answer"
        wrongAnswer2 = ansW2;
    }
    public void setWrongAnswer3(String ansW3){//ansW - stands for "wrong answer"
        wrongAnswer3 = ansW3;
    }
*/
    public String getTriviaq(){
        return triviaq;
    }
    public int getCorrect(){
        return correct;
    }
    public String[] getAnswer(){
        return Answer;
    }
  /*  public String getWrongAnswer2(){
        return wrongAnswer2;
    }
    public String getWrongAnswer3(){
        return wrongAnswer3;
    }
*/
}//the closing curly bracket for the "class" has to be after the all of the "void statments"

  

