package test.cod.cal;

public class Comentarios {
    public static void main(String[] args) {
    }
/**
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis
 * mas olha, ele tem a finalidade de somar ou  multiplicar
 * dois números
 **/
public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicao
        r = n * x;
    }else{
        // se nao soma mesmo
        r = n + x;
    }
    return r;
    }
}


