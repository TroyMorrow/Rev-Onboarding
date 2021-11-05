public class RPS {
    public static void main(String[] args) {
        System.out.println(winner("Paper", "Rock"));
    }

    public static String winner(String player1, String player2){
        String result = "";

        if(player1.equals("Rock") && player2.equals("Scissors")){
            result = "Player 1 wins";
        }else if(player1.equals("Rock") && player2.equals("Rock")){
            result = "Tie";
        }else if(player1.equals("Rock") && player2.equals("Paper")){
            result = "Player 2 wins";
        }


        if(player1.equals("Scissors") && player2.equals("Paper")){
            result = "Player 1 wins";
        }else if(player1.equals("Scissors") && player2.equals("Scissors")){
            result = "Tie";
        }else if(player1.equals("Scissors") && player2.equals("Rock")){
            result = "Player 2 wins";
        }

        if(player1.equals("Paper") && player2.equals("Rock")){
            result = "Player 1 wins";
        }else if(player1.equals("Paper") && player2.equals("Paper")){
            result = "Tie";
        }else if(player1.equals("Paper") && player2.equals("Scissors")){
            result = "Player 2 wins";
        }

        return result;
    }
}


