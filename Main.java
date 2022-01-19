class Main {
  public static void main(String[] args) {

    Cliente italo = new Cliente();
    italo.setNome("Italo");
    
    Conta cc = new ContaCorrente(italo);
    cc.depositar(100);
    Conta poupanca = new ContaPoupanca(italo);
    cc.transferir(10, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }
}