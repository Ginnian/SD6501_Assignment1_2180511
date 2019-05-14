package com.example.sd6501_assignment1_2180511.Journal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sd6501_assignment1_2180511.R;

public class JournalFragment extends Fragment {
    private EditText title, subject, entry;
    private TextView savedEntry;
    private JournalClass userEntryDetails;
    private FloatingActionButton floatingActionButton;

    String date = "10/10/10"; //debug

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_journal, container,false);
        userEntryDetails = new JournalClass();

        findViews(v);

        entry.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                switch(keyCode) {
                    case KeyEvent.KEYCODE_ENTER:
                        saveJournalEntryDetails();
                        savedEntry.setText(userEntryDetails.getEntry());
                        return true;
                    default:
                        break;
                }
                return false;
            }
        }); //End keyboard submit listener

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveJournalEntryDetails();
                savedEntry.setText(userEntryDetails.getEntry());

//                DatabaseHandlerJournal dbhandler =
//                        new DatabaseHandlerJournal(getActivity().getApplicationContext());
//                dbhandler.insertJournalDetails( userEntryDetails.getTitle(),
//                                                userEntryDetails.getSubject(),
//                                                userEntryDetails.getDate(),
//                                                userEntryDetails.getEntry(),
//                                                userEntryDetails.getImageResource() );
            }
        });

        return v;
    }

    private void findViews(View v) {
        title = v.findViewById(R.id.jourrnalEntry_et_title);
        subject = v.findViewById(R.id.journalEntry_et_subject);
        entry = v.findViewById(R.id.journalEntry_et_entry);
        savedEntry = v.findViewById(R.id.journalEntry_tv_savedentry);
        floatingActionButton = v.findViewById(R.id.journalEntry_fab_addJournal);
    }

    private void saveJournalEntryDetails() {
        userEntryDetails.setEntry(entry.getText().toString().trim());
        userEntryDetails.setTitle(title.getText().toString().trim());
        userEntryDetails.setSubject(subject.getText().toString().trim());
    }
}