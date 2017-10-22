/**
 * @author zhumeng
 */
package com.mengjie.main;

public class ChessBoard {
	
	public static final int NOCHESS = 0;          //表示没有落子
	
	public static final int WHITECHESS = 1;       //表示落白子
	 
	public static final int BLACKCHESS = 2;       //表示落黑子
	
	private int[][] chessMatrix;                  //描述棋盘状态的矩阵，chessMatrix[2][1] = ChessBoard.WHITECHESS 表示（2，1）这个点下了白子
	
	private int n;                                //棋盘的大小
	
	/**
	 * 	棋盘类实例的默认构造方法，n默认为50
	 * @return ChessBoard实例
	 */
	public ChessBoard()
	{
		this.n = 50;
		this.chessMatrix = new int[50][50];
	}
	
	/**
	 * 棋盘类实例的构造方法，根据n创建棋盘实例
	 * @param n 棋盘的大小
	 * @return ChessBoard实例
	 */
	public ChessBoard(int n) 
	{
		this.n = n;
		this.chessMatrix = new int[n][n];
	}
	
	/**
	 * 表示下棋的动作
	 * @param x 落子点的x值
	 * @param y 落子点的y值
	 * @param whiteOrBlack 黑棋或者白棋
	 * @return 返回下棋动作是否成功
	 */
	public boolean playChess(int x, int y, int whiteOrBlack)
	{
		if (x < 0 || x >= n || y < 0 || y > n) {
			return false;
		}
		if (chessMatrix[x][y] != ChessBoard.NOCHESS) {
			return false;
		}
		if(whiteOrBlack != ChessBoard.BLACKCHESS || whiteOrBlack != ChessBoard.WHITECHESS)
		{
			return false;
		}
		
		chessMatrix[x][y] = whiteOrBlack;
		
		return true;
	}
	
	
	
	
	

}
