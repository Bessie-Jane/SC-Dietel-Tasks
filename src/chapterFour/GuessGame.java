package chapterFour;

import java.util.Scanner;

public class GuessGame {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int guess = 45;
            int userGuess = 0;



            while (userGuess != guess ) {
                System.out.print("Enter number to guess: ");
                userGuess = input.nextInt();


                if (userGuess != guess){
                    System.out.println("Nope! Try Again!");
                }

                if (userGuess == guess) {
                    System.out.print("You Won!");
                }

            }




           /** if(userGuess == guess){
                System.out.print("You Won!");
            }

            if (userGuess > guess){
                System.out.print("Wrong!...Too High");
            }

            if (userGuess < guess){
                System.out.print("Wrong!...Too Low");
            }**/

        }

    }




