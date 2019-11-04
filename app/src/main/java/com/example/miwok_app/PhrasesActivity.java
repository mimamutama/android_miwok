package com.example.miwok_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("where are you going?","minto wukus"));
        words.add(new Word("what is your name?","tinna oyaase'na"));
        words.add(new Word("my name is...","oyaaset..."));
        words.add(new Word("How are you feeling?","michaksas?"));
        words.add(new Word("I'm feeling good.","kuchi achit"));
        words.add(new Word("Are you coming?","aanes'aa?"));
        words.add(new Word("Yes, I,m coming.","haa' aanam"));
        words.add(new Word("I'm coming.","aanam"));
        words.add(new Word("Let's go.","yoowutis"));
        words.add(new Word("Come here.","anni'nem"));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView =  (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
