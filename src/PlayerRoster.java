
import java.util.Scanner;

public class PlayerRoster {
    static void menuOptions(){
        System.out.println("MENU");
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");
        System.out.println();
        System.out.println("Choose an option:");
    }
    static void outputRoster(int [] arr,int [] rating){
        System.out.println("ROSTER");
        if(arr !=null){
            for(int i=0; i <arr.length; i++){
                System.out.println("Player " + (i+1) + " -- Jersey number: "+arr[i] +", Rating: "+rating[i]);
            }
        }
    }


    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int [] jerseyNumbers = new int[5];
        int [] ratings = new int[5];
        int jerseyNumber = 0;
        int rating = 0;

        int index = 0;
        
        char option;
        try{
            while (index < 5){
                System.out.println("Enter player " +(index+1)+ "'s  jersey number:");
                jerseyNumber = scan.nextInt();
                System.out.println("Enter player " +(index+1)+ "'s  rating:");
                rating = scan.nextInt();
                if(jerseyNumber >0 && jerseyNumber <100){
                    jerseyNumbers[index]=jerseyNumber;
                }
                if(rating > 0 && rating <10){
                    ratings[index]=rating;
                }
                index++;
                System.out.println();

            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        while (true){
            outputRoster(jerseyNumbers,ratings);
            System.out.println();
            menuOptions();
            option = scan.next().charAt(0);
            if(option=='q'){
                break;
            }else if(option=='u'){
                System.out.println("Enter a jersey number: ");
                int jerseyNum = scan.nextInt();
                System.out.println("Enter a new rating for the player: ");
                int newRating = scan.nextInt();
                for (int l = 0; l < 5; l++) {
                    if (jerseyNumbers[l] == jerseyNum) {
                        jerseyNumbers[l]=jerseyNum;
                        ratings[l] = newRating;
                    }
                }
                outputRoster(jerseyNumbers,ratings);
            }else if(option=='a'){
                System.out.println("Enter a rating: ");
                int rate = scan.nextInt();
                System.out.println("ABOVE "+rate);
                for (int l = 0; l < 5; l++) {
                    if (ratings[l]>rate) {
                        System.out.println("Player " + (l+1) + " -- Jersey number: "+jerseyNumbers[l] +", Rating: "+ratings[l]);
                    }
                }

            }else if(option=='r'){
                System.out.println("Enter a jersey number: ");
                int jersey = scan.nextInt();
                for (int l = 0; l < 5; l++) {
                    if (jerseyNumbers[l] == jersey) {
                        System.out.println("Enter a new jersey number: ");
                        jerseyNumbers[l] = scan.nextInt();
                        System.out.println("Enter a rating for the new player: ");
                        jerseyNumbers[l] = scan.nextInt();
                    }
                }
                outputRoster(jerseyNumbers,ratings);
            }else if(option=='o'){
                outputRoster(jerseyNumbers,ratings);
            }
            return;
        }
    }

}
