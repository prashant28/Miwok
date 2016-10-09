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
    /** Image of the word*/
    private Integer mImageResourceId;

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
     * Create a word object
     * @param defaultTranslation  is the word which the user is familiar with
     * @param miwokTranslation is the word in miwok language
     * @param imageResourceId image of the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
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

    /** Return the image resource id */
    public int getImageResouceId(){
        return mImageResourceId;
    }
}
