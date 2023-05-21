import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MazeReader {

    public static void main(String[] args) {

        int numRows = 0;
        int numCols = 0;
        char[][] maze = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("SizedMaze.txt"));
            String line = reader.readLine();

            if (line != null) {
                String[] size = line.split(" ");
                numRows = Integer.parseInt(size[0]);
                numCols = Integer.parseInt(size[1]);
                maze = new char[numRows][numCols];
            }

            int row = 0;
            while ((line = reader.readLine()) != null) {
                for (int col = 0; col < numCols; col++) {
                    maze[row][col] = line.charAt(col);
                }
                row++;
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the two-dimensional array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}