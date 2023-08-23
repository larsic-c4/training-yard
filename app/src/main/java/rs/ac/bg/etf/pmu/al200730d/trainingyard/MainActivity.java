package rs.ac.bg.etf.pmu.al200730d.trainingyard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int margin = (int) (this.getResources().getDisplayMetrics().density * 16);

        int linearLayoutId = View.generateViewId();
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(linearLayoutId);


        EditText editText = new EditText(this);
        LinearLayout.LayoutParams etParams = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        etParams.setMargins(margin, margin, margin, margin);
        etParams.gravity = Gravity.CENTER;
        editText.setLayoutParams(etParams);


        Button button = new Button(this);
        LinearLayout.LayoutParams btParams = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        TextView textView = new TextView(this);
        textView.setText("Hej, hej!");

        linearLayout.addView(editText);
        linearLayout.addView(button);
        linearLayout.addView(textView);

        setContentView(linearLayout);
    }
}