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
    private double cantHsDia;
    private int cantDiaSemana;
    private String turno;
    private double precioXhs;
    private String alumno[];

    public Curso() {
        alumno = new String [5];
    }

    public Curso(String nombreCurso, double cantHsDia, int cantDiaSemana, String turno, double precioXhs, String[] alumno) {
        this.nombreCurso = nombreCurso;
        this.cantHsDia = cantHsDia;
        this.cantDiaSemana = cantDiaSemana;
        this.turno = turno;
        this.precioXhs = precioXhs;
        this.alumno = alumno;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantHsDia() {
        return cantHsDia;
    }

    public void setCantHsDia(double cantHsDia) {
        this.cantHsDia = cantHsDia;
    }

    public int getCantDiaSemana() {
        return cantDiaSemana;
    }

    public void setCantDiaSemana(int cantDiaSemana) {
        this.cantDiaSemana = cantDiaSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioXhs() {
        return precioXhs;
    }

    public void setPrecioXhs(double precioXhs) {
        this.precioXhs = precioXhs;
    }

    public String[] getAlumno() {
        return alumno;
    }

    public void setAlumno(String[] alumno) {
        this.alumno = alumno;
    }
    
    
    
}
