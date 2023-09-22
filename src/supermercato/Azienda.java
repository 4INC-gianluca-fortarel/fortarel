package supermercato;

public class Azienda {
    private String sede;//ha un indirizzo
    private String nome;
    private Supermercato[] sm;
    
    public Azienda(Supermercato[] sm, String nome, String sede){
        this.nome = nome;
        this.sede = sede;
        this.sm = copia(sm);
    }
    
    private Supermercato[] copia(Supermercato[] c){
        Supermercato[] a = new Supermercato[c.length];
        for(int i = 0; i < c.length; i++){
            a[i] = c[i];
        }
        return a;
    }
    //invoco il metodo ad prodotto che ho nel supermecato
    public void addProd(Prodotto p, int i){
        sm[i].addProdotto(p);
    }
    
    
         
            
}
