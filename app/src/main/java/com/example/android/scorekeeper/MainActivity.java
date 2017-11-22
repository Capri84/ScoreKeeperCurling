package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int endNum;
    int[] tableTeamA = new int[10];
    int[] tableTeamB = new int[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method saves the current state of the data.
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
    }

    // This method restores saved state of the data.
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("scoreTeamA");
        scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    // This method determines whether or not the condition stated in it is satisfied. For Team A.
    /**  public boolean gotEightPointsA() {
     if (scoreTeamA > 8) {
     return true;
     }
     return false;
     }

     // This method determines whether or not the condition stated in it is satisfied. For Team B.
     public boolean gotEightPointsB() {
     if (scoreTeamB > 8) {
     return true;
     }
     return false;
     }
     */

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if ((endNum + 1) <= 10) {
            endNum = endNum + 1;
            displayEndNumber(endNum);
        } else {
            return;
        }
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        if ((endNum - 1) > 0) {
            endNum = endNum - 1;
            displayEndNumber(endNum);
        } else {
            return;
        }
    }

    /**
     * This method displays the End Number on the screen.
     */
    public void displayEndNumber(int endNum) {
        TextView endNumView = (TextView) findViewById(R.id.end_num);
        endNumView.setText(String.valueOf(endNum));
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the "+1 points" button for Team A is clicked.
     */
    public void plusOneA(View view) {
        //scoreTeamA = scoreTeamA + 1;
        if ((scoreTeamA + 1) > 8) {
            return;
        } else {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * This method is called when the "+2 points" button for Team A is clicked.
     */
    public void plusTwoA(View view) {
        // scoreTeamA = scoreTeamA + 2;
        if ((scoreTeamA + 2) > 8) {
            return;
        } else {
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * This method is called when the "+3 points" button for Team A is clicked.
     */
    public void plusThreeA(View view) {
        //scoreTeamA = scoreTeamA + 3;
        if ((scoreTeamA + 3) > 8) {
            return;
        } else {
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * This method is called when the "+4 points" button for Team A is clicked.
     */
    public void plusFourA(View view) {
        //scoreTeamA = scoreTeamA + 4;
        if ((scoreTeamA + 4) > 8) {
            return;
        } else {
            scoreTeamA = scoreTeamA + 4;
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * This method is called when the "+5 points" button for Team A is clicked.
     */
    public void plusFiveA(View view) {
        //scoreTeamA = scoreTeamA + 5;
        if ((scoreTeamA + 5) > 8) {
            return;
        } else {
            scoreTeamA = scoreTeamA + 5;
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * This method is called when the "+6 points" button for Team A is clicked.
     */
    public void plusSixA(View view) {
        //scoreTeamA = scoreTeamA + 6;
        if ((scoreTeamA + 6) > 8) {
            return;
        } else {
            scoreTeamA = scoreTeamA + 6;
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * This method is called when the "+7 points" button for Team A is clicked.
     */
    public void plusSevenA(View view) {
        //scoreTeamA = scoreTeamA + 7;
        if ((scoreTeamA + 7) > 8) {
            return;
        } else {
            scoreTeamA = scoreTeamA + 7;
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * This method is called when the "+8 points" button for Team A is clicked.
     */
    public void plusEightA(View view) {
        //scoreTeamA = scoreTeamA + 8;
        if ((scoreTeamA + 8) > 8) {
            return;
        } else {
            scoreTeamA = scoreTeamA + 8;
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the "+1 points" button for Team B is clicked.
     */
    public void plusOneB(View view) {
        //scoreTeamB = scoreTeamB + 1;
        if ((scoreTeamB + 1) > 8) {
            return;
        } else {
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * This method is called when the "+2 points" button for Team B is clicked.
     */
    public void plusTwoB(View view) {
        //scoreTeamB = scoreTeamB + 2;
        if ((scoreTeamB + 2) > 8) {
            return;
        } else {
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * This method is called when the "+3 points" button for Team B is clicked.
     */
    public void plusThreeB(View view) {
        //scoreTeamB = scoreTeamB + 3;
        if ((scoreTeamB + 3) > 8) {
            return;
        } else {
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * This method is called when the "+4 points" button for Team B is clicked.
     */
    public void plusFourB(View view) {
        //scoreTeamB = scoreTeamB + 4;
        if ((scoreTeamB + 4) > 8) {
            return;
        } else {
            scoreTeamB = scoreTeamB + 4;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * This method is called when the "+5 points" button for Team B is clicked.
     */
    public void plusFiveB(View view) {
        //scoreTeamB = scoreTeamB + 5;
        if ((scoreTeamB + 5) > 8) {
            return;
        } else {
            scoreTeamB = scoreTeamB + 5;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * This method is called when the "+6 points" button for Team B is clicked.
     */
    public void plusSixB(View view) {
        //scoreTeamB = scoreTeamB + 6;
        if ((scoreTeamB + 6) > 8) {
            return;
        } else {
            scoreTeamB = scoreTeamB + 6;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * This method is called when the "+7 points" button for Team B is clicked.
     */
    public void plusSevenB(View view) {
        //scoreTeamB = scoreTeamB + 7;
        if ((scoreTeamB + 7) > 8) {
            return;
        } else {
            scoreTeamB = scoreTeamB + 7;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * This method is called when the "+8 points" button for Team B is clicked.
     */
    public void plusEightB(View view) {
        //scoreTeamB = scoreTeamB + 8;
        if ((scoreTeamB + 8) > 8) {
            return;
        } else {
            scoreTeamB = scoreTeamB + 8;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Displays the given score for Team A in the table.
     */
    public void displayInTableA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorea);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B in the table.
     */
    public void displayInTableB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreb);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the "Fix Result" button is clicked.
     */
    public void results(View view) {
       tableTeamA [endNum] = scoreTeamA;
       tableTeamB [endNum] = scoreTeamB;
       displayInTableA(tableTeamA [endNum]);
       displayInTableB(tableTeamB [endNum]);
    }

    /**
     * This method is called when the "Reset" button is clicked.
     * It resets the score for both teams back to 0.
     */
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
