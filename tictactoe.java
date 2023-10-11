import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        
        String[][] ttt = {
            {"_","_","_"}, {"_","_","_"}, {"_","_","_"}
        };
        System.out.println("Lets play TIC TAC TOE !!");
       board(ttt);
    System.out.println();
    place(ttt);
    }
    
    public static void place (String [][] ttt) {
        Scanner scan = new Scanner(System.in);

        for(int k=0;k<9;k++){

            //for X
        if(k%2==0)
        {
            System.out.println("Turn : X ");
            System.out.print("Pick a row and a column ");
            int[] spot = askUser(ttt);
             ttt[spot[0]][spot[1]]="X";
             board(ttt);
                            int count=win(ttt);
                                if(count==3)
                                System.out.println("X Wins !!");
                                else if(count ==-3)
                                System.out.println("O Wins !!");
        }
            //for O
        else{
            System.out.println("Turn : O");
            System.out.print("Pick a row and a column ");
            int[] spot = askUser(ttt);
            ttt[spot[0]][spot[1]]="O";
            board(ttt);
            int count=win(ttt);
            if(count==3)
            System.out.println("X Wins !!");
            else if(count ==-3)
            System.out.println("O Wins !!");
        }
    }
    }
    public static void board(String [][] ttt)
    {
        for (int i=0;i<ttt.length;i++){
            for(int j=0;j<ttt.length;j++){
              System.out.print(" "+ ttt[i][j] +" ");
            
            }
            System.out.println(); 
        }
    }


public static int[] askUser(String ttt[][]){
    Scanner scan=new Scanner(System.in);
     int row = scan.nextInt();
     int column=scan.nextInt();
     if(ttt[row][column]!="_"){
     System.out.println("Spot taken,try again");
     row = scan.nextInt();

      column =scan.nextInt();
     }
     
        return new int[]{row,column};

}
public static int win(String ttt[][])
{
    int count=0;
    for(int i=0;i<3;i++)
    {
        for(int j =0;j<3;j++)
        {
            if(ttt[i][j]=="X")
            count++;
            else if(ttt[i][j]=="O")
            count--;
        }
        if(count==3||count==-3)
            return count;
        else
        count=0;
        for(int j=0;j<3;j++)
        {
            if(ttt[j][i]=="X")
            count++;
            else if(ttt[j][i]=="O")
            count--;
        }
        if(count==3||count==-3)
        return count;
        else
        count =0;
    }
    for(int i=0;i<3;i++)
    {
        if(ttt[i][i]=="X")
        count++;
        else if(ttt[i][i]=="O")
        count--;
    }
    if(count==3||count==-3)
    return count;
    else
    count =0;

    for(int i=0;i<3;i++)
    {
        int rowIndex=2-i;
        if(ttt[rowIndex][i]=="X")
        count++;
        else if(ttt[rowIndex][i]=="O")
        count--;
    }
    
    return count;
}
}




    

   
    

