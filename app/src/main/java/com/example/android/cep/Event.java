package com.example.android.cep;

import java.io.StringReader;
import java.util.ArrayList;

/**
 * Created by Jéssica Nabarro on 08-May-18.
 */

public class Event {

    public String valorFrete;
    public int prazoFrete;
    public ArrayList arqq;

    public Event(String eventValor, int eventPrazo){
        valorFrete = eventValor;
        prazoFrete = eventPrazo;
    }

    public Event (ArrayList arq){
        arqq = arq;
    }
}
