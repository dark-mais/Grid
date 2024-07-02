package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class GameGrid {private final int rows;
    private final int cols;
    private final Objects[][] grid;

    public GameGrid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new Objects[rows][cols];
    }

    public void addObject(Objects object, int row, int col) {
        grid[row][col] = object;
    }

    public Objects getObject(int row, int col) {
        return grid[row][col];
    }

    public void removeObject(int row, int col) {
        grid[row][col] = null;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public List<Objects> getAllObjects() {
        List<Objects> objects = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] != null) {
                    objects.add(grid[row][col]);
                }
            }
        }
        return objects;
    }
}
