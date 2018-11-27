
package prytienda;


public class ClsTienda {
    
   
    private String _producto;

    //CONSTRUCTORES
    public ClsTienda(String producto) {
        
        this._producto = producto;
    }
    
    //GET & SET

   
    public String producto() {
        return _producto;
    }

    public void producto(String producto) {
        this._producto = producto;
    }

    
    public String ver() {
        
        
        return  _producto;
    }
    
    
    
    
    
    
    
}
