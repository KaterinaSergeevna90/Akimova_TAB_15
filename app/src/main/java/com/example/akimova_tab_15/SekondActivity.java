package com.example.akimova_tab_15;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SekondActivity extends Fragment

{
    @Nullable
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @Nullable Bundle savedInstanceState)

    {
        return inflater.inflate(R.layout.sekond_tab, container, false);
    }
}
