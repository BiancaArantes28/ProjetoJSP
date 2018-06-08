/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author internet
 */
public class MetaBean {
    
    private int id;
    private String tipometa;
    private float objetivo;
    private String DataIni;
    private String DataFim;
    
    public MetaBean(String tipometa, float objetivo){
        this.tipometa = tipometa;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipometa() {
        return this.tipometa;
    }

    public void setTipometa(String tipometa) {
        this.tipometa = tipometa;
    }

    public float getObjetivo() {
        return this.objetivo;
    }

    public void setObjetivo(float objetivo) {
        this.objetivo = objetivo;
    }

    public String getDataIni() {
        return this.DataIni;
    }

    public void setDataIni(String DataIni) {
        this.DataIni = DataIni;
    }

    public String getDataFim() {
        return this.DataFim;
    }

    public void setDataFim(String DataFim) {
        this.DataFim = DataFim;
    }
    
    
    
}
