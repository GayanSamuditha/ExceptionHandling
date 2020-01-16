package CheckedException;

class Demo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("top layer ");

        e.initCause(new ArithmeticException("causes this ! "));

        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);

            System.out.println("Original cause: " + e.getCause());
        }
    }
}