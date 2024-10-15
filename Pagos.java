
public class Pagos extends Emitir{
    StringBuilder TicketsPagos() {
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
