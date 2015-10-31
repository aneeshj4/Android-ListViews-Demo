package demo.android.com.demo4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aneeshjindal on 10/30/15.
 */
public class SubjectAdapter extends ArrayAdapter<SchoolSubject> {
    Context context;
    int resource;
    ArrayList<SchoolSubject> subjects = null;

    public SubjectAdapter(Context context, int resource, ArrayList<SchoolSubject> subjects) {
        super(context, resource, subjects);
        this.context = context;
        this.resource = resource;
        this.subjects = subjects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SchoolSubject subject = subjects.get(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_view, parent, false);
        }

        TextView subjectNameTextView = (TextView)convertView.findViewById(R.id.subjectNameTextView);
        CheckBox homeworkDoneCheckBox = (CheckBox)convertView.findViewById(R.id.homeworkDoneCheckBox);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageView);

        subjectNameTextView.setText(subject.name);
        homeworkDoneCheckBox.setChecked(subject.isHomeworkDone);
        imageView.setImageResource(subject.imageId);

        return convertView;
    }
}
