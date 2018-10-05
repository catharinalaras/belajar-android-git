package com.example.amikom.simpleapplication.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;

/**
 * Created by amikom on 28/09/2018.
 */

public class PreferenceHelper {
    private static PreferenceHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private PreferenceHelper(Context context) {
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("simple.android.app", Context.MODE_PRIVATE);
    }
    public static PreferenceHelper getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new PreferenceHelper(context);
        }
        return INSTANCE;
    }

    public SharedPreferences Pref() {
        return sharedPreferences;
    }

    public Boolean isLogin() {
        return sharedPreferences.getBoolean("isLogin", false);
    }

    public void setLogin(boolean isCall) {
        sharedPreferences.edit().putBoolean("isLogin", isCall).apply();
    }

    public void setName(String isName) {
        sharedPreferences.edit().putString("isName", isName);
    }

    public String getName () {
        return sharedPreferences.getString("isName", "");
    }

}
