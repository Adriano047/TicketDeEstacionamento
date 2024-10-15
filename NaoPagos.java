
public class NaoPagos extends Emitir{
    StringBuilder TicketNãoPago() {
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
}
