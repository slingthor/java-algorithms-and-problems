package com.ingthor.chef;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Ingthor on 14/05/2017.
 */
public class CardShuffle {

    File inputFile;
    public CardShuffle(File file)
    {
        this.inputFile = file;
        deck = new ArrayList<>();
        commands = new ArrayList<>();
        ReadInput();
        BuildDeck();
    }

    public ArrayList<Integer> ShuffleCards()
    {
        for(Command command : commands)
        {
            command.Execute(deck);
        }
        ArrayList inverseDeck = new ArrayList();
        for(int i = deck.size()-1; i > -1;i--)
        {
            inverseDeck.add(deck.get(i));
        }
        return inverseDeck;
    }

    int N;
    int M;


    ArrayList<Integer> deck;
    ArrayList<Command> commands;

    public void ReadInput()
    {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
            String[] firstLine = fileReader.readLine().split(" ");
            N = Integer.parseInt(firstLine[0]);
            M = Integer.parseInt(firstLine[1]);
            String line = fileReader.readLine();
            while(line != null)
            {
                String[] split = line.split(" ");
                int[] abc = new int[split.length];
                for(int i = 0; i < split.length; i++)
                {
                    abc[i] = Integer.parseInt(split[i]);
                }
                int a = abc[0];
                int b = abc[1];
                int c = abc[2];
                commands.add(new Command(a,b,c));
                line = fileReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void BuildDeck()
    {
        for(int i = N-1; i > -1;i--)
        {
            deck.add(i+1);
        }
    }

    class Command
    {
        public int A;
        public int B;
        public int C;

        public Command(int a, int b, int c) {
            A = a;
            B = b;
            C = c;
        }

        public void Execute(ArrayList<Integer> deck)
        {
            ArrayList<Integer> aCards = TakeCardsStack(A, deck);
            ArrayList<Integer> bCards = TakeCardsStack(B, deck);
            PutCardsBack(aCards, deck);
            ArrayList<Integer> cCards = TakeCardsStack(C, deck);
            PutCardsbackOneAtTime(bCards, deck);
            PutCardsBack(cCards, deck);
        }

        private ArrayList<Integer> TakeCardsStack(int count, ArrayList<Integer> deck)
        {
            ArrayList<Integer> secondStack = new ArrayList<>();
            int index = deck.size()-count;
            int end = deck.size();
            for(int i = index; i < end;i++)
            {
                 secondStack.add(deck.get(index));
                 deck.remove(index);
            }
            return secondStack;
        }

        private void PutCardsBack(ArrayList<Integer> tempStack, ArrayList<Integer> deck)
        {
            for(int i = 0; i < tempStack.size();i++)
            {
                deck.add(tempStack.get(i));
            }
        }

        private void PutCardsbackOneAtTime(ArrayList<Integer> tempStack, ArrayList<Integer> deck)
        {
            int tempStackLength = tempStack.size();
            for(int i = 0; i < tempStackLength;i++)
            {
                int lastIndex = tempStack.size()-1;
                int numToAdd = tempStack.get(lastIndex);
                tempStack.remove(lastIndex);
                deck.add(numToAdd);
            }
        }
    }

}
