package Øving6;

import java.lang.Math;
import java.util.Arrays;

public class matriseregning {
    private int[][] matrix;
    private int colums;
    private int rows;
    

   

    public matriseregning (int[][]matrix){
        this.matrix = matrix;
        colums = matrix[0].length;
        rows = matrix.length;
    }


    public String toString(){
        String output = "";
            for (int i = 0; i < matrix.length; i++) {
                output+="[";
                for (int j = 0; j < matrix[i].length; j++) {
                    output += (matrix[i][j] + ", ");
                }
                output+="]";
                output+= "\n";
            }
        return output;
}


public int getcolums(){
    return colums;

}

public int getrows(){
    return rows;

}


public matriseregning addere(matriseregning matrix2){
    int[][]mat3 = new int[colums][rows];
    for (int i = 0; i < mat3.length;i++){
        for (int j = 0; j < mat3[i].length; j++){
            mat3[i][j] = matrix[i][j]+matrix2.matrix[i][j];
        }
    }
    return new matriseregning(mat3);

    

}
public matriseregning multiply(matriseregning matrix2){
    int[][]mat3 = new int[colums][rows];
    


    int sum = 0;
    for (int i = 0; i < this.matrix.length; i++){
        for (int j = 0; j < matrix2.matrix[0].length; j++){
            for (int x = 0; x < matrix2.matrix.length; x++){
                sum = sum + matrix[i][x]*matrix2.matrix[x][j];
            }
           
            mat3[i][j] = sum;
            sum = 0;
        }
    }  
    return new matriseregning(mat3);
}
public matriseregning Transpose(){
    int[][]mat3 = new int[colums][rows];
    for (int i = 0; i < mat3.length; i++){
        for (int j = 0; j < mat3[i].length; j++){
            mat3[i][j] = matrix[j][i];
        }
}   return new matriseregning(mat3);




}

}