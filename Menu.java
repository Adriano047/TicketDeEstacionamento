
import javax.swing.JOptionPane;

public class Menu {
    Emitir Emitir = new Emitir();
    private Pagar Pagar = new Pagar();
    Integer Valor;
    void Iniciar() {
        while (true) {
            
            String Op[] = {"Emitir", "Pagar", "Saldo"} ;
            var menu = JOptionPane.showOptionDialog(null, "- Emitir Ticket\n- Pagar Ticket\n- Verificar Saldo", "Estacionamento Christine", 0, 3, null, Op, Op[0]);
            if(menu == 0) {
                String Tempo[] = {"1h", "+1h", "Diaria"} ;
                var Mais = "Iniciar";
                var Preços = JOptionPane.showOptionDialog(null, "Tabela de Preços:\n- Até 1 hora: R$5.00\n- +1 hora: R$5.00 + R$2.00 por hora\n- Diaria: R$40.00", "Tabela De preço", 0, 3, null, Tempo, Tempo[0]);
                if (Preços == 1) {
                    main: while (true) {
                        try {
                            while (true) {
                                Mais = JOptionPane.showInputDialog(null, "Informe a quantidade de horas(Minima: 2 | Maxima: 23): ", "Opção +1 hora:" , 3);
                                if (Mais == null) {
                                    break main;
                                }
                                var Extra = Integer.parseInt(Mais.trim());
                                if (Extra < 2 || Extra > 23) {
                                    JOptionPane.showMessageDialog(null, "Informe um numero de 2 a 23", "Numero fora do intervalo", 2);
                                } else {
                                    Valor = 5 + (Extra * 2) - 2; 
                                    break;
                                }    
                            }
                            break;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Erro: Digite um número válido.", null, 0);
                        }
                    }
                }else if(Preços == 2) {
                    Valor = 40;
                }else if(Preços == 0) {
                    Valor = 5;
                }
                if (Preços != -1 && Mais != null) {
                    JOptionPane.showMessageDialog(null, Emitir.Ticket(Valor));
                }
            }else if(menu == 1) {
                var codigo = "";
                while (codigo.equals("")) {
                    codigo = JOptionPane.showInputDialog(null, Emitir.TicketsNãoPagos() + "\nDigite o Código do Ticket:", "Pagamentos de ticket", 3);
                   
                    if (codigo == null) {
                        break;
                    } else if (codigo.equals("")) {
                        JOptionPane.showMessageDialog(null, "Digite algo", "", 0);
                    }else {
                        JOptionPane.showMessageDialog(null, Pagar.PagarTicket(codigo));
                    }
                }
            }else if(menu == 2) {
                JOptionPane.showMessageDialog(null, Emitir.TicketsPagos(), "Tickes Pagos", 1);
            }else {
                break;
            }
        }
    }
}
