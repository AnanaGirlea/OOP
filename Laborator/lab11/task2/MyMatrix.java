package lab11.task2;

public class MyMatrix implements Summable{
    private int[][] matrix;

    public MyMatrix(int[][] a) {
        this.matrix = a;
    }
    public MyMatrix(){
        this.matrix = new int[4][4];
    }

    @Override
    public void addValue(Summable value) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = matrix[i][j] + (((MyMatrix) value).geA())[i][j];
            }
        }
    }

    @Override
    public int total() {
        int total = 0;
        for(int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix.length; j++) {
                total = total + matrix[i][j];
            }
        }
        return total;
    }

    public int[][] geA() {
        return matrix;
    }

    public void setMatrix(int[][] map) {
        this.matrix = map;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                str.append(matrix[i][j]).append(" ");
            }
            str.append("    ");
        }
        str.append("\n");
        return str.substring(0, str.length() - 1);
    }
}
