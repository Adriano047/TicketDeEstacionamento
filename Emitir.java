
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
    public StringBuilder TicketsNãoPagos() {
        Boolean Devendo = false;
        StringBuilder NaoPagos = new StringBuilder("Tickets não Pagos:\n");
            var Index = 0;
            for (Boolean Verifar: Pagamento) {
                if (Verifar.equals(false)) {
                    NaoPagos.append(StringFormatada.get(Index)).append("\n");
                    Devendo = true;
                }
                Index++;
            } if (Devendo.equals(false)) {
                NaoPagos = new StringBuilder("Sem Tickets a paga\n");
            }
        return NaoPagos;
    }
    public StringBuilder TicketsPagos() {
        Boolean Pago = false;
        Integer Total = 0;
        StringBuilder Pagos = new StringBuilder("Tickets Pagos:\n");
            var Index = 0;
            for (Boolean Verifar: Pagamento) {
                if (Verifar.equals(true)) {
                    Pagos.append(StringFormatada.get(Index)).append("\n");
                    var valor = Valores.get(Index);
                    Total += valor;
                    Pago = true;
                }
                Index++;
            } 
            
            if (Pago.equals(false)) {
                Pagos = new StringBuilder("Sem Tickets pagos\n");
            }else {
                Pagos.append("Total: R$" + Total);
            }
        return Pagos;
    }
}
