package demo.android.com.demo4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);

        ArrayList<SchoolSubject> schoolSubjects = new ArrayList<SchoolSubject>();

        SchoolSubject math = new SchoolSubject("Math", false, R.drawable.math);
        schoolSubjects.add(math);

        SchoolSubject science = new SchoolSubject("Science", true, R.drawable.science);
        schoolSubjects.add(science);

        SchoolSubject history = new SchoolSubject("History", true, R.drawable.history);
        schoolSubjects.add(history);

        SchoolSubject reading = new SchoolSubject("Reading", false, R.drawable.reading);
        schoolSubjects.add(reading);

        SubjectAdapter adapter = new SubjectAdapter(getApplicationContext(), R.layout.row_view, schoolSubjects);
        listView.setAdapter(adapter);

    }
}
