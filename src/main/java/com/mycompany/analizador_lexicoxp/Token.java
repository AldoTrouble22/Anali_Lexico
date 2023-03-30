package codigo;

public class Token {

    final TipoToken tipo;
    final String lexema;
    final Object literal;
    final int linea;

    public Token(TipoToken tipo, String lexema, Object literal, int linea) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.literal = literal;
        this.linea = linea;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return tipo + " " + lexema + " " + literal;
    }
}
