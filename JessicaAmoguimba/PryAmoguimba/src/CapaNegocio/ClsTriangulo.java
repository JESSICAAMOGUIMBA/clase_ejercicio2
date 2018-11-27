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
public class ClsTriangulo {
private int _lado1;
    private int _lado2;
    private int _lado3;
    
    //CONSTRUCTOR

        public ClsTriangulo(int _lado1, int _lado2, int _lado3) {
        this._lado1 = _lado1;
        this._lado2 = _lado2;
        this._lado3 = _lado3;
    }
        //GET Y SET

    public int lado1() {
        return _lado1;
    }

    public void lado1(int lado1) {
        this._lado1 = lado1;
    }

    public int lado2() {
        return _lado2;
    }

    public void lado2(int lado2) {
        this._lado2 = lado2;
    }

    public int lado3() {
        return _lado3;
    }

    public void lado3(int lado3) {
        this._lado3 = lado3;
    }
    
    //metodos
    //siempre la suma de los dos lados es un mayor q el otro
    public boolean esTriangulo(){
        if (_lado1+_lado2>_lado3||_lado1+_lado3>_lado2||_lado2+_lado3>=_lado1) {
            return false;
        
        }else{
            return true;
        }
    }
         
    
    
        public String tipo(){
          
        if (_lado1==_lado2 && _lado1==_lado3) {
            return "EQUILATERO";
        }else{
            if (_lado1==_lado2 ) {
            return "ISOCELES";
        }if (_lado1!=_lado2||_lado2!=_lado3||_lado2!=_lado3 ) {
            return "ESCALENO";
                }
         return "No es triangulo";
         }
        
}
        public int perimetro(){
           int p;
           p=_lado1+_lado2+_lado3;
        
        
        return p;
        }
        public float area(){
           float resultado;
           float sp= perimetro()/2;
                 
        
        
        return 0;
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 //fin          
}


    
   
    
    
    
    