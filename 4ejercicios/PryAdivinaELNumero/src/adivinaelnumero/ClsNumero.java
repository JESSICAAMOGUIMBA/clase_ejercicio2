
package adivinaelnumero;


public class ClsNumero {
    private int _numero;

    public ClsNumero(int _numero) {
        this._numero = _numero;
    }

    public int numero() {
        return _numero;
    }

    public void numero(int _numero) {
        this._numero = _numero;
    }

   
    public String ver() {
        return "El numero es:  " + _numero ;
    }
    
    
}
