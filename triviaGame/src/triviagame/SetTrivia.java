package triviagame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author eliha
 */
public class SetTrivia {
    public static void main(String[] args){
    Scanner kybd = new Scanner(System.in);
    String[] question;
    String ans2;//all of the answer choices
    int score1 = 0;//the score of player 1
    int score2 = 0;//the score of player 2
    String questionGeter = null;
    int scoreGeter = 0;
      TriviaGame politics = new TriviaGame();//this is the class I made 

     //this next part sets up the values that will be in the differnet mehtods of the code
     //player 1
      for(int x = 0; x<=9; x++){
        System.out.println("Type in the number coresponding to the choice you are chosing.");
        if (x%2 == 0){
            politics.setTriviaq(setQ(questionGeter, x));//this sets up the questions
            politics.setCorrect(correct(x));//sets up the right answers
            System.out.println("Player 1");
            System.out.println(politics.getTriviaq());
            politics.setAnswer(setA(x));
            for(int i = 0; i <=3 ; i++){
                System.out.println(politics.getAnswer()[i]);// the empty parethesis refer back two lines to "(setA(x)"
            }   
          //player 1 picks his answer
            int num = kybd.nextInt();
            if(num == politics.getCorrect())//the correct answer for this question
               score1 += 1;
      }
       
        //player 2
        if (x%2 != 0){
            politics.setTriviaq(setQ(questionGeter, x));//this sets up the questions
            politics.setCorrect(correct(x));//sets up the right answers
            System.out.println("Player 1");
            System.out.println(politics.getTriviaq());
            politics.setAnswer(setA(x));
            for(int i = 0; i <=3 ; i++){
                System.out.println(politics.getAnswer()[i]);
            }  
      /*  for(int i = 0; i <=3 ; i++){
            politics.setAnswer(setA(x, i));
            System.out.println(politics.getAnswer());
            }*/
            //player 2 chooses an answer
            int num = kybd.nextInt();
            if(num == politics.getCorrect())//the correct answer for this question
                score2 += 1;
            }    
          System.out.println("___________________________________");
      }
      //determining which player won
      if(score1 == score2){
        System.out.println("It was a tie!!\n" + "Player 1 score " +score1 +"\nplayer 2 score "+score2);
      }
       if(score1 < score2){
        System.out.println("Player 2 wins!!\n" + "Player 1 score " +score1 +"\nplayer 2 score "+ score2);
      }
      if(score1 > score2){
        System.out.println("player 1 wins!!\n" + "Player 1 score " +score1 +"\nplayer 2 score "+ score2);
      }       
    }
  
    
//this method lists all of the questions
    public static String setQ(String questionGeter, int x) {
       String[] question = { "(1) What famous document begins: When in the course of human events...?",
        "(2) Who said A billion dollars isn't worth what it used to be?", "(3) What number does giga stand for?",
        "(4) What number is 1 followed by 100 zeros?","(5) Which of the planets is closest in size to our moon?",
        "(6) What do you call a group of geese on the ground?","(7) What do you call a group of geese in the air?",
        "(8) Talk show host Jerry Springer was the mayor of this city.","(9) On a standard telephone keypad, the letters T, U, and V are matched to what number?",
         "(10) Crickets hear through this part of their bodies."}; 
       return question[x];
    }
    
    
    //this method sets up all of the answer choices for the trivia game
     public static String[] setA(int x) {
 
       String[][] answer = {{ "The Gettysburg Address",
        "The US Declaration of Independence", "The Magna Carta",
        "The US Bill of Rights"},{"J. Paul Getty",
        "Bill Gates","Warren Buffet",
        "Henry Ford"},{"One thousand","One million","One billion", "One trillion"},
        {"A quintillion","A googol","A moogle", "A septaquintillion"},
        {"Mercury", "Venus", "Mars", "Jupiter"},
        {"skein", "pack", "huddle", "gaggle"},
        {"skein","pack", "huddle", "gaggle"},
        {"Chicago", "Indianapolis", "Cincinnati","Houston"},
        {"five", "six", "seven","eight"},
        {"Head", "Knees", "Ears", "Tail"} };
       String[] answeChoices = answer[x];//array of answer choices
       return answeChoices;
    }   
     
     //this method sets up all of the correct answers
     public static int correct(int x) {
       int [] answer = {2,1,3,2,1,4,1,3,4,2}; 
       return answer[x];
    }
}