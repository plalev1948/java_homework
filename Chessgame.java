import java.util.*;

public class GameKingIsDead{
public static void main(String[] args)  {

String InFrontOfTheChessPiece;
        int movement = 1;
        
        boolean white_pawn_move=true;
        boolean black_pawn_move=true;
        
        int tempX = x;
        int tempY = y;
        
        //Number of squares in the game board:
        int[] ArrayList = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 10, 11
        		12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23
        		24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        }
        
        //Number of charactes in the game:
        int King = 1;
        int Queen = 1;
        int Donkey = 1;
        int Dwarves = 2;
        int MachineGun = 1;
        
//Keep track of white pieces:
    private ArrayList<Piece> White_Pieces;
    
//Keep track of black pieces:
    private ArrayList<Piece> Black_Pieces;

//To keep track of the white king and black king:
    private Map<JButton, Piece> map = new HashMap<JButton,Piece>();


//JLabel:
	
        private JLabel black_Win_label = new JLabel();
        private JLabel white_Win_label = new JLabel();

//For the chess board:	
		private final int ROWS = 6;
		private final int COLS = 6;

//Adding white chess pieces:
        White_Pieces.add(0,new Dw(7,0,"left_Dwarf",true));
        White_Pieces.add(1,new M(7,1,"left_MachineGun",true));
        White_Pieces.add(2,new K(7,3,"King",true));  
        White_Pieces.add(3,new Q(7,4,"White_Queen",true)); 
        White_Pieces.add(4,new D(7,2,"left_Donkey",true)); 

//Adding black chess pieces:
        Black_Pieces.add(0,new Dw(7,0,"left_Dwarf",true));
        Black_Pieces.add(1,new D(7,2,"left_Donkey",true));
        Black_Pieces.add(2,new K(7,3,"King",true));  
        Black_Pieces.add(3,new M(7,1,"left_MachineGun",true));
        Black_Pieces.add(4,new Q(7,4,"Black_Queen",true)); 

//Making a gameboard:
        
System.out.println(
====================
wDw +wD +wQ +wK + wM + wDw
====================
X + X + X +X +X
====================
X + X + X +X +X
====================
X + X + X +X +X
====================
bDw + bM + bK + bQ + bM + bDw

);


//Adding black chess pieces to the board:
        for(int i = 0; i< Black_Pieces.size();++i)
        {
//Each piece object has correct y and x position: 
        tile[Black_Pieces.get(i).current_y_position()][Black_Pieces.get(i).current_x_position()].setIcon( new ImageIcon(Black_Pieces.get(i).getFilePath()));


//Adding white chesspieces to the board:
        for(int i = 0; i< White_Pieces.size();++i)
        {
            tile[White_Pieces.get(i).current_y_position()][White_Pieces.get(i).current_x_position()].setIcon( new ImageIcon(White_Pieces.get(i).getFilePath()));



//Initialize to keep track of black and white chess:
		for(int row = 0; row < ROWS; ++row)
		{
			for(int col = 0; col<COLS; ++col)
			{
//Invalid moves:
       
                
        }               
private void invalid_move_message()
        {
            topLabel.setText("Unvalid move!"); 
            bottomLabel.setText("Move again! ");
             
        }         

                        
//Implement the move for white chess:
private boolean white_pawn_move(int y, int x)
	{
	  int ab_y = Math.abs(y - White_Pieces.get(current_chess).current_y_position());
      int ab_x = Math.abs(x - White_Pieces.get(current_chess).current_x_position());
      
      
//Implement the move for black chess:
private boolean white_pawn_move(int y, int x)
   {
    int ab_y = Math.abs(y - Black_Pieces.get(current_chess).current_y_position());
    int ab_x = Math.abs(x - Black_Pieces.get(current_chess).current_x_position());

//If next-move is not a legit move: 
            if(White_Pieces.get(current_chess).canMove(y,x) == false )
		{
			return false;
		}
		
            
//If the next-move is have black or white chess piece:
            if((color_array[y][x] == 1)|| (color_array[y][x] == 2) )//if same color 
              {
                 
             return false;
		
              }

//If there is another white chess pieces in the path:
             
             int distance = Math.abs(y-White_Pieces.get(current_chess).current_y_position()); //square distance
             int y_distance = y - White_Pieces.get(current_chess).current_y_position();
             int x_distance = x - White_Pieces.get(current_chess).current_x_position();
             if(y_distance < 0)
             {
                 if(x_distance <0)
                 {
                	
                	 
//If there is another black chess pieces in the path:
                     
              int distance = Math.abs(y-Black_Pieces.get(current_chess).current_y_position()); //square distance
              int y_distance = y - Black_Pieces.get(current_chess).current_y_position();
              int x_distance = x - Black_Pieces.get(current_chess).current_x_position();
              if(y_distance < 0)
               {
                 if(x_distance <0)
                 {
/*Adding the diagonal movement:
 * Move North-West:
*/
 
             int tempX = x;
             int tempY = y;
             for(int i = 1; i< distance; ++i)
             {
              if(( color_array[tempY+i][tempX+i] == 1)||( color_array[tempY+i][tempX+i] == 2))
              {
               return false;
               }
              }
                 }else
                 {
//Move North-East:
              int tempX = x;
              int tempY = y;
              for(int i = 1; i< distance; ++i)
              {
              if(( color_array[tempY + i][tempX-i] == 1)||( color_array[tempY+i][tempX-i] == 2))
              {
              return false;
              }
              	}
             }
            }else
             {
                 if(x_distance <0)
                 {
//Move South-West:
                      int tempX = x;
                     int tempY = y;
                     for(int i = 1; i< distance; ++i)
                     {
                         if(( color_array[tempY-i][tempX+i] == 1)||( color_array[tempY-i][tempX+i] == 2))
                         {
                             return false;
                         }
                     }
                 }else
                 {
//Move South-East:
                   int tempX = x;
                   int tempY = y;
                   for(int i = 1; i< distance; ++i)
                     {
                   if(( color_array[tempY-i][tempX-i] == 1)||( color_array[tempY-i][tempX-i] == 2))
                         {
                   return false;
                         }
                     }
                 }
             }
             
                 }
             }
             
//Check which king (Black/White) is Checkmated:
              if(white_king_checkmate() == true)
                      {                                                     
                         topLabel.setText("White King's Checkmated!");                                                    
                       }   
              if(black_king_checkmate() == true)
                    {                    
                      topLabel.setText("Black King's Checkmated!");
                    }             
 
              
