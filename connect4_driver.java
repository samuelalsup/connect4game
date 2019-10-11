{\rtf1\ansi\ansicpg1252\cocoartf2509
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 TimesNewRomanPSMT;\f1\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl440\partightenfactor0

\f0\fs32 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import java.util.Scanner;\'a0
\f1\fs24 \

\f0\fs32 /**
\f1\fs24 \

\f0\fs32 \'a0* Drives the Connect 4 Game
\f1\fs24 \

\f0\fs32 \'a0*
\f1\fs24 \

\f0\fs32 \'a0* @ Sam Alsup
\f1\fs24 \

\f0\fs32 \'a0* @ 5 - 14 - 19
\f1\fs24 \

\f0\fs32 \'a0*/
\f1\fs24 \

\f0\fs32 public class Driver
\f1\fs24 \

\f0\fs32 \{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0static Scanner input = new Scanner(System.in);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* Runs the Connect 4 Game
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* Prints out who wins or loses at the end
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public static void main (String [] args)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println("Welcome to the game of Connect 4!\\nTry to place your tokens in a way that \\ngives you four in a row before the computer!");\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.print("Press any key to start:\'a0 \\n");\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(" ");\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Player p1 = new Person();\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Computer p2 = new Computer();\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String x = input.next();\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Board b1 = new Board();
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println("What initial would you like to have on your token?");\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0String y = input.next();\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0char z = y.charAt(0);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0p1.setPlayerInitial(z);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println("Your initial is '" + z + "' and the computer's is 'c'");\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0int a = 0;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0int b = 0;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0while(!x.equals("q"))\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0b1.printBoard();\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println("Which column would you like to place your token in?");\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0a = input.nextInt() - 1;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (a > 6 || a < 0 || b1.numInColumn(a) >= 6)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println("That column is full or does not exist! \\nPlease choose a different one.");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0a = input.nextInt() - 1;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0p1.insertTokenInGameBoard(new Token(p1.getPlayerInitial()),a,b1);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0b1.printBoard();\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0else\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0p1.insertTokenInGameBoard(new Token(p1.getPlayerInitial()),a,b1);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0b1.printBoard();\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (b1.checkHorizontalWin(6 - b1.numInColumn(a), a, p1.getPlayerInitial())==true|| b1.checkVerticalWin(6 - b1.numInColumn(a), a, p1.getPlayerInitial())==true|| b1.checkDiagonalWin(6 - b1.numInColumn(a), a, p1.getPlayerInitial())==true)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0break;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (p2 instanceof Computer)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0p2.insertTokenInGameBoard(b1);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0b = p2.lastColumn();\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println("The computer placed its token in Column " + (b+1));\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (b1.checkHorizontalWin(6 - b1.numInColumn(b), b, p2.getPlayerInitial())==true|| b1.checkVerticalWin(6 - b1.numInColumn(b), b, p2.getPlayerInitial())==true|| b1.checkDiagonalWin(6 - b1.numInColumn(b), b, p2.getPlayerInitial())==true)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0b1.printBoard();\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0break;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (b1.checkHorizontalWin(6 - b1.numInColumn(b), b, p2.getPlayerInitial())==true|| b1.checkVerticalWin(6 - b1.numInColumn(b), b, p2.getPlayerInitial())==true|| b1.checkDiagonalWin(6 - b1.numInColumn(b), b, p2.getPlayerInitial())==true)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println("You lose...try again sometime.");\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (b1.checkHorizontalWin(6 - b1.numInColumn(a), a, p1.getPlayerInitial())==true|| b1.checkVerticalWin(6 - b1.numInColumn(a), a, p1.getPlayerInitial())==true|| b1.checkDiagonalWin(6 - b1.numInColumn(a), a, p1.getPlayerInitial())==true)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println("You win!!!");\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \}
\f1\fs24 \
}