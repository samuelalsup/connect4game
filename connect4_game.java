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

\f0\fs32 \'a0* Will be implemented in the Player class, could be implemented for other\'a0
\f1\fs24 \

\f0\fs32 \'a0* games too.\'a0
\f1\fs24 \

\f0\fs32 \'a0*
\f1\fs24 \

\f0\fs32 \'a0* @ Sam Alsup
\f1\fs24 \

\f0\fs32 \'a0* @ 5 - 13 - 19
\f1\fs24 \

\f0\fs32 \'a0*/
\f1\fs24 \

\f0\fs32 public interface Game
\f1\fs24 \

\f0\fs32 \{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* Used in many games to take a turn
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @param\'a0 t is the token that will be placed in the board
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @param column is the column that the token will be placed in
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* @param b is the board that is selected for the token to be placed in
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0void insertTokenInGameBoard(Token t, int column, Board b);
\f1\fs24 \

\f0\fs32 \}
\f1\fs24 \
}