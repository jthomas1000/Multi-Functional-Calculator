package com.example.multi_functional_calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;


import com.example.multi_functional_calculator.databinding.ActivityMainBinding;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private StringBuilder lhs;
    private boolean isOpSelected = false;
    private StringBuilder rhs;
    private BigDecimal rightSide;
    private BigDecimal leftSide;
    private String operator;
    private BigDecimal sign;
    private Boolean isSign = false;
    private Boolean isOnLeftSide = false;
    private Boolean flag = false;
    private BigDecimal percent;
    private Boolean percentClicked = false;
    private Boolean sqrtClicked = false;


    private void opSelected (CalculatorState operator) {
        switch (operator) {
            case PLUS:
                if (sqrtClicked){
                    rightSide = new BigDecimal(String.valueOf(rhs));
                }
                if (isSign){
                    if (isOnLeftSide){
                        rightSide = new BigDecimal(String.valueOf(rhs));
                    }
                }
                else if (percentClicked){
                    if (flag){
                        leftSide = percent;
                        rightSide = new BigDecimal(String.valueOf(rhs));
                    }
                    rightSide = percent;
                }
                else {
                    leftSide = new BigDecimal(String.valueOf(lhs));
                    rightSide = new BigDecimal(String.valueOf(rhs));
                }
                leftSide.add(rightSide);
                binding.displayId.setText(String.valueOf(leftSide));
                break;

            case MINUS:

                if (sqrtClicked){
                    rightSide = new BigDecimal(String.valueOf(rhs));
                }
                if (isSign){
                    if (isOnLeftSide){
                        rightSide = new BigDecimal(String.valueOf(rhs));
                    }
                }
                else if (percentClicked){
                    if (flag){
                        leftSide = percent;
                        rightSide = new BigDecimal(String.valueOf(rhs));
                    }
                    rightSide = percent;
                }
                else {
                    leftSide = new BigDecimal(String.valueOf(lhs));
                    rightSide = new BigDecimal(String.valueOf(rhs));
                }
                leftSide.subtract(rightSide);
                binding.displayId.setText(String.valueOf(leftSide));
                break;

            case MULTIPLY:
                if (sqrtClicked){
                    rightSide = new BigDecimal(String.valueOf(rhs));
                }
                if (isSign){
                    if (isOnLeftSide){
                        rightSide = new BigDecimal(String.valueOf(rhs));
                    }
                }
                else if (percentClicked){
                    if (flag){
                        leftSide = percent;
                        rightSide = new BigDecimal(String.valueOf(rhs));
                    }
                    rightSide = percent;
                }
                else {
                    leftSide = new BigDecimal(String.valueOf(lhs));
                    rightSide = new BigDecimal(String.valueOf(rhs));
                }
                leftSide.multiply(rightSide);
                binding.displayId.setText(String.valueOf(leftSide));
                break;

            case DIVIDE:

                if (sqrtClicked){
                    rightSide = new BigDecimal(String.valueOf(rhs));
                }
                if (isSign){
                    if (isOnLeftSide){
                        rightSide = new BigDecimal(String.valueOf(rhs));
                    }
                }
                else if (percentClicked){
                    if (flag){
                        leftSide = percent;
                        rightSide = new BigDecimal(String.valueOf(rhs));
                    }
                    rightSide = percent;
                }
                else {
                    leftSide = new BigDecimal(String.valueOf(lhs));
                    rightSide = new BigDecimal(String.valueOf(rhs));
                }
                if (String.valueOf(rhs).equals("0")){
                    binding.displayId.setText("ERROR");
                }
                else{
                leftSide.divide(rightSide);
                binding.displayId.setText(String.valueOf(leftSide));
                }
                break;

            default:
                binding.displayId.setText("ERROR");
                break;
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append("0");
                } else {
                    lhs = new StringBuilder().append("0");
                }

    }
});
        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append("1");
                } else {
                    lhs = new StringBuilder().append("1");
                }

            }
        });
        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append("2");
                } else {
                    lhs = new StringBuilder().append("2");
                }

            }
        });
        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append("3");
                } else {
                    lhs = new StringBuilder().append("3");
                }
            }
        });
        binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append("4");
                } else {
                    lhs = new StringBuilder().append("4");
                }

            }
        });
        binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append("5");
                } else {
                    lhs = new StringBuilder().append("5");
                }

            }
        });
        binding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append("6");
                } else {
                    lhs = new StringBuilder().append("6");
                }

            }
        });
        binding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append("7");
                } else {
                    lhs = new StringBuilder().append("7");
                }
            }
        });
        binding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append("8");
                } else {
                    lhs = new StringBuilder().append("8");
                }
            }
        });

        binding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append("9");
                } else {
                    lhs = new StringBuilder().append("9");
                }
            }
        });
        binding.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.displayId.setText("0");
                leftSide = new BigDecimal("0");
                rightSide = new BigDecimal("0");

            }
        });
        binding.btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    rhs = new StringBuilder().append(".");
                } else {
                    lhs = new StringBuilder().append(".");
                }

            }
        });
        binding.btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOpSelected = true;
                operator = "DIVIDE";

            }
        });
        binding.btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOpSelected = true;
                operator = "MULTIPLY";

            }
        });
        binding.btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opSelected(CalculatorState.valueOf(operator));

            }
        });
        binding.btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOpSelected = true;
                operator = "MINUS";

            }
        });
        binding.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOpSelected = true;
                operator = "PLUS";

            }
        });
        binding.btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isOpSelected) {
                    percent = new BigDecimal(String.valueOf(rhs));
                } else {
                    percent = new BigDecimal(String.valueOf(lhs));
                    flag = true;
                }
                percent = percent.divide(new BigDecimal(100));
                percentClicked = true;
            }
        });
        binding.btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOpSelected) {
                    sign = new BigDecimal(String.valueOf(rhs));
                    sign.multiply(new BigDecimal("-1"));
                    rightSide = sign;

                }
                else{
                    sign = new BigDecimal(String.valueOf(lhs));
                    sign.multiply(new BigDecimal("-1"));
                    leftSide = sign;
                    isOnLeftSide = true;

                }

                isSign = true;
            }
        });
        binding.btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amount = 1/2;
                leftSide = new BigDecimal(String.valueOf(lhs));
                double sqrt = leftSide.doubleValue();
                binding.displayId.setText(String.valueOf(Math.pow(sqrt,amount)));
                leftSide = new BigDecimal(Math.pow(sqrt,amount));
                sqrtClicked = true;

            }
        });
    }
}
