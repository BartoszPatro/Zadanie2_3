// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) 
  {
    int[]randomNumbers=new int[5];
    Random random=new Random();
    for(int i=0;i<randomNumbers.length;i++)
      {
        randomNumbers[i]=random.nextInt(100)+1;
      }
    for(int number:randomNumbers)
      {
        System.out.println(number);
      }
    int sum=Arrays.stream(randomNumbers).sum();
    System.out.println("Suma 5 wygenerowanych liczb wynosi "+sum);
    int kwadratsumy = sum*sum;
    System.out.println("Kwadrat sumy 5 wygenerowanych liczb wynosi "+kwadratsumy);
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}