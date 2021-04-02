package com.maximumintelligence.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.maximumintelligence.calculator.SequenceFiller;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    CharSequence sequenceForProcessing;
    CharSequence readySequence;
    TextView tempTV, resultTV;
    Button zeroBtn, oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn,
            dotBtn, equalBtn, plusBtn, minusBtn, multiplyBtn, divisionBtn, deleteBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tempTV = findViewById(R.id.tempTV);
        resultTV = findViewById(R.id.resultTV);
        zeroBtn = findViewById(R.id.zero_btn);
        oneBtn = findViewById(R.id.one_btn);
        twoBtn = findViewById(R.id.two_btn);
        threeBtn = findViewById(R.id.three_btn);
        fourBtn = findViewById(R.id.four_btn);
        fiveBtn = findViewById(R.id.five_btn);
        sixBtn = findViewById(R.id.six_btn);
        sevenBtn = findViewById(R.id.seven_btn);
        eightBtn = findViewById(R.id.eight_btn);
        nineBtn = findViewById(R.id.nine_btn);
        dotBtn = findViewById(R.id.dot_btn);
        plusBtn = findViewById(R.id.plus_btn);
        minusBtn = findViewById(R.id.minus_btn);
        multiplyBtn = findViewById(R.id.multiply_btn);
        divisionBtn = findViewById(R.id.division_btn);
        equalBtn = findViewById(R.id.equal_btn);
        deleteBtn = findViewById(R.id.delete_btn);


        StringBuilder sb = new StringBuilder();
        SequenceFiller sf = new SequenceFiller();
        SequenceProcessor sp = new SequenceProcessor();


        View.OnClickListener ocl = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                CharSequence sequenceForFill;

                switch (v.getId()) {
                    case R.id.zero_btn:
                        sequenceForFill = sb.append(zeroBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.one_btn:
                        sequenceForFill = sb.append(oneBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.two_btn:
                        sequenceForFill = sb.append(twoBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.three_btn:
                        sequenceForFill = sb.append(threeBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.four_btn:
                        sequenceForFill = sb.append(fourBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.five_btn:
                        sequenceForFill = sb.append(fiveBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.six_btn:
                        sequenceForFill = sb.append(sixBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.seven_btn:
                        sequenceForFill = sb.append(sevenBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.eight_btn:
                        sequenceForFill = sb.append(eightBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.nine_btn:
                        sequenceForFill = sb.append(nineBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.dot_btn:
                        sequenceForFill = sb.append(dotBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.plus_btn:
                        sequenceForFill = sb.append(plusBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.minus_btn:
                        sequenceForFill = sb.append(minusBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.multiply_btn:
                        sequenceForFill = sb.append(multiplyBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.division_btn:
                        sequenceForFill = sb.append(divisionBtn.getText());
                        sequenceForProcessing = sf.sequenceFiller(sequenceForFill);
                        tempTV.setText(sequenceForProcessing);
                        break;

                    case R.id.equal_btn:
                        readySequence = sp.sequenceProcessor(sequenceForProcessing);
                        resultTV.setText(readySequence);
                        break;

                    case R.id.delete_btn:

                        readySequence = sb.delete(0, tempTV.getText().length());
                        tempTV.setText(readySequence);
                        readySequence = sb.delete(0, resultTV.getText().length());
                        resultTV.setText(readySequence);

                        //resultTV.setText(sb.delete(0, resultTV.getText().length()));
                        //tempTV.setText(sb.delete(0, tempTV.getText().length()));




                }

             }

        };

        zeroBtn.setOnClickListener(ocl);
        oneBtn.setOnClickListener(ocl);
        twoBtn.setOnClickListener(ocl);
        threeBtn.setOnClickListener(ocl);
        fourBtn.setOnClickListener(ocl);
        fiveBtn.setOnClickListener(ocl);
        sixBtn.setOnClickListener(ocl);
        sevenBtn.setOnClickListener(ocl);
        eightBtn.setOnClickListener(ocl);
        nineBtn.setOnClickListener(ocl);
        dotBtn.setOnClickListener(ocl);
        plusBtn.setOnClickListener(ocl);
        minusBtn.setOnClickListener(ocl);
        multiplyBtn.setOnClickListener(ocl);
        divisionBtn.setOnClickListener(ocl);
        equalBtn.setOnClickListener(ocl);
        deleteBtn.setOnClickListener(ocl);

    }
}