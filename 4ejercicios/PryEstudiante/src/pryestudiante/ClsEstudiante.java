/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryestudiante;

/**
 *
 * @author FRANCISCO
 */
public class ClsEstudiante {
    private String _nombre;
    private String _apellido;
    private int _nota1;
    private int _nota2;
    private int _nota3;
    private int _promedio;

    public ClsEstudiante(String _nombre, String _apellido, int _nota1, int _nota2, int _nota3, int _promedio) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._nota1 = _nota1;
        this._nota2 = _nota2;
        this._nota3 = _nota3;
        this._promedio = _promedio;
    }

 

    public String nombre() {
        return _nombre;
    }

    public void nombre(String nombre) {
        this._nombre = nombre;
    }

    public String apellido() {
        return _apellido;
    }

    public void apellido(String apellido) {
        this._apellido = apellido;
    }

    public int nota1() {
        return _nota1;
    }

    public void nota1(int nota1) {
        this._nota1 = nota1;
    }

    public int nota2() {
        return _nota2;
    }

    public void nota2(int nota2) {
        this._nota2 = nota2;
    }

    public int nota3() {
        return _nota3;
    }

    public void nota3(int nota3) {
        this._nota3 = nota3;
    }

    public int promedio() {
        return _promedio;
    }

    public void promedio(int promedio) {
        this._promedio = promedio;
    }
    
    public void promedio(float r){
    _promedio=(_nota1+_nota2+_nota3)/3;
}
    
    
    
    public String ver() {
        return "ESTUDIANTE:  "+_nombre+ "  " + _apellido + "  " +
                    " NOTAS:  "+ _nota1+ "      " + _nota2 + "      " + _nota3 + 
                    "     " +" PROMEDIO:    "+ _promedio + "\n";
    }
    
    
    
}
