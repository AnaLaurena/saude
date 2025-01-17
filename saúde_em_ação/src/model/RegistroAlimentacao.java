package model;

import java.util.Date;

public class RegistroAlimentacao {
    private int id;
    private int idUsuario;
    private Date data;
    private String tipoAlimento;
    private double quantidade;

    
    public RegistroAlimentacao(int id, int idUsuario, Date data, String tipoAlimento, double quantidade) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.data = data;
        this.tipoAlimento = tipoAlimento;
        this.quantidade = quantidade;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}