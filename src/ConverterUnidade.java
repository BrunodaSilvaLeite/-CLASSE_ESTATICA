public class ConverterUnidade {



    // Método estático para converter gramas em libras, permitindo chamada direta sem necessidade de instanciar a classe
    public static double gramasParaLibras(double valor){
        return valor/453.592;
    }
    // Método estático para converter quilometros em milhas, permitindo chamada direta sem necessidade de instanciar a classe
    public static double quilometrosParaMilhas(double valor) {
        return valor * 0.621371;
    }
    // Método estático para converter celsius em Fahrenheit, permitindo chamada direta sem necessidade de instanciar a classe
    public static double celsiusParaFahrenheit(double valor) {

        return (valor * 1.8) + 32 ;
    }
}
