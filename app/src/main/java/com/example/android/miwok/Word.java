package com.example.android.miwok;

import java.util.ArrayList;

/**
 * {@link Word}represents a vocabulary word which the user want to learn
 * It contains a default and miwok translation for that word
 */

public class Word {

    /**Default translation of the word */
    private String mDefaultTranslation;
    /**Miwok translation of the word */
    private String mMiwokTranslation;

    /**
     * Create a word object
     * @param defaultTranslation is the word which the user is familiar with
     * @param miwokTranslation is the word in miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the defaultTranslation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * get the miwokTranslation of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
