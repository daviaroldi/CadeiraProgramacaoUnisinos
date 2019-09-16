package model;

public class Consultor extends Usuario{
    private Carteira carteira;

    public Consultor(String nome, String cpf, String username, String password) {
        super(nome, cpf, username, password);
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }
}
