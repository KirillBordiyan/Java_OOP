package org.example.practies.sem1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vector {
    private int x;
    private int y;
    private int z;

    public double len() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    /**
     * @param second - вектор, с которым происходит умножение
     * @return скалярное произведение
     * @apiNote метод, вычисл скалярное произведение
     */

    public double scalar(Vector second) {
        return x * second.x + y * second.y + z * second.z;
    }

    /**
     *
     * @param second второй вектор
     * @return векторное произведение - новый вектор
     */
    public Vector multiply(Vector second) {
        return new Vector((y*second.z) - (z*second.y),
                z*second.x - x*second.z,
                x*second.y - y*second.x);
    }

    /**
     * @param second второй вектор
     * @return cos угла между векторами
     */
    public double getCos(Vector second){
        return scalar(second) / (this.len() * second.len());
    }


}
