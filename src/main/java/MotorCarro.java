public class MotorCarro implements Motor{
    @Override
    public void ligar() {
        System.out.println("O motor do carro está ligado. ");
    }
    @Override
    public void desligar(){
        System.out.println("O motor do carro está desligado!");
    }
}
