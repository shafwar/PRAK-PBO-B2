public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi objek array integer
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[3] = 10; // Menggunakan indeks yang valid
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code...");
        }
    }
}
