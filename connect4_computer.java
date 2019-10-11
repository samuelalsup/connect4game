{\rtf1\ansi\ansicpg1252\cocoartf2509
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 TimesNewRomanPSMT;\f1\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl440\partightenfactor0

\f0\fs32 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import java.util.List;\'a0
\f1\fs24 \

\f0\fs32 import java.util.ArrayList;\'a0
\f1\fs24 \

\f0\fs32 import java.util.Collections;\'a0
\f1\fs24 \

\f0\fs32 /**
\f1\fs24 \

\f0\fs32 \'a0* Creates a player that is a specified computer
\f1\fs24 \

\f0\fs32 \'a0*
\f1\fs24 \

\f0\fs32 \'a0* @ Sam Alsup
\f1\fs24 \

\f0\fs32 \'a0* @ 5 - 20 - 19
\f1\fs24 \

\f0\fs32 \'a0*/
\f1\fs24 \

\f0\fs32 public class Computer extends Player
\f1\fs24 \

\f0\fs32 \{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0int randomColumn;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0List <Integer> cols = new ArrayList<Integer>(7);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* Creates a computer with playerInitial 'c' by default unless given a\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* parameter
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public Computer()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0playerInitial = 'c';\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* Inserts the player's token in the game board
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @param b is the board that is selected for the token to be placed in
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public void insertTokenInGameBoard(Board b)\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0for (int i = 0; i < 7; i++)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (b.numInColumn(i) < 6)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0cols.add(i);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Collections.shuffle(cols);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0int desiredIndex = cols.get((int)Math.random()*cols.size());\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0b.addToken(desiredIndex, new Token(playerInitial));\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0randomColumn = desiredIndex;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0for (int i = 0; i != cols.size(); i++)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0cols.remove(i);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0i--;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* Gives us the last column that the computer's token was placed in
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @return\'a0 randomColumn which is the last column that the computer's\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* token was placed in
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public int lastColumn()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return randomColumn;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \}
\f1\fs24 \
}