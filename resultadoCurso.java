package Semana6;

/**
 * Nombre del programa: 
 * Descripcion: Modifique el ejercicio anterior de la siguiente manera: el programa debe calcular ahora
    la cantidad de estudiantes que aprobó el curso, la cantidad de estudiantes que reprobó
    y la cantidad que fue a ampliación, usando los mismos criterios del ejercicio tres.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej4w6v2 {

    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException {
        double nota;
        String aprobado;
        int examenesRealizados;
        double notaExamenes = 0;
        double promedio;

        int estApro=0, estAmpl=0, estRepr=0;

        escribir.println("Digite la cantidad de estudiantes:");
        int estudiantes = Integer.parseInt(leer.readLine());

        for (int countk = 0; countk < estudiantes; countk++) {

            escribir.println("Digite la cantidad de examenes realizados:");
            examenesRealizados = Integer.parseInt(leer.readLine());

            for (int count = 1; count <= examenesRealizados; count++) {
                escribir.println("Digite la nota obtenida del examen " + count);
                nota = Double.parseDouble(leer.readLine());

                notaExamenes = notaExamenes + nota;
            }

            promedio = notaExamenes / examenesRealizados;
            //escribir.println(promedio);

            if (promedio >= 70) {
                aprobado = "El estudiante aprobó";
                estApro = estApro + 1;
            } else if (promedio >= 60 && promedio < 70) {
                aprobado = "El estudiante debe hacer ampliación";
                estAmpl = estAmpl + 1;
            } else {
                aprobado = "El estudiante no aprobó el examen";
                estRepr = estRepr + 1;
            }

            escribir.println(aprobado);
        }

        escribir.println("Cantidad de estudiantes que aprobaron: " +estApro);
        escribir.println("Cantidad de estudiantes que van a ampliacion: " +estAmpl);
        escribir.println("Cantidad de estudiantes que reprobaron: " +estRepr);
    }
}