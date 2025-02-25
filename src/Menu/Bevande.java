package Menu;

public class Bevande extends Portata {

    private boolean isAlcoholic;
    private double grades;
    private final TipoDrinkEnum tipoDrink;

    public Bevande(String type, String name, Integer price, boolean isAlcoholic, TipoEnum tipoPortata, TipoDrinkEnum tipoDrink, double grades) {
        super(type, name, price, tipoPortata);
        this.tipoDrink = tipoDrink;
        this.isAlcoholic = isAlcoholic;
        this.grades = grades;
    }


    public String printAlcoholInfo() {
        if (isAlcoholic) {
            return "Alcolico " + grades;
        } else return "Analcolico";
    }

    @Override
    public void printPortataDetail() {
        if (tipoDrink == TipoDrinkEnum.ANALCOLICO) {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + printAlcoholInfo() + " - Tipo drink: " + tipoDrink);
        } else {
            System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + printAlcoholInfo() + " - Tipo drink: " + tipoDrink.getDescription() + " con " + grades + " gradi.");
            //System.out.println(getType() + getName() + " - " + "Prezzo: " + getPrice() + " " + printAlcoholInfo() + " - Tipo drink: " + tipoDrink.getDescription());
        }
    }
}