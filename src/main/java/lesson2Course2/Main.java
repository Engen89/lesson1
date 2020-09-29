package lesson2Course2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "три", "4"},
                {"1", "2", "3", "4"},
        };

        try {
            System.out.println(sum(arr));
        } catch (MyArraySizeException e){
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();

            System.out.println(e.getRow() + e.getCol());
            System.out.println(arr[e.getRow()][e.getCol()]);

            System.out.println("end");
        }
    }

    static  int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4){
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("format "+i + j, i , j);
                }
            }
        }
        return sum;
    }


}
