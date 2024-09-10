package org.example.modelo;



public class Gasto extends usuario {

    private  int idGasto;
    private int vlrMonto;
    private String fecha;



    public Gasto(){
    }

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public double getvlrMonto() {
        return vlrMonto;
    }

    public void setvlrMonto(double vlrMonto) {
        this.vlrMonto = vlrMonto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


}







