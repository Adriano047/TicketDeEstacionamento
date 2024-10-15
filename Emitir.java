
import java.util.ArrayList;
import java.util.List;

public class Emitir extends Ticket{
    
    protected static List<String> StringFormatada = new ArrayList<>();
    protected static List<String> Codigos = new ArrayList<>();
    protected static List<Integer> Valores = new ArrayList<>();
    protected static List<Boolean> Pagamento = new ArrayList<>();
    String Ticket(Integer Preco) {
        Codigos.add("T");

        main: while (true) {
           for (var T = 0; T < 4; T++) {
            int numeroAleatorio = (int) (Math.random() * 10);

            Codigo += numeroAleatorio;

            } 
            for(String c : Codigos) {
                if (Codigo.equals(c)) {
                    Codigo = "";
                }else {
                    break main;
                }
            }
        }
        Codigos.remove("T");
        Valor = Preco;
        Codigos.add(Codigo);
        Valores.add(Valor);
        Pagamento.add(Pago);
        var Format = String.format("Codigo: %s | Valor: R$%d", Codigo, Valor);
        Codigo = "";
        StringFormatada.add(Format);
        return Format;
    }
}
