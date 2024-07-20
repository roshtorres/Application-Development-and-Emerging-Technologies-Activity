package com.torres.namenumberinnumerology;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity
{
    TextView output_nameNumber;
    TextView output_personalityType;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage);

        output_nameNumber = findViewById(R.id.nameNumber);
        output_personalityType = findViewById(R.id.personalityType);

        String name = getIntent().getStringExtra("name");
        name = name.toUpperCase();

        int nameNumber = calculateNameNumber(name);

        output_nameNumber.setText(String.valueOf(nameNumber));
        output_personalityType.setText(getPersonalityType(nameNumber));
    }

    //NAME NUMBER IN NUMEROLOGY
    private int calculateNameNumber(String name)
    {
        int sum = 0;

        for (int i = 0; i < name.length(); i++)
        {
            char c = name.charAt(i);
            switch (c)
            {
                case 'A': case 'J': case 'S':
                sum += 1;
                    break;
                case 'B': case 'K': case 'T':
                sum += 2;
                    break;
                case 'C': case 'L': case 'U':
                sum += 3;
                    break;
                case 'D': case 'M': case 'V':
                sum += 4;
                    break;
                case 'E': case 'N': case 'W':
                sum += 5;
                    break;
                case 'F': case 'O': case 'X':
                sum += 6;
                    break;
                case 'G': case 'P': case 'Y':
                sum += 7;
                    break;
                case 'H': case 'Q': case 'Z':
                sum += 8;
                    break;
                case 'I': case 'R':
                sum += 9;
                    break;
                default:
                    break;
            }
        }

        sum = reduceToSingleDigit(sum);

        return sum;
    }

    // Reduce the sum to a single-digit number
    private int reduceToSingleDigit(int number)
    {
        while (number > 9 || number == 11 || number == 22 || number == 33)
        {
            int sum = 0;

            while (number > 0)
            {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }

    //PERSONALITY TYPE
    private String getPersonalityType(int nameNumber)
    {
        switch (nameNumber)
        {
            case 1:
                return "Initiator of action, pioneering, leading, independent, attaining, individualistic";
            case 2:
                return "Cooperation, adaptability, consideration of others, partnering, mediating";
            case 3:
                return "Expression, verbalization, socialization, the arts, the joy of living";
            case 4:
                return "Values foundation, order, service, struggle against limits, steady growth";
            case 5:
                return "Expansiveness, visionary, adventure, the constructive use of freedom";
            case 6:
                return "Responsibility, protection, nurturing, community, balance, sympathy";
            case 7:
                return "Analysis, understanding, knowledge, awareness, studious, meditating";
            case 8:
                return "Practical endeavors, status-oriented, power-seeking, high-material goals";
            case 9:
                return "Humanitarian, giving nature, selflessness, obligations, creative expression";
            case 10:
                return "Leadership, confidence, independence, originality, success, adaptability";
            default:
                return "Invalid";
        }
    }

}

