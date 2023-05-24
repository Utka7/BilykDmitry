package org.example;

import junit.framework.Assert;
import lombok.var;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void isValidBoard_CorrectMatrix_ReturnTrue() {
        var matrixValidator = new MatrixValidator();
        var matrix = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };

        var result = matrixValidator.isValidMatrix(matrix);
        Assert.assertTrue(result);
    }

    @Test
    public void isValidBoard_IncorrectMatrix_ReturnFalse() {
        var matrixValidator = new MatrixValidator();
        var matrix = new char[][]{
                {'5', '3', '.', '7', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', 's', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };

        var result = matrixValidator.isValidMatrix(matrix);
        Assert.assertFalse(result);
    }

}
