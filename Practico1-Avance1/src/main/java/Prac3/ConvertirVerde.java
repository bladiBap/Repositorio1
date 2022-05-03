package Prac3;

public class ConvertirVerde extends Convertir {

    public ConvertirVerde(Imagen img) {
        this.imagen = img;
    }

    @Override
    public void transformar(int x1, int y1,int x2,int y2) {
        int[][] pixeles = imagen.getPixeles();
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                int c = pixeles[i][j];

                int g = (c >> 8) & 0xff;

                c = (g << 8);
                //int gris = (r + g + b) / 3;
                //int gris = (int)(((double)r + (double)g + (double)b) / 3.0);

                //int intGris = gris & (gris << 8) & (gris << 16);
                //int intGris = gris + gris * 256 + gris * 256*256;
                imagen.setColor(c, i, j);
            }
        }
        imagen.transformada();
    }
}

