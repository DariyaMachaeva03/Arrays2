/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array2;

/**
 *
 * @author Dariya
 */
public class Generate {
    public static int [] [] generateArray (int[][] array, int min, int max) {
    for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * max + min);
            }
        }

    return array;
}
}
