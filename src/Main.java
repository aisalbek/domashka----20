import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

            try (Car car = new Car()) {
                car.drive();
          } catch (RuntimeException e) {
            System.out.println(e);
            }catch (Exception e){
            throw new RuntimeException();
         }
        }
      }
