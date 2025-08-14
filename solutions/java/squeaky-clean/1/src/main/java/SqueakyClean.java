class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);

            // Caso: guion medio convierte la siguiente letra a mayúscula
            if (c == '-') {
                if (i + 1 < identifier.length()) {
                    char nextChar = identifier.charAt(i + 1);
                    result.append(Character.toUpperCase(nextChar));
                    i++; // saltamos el siguiente char porque ya lo procesamos
                }
            }

            // Reemplazos de números por letras
            else if (c == '4') {
                result.append('a');
            } else if (c == '3') {
                result.append('e');
            } else if (c == '0') {
                result.append('o');
            } else if (c == '1') {
                result.append('l');
            } else if (c == '7') {
                result.append('t');
            }

            // Espacio se convierte en _
            else if (c == ' ') {
                result.append('_');
            }

            // Caracteres válidos: letras (a-z A-Z) o _
            else if (Character.isLetter(c) || c == '_') {
                result.append(c);
            }

            // Otros caracteres se ignoran
        }

        return result.toString();
    }
}
