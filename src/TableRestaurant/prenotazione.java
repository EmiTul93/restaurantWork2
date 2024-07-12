package TableRestaurant;


import Client.Client;

public class prenotazione {
    private int time;
    private Client surname;
    private Tavoli idTavolo;

    public prenotazione(int time, Client surname, Client phoneNumber, Tavoli idTavolo) {
        this.time = time;
        this.surname = surname;
        this.idTavolo = idTavolo;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Client getSurname() {
        return surname;
    }

    public void setSurname(Client surname) {
        this.surname = surname;
    }


    public Tavoli getIdTavolo() {
        return idTavolo;
    }

    public void setIdTavolo(Tavoli idTavolo) {
        this.idTavolo = idTavolo;
    }
}

