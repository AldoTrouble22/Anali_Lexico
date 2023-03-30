package codigo;

public enum TipoToken {
    // Crear un tipoToken por palabra reservada
    // Crear un tipoToken: identificador, una cadena y numero
    // Crear un tipoToken por cada "Signo del lenguaje" (ver clase Scanner)
    
// Palabras reservadas:
    Y, CLASE, ADEMAS, FALSO, PARAR, FUNCION, SI, NULO, O, IMPRIMIR, RETORNAR,
    SUPER, ESTE, VERDADERO, VARIABLE, MIENTRAS,

//Signos y simbolos de lenguaje:
    PARENTESIS_IZQ, PARENTESIS_DER, CORCHETE_IZQ, CORCHETE_DER,
    COMA, PUNTO, PUNTO_Y_COMA, RESTA, SUMA, PRODUCTO, DIVISION, 
    NEGACION, DIFERENTE_DE, ASIGNACION, IGUAL_A, MENOR_A, MENOR_IGUAL_A, 
    MAYOR_A, MAYOR_IGUAL_A,
    
    IDENTIFICADOR, CADENA, NUMERO, COMENTARIO,
    
// Final de cadena
    EOF
}
