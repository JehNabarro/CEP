package com.example.android.cep;

/**
 * Created by Jéssica Nabarro on 10-May-18.
 */

public class Entry {
    public final String title;
    public final String link;
    public final String summary;

    private Entry(String title, String summary, String link) {
        this.title = title;
        this.summary = summary;
        this.link = link;
    }
}