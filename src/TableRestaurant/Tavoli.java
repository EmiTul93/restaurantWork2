package TableRestaurant;

import Client.Client;

public class Tavoli{

    private int tableNumber;
    private boolean available;
    private Client cliente;

    public Tavoli(int tableNumber,boolean available, Client cliente) {
        this.tableNumber = tableNumber;
        this.available = available;
        this.cliente = cliente;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean isAvailable() {
        return available;
    }
    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void printTableDetails(){
        if (available){
            System.out.println("Numero Tavolo: " + getTableNumber() + "Cliente: " + getCliente().getName() + " " + "Libero");
        } else {
            System.out.println("Numero Tavolo: " + getTableNumber() +" - " + "Cliente: " + getCliente().getName() + " - " + "Prenotato");
        }
    }
}

