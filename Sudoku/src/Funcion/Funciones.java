
package Funcion;

public class Funciones {
	public int[][] matriz = new int[9][9];
	
	public int[][] valores() {
		 matriz[0][2] = 1; //1
	     matriz[0][0] = 2;//1
	     matriz[0][5] = 3;//1
	     matriz[0][6] = 4;//1
	     matriz[0][7] = 5;//1
	     matriz[1][8] = 6;//1
	     matriz[2][1] = 7;//1
	     matriz[2][2] = 8;//1
	     matriz[2][4] = 9;//1
	    return matriz;
        
	}

	public boolean comval(String valor) {
        
        if (String.valueOf(valor).equalsIgnoreCase("")) {
            return false;
        } else {
            int dato = Integer.valueOf(valor);
            if (dato >0 && dato < 10) {
                return true;
            } else {
                return false;
            }
        }
    }
	
	
	
	
	public boolean existe_fila(int numero, int fila) {

        boolean resultado = false;
       // int a = matriz[0][2];
        for (int i = 0; i < matriz.length; i++) {
            if (numero == 0) {
                
            } else {
                if (matriz[fila][i] == numero) {
                    resultado = true;
                    break;
                }
            }
        }
        return resultado;

    }
	
	public boolean existe_caja(int valor, int fila, int columna) {

        //VARIABLES.
        int filmin;
        int filmax;
        int colmax;
        int colmin;
        boolean result = false;

        //DETERMINAMOS LAS FILAS DE LA CAJA.
        if (fila >= 0 && fila < 3) {
            filmin = 0;
            filmax = 2;
        } else if (fila >= 3 && fila < 6) {
            filmin = 3;
            filmax = 5;
        } else {
            filmin = 6;
            filmax = 8;
        }

        //DETERMINAMOS LAS COLUMNAS DE LA CAJA.
        if (columna >= 0 && columna < 3) {
            colmax = 0;
            colmin = 2;
        } else if (columna >= 3 && columna < 6) {
            colmax = 3;
            colmin = 5;
        } else {
            colmax = 6;
            colmin = 8;
        }

        //RECORREMOS EL RANGO DE LA CAJA, Y BUSCAMOS EL VALOR.
        for (int f = filmin; f <= filmax; f++) {
            for (int c = colmax; c <= colmin; c++) {
                if (valor == 0) {
                } else {
                    if (matriz[f][c] == valor) {
                        result = true;
                        break;

                    }
                }
            }
        }
        //REGRESAMOS EL VALOR BOOLEANO.
        return result;



    }
	
}
