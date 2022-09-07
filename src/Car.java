public class Car implements AutoCloseable{

        public void drive(){
            System.out.println("===================================");
            System.out.println("Машина журуп жатат");
            System.out.println("===================================");
    }

    @Override
    public void close() throws Exception {
        System.out.println("===================================");
        System.out.println("Машина жабылып жатат");
        System.out.println("===================================");
    }
}
