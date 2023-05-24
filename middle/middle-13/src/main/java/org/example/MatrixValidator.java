package org.example;

import lombok.var;

import java.util.HashSet;
import java.util.Set;

public class MatrixValidator {

    public boolean isValidMatrix(char[][] matrix) {
        for (var i = 0; i < matrix.length; i++) {
            if (!isValidRow(matrix, i)) {
                return false;
            }
        }

        for (var j = 0; j < matrix[0].length; j++) {
            if (!isValidColumn(matrix, j)) {
                return false;
            }
        }

        return true;
    }

    private boolean isValidRow(char[][] matrix, int row) {
        var set = new HashSet<Character>();
        for (var j = 0; j < matrix[row].length; j++) {
            var cell = matrix[row][j];
            if (!isValidCell(cell, set)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidColumn(char[][] matrix, int column) {
        var set = new HashSet<Character>();
        for (var i = 0; i < matrix.length; i++) {
            var cell = matrix[i][column];
            if (!isValidCell(cell, set)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidCell(char cell, Set<Character> set) {
        if (cell == '.') {
            return true;
        }
        if (cell < '1' || cell > '9' || set.contains(cell)) {
            return false;
        }
        set.add(cell);
        return true;
    }

}
