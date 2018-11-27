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
public class ClsIndentidad {
    private String _nombre;
    private String _apellido;
    private int _edad;
    private float _sueldo;

    public ClsIndentidad(String _nombre, String _apellido, int _edad, float _sueldo) {
        this._nombre = _nombre;
        this._apellido = _apellido;
        this._edad = _edad;
        this._sueldo = _sueldo;
    }
   
 
    

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public int getEdad() {
        return _edad;
    }

    public void setEdad(int _edad) {
        this._edad = _edad;
    }

    public float getSueldo() {
        return _sueldo;
    }

    public void setSueldo(float _sueldo) {
        this._sueldo = _sueldo;
    }
    
    public String ver() {
        return "PERSONA:  "+_nombre+ "  " + _apellido + "  " +
                    " EDAD:  "+ _edad +" SUELDO:    "+ _sueldo + "\n";
    }
    
    
} 
