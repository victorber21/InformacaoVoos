package br.com.informacoesvoos.infovoos.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "voos")
public class Voos {

    @Id
    private String numeroVoo;
    private String aeroOrigem;
    private String aeroDestino;
    private double data;
    private double horarioSaida;
    private double horarioChegada;
    private double preco;

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getAeroOrigem() {
        return aeroOrigem;
    }

    public void setAeroOrigem(String aeroOrigem) {
        this.aeroOrigem = aeroOrigem;
    }

    public String getAeroDestino() {
        return aeroDestino;
    }

    public void setAeroDestino(String aeroDestino) {
        this.aeroDestino = aeroDestino;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public double getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(double horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public double getHorarioChegada() {
        return horarioChegada;
    }

    public void setHorarioChegada(double horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
