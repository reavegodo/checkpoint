public class Student {
    // TODO hasLegalAge
    public static boolean hasLegalAge(int age) {
        return age >= 18;
    }

    // TODO getGroup
    public static char getGroup(int num) {
        if (num % 2 == 0) {
            return 'A';
        }
        return 'B';
    }

    // TODO countStudents
    public static int countStudents(String[] tableau) {
        int count = 0;
        for (String language : tableau) {
            if (language.equalsIgnoreCase("java")) {
                count++;
            }
        }
        return count;
    }
}


           


