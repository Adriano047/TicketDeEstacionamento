
public class Pagar extends Emitir{
    
    String PagarTicket(String Codigo) {
        String MsnStatus = "Codigo Não Encontrado";  
        for (int I = 0; I < Codigos.size(); I++) {
            var Valor = Codigos.get(I);
            if (Valor.equals(Codigo)) {
                Pagamento.set(I, true);
                MsnStatus = "Pago com sucesso";
            }
        }
        return MsnStatus;   
    }
    
}
