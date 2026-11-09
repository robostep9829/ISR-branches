class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");

        final String foo =  "foo";
        final String bar = "bar";
        final String baz = "baz";

        for(int i = 0; i < 200; i++){
            if (i % 3 == 0){
                System.out.println(foo);
            } else if (i % 3 == 1){
                System.out.println(bar);
            } else {
                System.out.println(baz);
            }
        }
        System.out.println("Dev branch");

        int counter = 0;
        while (true) {
            counter++;

            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            try {
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                break;
            } catch (Exception e) {

            }
        }
    }
}