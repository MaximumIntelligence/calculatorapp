package com.maximumintelligence.calculator;

public class SequenceProcessor {

    public String sequenceProcessor(CharSequence receivedSequence){

        String inputString = receivedSequence.toString();
        String readySequence = null;



        double firstSubSequence;
        double secondSubSequence;

        if(inputString.contains("+")){
            int index = inputString.indexOf("+");


            firstSubSequence = Double.parseDouble(inputString.substring(0, index));
            secondSubSequence = Double.parseDouble(inputString.substring(index + 1, inputString.length()));
            /*if(inputString.subSequence(0, index).toString().contains(".") ||
                    inputString.subSequence(index + 1, inputString.length()).toString().contains(".")){
                d_firstSequence = Double.parseDouble(inputString.subSequence(0, index)));
                d_secondSequence = Double.parseDouble((inputString.subSequence(index + 1, inputString.length()))));
                readySequence = String.valueOf(d_firstSequence + d_secondSequence);
                return readySequence;

            }*/
            readySequence = String.valueOf(firstSubSequence + secondSubSequence);
        }
        if(inputString.contains("-")){
            int index = inputString.indexOf("-");
            firstSubSequence = Double.parseDouble(inputString.substring(0, index));
            secondSubSequence = Double.parseDouble(inputString.substring(index + 1, inputString.length()));
            readySequence = String.valueOf(firstSubSequence - secondSubSequence);
        }
        if(inputString.contains("*")){
            int index = inputString.indexOf("*");
            firstSubSequence = Double.parseDouble(inputString.substring(0, index));
            secondSubSequence = Double.parseDouble(inputString.substring(index + 1, inputString.length()));
            readySequence = String.valueOf(firstSubSequence * secondSubSequence);

        }
        if(inputString.contains("/")){
            int index = inputString.indexOf("/");
            double divFirstSubSequence = Double.parseDouble(inputString.substring(0, index));
            double divSecondSubSequence = Double.parseDouble(inputString.substring(index + 1, inputString.length()));
            readySequence = String.valueOf(divFirstSubSequence / divSecondSubSequence);
        }

        return readySequence;
    }

    public CharSequence clearView(CharSequence receivedSequence){
        StringBuilder sb = new StringBuilder();
        receivedSequence = sb.delete(0, receivedSequence.length());

        return receivedSequence;

    }
}
