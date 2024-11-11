public class Main {
    public static void main(String[] args) {
        Motor motor = new MotorCarro();
        Janela janela = new JanelaCarro();
        Radio radio = new RadioCarro();

        radio.ligar();
        radio.sintonizar();

        motor.ligar();
        motor.desligar();

        janela.abrir();
        janela.fechar();
    }
}
