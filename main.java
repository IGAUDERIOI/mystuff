@RestController
public class AgendamentoController {

    @PostMapping("/agendar")
    public ResponseEntity<String> agendar(@RequestParam String nome,
                                          @RequestParam String email,
                                          @RequestParam String telefone,
                                          @RequestParam String data,
                                          @RequestParam String hora,
                                          @RequestParam(required = false) String mensagem) {
        System.out.println("Novo agendamento:");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Mensagem: " + mensagem);

        // Aqui você salvaria no banco, por exemplo com JPA ou JDBC

        return ResponseEntity.ok("Agendamento recebido com sucesso!");
    }
}