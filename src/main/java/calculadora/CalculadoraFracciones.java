package calculadora;

/**
 *
 * @author Bernat
 */
public class CalculadoraFracciones {
    private Fraccion operador1;
    private Fraccion operador2;

    public CalculadoraFracciones(Fraccion operador1, Fraccion operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    
    public Fraccion sum(){
        return simplify(new Fraccion(operador1.getNumerador() * operador2.getDenominador() + operador1.getDenominador() * operador2.getNumerador(),
            operador1.getDenominador() * operador2.getDenominador()));
    }
    
    public Fraccion resta(){
        return simplify(new Fraccion((operador1.getNumerador() * operador2.getDenominador()) - (operador1.getDenominador() * operador2.getNumerador()),
                operador1.getDenominador() * operador2.getDenominador()));
    }
    
    public Fraccion producto(){
        return simplify(new Fraccion(operador1.getNumerador()*operador2.getNumerador(), operador1.getDenominador()*operador2.getDenominador()));
    }
    
    public Fraccion division(){
        Fraccion FracFinal = new Fraccion(operador1.getNumerador()*operador2.getDenominador(), operador1.getDenominador()*operador2.getNumerador());
        return simplify(FracFinal);
    }
    
    private double mcd(double a, double b) {
        if (b==0) return a;
        return mcd(b,a%b);
    }

    private Fraccion simplify(Fraccion fraccion) {
        double mcd = mcd(fraccion.getNumerador(), fraccion.getDenominador());
        return new Fraccion(fraccion.getNumerador() / mcd, fraccion.getDenominador() / mcd);
    }
    
    
}
