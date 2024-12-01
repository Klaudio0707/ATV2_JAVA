package com.example.Atividade_2;

public class OperacoesService {

    // Calcula o fatorial
    public static long getFactorial(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Número deve ser maior que 0.");
        }
        if (n > 20) { // Proteção contra overflow
            throw new IllegalArgumentException("Número muito grande para calcular o fatorial.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Fatorial de " + n + " é: " + result); // Log do resultado
        return result;
    }

    // Retorna o maior valor de um array
    public static int maxValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array não pode ser vazio.");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maior valor no array é: " + max); // Log do resultado
        return max;
    }

    // Retorna o número de vogais em uma string
    public static int getVowelNumber(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Texto não pode ser vazio.");
        }
        int count = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("Número de vogais em \"" + text + "\" é: " + count); // Log do resultado
        return count;
    }
}
