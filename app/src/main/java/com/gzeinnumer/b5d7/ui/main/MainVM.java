package com.gzeinnumer.b5d7.ui.main;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import android.app.Application;
import android.content.Context;

import com.gzeinnumer.b5d7.ProcessRepoImpl;

public class MainVM extends AndroidViewModel {

    private final ProcessRepoImpl repoProsess;

    public MainVM(Application application) {
        super(application);
        repoProsess = new ProcessRepoImpl(application.getApplicationContext());
    }

    private final MutableLiveData<String> _str = new MutableLiveData<>();

    public MutableLiveData<String> getStr() {
        return _str;
    }

    public void setStr(String str) {
        _str.setValue(repoProsess.processString(str));
    }
}