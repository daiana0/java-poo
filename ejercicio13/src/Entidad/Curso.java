/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Dai
 */
public class Curso {

    private String nombreCurso;
    private int horasDiarias;
    private int diasSemanales;
    private boolean turno;
    private double precioHora;
    private String[] alumnos ;

    public Curso() {
        
    }

    public Curso(String nombreCurso, int horasDiarias, int diasSemanales, boolean turno, double precioHora, String alumnos) {
        this.alumnos = new String [5];
        this.nombreCurso = nombreCurso;
        this.horasDiarias = horasDiarias;
        this.diasSemanales = diasSemanales;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = new String [5] ;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHorasDiarias() {
        return horasDiarias;
    }

    public void setHorasDiarias(int horasDiarias) {
        this.horasDiarias = horasDiarias;
    }

    public int getDiasSemanales() {
        return diasSemanales;
    }

    public void setDiasSemanales(int diasSemanales) {
        this.diasSemanales = diasSemanales;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

}
