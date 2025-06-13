


public class CoordenadasAlCentro {
    private Integer eje_x;
    private Integer eje_y;

    public CoordenadasAlCentro(Integer eje_x, Integer eje_y) {
        this.eje_x = eje_x;
        this.eje_y = eje_y;
    }

    public Integer getEje_x() {
        return eje_x;
    }

    public void setEje_x(Integer eje_x) {
        this.eje_x = eje_x;
    }

    public Integer getEje_y() {
        return eje_y;
    }

    public void setEje_y(Integer eje_y) {
        this.eje_y = eje_y;
    }

    @Override
    public String toString() {
        return "CoordenadasAlCentro [eje_x=" + eje_x + ", eje_y=" + eje_y + "]";
    } 

}
