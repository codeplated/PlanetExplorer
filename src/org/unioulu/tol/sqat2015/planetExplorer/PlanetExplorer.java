package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:
public class PlanetExplorer {
	int[][] grid;
	int x;
	int y;
	String obstacles;
	
	public PlanetExplorer(int x, int y, String obstacles){
		this.x=x;
		this.y=y;
		this.obstacles=obstacles;
		grid=new int[x][y];
		
		for(int i=0; i<x;i++){
			for(int j=0; j<y;j++){
				grid[i][j]=0;	
			}
		}
		for(int sizeOfString=0; sizeOfString<=obstacles.length(); sizeOfString++){
			
			if(obstacles.charAt(sizeOfString)==')'){
				//System.out.println(obstacles.charAt(sizeOfString-3) + "," + obstacles.charAt(sizeOfString-1));
				grid[obstacles.charAt(sizeOfString-3)][obstacles.charAt(sizeOfString-1)]=2;
			}
		}
		
		
			
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	}
	
	
	public int[][] getGrid() {
		return grid;
	}


	public void setGrid(int[][] grid) {
		this.grid = grid;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public String getObstacles() {
		return obstacles;
	}


	public void setObstacles(String obstacles) {
		this.obstacles = obstacles;
	}


	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return null;
	}
	public void displayGrid(){
		for(int i=0; i<x;i++){
			for(int j=0; j<y;j++){
				System.out.print(this.grid[i][j]);
			}
			System.out.println("\n");
		}
	}
}
