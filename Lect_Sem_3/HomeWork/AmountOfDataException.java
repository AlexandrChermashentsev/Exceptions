package Lect_Sem_3.HomeWork;

public class AmountOfDataException extends RuntimeException {
    public AmountOfDataException(){
        super("Неверное кол-во элементов");
    }
}
