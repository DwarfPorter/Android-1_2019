package ru.geekbrains.fragmentobserver;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment implements Observer {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        textView = view.findViewById(R.id.textView);
        return view;
    }

    // Как только пришло событие - обработаем его
    @Override
    public void updateText(String text) {
        textView.setText(text);
    }
}