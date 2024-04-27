public class Operadores {
    public static void main(String[] args) {
        
    
        //TIPOS DE OPERADORES
    // - Operadores Aritméticos
    // - Operadores unários
    // - Operadores relacionais
    // - Operadores lógicos
    // - Operador ternário

    // OPERADORES ARITIMETICOS
        
        // + (adição), - (subtração), * (multiplicação), / (divisão)
        // Exemplo:

        double soma = 10.5 + 12.5;
        int divisão = 6 / 3;

    // OPERADORES UNÁRIOS

        // de valor/expressão positivo: +
        // de valor/expressão negativo: -
        // de incremento de valor: ++
        // de decremento de valor: --
        // lógico de negação: ! (nega o valor da expressão booleana)
        // Exemplo:
        int num = 5;
        num = - num; // aqui o valor da variável "num" se tornará = -5
    
        int incremento = 9;
        incremento ++; // aqui o valor da variavel aumentara em +1
    
        // OPERADOR TERNÁRIO
            // representado pelo simbolo "?:" na seguinte expressão:
            // <Expressão Condicional> ? <Caso se condição verdadeira> : <caso se condição falsa>
            // Exemplo:
            int numero1 = 3;
            int numero2 = 6;

            String resultado = numero1 > numero2 ? "verdadeiro" : "falso"; // ?: é abreviação do IF ELSE

        // OPERADORES RELACIONAIS

        // == (quando comparamos a IGUALDADE)
        // != (quando verificamos a DIFERENÇA)
        // > (quando verificamos se é MAIOR QUE)
        // >= (quando verificamos se é MAIOR OU IGUAL QUE)
        // < (quando verificamos se é MENOR QUE)
        // <= (quando verificamos se é MENOR OU IGUAL QUE)

        //Exemplo:
        int numeroUm = 1;
        int numeroDois = 2;
        boolean verifica = numeroUm >= numeroDois;
        System.out.println(verifica); //aqui será printado "false", pois a comparação não é verdadeira        
    
    // OPERADORES LÓGICOS
        // && representa o "e"
        // || representa o "ou"
        //Exemplo:
        boolean cond1 = true;
        boolean cond2 = false;
        
        if (cond1 && cond2){
            System.out.println("verdadeiro");
        } // aqui o sistema ira verificar se cond1 E cond2 são verdadeiras
    }
}
