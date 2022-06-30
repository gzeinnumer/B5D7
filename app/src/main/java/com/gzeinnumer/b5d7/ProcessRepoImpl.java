package com.gzeinnumer.b5d7;

import android.content.Context;

public class ProcessRepoImpl {

//    private final ProcessRepoImpl repoProsess;
//    repoProsess = new ProcessRepoImpl(application.getApplicationContext());

    private final Context context;

    public ProcessRepoImpl(Context applicationContext) {
        this.context = applicationContext;
    }

    public String processString(String str) {
        String res = "";
        for (int i = 0; i < 20; i++) {
            res = res + str;
        }
        return res;
    }
}