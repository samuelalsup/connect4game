{\rtf1\ansi\ansicpg1252\cocoartf2509
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 TimesNewRomanPSMT;\f1\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl440\partightenfactor0

\f0\fs32 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 /**
\f1\fs24 \

\f0\fs32 \'a0* Creates a token object that will be in the slots of the game board
\f1\fs24 \

\f0\fs32 \'a0*
\f1\fs24 \

\f0\fs32 \'a0* @ Sam Alsup
\f1\fs24 \

\f0\fs32 \'a0* @ 5 - 9 - 19
\f1\fs24 \

\f0\fs32 \'a0*/
\f1\fs24 \

\f0\fs32 public class Token
\f1\fs24 \

\f0\fs32 \{
\f1\fs24 \

\f0\fs32 \'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public char letter;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public int rowPosition;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public int columnPosition;\'a0
\f1\fs24 \
\pard\pardeftab720\sl280\partightenfactor0
\cf2 \
\pard\pardeftab720\sl440\partightenfactor0

\f0\fs32 \cf2 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* Creates a token with the letter of their choice, and gives it position
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* (-1, -1).
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public Token(char l)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0letter = l;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0rowPosition = 0;\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0columnPosition = 0;\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \
\pard\pardeftab720\sl280\partightenfactor0
\cf2 \
\pard\pardeftab720\sl440\partightenfactor0

\f0\fs32 \cf2 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @return\'a0 the letter on their token
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public char getLetter()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return letter;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @param let\'a0 sets the new letter on the token
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public void setLetter(char let)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0letter = let;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @return \'a0 the row that the token is currently in
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public int getRowPosition()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return rowPosition;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @param\'a0 r  sets the row that the token will be in
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public void setRowPosition(int r)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0rowPosition = r;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @return \'a0 the column that the token is currently in
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public int getColumnPosition()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return columnPosition;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @param\'a0 c   sets the column that the token will be in
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public void setColumnPosition(int c)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0columnPosition = c;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @return\'a0 the inital of the token along with a space before it to\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* separate the initials from each other on the board
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public String toString()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return "" + letter;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* Compares two tokens to see if they have the same initial on them
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @param other\'a0 is a Token that is being compared to another token
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @return true if they have the same initial, false otherwise
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public boolean equals(Token other)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (this.letter == other.letter)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return true;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return false;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \}
\f1\fs24 \
}