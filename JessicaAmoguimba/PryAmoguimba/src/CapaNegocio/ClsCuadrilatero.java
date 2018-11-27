/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

/**
 *
 * @author Estudiante
 */
public class ClsCuadrilatero {
    
    private int _largo;
    private int _ancho;
    
    
    public ClsCuadrilatero(int _largo, int _ancho) {
        this._largo = _largo;
        this._ancho = _ancho;
    }

    public int getAncho() {
        return _ancho;
    }

    public void setAncho(int _ancho) {
        this._ancho = _ancho;
    }

    public int getLargo() {
        return _largo;
    }

    public void setLargo(int _largo) {
        this._largo = _largo;
    }
    
    public boolean esRectangulo(){
        if (_largo==_ancho) {
            return true;
        
        }else{
            return false;
        }
    }
    public String tipo(){
          
         if (_largo!=_ancho) {
            return "ES RECTANGULO";
        }else{
          return "ES CUADRADO";  
        }
         
}
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
