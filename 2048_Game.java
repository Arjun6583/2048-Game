import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class Pract extends JFrame implements ActionListener 
{
	JLabel board[][]=new JLabel[4][4],move,high_score,player_score,game_name;
	JTextField display_high_score,display_player_score;
	JButton left,right,up,down,reset,exit;
	JFrame frame;
	int score=0,move_check=0;
	Pract()
	{
		setLayout(null);
		Border br= BorderFactory.createLineBorder(Color.ORANGE);
		Font myFont = new Font("Serif",Font.BOLD,24);
		board[0][0]=new JLabel("0",JLabel.CENTER);
		board[0][0].setSize(90,90);
		board[0][0].setLocation(150,234);
		add(board[0][0]);
		board[0][0].setForeground(new Color(120,90,40));
		board[0][0].setBackground(new Color(100,20,70));
		board[0][0].setBorder(br);
		board[0][0].setFont(myFont);

		board[0][1]=new JLabel("0",JLabel.CENTER);
		board[0][1].setSize(90,90);
		board[0][1].setLocation(242,234);
		add(board[0][1]);
		board[0][1].setForeground(new Color(120,90,40));
		board[0][1].setBackground(new Color(100,20,70));
		board[0][1].setBorder(br);
		board[0][1].setFont(myFont);

		board[0][2]=new JLabel("0",JLabel.CENTER);
		board[0][2].setSize(90,90);
		board[0][2].setLocation(334,234);
		add(board[0][2]);
		board[0][2].setForeground(new Color(120,90,40));
		board[0][2].setBackground(new Color(100,20,70));
		board[0][2].setBorder(br);
		board[0][2].setFont(myFont);

		board[0][3]=new JLabel("0",JLabel.CENTER);
		board[0][3].setSize(90,90);
		board[0][3].setLocation(426,234);
		add(board[0][3]);
		board[0][3].setForeground(new Color(120,90,40));
		board[0][3].setBackground(new Color(100,20,70));
		board[0][3].setBorder(br);
		board[0][3].setFont(myFont);

		board[1][0]=new JLabel("0",JLabel.CENTER);
		board[1][0].setSize(90,90);
		board[1][0].setLocation(150,326);
		add(board[1][0]);
		board[1][0].setForeground(new Color(120,90,40));
		board[1][0].setBackground(new Color(100,20,70));
		board[1][0].setBorder(br);
		board[1][0].setFont(myFont);

		board[1][1]=new JLabel("0",JLabel.CENTER);
		board[1][1].setSize(90,90);
		board[1][1].setLocation(242,326);
		add(board[1][1]);
		board[1][1].setForeground(new Color(120,90,40));
		board[1][1].setBackground(new Color(100,20,70));
		board[1][1].setBorder(br);
		board[1][1].setFont(myFont);

		board[1][2]=new JLabel("0",JLabel.CENTER);
		board[1][2].setSize(90,90);
		board[1][2].setLocation(334,326);
		add(board[1][2]);
		board[1][2].setForeground(new Color(120,90,40));
		board[1][2].setBackground(new Color(100,20,70));
		board[1][2].setBorder(br);
		board[1][2].setFont(myFont);

		board[1][3]=new JLabel("0",JLabel.CENTER);
		board[1][3].setSize(90,90);
		board[1][3].setLocation(426,326);
		add(board[1][3]);
		board[1][3].setForeground(new Color(120,90,40));
		board[1][3].setBackground(new Color(100,20,70));
		board[1][3].setBorder(br);
		board[1][3].setFont(myFont);


		board[2][0]=new JLabel("0",JLabel.CENTER);
		board[2][0].setSize(90,90);
		board[2][0].setLocation(150,418);
		add(board[2][0]);
		board[2][0].setForeground(new Color(120,90,40));
		board[2][0].setBackground(new Color(100,20,70));
		board[2][0].setBorder(br);
		board[2][0].setFont(myFont);

		board[2][1]=new JLabel("0",JLabel.CENTER);
		board[2][1].setSize(90,90);
		board[2][1].setLocation(242,418);
		add(board[2][1]);
		board[2][1].setForeground(new Color(120,90,40));
		board[2][1].setBackground(new Color(100,20,70));
		board[2][1].setBorder(br);
		board[2][1].setFont(myFont);

		board[2][2]=new JLabel("0",JLabel.CENTER);
		board[2][2].setSize(90,90);
		board[2][2].setLocation(334,418);
		add(board[2][2]);
		board[2][2].setForeground(new Color(120,90,40));
		board[2][2].setBackground(new Color(100,20,70));
		board[2][2].setBorder(br);
		board[2][2].setFont(myFont);

		board[2][3]=new JLabel("0",JLabel.CENTER);
		board[2][3].setSize(90,90);
		board[2][3].setLocation(426,418);
		add(board[2][3]);
		board[2][3].setForeground(new Color(120,90,40));
		board[2][3].setBackground(new Color(100,20,70));
		board[2][3].setBorder(br);
		board[2][3].setFont(myFont);

		board[3][0]=new JLabel("0",JLabel.CENTER);
		board[3][0].setSize(90,90);
		board[3][0].setLocation(150,510);
		add(board[3][0]);
		board[3][0].setForeground(new Color(120,90,40));
		board[3][0].setBackground(new Color(100,20,70));
		board[3][0].setBorder(br);
		board[3][0].setFont(myFont);

		board[3][1]=new JLabel("0",JLabel.CENTER);
		board[3][1].setSize(90,90);
		board[3][1].setLocation(242,510);
		add(board[3][1]);
		board[3][1].setForeground(new Color(120,90,40));
		board[3][1].setBackground(new Color(100,20,70));
		board[3][1].setBorder(br);
		board[3][1].setFont(myFont);

		board[3][2]=new JLabel("0",JLabel.CENTER);
		board[3][2].setSize(90,90);
		board[3][2].setLocation(334,510);
		add(board[3][2]);
		board[3][2].setForeground(new Color(120,90,40));
		board[3][2].setBackground(new Color(100,20,70));
		board[3][2].setBorder(br);
		board[3][2].setFont(myFont);

		board[3][3]=new JLabel("0",JLabel.CENTER);
		board[3][3].setSize(90,90);
		board[3][3].setLocation(426,510);
		add(board[3][3]);
		board[3][3].setForeground(new Color(120,90,40));
		board[3][3].setBackground(new Color(100,20,70));
		board[3][3].setBorder(br);
		board[3][3].setFont(myFont);

		move=new JLabel("Move",JLabel.CENTER);
		move.setSize(80,40);
		move.setLocation(290,670);
		add(move);
		move.setForeground(new Color(120,90,40));
		move.setBackground(new Color(100,20,70));
		move.setFont(myFont);


		reset=new JButton("Reset");
		reset.setSize(80,50);
		reset.setLocation(600,300);
		add(reset);
		reset.addActionListener(this);

		exit=new JButton("Exit");
		exit.setSize(80,50);
		exit.setLocation(700,300);
		add(exit);
		exit.addActionListener(this);

		left = new JButton("Left");
		left.setSize(80,40);
		left.setLocation(210,670);
		add(left);
		left.addActionListener(this);
		//left.setBackground(Color.BLACK);
		//left.setForeground(Color.GRAY);

		right = new JButton("Right");
		right.setSize(80,40);
		right.setLocation(370,670);
		add(right);
		right.addActionListener(this);
		//right.setBackground(Color.BLACK);
		//right.setForeground(Color.GRAY);

		down = new JButton("Down");
		down.setSize(80,40);
		down.setLocation(290,710);
		add(down);
		down.addActionListener(this);
		//down.setBackground(Color.BLACK);
		//down.setForeground(Color.GRAY);

		up = new JButton("Up");
		up.setSize(80,40);
		up.setLocation(290,630);
		add(up);
		up.addActionListener(this);
		//up.setBackground(Color.BLACK);
		//up.setForeground(Color.GRAY);

		high_score=new JLabel("Best");
		high_score.setSize(150,60);
		high_score.setLocation(350,100);
		add(high_score);
		high_score.setForeground(new Color(120,90,40));
		high_score.setBackground(new Color(100,20,70));
		high_score.setFont(myFont);		

		player_score=new JLabel("Score");
		player_score.setSize(150,60);
		player_score.setLocation(160,100);
		add(player_score);
		player_score.setForeground(new Color(120,90,40));
		player_score.setBackground(new Color(100,20,70));
		player_score.setFont(myFont);

		game_name=new JLabel("2048 Charm");
		game_name.setSize(200,60);
		game_name.setLocation(20,30);
		add(game_name);
		game_name.setForeground(new Color(120,90,40));
		game_name.setBackground(new Color(100,20,70));
		game_name.setFont(myFont);			

		display_high_score=new JTextField("0000",JTextField.CENTER);
		display_high_score.setSize(90,60);
		display_high_score.setLocation(330,150);
		display_high_score.setEditable(false);
		display_high_score.setHorizontalAlignment(JTextField.CENTER);
		add(display_high_score);
		display_high_score.setForeground(new Color(120,90,40));
		display_high_score.setFont(myFont);
		display_high_score.setBorder(null);

		display_player_score=new JTextField("0000",JTextField.CENTER);
		display_player_score.setSize(90,60);
		display_player_score.setLocation(140,150);
		display_player_score.setEditable(false);
		display_player_score.setHorizontalAlignment(JTextField.CENTER);
		add(display_player_score);
		display_player_score.setForeground(new Color(120,90,40));
		display_player_score.setFont(myFont);
		display_player_score.setBorder(null);


		setVisible(true);
		setSize(850,850);
		setLocation(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().setBackground(Color.cyan);
		setTitle("2048 Game");
		generateVal();

	}

	void left()
	{
		int i,j,x;
		int temp_board[][]=new int[4][4];
		move_check=0;
		for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}

    	for(i=0;i<4;i++)
    	{
        	x=1;
        	if(temp_board[i][3]==temp_board[i][0] && temp_board[i][1]==0 && temp_board[i][2]==0)
        	{
            	temp_board[i][0]=temp_board[i][0]+temp_board[i][3];
            	temp_board[i][1]=0;
            	temp_board[i][2]=0;
            	temp_board[i][3]=0;
            	score+=temp_board[i][0];
            	x=0;
            	
        	}
        	else if(temp_board[i][0]==temp_board[i][2] && temp_board[i][1]==0 && temp_board[i][3]==0)
        	{
            	temp_board[i][0]=temp_board[i][0]+temp_board[i][2];
            	temp_board[i][1]=0;
            	temp_board[i][2]=0;
            	temp_board[i][3]=0;
            	score+=temp_board[i][0];
            	x=0;
            	
        	}
        	else if(temp_board[i][3]!=0 && temp_board[i][0]==0 && temp_board[i][1]==0 && temp_board[i][2]==0)
        	{
            	temp_board[i][0]=temp_board[i][3];
            	temp_board[i][1]=0;
            	temp_board[i][2]=0;
            	temp_board[i][3]=0;
            	x=0;
            	
        	}
        	for(j=0;j<3 && x!=0;j++)
        	{
            	if(temp_board[i][j]==temp_board[i][j+1])
            	{
                	temp_board[i][j]=2*temp_board[i][j];
                	temp_board[i][j+1]=0;
                	score+=temp_board[i][j];
                	
                }

            }
        }

        for(i=0;i<4;++i)
        {
        	for(j=0;j<4;++j)
        	{
        		board[i][j].setText(Integer.toString(temp_board[i][j]));
        	}
        }
        display_player_score.setText(Integer.toString(score));
    }

    void right()
	{
	    int i,j,x;
	    int temp_board[][]=new int[4][4];
		for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
	    for(i=0;i<4;i++)
	    {
	        x=1;
	        if(temp_board[i][0]==temp_board[i][3] && temp_board[i][1]==0 && temp_board[i][2]==0)
	        {
	            temp_board[i][3]=temp_board[i][0]+temp_board[i][3];
	            temp_board[i][2]=0;
	            temp_board[i][1]=0;
	            temp_board[i][0]=0;
	            score+=temp_board[i][3];
	            x=0;
	            
	        }
	        else if(temp_board[i][1]==temp_board[i][3] && temp_board[i][0]==0 && temp_board[i][2]==0)
	        {
	            temp_board[i][3]=temp_board[i][1]+temp_board[i][3];
	            temp_board[i][2]=0;
	            temp_board[i][1]=0;
	            temp_board[i][0]=0;
	            score+=temp_board[i][3];
            	x=0;
            	
        	}
        	else if(temp_board[i][0]!=0 && temp_board[i][1]==0 && temp_board[i][2]==0 && temp_board[i][2]==0)
        	{
            	temp_board[i][3]=temp_board[i][0];
            	temp_board[i][0]=0;
            	temp_board[i][1]=0;
            	temp_board[i][2]=0;
            	x=0;
            	
        	}
        	for(j=3;j>0 && x!=0;j--)
        	{
            	if(temp_board[i][j]==temp_board[i][j-1])
            	{
                	temp_board[i][j]=temp_board[i][j]+temp_board[i][j-1];
                	temp_board[i][j-1]=0;
                	score+=temp_board[i][j];
                	
            	}
            }
        }
        display_player_score.setText(Integer.toString(score));
        for(i=0;i<4;++i)
        {
        	for(j=0;j<4;++j)
        	{
        		board[i][j].setText(Integer.toString(temp_board[i][j]));
        	}
        }
    }

    void down()
	{
    	int i,j,x;
    	int temp_board[][]=new int[4][4];
		for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
    	for(i=0;i<4;i++)
    	{
        	x=1;
        	if(temp_board[0][i]==temp_board[3][i] && temp_board[1][i]==0 && temp_board[2][i]==0)
        	{
            	temp_board[3][i]=temp_board[0][i]+temp_board[3][i];
            	temp_board[2][i]=0;
            	temp_board[1][i]=0;
            	temp_board[0][i]=0;
            	score+=temp_board[3][i];
            	x=0;
            	
        	}
        	else if(temp_board[1][i]==temp_board[3][i] && temp_board[0][i]==0 && temp_board[2][i]==0)
        	{
            	temp_board[3][i]=temp_board[1][i]+temp_board[3][i];
            	temp_board[2][i]=0;
            	temp_board[1][i]=0;
            	temp_board[0][i]=0;
            	score+=temp_board[3][i];
            	x=0;
            	
        	}
        	else if(temp_board[0][i]!=0 && temp_board[1][i]==0 && temp_board[2][i]==0 && temp_board[2][i]==0)
        	{
            	temp_board[3][i]=temp_board[0][i];
            	temp_board[2][i]=0;
            	temp_board[1][i]=0;
            	temp_board[0][i]=0;
            	x=0;
            	
        	}
        	for(j=3;j>0 && x!=0;j--)
	        {
	            if(temp_board[j][i]==temp_board[j-1][i])
	            {
	                temp_board[j][i]=temp_board[j][i]+temp_board[j-1][i];
	                temp_board[j-1][i]=0;
	                score+=temp_board[j][i];
	                
	            }
	        }
	    }
	    display_player_score.setText(Integer.toString(score));
        for(i=0;i<4;++i)
        {
        	for(j=0;j<4;++j)
        	{
        		board[i][j].setText(Integer.toString(temp_board[i][j]));
        	}
        }
	}

	void up()
	{
	    int i,j,x;
	    int temp_board[][]=new int[4][4];
		for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
	    for(i=0;i<4;i++)
	    {
	        x=1;
	        if(temp_board[0][i]==temp_board[3][i] && temp_board[1][i]==0 && temp_board[2][i]==0)
	        {
	            temp_board[0][i]=temp_board[0][i]+temp_board[3][i];
	            temp_board[1][i]=0;
	            temp_board[2][i]=0;
	            temp_board[3][i]=0;
	            score+=temp_board[0][i];
	            x=0;
	            
	        }
	        else if(temp_board[0][i]==temp_board[2][i] && temp_board[1][i]==0 && temp_board[3][i]==0)
	        {
	            temp_board[0][i]=temp_board[0][i]*2;
	            temp_board[1][i]=0;
	            temp_board[2][i]=0;
	            temp_board[3][i]=0;
	            score+=temp_board[0][i];
	            x=0;
	            
	        }
	        else if(temp_board[3][i]!=0 && temp_board[0][i]==0 && temp_board[1][i]==0 && temp_board[2][i]==0)
	        {
	            temp_board[0][i]=temp_board[3][i];
	            temp_board[1][i]=0;
	            temp_board[2][i]=0;
	            temp_board[3][i]=0;
	            x=0;
	            move_check=1;
	        }
	        for(j=0;j<3 && x!=0;j++)
	        {
	            if(temp_board[j][i]==temp_board[j+1][i])
	            {
	                temp_board[j][i]=temp_board[j][i]+temp_board[j+1][i];
	                temp_board[j+1][i]=0;
	                score+=temp_board[j][i];
	                
	            }
	        }
	    }
	    display_player_score.setText(Integer.toString(score));
	    for(i=0;i<4;++i)
	    {
	    	for(j=0;j<4;++j)
	        {
	        	board[i][j].setText(Integer.toString(temp_board[i][j]));
	        }
	    }
	}

	void shiftUp()
	{
	    int i,j,x;
	    int temp_board[][]=new int[4][4];
		for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
	    for(i=0;i<4;i++)
	    {
	        x=1;
	        if(temp_board[3][i]!=0 && temp_board[1][i]==0 && temp_board[0][i]==0 && temp_board[2][i]==0){
	            x=0;
	            move_check=1;
	        }
	        for(j=0;j<3 && x!=0;j++)
	        {
	            if(temp_board[j][i]==0 && temp_board[j+1][i]!=0)
	            {
	                temp_board[j][i]=temp_board[j+1][i];
	                temp_board[j+1][i]=0;	          
	            }
	        }
	    }
	    for(i=0;i<4;++i)
	    {
	    	for(j=0;j<4;++j)
	        {
	        	board[i][j].setText(Integer.toString(temp_board[i][j]));
	        }
	    }
	}

    void shiftLeft()
	{
    	int i,j,x;
    	int temp_board[][]=new int[4][4];
    	for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
    	for(i=0;i<4;i++)
    	{
        	x=1;
        	if(temp_board[i][3]!=0 && temp_board[i][1]==0 && temp_board[i][2]==0 && temp_board[i][0]==0){
            	x=0;            	
        	}
        	for(j=0;j<3 && x!=0;j++)
        	{
            	if(temp_board[i][j]==0 && temp_board[i][j+1]!=0)
            	{
                	temp_board[i][j]=temp_board[i][j+1];
                	temp_board[i][j+1]=0;              	
                }
            }
        }
        for(i=0;i<4;++i)
        {
        	for(j=0;j<4;++j)
        	{
        		board[i][j].setText(Integer.toString(temp_board[i][j]));
        	}
        }
    }

    void shiftRight()
	{
    	int i,j,x;
    	int temp_board[][]=new int[4][4];
    	for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
    	for(i=0;i<4;i++)
    	{
        	x=1;
        	if(temp_board[i][0]!=0 && temp_board[i][1]==0 && temp_board[i][3]==0 && temp_board[i][2]==0){
            	x=0;           	
        	}
        	for(j=3;j>0 && x!=0;j--)
        	{
            	if(temp_board[i][j]==0 && temp_board[i][j-1]!=0)
            	{
                	temp_board[i][j]=temp_board[i][j-1];
                	temp_board[i][j-1]=0;                	
            	}
        	}
    	}
    	for(i=0;i<4;++i)
        {
        	for(j=0;j<4;++j)
        	{
        		board[i][j].setText(Integer.toString(temp_board[i][j]));
        	}
        }
    
	}

	void shiftDown()
	{
	    int i,j,x;
	    int temp_board[][]=new int[4][4];
	    for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
	    for(i=0;i<4;i++)
	    {
	        x=1;
	        if(temp_board[0][i]!=0 && temp_board[1][i]==0 && temp_board[2][i]==0 && temp_board[3][i]==0){
	            x=0;	            
	        }
	        for(j=3;j>0 && x!=0;j--)
	        {
	            if(temp_board[j][i]==0 && temp_board[j-1][i]!=0)
	            {
	                temp_board[j][i]=temp_board[j-1][i];
	                temp_board[j-1][i]=0;	     
	            }
	        }
	    }
	    for(i=0;i<4;++i)
        {
        	for(j=0;j<4;++j)
        	{
        		board[i][j].setText(Integer.toString(temp_board[i][j]));
        	}
        }
	}

	boolean leftMoveCheck()
	{
		int i,j;
	    int temp_board[][]=new int[4][4];
	    int cnt=0;
	    for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
		for(i=0;i<4;++i)
		{
			if(temp_board[i][0]==0 && temp_board[i][1]==0 && temp_board[i][2]==0 && temp_board[i][3]==0)
			{
				cnt+=1;
			}
			else if(temp_board[i][0]!=0 && temp_board[i][1]==0 && temp_board[i][2]==0 && temp_board[i][3]==0)
			{
				cnt+=1;
			}
			else if(temp_board[i][0]!=0 && temp_board[i][1]!=0 && temp_board[i][2]==0 && temp_board[i][3]==0 && temp_board[i][0]!=temp_board[i][1])
			{
				cnt+=1;
			}
			else if(temp_board[i][0]!=0 && temp_board[i][1]!=0 && temp_board[i][2]!=0 && temp_board[i][3]==0 && (temp_board[i][0]!=temp_board[i][1] || temp_board[i][1]!=temp_board[i][2]))
			{
				cnt+=1;
			}
			else if(temp_board[i][0]!=0 && temp_board[i][1]!=0 && temp_board[i][2]!=0 && temp_board[i][3]!=0 && (temp_board[i][0]!=temp_board[i][1] || temp_board[i][1]!=temp_board[i][2] || temp_board[i][2]!=temp_board[i][3]))
			{
				cnt+=1;
			}
		}
		if(cnt==4)
			return true;
		return false;

	}

	boolean rightMoveCheck()
	{
		int i,j;
	    int temp_board[][]=new int[4][4];
	    int cnt=0;
	    for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
		for(i=0;i<4;++i)
		{
			if(temp_board[i][0]==0 && temp_board[i][1]==0 && temp_board[i][2]==0 && temp_board[i][3]==0)
			{
				cnt+=1;
			}
			else if(temp_board[i][3]!=0 && temp_board[i][2]==0 && temp_board[i][1]==0 && temp_board[i][0]==0)
			{
				cnt+=1;
			}
			else if(temp_board[i][3]!=0 && temp_board[i][2]!=0 && temp_board[i][1]==0 && temp_board[i][0]==0 && temp_board[i][3]!=temp_board[i][2])
			{
				cnt+=1;
			}
			else if(temp_board[i][3]!=0 && temp_board[i][2]!=0 && temp_board[i][1]!=0 && temp_board[i][0]==0 && (temp_board[i][3]!=temp_board[i][2] || temp_board[i][2]!=temp_board[i][1]))
			{
				cnt+=1;
			}
			else if(temp_board[i][0]!=0 && temp_board[i][1]!=0 && temp_board[i][2]!=0 && temp_board[i][3]!=0 && (temp_board[i][3]!=temp_board[i][2] || temp_board[i][2]!=temp_board[i][1] || temp_board[i][1]!=temp_board[i][0]))
			{
				cnt+=1;
			}
			else 
			{
				return false;
			}
		}
		if(cnt==4)
			return true;
		return false;

	}

	boolean downMoveCheck()
	{
		int i,j;
	    int temp_board[][]=new int[4][4];
	    int cnt=0;
	    for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
		for(i=0;i<4;++i)
		{
			if(temp_board[0][i]==0 && temp_board[1][i]==0 && temp_board[2][i]==0 && temp_board[3][i]==0)
			{
				cnt+=1;
			}
			else if(temp_board[3][i]!=0 && temp_board[2][i]==0 && temp_board[1][i]==0 && temp_board[0][i]==0)
			{
				cnt+=1;
			}
			else if(temp_board[3][i]!=0 && temp_board[2][i]!=0 && temp_board[1][i]==0 && temp_board[0][i]==0 && temp_board[3][i]!=temp_board[2][i])
			{
				cnt+=1;
			}
			else if(temp_board[3][i]!=0 && temp_board[2][i]!=0 && temp_board[1][i]!=0 && temp_board[0][i]==0 && (temp_board[3][i]!=temp_board[2][i] || temp_board[2][i]!=temp_board[1][i]))
			{
				cnt+=1;
			}
			else if(temp_board[3][i]!=0 && temp_board[2][i]!=0 && temp_board[1][i]!=0 && temp_board[0][i]==0 && (temp_board[3][i]!=temp_board[2][i] || temp_board[2][i]!=temp_board[1][i] || temp_board[1][i]!=temp_board[0][i]))
			{
				cnt+=1;
			}
			
		}
		if(cnt==4)
			return true;
		return false;

	}

	boolean upMoveCheck()
	{
		int i,j;
	    int temp_board[][]=new int[4][4];
	    int cnt=0;
	    for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
		for(i=0;i<4;++i)
		{
			if(temp_board[0][i]==0 && temp_board[1][i]==0 && temp_board[2][i]==0 && temp_board[3][i]==0)
			{
				cnt+=1;
			}
			else if(temp_board[0][i]!=0 && temp_board[1][i]==0 && temp_board[2][i]==0 && temp_board[3][i]==0)
			{
				cnt+=1;
			}
			else if(temp_board[0][i]!=0 && temp_board[1][i]!=0 && temp_board[2][i]==0 && temp_board[3][i]==0 && temp_board[0][i]!=temp_board[1][i])
			{
				cnt+=1;
			}
			else if(temp_board[0][i]!=0 && temp_board[1][i]!=0 && temp_board[2][i]!=0 && temp_board[3][i]==0 && (temp_board[0][i]!=temp_board[1][i] || temp_board[1][i]!=temp_board[2][i]))
			{
				cnt+=1;
			}
			else if(temp_board[0][i]!=0 && temp_board[1][i]!=0 && temp_board[2][i]!=0 && temp_board[3][i]==0 && (temp_board[0][i]!=temp_board[1][i] || temp_board[1][i]!=temp_board[2][i] || temp_board[2][i]!=temp_board[3][i]))
			{
				cnt+=1;
			}
		}
		if(cnt==4)
			return true;
		return false;

	}
	boolean tiles_count()
	{

    	int i,j,x=1;
    	int cnt=0;
    	int temp_board[][]=new int[4][4];
		for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
		for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				if(temp_board[i][j]!=0)
					cnt+=1;
			}
		}
		return cnt!=16;
	}
    void generateVal()
    {

    	int i,j,x=1;
    	int num;
    	int temp_board[][]=new int[4][4];
		for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
		Random rand=new Random();
		if(check_merge())
		{
			JOptionPane.showMessageDialog(null,"Unable to merge!!!");
			System.exit(0);
		}
		if(check_win())
		{
			JOptionPane.showMessageDialog(null,"You Win");
		}
        while(true && tiles_count())
        {
        	num=rand.nextInt(2);
            if(num==0)
            {
            	i=rand.nextInt(4);
            	j=rand.nextInt(4);
            	if(temp_board[i][j]!=0)
                	continue;
            	temp_board[i][j]=2;
            }
            else if(num==1) 
            {
            	i=rand.nextInt(4);
            	j=rand.nextInt(4);
            	if(temp_board[i][j]!=0)
                	continue;
            	temp_board[i][j]=4;
            }
            break;
        }

    	for(i=0;i<4;++i)
        {
        	for(j=0;j<4;++j)
        	{
        		board[i][j].setText(Integer.toString(temp_board[i][j]));
        	}
        }
    }

    boolean check_win()
    {
    	int i,j;
    	for(i=0;i<4;++i)
    	{
    		for(j=0;j<4;++j)
    		{
    			int score=Integer.parseInt(board[i][i].getText());
    			if(score==2048)
    				return true;
    		}
    	}
    	return false;
    }

    void reset_board()
    {
    	int i,j;
    	for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				board[i][j].setText("0");
			}
		}
		display_player_score.setText("0000");
		generateVal();
    }

    boolean check_merge()
	{
	    int i,j;
	    int temp_board[][]=new int[4][4];
	    for(i=0;i<4;++i)
		{
			for(j=0;j<4;++j)
			{
				temp_board[i][j]=Integer.parseInt(board[i][j].getText());
			}
		}
	    for(i=0;i<4;i++)
	    {
	        for(j=0;j<4;j++)
	        {
	            if(j!=3 && (temp_board[i][j]==temp_board[i][j+1] || temp_board[i][j]==0))
	                return false;
	            else if(j==3 && temp_board[i][j]==0)
	                return false;
	        }
	    }
	    for(i=0;i<4;i++)
	    {
	        for(j=0;j<4;j++)
	        {
	            if(j!=3 && (temp_board[j][i]==temp_board[j+1][i] || temp_board[j][i]==0))
	                return false;
	            else if(j==3 && temp_board[j][i]==0)
	                return false;
	        }
	    }
	    return true;
	}

    public void actionPerformed(ActionEvent ae)
	{
		String move=(String)ae.getActionCommand();
		boolean flag;
		if(move.equals("Left"))
		{
			flag=leftMoveCheck();
			shiftLeft();
			left();
			shiftLeft();
			if(!flag)
				generateVal();
		}
		else if(move.equals("Right"))
		{
			flag=rightMoveCheck();
			shiftRight();
			right();
			shiftRight();
			if(!flag)
				generateVal();
		}
		else if(move.equals("Up"))
		{
			flag=upMoveCheck();
			shiftUp();
			up();
			shiftUp();
			if(!flag)
				generateVal();
		}
		else if(move.equals("Down"))
		{
			flag=downMoveCheck();
			shiftDown();
			down();
			shiftDown();
			if(!flag)
				generateVal();
		}
		else if(move.equals("Reset"))
		{
			int res=JOptionPane.showConfirmDialog(null,"Do you want to reset board");
			switch(res)
			{
				case JOptionPane.YES_OPTION:
					reset_board();
					break;
				case JOptionPane.NO_OPTION:
					break;
				case JOptionPane.CANCEL_OPTION:
					break; 
			}
		}
		else if(move.equals("Exit"))
		{
			int res=JOptionPane.showConfirmDialog(null,"Sure you want to exit!!!");
			switch(res)
			{
				case JOptionPane.YES_OPTION:
					System.exit(0);
					break;
				case JOptionPane.NO_OPTION:
					break;
				case JOptionPane.CANCEL_OPTION:
					break; 
			}
		}
	}

	public static void main(String args[])
	{
		new Pract();
	}

}