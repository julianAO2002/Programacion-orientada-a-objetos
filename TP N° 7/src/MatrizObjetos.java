public class MatrizObjetos {
    static int max_rows = 200;
    static int max_cols = 200;
    private Vector cuerpo[];

    MatrizObjetos(int columnas, int filas) throws MatrizException {        
        if (columnas < 0 || filas < 0) {
            throw new MatrizException(MatrizException.ERR_DIMENSIONES_NEGATIVAS);
        }        
        
        if (columnas > max_cols) {
            throw new MatrizException(MatrizException.ERR_COLUMNAS_EXCEDIDAS);
        }
        
        if (filas > max_rows) {
            throw new MatrizException(MatrizException.ERR_FILAS_EXCEDIDAS);
        }
        
        cuerpo = new Vector[filas];
        for (int i = 0; i < filas; i++) {
            cuerpo[i] = new Vector(columnas); // Ahora usa 'columnas' en lugar de 2
        }
    }

    public void SetRowCol(int row, int col, Object obj) throws MatrizException {        
        if (row < 0 || row >= cuerpo.length) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);
        }

        if (col < 0 || col >= max_cols) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }

        
        cuerpo[row].add(col, obj);
    }

    public Object GetRowCol(int row, int col) throws MatrizException {
        if (row < 0 || row >= cuerpo.length) {
            throw new MatrizException(MatrizException.ERR_FILA_FUERA_DE_RANGO);
        }

        if (col < 0 || col >= max_cols) {
            throw new MatrizException(MatrizException.ERR_COLUMNA_FUERA_DE_RANGO);
        }
        
        return cuerpo[row].elementAt(col);
    }

    public String toString() {
        String staux = new String("");
        for (int i = 0; i < cuerpo.length; i++)
            for (int j = 0; j < cuerpo[i].size(); j++) {
                staux = staux + cuerpo[i].elementAt(j);
            }
        return staux;
    }
}
