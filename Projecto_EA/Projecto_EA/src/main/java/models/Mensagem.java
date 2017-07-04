package models;

import java.util.GregorianCalendar;

/**
 * Created by joaof on 04/07/2017.
 */
public class Mensagem {
    private GregorianCalendar time;
    public Mensagem(){
        setTime(new GregorianCalendar());
    }

    public String getTime() {
        return time.getTime().toString();
    }

    public void setTime(GregorianCalendar time) {
        this.time = time;
    }
}
