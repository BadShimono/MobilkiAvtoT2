import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test

    public void testGetClassNumber()
    {
        int b = this.getClassNumber();
         if (b > 45) {
             System.out.println(("Тест пройден!!!"));
         } else {
             System.out.println("Ошибка!!! Метод getClassNumber возвращает число, меньше или равно 45!!!");
         }
    }

}
