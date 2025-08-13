

public class MatrizObjetos {
    static int max_rows = 200;
    static int max_cols = 200;
    private Vector cuerpo[];

    MatrizObjetos(int columnas, int filas) throws MatrizException {
        if (columnas > max_cols) {
            throw new MatrizException("Excede la cantidad de columnas");
        } else {
            cuerpo = new Vector[filas];
            for (int i = 0; i < filas; i++) {
                cuerpo[i] = new Vector(2);
            }
        }
    }

    public void SetRowCol(int row, int col, Object obj) {
        try {
            cuerpo[row].add(col, obj);
        } catch (Exception e) {
            System.out.println("ERRRRROOOOOOOR!!!!!");
            System.out.println(e);
        }
    }

    public Object GetRowCol(int row, int col) {
        Object obj = null;
        try {
            obj = cuerpo[row].elementAt(col);
        } catch (Exception e) {
            System.out.println("ERROR -> :" + e);
        }
        return obj;
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
